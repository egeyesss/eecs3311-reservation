package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive test suite for AuthenticationService covering authentication,
 * session management, registration, validation, and admin approval logic.
 */
public class AuthenticationServiceManualTest {

    private AuthenticationService authService;

    @BeforeEach
    public void setUp() {
        // Reset singleton instance for each test
        authService = AuthenticationService.getInstance();
        // Clear active sessions by logging out any existing sessions
        var sessions = authService.getActiveSessions();
        sessions.keySet().forEach(authService::logout);
    }

    // ============ EMAIL VALIDATION TESTS ============

    @Test
    @DisplayName("should confirm email is unique when not found in database")
    public void testIsEmailUnique_UniqueEmail() {
        assertTrue(authService.isEmailUnique("newemail@york.edu"));
    }

    @Test
    @DisplayName("should reject duplicate email")
    public void testIsEmailUnique_DuplicateEmail() {
        // Register a user first
        Student student = new Student("student@york.edu", "SecurePass123!", "CS",
                "STUD001", "EECS", 2);
        authService.getUserDAO().save(student);

        // Try to use the same email
        assertFalse(authService.isEmailUnique("student@york.edu"));
    }

    @Test
    @DisplayName("should handle null email")
    public void testIsEmailUnique_NullEmail() {
        assertFalse(authService.isEmailUnique(null));
    }

    @Test
    @DisplayName("should handle empty email")
    public void testIsEmailUnique_EmptyEmail() {
        assertFalse(authService.isEmailUnique(""));
    }

    @Test
    @DisplayName("should handle whitespace-only email")
    public void testIsEmailUnique_WhitespaceEmail() {
        assertFalse(authService.isEmailUnique("   "));
    }

    @Test
    @DisplayName("should trim email before checking uniqueness")
    public void testIsEmailUnique_TrimWhitespace() {
        assertTrue(authService.isEmailUnique("  newemail@york.edu  "));
    }

    // ============ PASSWORD STRENGTH VALIDATION TESTS ============

    @Test
    @DisplayName("should accept strong password with uppercase, lowercase, digit, special char")
    public void testIsStrongPassword_ValidStrong() {
        assertTrue(authService.isStrongPassword("SecurePass123!"));
    }

    @Test
    @DisplayName("should reject password less than 8 characters")
    public void testIsStrongPassword_TooShort() {
        assertFalse(authService.isStrongPassword("Pass12!"));
    }

    @Test
    @DisplayName("should reject null password")
    public void testIsStrongPassword_NullPassword() {
        assertFalse(authService.isStrongPassword(null));
    }

    @Test
    @DisplayName("should reject password with no uppercase letters")
    public void testIsStrongPassword_NoUppercase() {
        assertFalse(authService.isStrongPassword("securepass123!"));
    }

    @Test
    @DisplayName("should reject password with no lowercase letters")
    public void testIsStrongPassword_NoLowercase() {
        assertFalse(authService.isStrongPassword("SECUREPASS123!"));
    }

    @Test
    @DisplayName("should reject password with no digits")
    public void testIsStrongPassword_NoDigit() {
        assertFalse(authService.isStrongPassword("SecurePassQWE!"));
    }

    @Test
    @DisplayName("should reject password with no special characters")
    public void testIsStrongPassword_NoSpecialChar() {
        assertFalse(authService.isStrongPassword("SecurePass123a"));
    }

    @Test
    @DisplayName("should accept password exactly 8 characters with all requirements")
    public void testIsStrongPassword_ExactlyEightChars() {
        assertTrue(authService.isStrongPassword("Pass12!a"));
    }

    @Test
    @DisplayName("should accept long strong password")
    public void testIsStrongPassword_LongPassword() {
        assertTrue(authService.isStrongPassword("VerySecurePassword123!WithManyCharacters"));
    }

    @Test
    @DisplayName("should accept various special characters")
    public void testIsStrongPassword_VariousSpecialChars() {
        assertTrue(authService.isStrongPassword("Secure@Pass123"));
        assertTrue(authService.isStrongPassword("Secure#Pass123"));
        assertTrue(authService.isStrongPassword("Secure$Pass123"));
        assertTrue(authService.isStrongPassword("Secure%Pass123"));
    }

    // ============ STUDENT LOGIN TESTS ============

    @Test
    @DisplayName("should login Student with correct credentials")
    public void testLogin_StudentSuccess() {
        Student student = new Student("student@york.edu", "SecurePass123!", "CS",
                "STUD001", "EECS", 2);
        student.activate();
        authService.getUserDAO().save(student);

        User loggedIn = authService.login("student@york.edu", "SecurePass123!");
        assertNotNull(loggedIn);
        assertEquals("student@york.edu", loggedIn.getEmail());
        assertTrue(authService.isLoggedIn(student.getUserId()));
    }

