package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.dao.UserDAO;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.SystemAdministrator;
import ca.yorku.eecs3311.model.user.User;
import ca.yorku.eecs3311.model.user.UserFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// some additions made by Ege, shown with "Added" after Gurnoor completed
public class AuthenticationService {

    private static AuthenticationService instance;
    private final UserDAO userDAO;
    // Added by ege: tracks currently logged-in users by userId as required by context spec
    private final Map<String, User> activeSessions = new HashMap<>();

    private AuthenticationService() {
        this.userDAO = new UserDAO();
    }

    // Added synchronized to prevent a race condition if two threads call getInstance() simultaneously
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

        // Added by ege: registers user in activeSessions so isLoggedIn() and getActiveUser() work correctly
        activeSessions.put(user.getUserId(), user);
        return user;
    }

    // Added by ege: removes the user from active sessions; required by context spec for logout flow
    public void logout(String userId) {
        activeSessions.remove(userId);
    }

    // Added by ege: returns true if the user has an active session; used by controllers before allowing protected actions
    public boolean isLoggedIn(String userId) {
        return activeSessions.containsKey(userId);
    }

    // Added by ege: retrieves the currently logged-in User object by userId; returns null if no active session exists
    public User getActiveUser(String userId) {
        return activeSessions.get(userId);
    }

    // Added by ege: returns an unmodifiable view to prevent external callers from mutating session state directly
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

        userDAO.save(user);
        return user;
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

        return registerUser(
                UserType.MANAGER,
                email,
                password,
                department,
                credentialNumber,
                null,
                null,
                null
        );
    }

    // Changed from public to package-private so controllers cannot bypass the facade to access the DAO directly
    UserDAO getUserDAO() {
        return userDAO;
    }
}
