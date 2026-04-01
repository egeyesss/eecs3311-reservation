package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.enums.PaymentMethod;
import ca.yorku.eecs3311.model.payment.Payment;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAO {

    private static String FILE_PATH = "src/main/resources/data/payments.csv";
    private static final String HEADER =
            "paymentID,bookingID,userId,amount,paymentMethod,paymentDate,transactionID,status,isDeposit";

    // CSV READ

    public List<Payment> loadAll() {
        List<Payment> list = new ArrayList<>();
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
                    list.add(parseRow(line.split(",", -1)));
                } catch (Exception e) {
                    System.err.println("PaymentDAO: skipping malformed row: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("PaymentDAO: read error: " + e.getMessage());
        }
        return list;
    }

    public Payment findById(String paymentID) {
        for (Payment p : loadAll()) {
            if (p.getPaymentID().equals(paymentID)) return p;
        }
        return null;
    }

    public List<Payment> findByBookingId(String bookingID) {
        List<Payment> result = new ArrayList<>();
        for (Payment p : loadAll()) {
            if (p.getBookingID().equals(bookingID)) result.add(p);
        }
        return result;
    }

    public List<Payment> findByUserId(String userId) {
        List<Payment> result = new ArrayList<>();
        for (Payment p : loadAll()) {
            if (p.getUserId().equals(userId)) result.add(p);
        }
        return result;
    }

    // CSV WRITE

    public void save(Payment payment) {
        List<Payment> all = loadAll();
        boolean updated = false;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getPaymentID().equals(payment.getPaymentID())) {
                all.set(i, payment);
                updated = true;
                break;
            }
        }
        if (!updated) all.add(payment);
        writeAll(all);
    }

    public void delete(String paymentID) {
        List<Payment> all = loadAll();
        all.removeIf(p -> p.getPaymentID().equals(paymentID));
        writeAll(all);
    }

    // HELPER METHODS / FUNCTIONS

    private Payment parseRow(String[] p) {
        if (p.length < 9) throw new IllegalArgumentException("Too few columns");
        String paymentID      = p[0].trim();
        String bookingID      = p[1].trim();
        String userId         = p[2].trim();
        double amount         = Double.parseDouble(p[3].trim());
        PaymentMethod method  = PaymentMethod.valueOf(p[4].trim());
        LocalDateTime date    = LocalDateTime.parse(p[5].trim());
        String transactionID  = p[6].trim();
        String status         = p[7].trim();
        boolean isDeposit     = Boolean.parseBoolean(p[8].trim());

        Payment payment = new Payment(bookingID, userId, amount, method, isDeposit);
        // Restore persisted fields that override the auto-generated ones
        payment.setPaymentID(paymentID);
        payment.setPaymentDate(date);
        payment.setTransactionID(transactionID);
        payment.setStatus(status);
        return payment;
    }

    private String toRow(Payment p) {
        return String.join(",",
                p.getPaymentID(),
                p.getBookingID(),
                p.getUserId(),
                String.valueOf(p.getAmount()),
                p.getPaymentMethod().name(),
                p.getPaymentDate().toString(),
                p.getTransactionID(),
                p.getStatus(),
                String.valueOf(p.isDeposit()));
    }

    private void writeAll(List<Payment> payments) {
        File file = new File(FILE_PATH);
        file.getParentFile().mkdirs();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(HEADER);
            writer.newLine();
            for (Payment p : payments) {
                writer.write(toRow(p));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("PaymentDAO: write error: " + e.getMessage());
        }
    }
}