    @Test
    @DisplayName("should reject login with wrong password")
    public void testLogin_WrongPassword() {
        Student student = new Student("student@york.edu", "SecurePass123!", "CS",
                "STUD001", "EECS", 2);
        student.activate();
        authService.getUserDAO().save(student);

        User loggedIn = authService.login("student@york.edu", "WrongPassword!");
        assertNull(loggedIn);
        assertFalse(authService.isLoggedIn(student.getUserId()));
    }

    @Test
    @DisplayName("should reject login with non-existent email")
    public void testLogin_NonExistentEmail() {
        User loggedIn = authService.login("nonexistent@york.edu", "SecurePass123!");
        assertNull(loggedIn);
    }

    @Test
    @DisplayName("should throw exception for PENDING account login attempt")
    public void testLogin_PendingAccount() {
        Student student = new Student("student@york.edu", "SecurePass123!", "CS",
                "STUD001", "EECS", 2);
        // Student remains PENDING (not activated)
        authService.getUserDAO().save(student);

        assertThrows(IllegalStateException.class, () ->
            authService.login("student@york.edu", "SecurePass123!")
        );
    }

    @Test
    @DisplayName("should reject login with null email")
    public void testLogin_NullEmail() {
        User loggedIn = authService.login(null, "SecurePass123!");
        assertNull(loggedIn);
    }

    @Test
    @DisplayName("should reject login with null password")
    public void testLogin_NullPassword() {
        User loggedIn = authService.login("student@york.edu", null);
        assertNull(loggedIn);
    }

    @Test
    @DisplayName("should handle case-sensitive email login")
    public void testLogin_CaseSensitiveEmail() {
        Student student = new Student("student@york.edu", "SecurePass123!", "CS",
                "STUD001", "EECS", 2);
        student.activate();
        authService.getUserDAO().save(student);

        User loggedIn = authService.login("STUDENT@YORK.EDU", "SecurePass123!");
        assertNull(loggedIn);
    }

    // ============ FACULTY LOGIN TESTS ============

    @Test
    @DisplayName("should reject Faculty login when account is PENDING")
    public void testLogin_FacultyPending() {
        Faculty faculty = new Faculty("professor@york.edu", "SecurePass123!", "CS",
                "FAC001", "Professor");
        // Faculty starts in PENDING status
        authService.getUserDAO().save(faculty);

        assertThrows(IllegalStateException.class, () ->
            authService.login("professor@york.edu", "SecurePass123!")
        );
    }

    @Test
    @DisplayName("should allow Faculty login when account is ACTIVE")
    public void testLogin_FacultyActive() {
        Faculty faculty = new Faculty("professor@york.edu", "SecurePass123!", "CS",
                "FAC001", "Professor");
        faculty.activate();
        authService.getUserDAO().save(faculty);

        User loggedIn = authService.login("professor@york.edu", "SecurePass123!");
        assertNotNull(loggedIn);
        assertInstanceOf(Faculty.class, loggedIn);
    }

    // ============ SESSION MANAGEMENT TESTS ============

    @Test
    @DisplayName("should add user to active sessions on login")
    public void testActiveSessionsAfterLogin() {
        Student student = new Student("student@york.edu", "SecurePass123!", "CS",
                "STUD001", "EECS", 2);
        student.activate();
        authService.getUserDAO().save(student);

        authService.login("student@york.edu", "SecurePass123!");
        assertTrue(authService.isLoggedIn(student.getUserId()));
    }

    @Test
    @DisplayName("should remove user from active sessions on logout")
    public void testLogoutRemovesSession() {
        Student student = new Student("student@york.edu", "SecurePass123!", "CS",
                "STUD001", "EECS", 2);
        student.activate();
        authService.getUserDAO().save(student);

        authService.login("student@york.edu", "SecurePass123!");
        assertTrue(authService.isLoggedIn(student.getUserId()));

        authService.logout(student.getUserId());
        assertFalse(authService.isLoggedIn(student.getUserId()));
    }

    @Test
    @DisplayName("should retrieve active user by ID")
    public void testGetActiveUser() {
        Student student = new Student("student@york.edu", "SecurePass123!", "CS",
                "STUD001", "EECS", 2);
        student.activate();
        authService.getUserDAO().save(student);

        authService.login("student@york.edu", "SecurePass123!");
        User activeUser = authService.getActiveUser(student.getUserId());
        assertNotNull(activeUser);
        assertEquals("student@york.edu", activeUser.getEmail());
    }

    @Test
    @DisplayName("should return null for inactive user")
    public void testGetActiveUserInactive() {
        User activeUser = authService.getActiveUser("nonexistent-id");
        assertNull(activeUser);
    }

