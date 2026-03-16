package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.dao.UserDAO;
import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.SystemAdministrator;
import ca.yorku.eecs3311.model.user.User;
import ca.yorku.eecs3311.model.user.UserFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {

    private static AuthenticationService instance;
    private final UserDAO userDAO;
    private final Map<String, User> activeSessions = new HashMap<>();

    private AuthenticationService() {
        this.userDAO = new UserDAO();
    }

    public static synchronized AuthenticationService getInstance() {
        if (instance == null) {
            instance = new AuthenticationService();
        }
        return instance;
    }

    public boolean isEmailUnique(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return userDAO.findByEmail(email.trim()) == null;
    }

    public boolean isStrongPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public User login(String email, String password) {
        if (email == null || password == null) {
            return null;
        }

        User user = userDAO.findByEmail(email.trim());
        if (user == null) {
            return null;
        }

        if (!user.validateCredentials(email.trim(), password)) {
            return null;
        }

        // Block login if the account has not been approved yet. (AuthGuard)
        if (user.getAccountStatus() == AccountStatus.PENDING) {
            throw new IllegalStateException("Your account is awaiting departmental approval. Please try again later.");
        }

        activeSessions.put(user.getUserId(), user);
        return user;
    }

    public void logout(String userId) {
        activeSessions.remove(userId);
    }

    public boolean isLoggedIn(String userId) {
        return activeSessions.containsKey(userId);
    }

    public User getActiveUser(String userId) {
        return activeSessions.get(userId);
    }

    public Map<String, User> getActiveSessions() {
        return Collections.unmodifiableMap(activeSessions);
    }

    public User registerUser(UserType type,
                             String email,
                             String password,
                             String department,
                             String credentialNumber,
                             String extraField1,
                             String extraField2,
                             String extraField3) {

        // Security Block --> Prevent unauthorized ADMIN creation
        if (type == UserType.ADMIN) {
            throw new SecurityException("Security Violation: Cannot publicly register ADMIN accounts.");
        }

        if (!isEmailUnique(email)) {
            throw new IllegalArgumentException("Email already exists.");
        }

        if (!isStrongPassword(password)) {
            throw new IllegalArgumentException("Password is not strong enough.");
        }

        User user = UserFactory.createUser(
                type,
                email.trim(),
                password,
                department,
                credentialNumber,
                extraField1,
                extraField2,
                extraField3
        );

        // Registration branching depending on user type.
        // Students and Guests are instantly active. Faculty/Researchers remain PENDING.
        if (type == UserType.STUDENT || type == UserType.GUEST) {
            user.activate();
        }

        userDAO.save(user);
        return user;
    }

    // Admin Approval Logic
    public void approveUser(String userId) {
        User user = userDAO.findById(userId);
        if (user != null && user.getAccountStatus() == AccountStatus.PENDING) {
            user.activate();
            userDAO.save(user); // Upserts the row in users.csv, persisting the ACTIVE status
        } else if (user == null) {
            throw new IllegalArgumentException("User not found.");
        }
    }

    public boolean canCreateManagerAccount(User currentUser) {
        if (currentUser == null) {
            return false;
        }

        if (!(currentUser instanceof SystemAdministrator)) {
            return false;
        }

        SystemAdministrator admin = (SystemAdministrator) currentUser;
        return admin.isHeadCoordinator();
    }

    public User createManagerAccount(User currentUser,
                                     String email,
                                     String password,
                                     String department,
                                     String credentialNumber) {

        if (!canCreateManagerAccount(currentUser)) {
            throw new IllegalStateException("Only the head coordinator can create manager accounts.");
        }

        // Managers are activated immediately upon creation by the Admin from the dashboard
        User newManager = UserFactory.createUser(
                UserType.MANAGER, email, password, department, credentialNumber, null, null, null
        );
        newManager.activate();
        userDAO.save(newManager);

        return newManager;
    }

    UserDAO getUserDAO() {
        return userDAO;
    }
}