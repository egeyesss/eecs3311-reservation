package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.*;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private static final String FILE_PATH = "src/main/resources/data/users.csv";
    private static final String HEADER =
            "userId,email,password,userType,accountStatus,registrationDate," +
            "department,credentialNumber,extraField1,extraField2,extraField3";

    // -------------------------------------------------------------------------
    // Read
    // -------------------------------------------------------------------------

    public List<User> loadAll() {
        List<User> users = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) return users;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) { isHeader = false; continue; }
                line = line.trim();
                if (line.isEmpty()) continue;
                try {
                    User u = parseRow(line.split(",", -1));
                    if (u != null) users.add(u);
                } catch (Exception e) {
                    System.err.println("UserDAO: skipping malformed row: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("UserDAO: read error: " + e.getMessage());
        }
        return users;
    }

    public User findById(String userId) {
        for (User u : loadAll()) {
            if (u.getUserId().equals(userId)) return u;
        }
        return null;
    }

    public User findByEmail(String email) {
        for (User u : loadAll()) {
            if (u.getEmail().equalsIgnoreCase(email)) return u;
        }
        return null;
    }

    // -------------------------------------------------------------------------
    // Write
    // -------------------------------------------------------------------------

    public void save(User user) {
        List<User> all = loadAll();
        boolean updated = false;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getUserId().equals(user.getUserId())) {
                all.set(i, user);
                updated = true;
                break;
            }
        }
        if (!updated) all.add(user);
        writeAll(all);
    }

    public void delete(String userId) {
        List<User> all = loadAll();
        all.removeIf(u -> u.getUserId().equals(userId));
        writeAll(all);
    }

    // -------------------------------------------------------------------------
    // Internal helpers
    // -------------------------------------------------------------------------

    private User parseRow(String[] p) {
        if (p.length < 8) return null;
        String userId        = p[0].trim();
        String email         = p[1].trim();
        String password      = p[2].trim();
        UserType type        = UserType.valueOf(p[3].trim());
        AccountStatus status = AccountStatus.valueOf(p[4].trim());
        LocalDateTime regDate= LocalDateTime.parse(p[5].trim());
        String dept          = p[6].trim();
        String cred          = p[7].trim();
        String e1            = p.length > 8  ? p[8].trim()  : "";
        String e2            = p.length > 9  ? p[9].trim()  : "";
        String e3            = p.length > 10 ? p[10].trim() : "";

        switch (type) {
            case STUDENT:
                return new Student(userId, email, password, status, regDate, dept,
                        cred, e1, e2.isEmpty() ? 1 : Integer.parseInt(e2));
            case FACULTY:
                return new Faculty(userId, email, password, status, regDate, dept, cred, e1);
            case RESEARCHER:
                return new Researcher(userId, email, password, status, regDate, dept, cred, e1, e2);
            case GUEST:
                return new Guest(userId, email, password, status, regDate, dept, cred, e1, e2);
            case MANAGER:
                return new Manager(userId, email, password, status, regDate, dept, cred);
            case ADMIN:
                return new SystemAdministrator(userId, email, password, status, regDate,
                        dept, cred, e2, Boolean.parseBoolean(e3));
            default:
                return null;
        }
    }

    private String toRow(User u) {
        String e1 = "", e2 = "", e3 = "";
        // SystemAdministrator MUST be checked before Manager (it extends Manager)
        if (u instanceof SystemAdministrator) {
            SystemAdministrator sa = (SystemAdministrator) u;
            e2 = sa.getAdminID();
            e3 = String.valueOf(sa.isHeadCoordinator());
        } else if (u instanceof Student) {
            Student s = (Student) u;
            e1 = s.getProgram();
            e2 = String.valueOf(s.getYearOfStudy());
        } else if (u instanceof Faculty) {
            e1 = ((Faculty) u).getPosition();
        } else if (u instanceof Researcher) {
            Researcher r = (Researcher) u;
            e1 = r.getResearchArea();
            e2 = r.getGrantNumber();
        } else if (u instanceof Guest) {
            Guest g = (Guest) u;
            e1 = g.getOrganization();
            e2 = g.getSponsorEmail();
        }
        return String.join(",",
                u.getUserId(), u.getEmail(), u.getPassword(),
                u.getUserType().name(), u.getAccountStatus().name(),
                u.getRegistrationDate().toString(), u.getDepartment(),
                u.getCredentialNumber(), e1, e2, e3);
    }

    private void writeAll(List<User> users) {
        File file = new File(FILE_PATH);
        file.getParentFile().mkdirs();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(HEADER);
            writer.newLine();
            for (User u : users) {
                writer.write(toRow(u));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("UserDAO: write error: " + e.getMessage());
        }
    }
}