    @Test
    @DisplayName("should handle multiple active sessions")
    public void testMultipleActiveSessions() {
        Student student1 = new Student("s1@york.edu", "SecurePass123!", "CS",
                "S001", "EECS", 2);
        Student student2 = new Student("s2@york.edu", "SecurePass123!", "CS",
                "S002", "EECS", 3);
        student1.activate();
        student2.activate();
        authService.getUserDAO().save(student1);
        authService.getUserDAO().save(student2);

        authService.login("s1@york.edu", "SecurePass123!");
        authService.login("s2@york.edu", "SecurePass123!");

        assertTrue(authService.isLoggedIn(student1.getUserId()));
        assertTrue(authService.isLoggedIn(student2.getUserId()));
        assertEquals(2, authService.getActiveSessions().size());
    }

    // ============ STUDENT REGISTRATION TESTS ============

    @Test
    @DisplayName("should register Student successfully")
    public void testRegisterStudent() {
        User user = authService.registerUser(UserType.STUDENT, "newstudent@york.edu", 
                "SecurePass123!", "Computer Science", "STUD1001",
                "EECS", "3", null);

        assertNotNull(user);
        assertInstanceOf(Student.class, user);
        Student student = (Student) user;
        assertEquals("newstudent@york.edu", student.getEmail());
        assertEquals("EECS", student.getProgram());
        assertEquals(3, student.getYearOfStudy());
        assertEquals(AccountStatus.ACTIVE, student.getAccountStatus()); // Students are auto-activated
    }

    @Test
    @DisplayName("should activate Student automatically on registration")
    public void testStudentAutoActivated() {
        User user = authService.registerUser(UserType.STUDENT, "newstudent@york.edu", 
                "SecurePass123!", "Computer Science", "STUD1001",
                "EECS", "3", null);

        assertEquals(AccountStatus.ACTIVE, user.getAccountStatus());
    }

    // ============ GUEST REGISTRATION TESTS ============

    @Test
    @DisplayName("should register Guest successfully")
    public void testRegisterGuest() {
        User user = authService.registerUser(UserType.GUEST, "guest@external.com", 
                "SecurePass123!", "Engineering", "GUEST1001",
                "Tech Corp", "sponsor@techcorp.com", null);

        assertNotNull(user);
        assertInstanceOf(Guest.class, user);
        assertEquals(AccountStatus.ACTIVE, user.getAccountStatus()); // Guests are auto-activated
    }

    // ============ FACULTY REGISTRATION TESTS ============

    @Test
    @DisplayName("should register Faculty with PENDING status")
    public void testRegisterFacultyPending() {
        User user = authService.registerUser(UserType.FACULTY, "newfaculty@york.edu", 
                "SecurePass123!", "Computer Science", "FAC1001",
                "Full Professor", null, null);

        assertNotNull(user);
        assertInstanceOf(Faculty.class, user);
        assertEquals(AccountStatus.PENDING, user.getAccountStatus()); // Faculty remain PENDING
    }

    // ============ RESEARCHER REGISTRATION TESTS ============

    @Test
    @DisplayName("should register Researcher with PENDING status")
    public void testRegisterResearcherPending() {
        User user = authService.registerUser(UserType.RESEARCHER, "researcher@york.edu", 
                "SecurePass123!", "Computer Science", "RES1001",
                "Machine Learning", "GRANT-2024-001", null);

        assertNotNull(user);
        assertInstanceOf(Researcher.class, user);
        assertEquals(AccountStatus.PENDING, user.getAccountStatus()); // Researchers remain PENDING
    }

    // ============ REGISTRATION VALIDATION TESTS ============

    @Test
    @DisplayName("should reject registration with duplicate email")
    public void testRegisterDuplicateEmail() {
        authService.registerUser(UserType.STUDENT, "student@york.edu", 
                "SecurePass123!", "Computer Science", "STUD1001",
                "EECS", "1", null);

        assertThrows(IllegalArgumentException.class, () ->
            authService.registerUser(UserType.STUDENT, "student@york.edu", 
                    "SecurePass123!", "Computer Science", "STUD1002",
                    "EECS", "2", null)
        );
    }

    @Test
    @DisplayName("should reject registration with weak password")
    public void testRegisterWeakPassword() {
        assertThrows(IllegalArgumentException.class, () ->
            authService.registerUser(UserType.STUDENT, "student@york.edu", 
                    "weak", "Computer Science", "STUD1001",
                    "EECS", "1", null)
        );
    }

    @Test
    @DisplayName("should not allow public ADMIN registration")
    public void testRegisterAdminSecurityBlock() {
        assertThrows(SecurityException.class, () ->
            authService.registerUser(UserType.ADMIN, "admin@york.edu", 
                    "SecurePass123!", "IT", "MGR-ADMIN",
                    null, null, null)
        );
    }

    // ============ ADMIN APPROVAL TESTS ============

