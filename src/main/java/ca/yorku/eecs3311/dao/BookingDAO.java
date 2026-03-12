package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.booking.*;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.user.User;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingDAO {

    private static final String FILE_PATH = "src/main/resources/data/bookings.csv";
    private static final String HEADER =
            "bookingID,userId,equipmentID,startTime,endTime,createdAt,arrivedAt,status,totalCost,depositPaid";

    private final UserDAO userDAO;
    private final EquipmentDAO equipmentDAO;

    public BookingDAO(UserDAO userDAO, EquipmentDAO equipmentDAO) {
        this.userDAO      = userDAO;
        this.equipmentDAO = equipmentDAO;
    }

    // -------------------------------------------------------------------------
    // Read
    // -------------------------------------------------------------------------

    public List<Booking> loadAll() {
        List<Booking> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return list;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) { isHeader = false; continue; }
                line = line.trim();
                if (line.isEmpty()) continue;
                try {
                    Booking b = parseRow(line.split(",", -1));
                    if (b != null) list.add(b);
                } catch (Exception e) {
                    System.err.println("BookingDAO: skipping malformed row: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("BookingDAO: read error: " + e.getMessage());
        }
        return list;
    }

    public Booking findById(String bookingID) {
        for (Booking b : loadAll()) {
            if (b.getBookingID().equals(bookingID)) return b;
        }
        return null;
    }

    public List<Booking> findByUserId(String userId) {
        List<Booking> result = new ArrayList<>();
        for (Booking b : loadAll()) {
            if (b.getUser().getUserId().equals(userId)) result.add(b);
        }
        return result;
    }

    public List<Booking> findByEquipmentId(String equipmentID) {
        List<Booking> result = new ArrayList<>();
        for (Booking b : loadAll()) {
            if (b.getEquipment().getEquipmentID().equals(equipmentID)) result.add(b);
        }
        return result;
    }

    // -------------------------------------------------------------------------
    // Write
    // -------------------------------------------------------------------------

    public void save(Booking booking) {
        List<Booking> all = loadAll();
        boolean updated = false;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getBookingID().equals(booking.getBookingID())) {
                all.set(i, booking);
                updated = true;
                break;
            }
        }
        if (!updated) all.add(booking);
        writeAll(all);
    }

    public void updateStatus(String bookingID, BookingStatus newStatus) {
        List<Booking> all = loadAll();
        for (Booking b : all) {
            if (b.getBookingID().equals(bookingID)) {
                switch (newStatus) {
                    case CONFIRMED: b.confirm();  break;
                    case ACTIVE:    b.activate(); break;
                    case COMPLETED: b.complete(); break;
                    case CANCELLED: b.cancel();   break;
                    default: break;
                }
                break;
            }
        }
        writeAll(all);
    }

    public void delete(String bookingID) {
        List<Booking> all = loadAll();
        all.removeIf(b -> b.getBookingID().equals(bookingID));
        writeAll(all);
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private Booking parseRow(String[] p) {
        if (p.length < 10) return null;
        String bookingID   = p[0].trim();
        String userId      = p[1].trim();
        String equipmentID = p[2].trim();
        LocalDateTime start    = LocalDateTime.parse(p[3].trim());
        LocalDateTime end      = LocalDateTime.parse(p[4].trim());
        LocalDateTime created  = LocalDateTime.parse(p[5].trim());
        LocalDateTime arrived  = p[6].trim().isEmpty() ? null : LocalDateTime.parse(p[6].trim());
        BookingStatus status   = BookingStatus.valueOf(p[7].trim());
        double totalCost       = Double.parseDouble(p[8].trim());
        double depositPaid     = Double.parseDouble(p[9].trim());

        User user          = userDAO.findById(userId);
        Equipment equipment = equipmentDAO.findById(equipmentID);

        if (user == null || equipment == null) {
            System.err.println("BookingDAO: unresolved userId=" + userId +
                    " or equipmentID=" + equipmentID + ", skipping.");
            return null;
        }

        // Initialize booking object
        Booking b = new Booking(bookingID, user, equipment, start, end,
                created, arrived, status, totalCost, depositPaid);

        // SYNC STATE PATTERN: Ensure the internal state object matches the persisted status
        switch (status) {
            case CONFIRMED:
                b.setState(new ConfirmedState(b));
                break;
            case ACTIVE:
                b.setState(new ActiveState(b));
                break;
            case COMPLETED:
                b.setState(new CompletedState(b));
                break;
            case CANCELLED:
                b.setState(new CancelledState(b));
                break;
            default:
                // PendingState is usually the default in the Booking constructor
                break;
        }

        return b;
    }

    private String toRow(Booking b) {
        return String.join(",",
                b.getBookingID(),
                b.getUser().getUserId(),
                b.getEquipment().getEquipmentID(),
                b.getStartTime().toString(),
                b.getEndTime().toString(),
                b.getCreatedAt().toString(),
                b.getArrivedAt() != null ? b.getArrivedAt().toString() : "",
                b.getStatus().name(),
                String.valueOf(b.getTotalCost()),
                String.valueOf(b.getDepositPaid()));
    }

    private void writeAll(List<Booking> bookings) {
        File file = new File(FILE_PATH);
        file.getParentFile().mkdirs();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(HEADER);
            writer.newLine();
            for (Booking b : bookings) {
                writer.write(toRow(b));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("BookingDAO: write error: " + e.getMessage());
        }
    }
}