    @Test
    @DisplayName("should approve PENDING user account")
    public void testApproveUser() {
        User user = authService.registerUser(UserType.FACULTY, "faculty@york.edu", 
                "SecurePass123!", "Computer Science", "FAC1001",
                "Full Professor", null, null);

        assertEquals(AccountStatus.PENDING, user.getAccountStatus());

        authService.approveUser(user.getUserId());

        Faculty approved = (Faculty) authService.getUserDAO().findById(user.getUserId());
        assertEquals(AccountStatus.ACTIVE, approved.getAccountStatus());
    }

    @Test
    @DisplayName("should not change already approved accounts")
    public void testApproveAlreadyApproved() {
        User user = authService.registerUser(UserType.STUDENT, "student@york.edu", 
                "SecurePass123!", "Computer Science", "STUD1001",
                "EECS", "1", null);

        assertEquals(AccountStatus.ACTIVE, user.getAccountStatus());

        authService.approveUser(user.getUserId());

        Student student = (Student) authService.getUserDAO().findById(user.getUserId());
        assertEquals(AccountStatus.ACTIVE, student.getAccountStatus());
    }

    @Test
    @DisplayName("should handle approval of non-existent user")
    public void testApproveNonExistentUser() {
        assertDoesNotThrow(() ->
            authService.approveUser("nonexistent-user-id")
        );
    }

    // ============ MANAGER CREATION TESTS ============

    @Test
    @DisplayName("should allow head coordinator to create manager")
    public void testHeadCoordinatorCanCreateManager() {
        SystemAdministrator headAdmin = new SystemAdministrator("admin@york.edu", "SecurePass123!", "IT",
                "MGR-ADMIN", "ADMIN001", true);
        headAdmin.activate();
        authService.getUserDAO().save(headAdmin);

        assertTrue(authService.canCreateManagerAccount(headAdmin));

        User newManager = authService.createManagerAccount(headAdmin, "manager@york.edu",
                "SecurePass123!", "EECS", "MGR1001");

        assertNotNull(newManager);
        assertInstanceOf(Manager.class, newManager);
        assertEquals(AccountStatus.ACTIVE, newManager.getAccountStatus());
    }

    @Test
    @DisplayName("should reject manager creation by non-head-coordinator")
    public void testNonHeadCoordinatorCannotCreateManager() {
        SystemAdministrator nonHeadAdmin = new SystemAdministrator("admin@york.edu", "SecurePass123!", "IT",
                "MGR-ADMIN", "ADMIN001", false);
        nonHeadAdmin.activate();

        assertFalse(authService.canCreateManagerAccount(nonHeadAdmin));

        assertThrows(IllegalStateException.class, () ->
            authService.createManagerAccount(nonHeadAdmin, "manager@york.edu",
                    "SecurePass123!", "EECS", "MGR1001")
        );
    }

    @Test
    @DisplayName("should reject manager creation by non-admin user")
    public void testNonAdminCannotCreateManager() {
        Faculty faculty = new Faculty("prof@york.edu", "SecurePass123!", "CS", "FAC001", "Prof");
        faculty.activate();

        assertFalse(authService.canCreateManagerAccount(faculty));

        assertThrows(IllegalStateException.class, () ->
            authService.createManagerAccount(faculty, "manager@york.edu",
                    "SecurePass123!", "EECS", "MGR1001")
        );
    }

    @Test
    @DisplayName("should handle null user in canCreateManagerAccount")
    public void testCanCreateManagerNullUser() {
        assertFalse(authService.canCreateManagerAccount(null));
    }

    // ============ REGISTRATION PRESERVATION TESTS ============

    @Test
    @DisplayName("should preserve password after registration")
    public void testPasswordPreservedAfterRegistration() {
        User user = authService.registerUser(UserType.STUDENT, "student@york.edu", 
                "SecurePass123!", "Computer Science", "STUD1001",
                "EECS", "1", null);

        String email = user.getEmail();
        String password = user.getPassword();

        // Should be able to log in with same credentials
        User loggedIn = authService.login(email, password);
        assertNotNull(loggedIn);
    }

    // ============ EDGE CASES ============

    @Test
    @DisplayName("should handle trimmed email in registration")
    public void testRegistrationTrimsEmail() {
        User user = authService.registerUser(UserType.STUDENT, "  student@york.edu  ", 
                "SecurePass123!", "Computer Science", "STUD1001",
                "EECS", "1", null);

        assertEquals("student@york.edu", user.getEmail());
    }

    @Test
    @DisplayName("should verify registration persists to database")
    public void testRegistrationPersistedToDatabase() {
        authService.registerUser(UserType.STUDENT, "student@york.edu", 
                "SecurePass123!", "Computer Science", "STUD1001",
                "EECS", "2", null);

        User found = authService.getUserDAO().findByEmail("student@york.edu");
        assertNotNull(found);
        assertInstanceOf(Student.class, found);
    }
}
