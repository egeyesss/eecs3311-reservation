package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.UserType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test suite for UserFactory, covering all user type creation paths.
 */
public class UserFactoryManualTest {

    // ============ STUDENT CREATION TESTS ============

    @Test
    @DisplayName("should create Student with basic factory method")
    public void testCreateStudentBasic() {
        User user = UserFactory.createUser(UserType.STUDENT, "student@york.edu", "SecurePass123!",
                "Computer Science", "STUD001", null, null, null);

        assertNotNull(user);
        assertInstanceOf(Student.class, user);
        Student student = (Student) user;
        assertEquals("student@york.edu", student.getEmail());
        assertEquals("STUD001", student.getStudentID());
        assertEquals(UserType.STUDENT, student.getUserType());
    }

    @Test
    @DisplayName("should create Student with program and year")
    public void testCreateStudentWithDetails() {
        User user = UserFactory.createUser(UserType.STUDENT, "student@york.edu", "SecurePass123!",
                "Computer Science", "STUD001", "EECS", "3", null);

        Student student = (Student) user;
        assertEquals("EECS", student.getProgram());
        assertEquals(3, student.getYearOfStudy());
    }

    @Test
    @DisplayName("should create Student with default year 1 if not specified")
    public void testCreateStudentDefaultYear() {
        User user = UserFactory.createUser(UserType.STUDENT, "student@york.edu", "SecurePass123!",
                "Computer Science", "STUD001", "EECS", null, null);

        Student student = (Student) user;
        assertEquals(1, student.getYearOfStudy());
    }

    // ============ FACULTY CREATION TESTS ============

    @Test
    @DisplayName("should create Faculty with factory method")
    public void testCreateFaculty() {
        User user = UserFactory.createUser(UserType.FACULTY, "professor@york.edu", "SecurePass123!",
                "Computer Science", "FAC001", "Full Professor", null, null);

        assertNotNull(user);
        assertInstanceOf(Faculty.class, user);
        Faculty faculty = (Faculty) user;
        assertEquals("professor@york.edu", faculty.getEmail());
        assertEquals("FAC001", faculty.getFacultyID());
        assertEquals("Full Professor", faculty.getPosition());
    }

    @Test
    @DisplayName("should create Faculty with overload method")
    public void testCreateFacultyOverload() {
        User user = UserFactory.createUser(UserType.FACULTY, "professor@york.edu", "SecurePass123!",
                "Computer Science", "FAC001");

        assertInstanceOf(Faculty.class, user);
        Faculty faculty = (Faculty) user;
        assertEquals("FAC001", faculty.getFacultyID());
    }

    // ============ RESEARCHER CREATION TESTS ============

    @Test
    @DisplayName("should create Researcher with all fields")
    public void testCreateResearcher() {
        User user = UserFactory.createUser(UserType.RESEARCHER, "researcher@york.edu", "SecurePass123!",
                "Computer Science", "RES001", "Machine Learning", "GRANT-2024-001", null);

        assertNotNull(user);
        assertInstanceOf(Researcher.class, user);
        Researcher researcher = (Researcher) user;
        assertEquals("researcher@york.edu", researcher.getEmail());
        assertEquals("RES001", researcher.getResearcherID());
        assertEquals("Machine Learning", researcher.getResearchArea());
        assertEquals("GRANT-2024-001", researcher.getGrantNumber());
    }

    @Test
    @DisplayName("should create Researcher with default grant empty string")
    public void testCreateResearcherDefaultGrant() {
        User user = UserFactory.createUser(UserType.RESEARCHER, "researcher@york.edu", "SecurePass123!",
                "Computer Science", "RES001", "Machine Learning", null, null);

        Researcher researcher = (Researcher) user;
        assertEquals("", researcher.getGrantNumber());
    }

    // ============ GUEST CREATION TESTS ============

    @Test
    @DisplayName("should create Guest with all fields")
    public void testCreateGuest() {
        User user = UserFactory.createUser(UserType.GUEST, "guest@external.com", "SecurePass123!",
                "Engineering", "GUEST001", "Tech Corp", "sponsor@techcorp.com", null);

        assertNotNull(user);
        assertInstanceOf(Guest.class, user);
        Guest guest = (Guest) user;
        assertEquals("guest@external.com", guest.getEmail());
        assertEquals("GUEST001", guest.getGuestID());
        assertEquals("Tech Corp", guest.getOrganization());
        assertEquals("sponsor@techcorp.com", guest.getSponsorEmail());
    }

    @Test
    @DisplayName("should create Guest with default values")
    public void testCreateGuestDefaults() {
        User user = UserFactory.createUser(UserType.GUEST, "guest@external.com", "SecurePass123!",
                "Engineering", "GUEST001", null, null, null);

        Guest guest = (Guest) user;
        assertEquals("", guest.getOrganization());
        assertEquals("", guest.getSponsorEmail());
    }

    // ============ MANAGER CREATION TESTS ============

    @Test
    @DisplayName("should create Manager with factory method")
    public void testCreateManager() {
        User user = UserFactory.createUser(UserType.MANAGER, "manager@york.edu", "SecurePass123!",
                "EECS", "MGR001", null, null, null);

        assertNotNull(user);
        assertInstanceOf(Manager.class, user);
        Manager manager = (Manager) user;
        assertEquals("manager@york.edu", manager.getEmail());
        assertEquals("MGR001", manager.getManagerID());
        assertEquals(UserType.MANAGER, manager.getUserType());
    }

    @Test
    @DisplayName("should create Manager with overload method")
    public void testCreateManagerOverload() {
        User user = UserFactory.createUser(UserType.MANAGER, "manager@york.edu", "SecurePass123!",
                "EECS", "MGR001");

        assertInstanceOf(Manager.class, user);
        Manager manager = (Manager) user;
        assertEquals("MGR001", manager.getManagerID());
    }

    // ============ ADMIN CREATION TESTS ============

    @Test
    @DisplayName("should create SystemAdministrator (Admin) with head coordinator true")
    public void testCreateAdminHeadCoordinator() {
        User user = UserFactory.createUser(UserType.ADMIN, "admin@york.edu", "SecurePass123!",
                "IT", "MGR-ADMIN", null, "ADMIN001", "true");

        assertNotNull(user);
        assertInstanceOf(SystemAdministrator.class, user);
        SystemAdministrator admin = (SystemAdministrator) user;
        assertEquals("admin@york.edu", admin.getEmail());
        assertEquals("ADMIN001", admin.getAdminID());
        assertTrue(admin.isHeadCoordinator());
        assertEquals(UserType.ADMIN, admin.getUserType());
    }

    @Test
    @DisplayName("should create SystemAdministrator with head coordinator false")
    public void testCreateAdminNonHeadCoordinator() {
        User user = UserFactory.createUser(UserType.ADMIN, "admin@york.edu", "SecurePass123!",
                "IT", "MGR-ADMIN", null, "ADMIN001", "false");

        SystemAdministrator admin = (SystemAdministrator) user;
        assertFalse(admin.isHeadCoordinator());
    }

    @Test
    @DisplayName("should create Admin with overload method")
    public void testCreateAdminOverload() {
        User user = UserFactory.createUser(UserType.ADMIN, "admin@york.edu", "SecurePass123!",
                "IT", "MGR-ADMIN");

        assertInstanceOf(SystemAdministrator.class, user);
    }

    // ============ NULL VALIDATION TESTS ============

    @Test
    @DisplayName("should throw exception for null UserType")
    public void testNullUserType() {
        assertThrows(IllegalArgumentException.class, () ->
            UserFactory.createUser(null, "test@york.edu", "Pass123!",
                    "CS", "USR001", null, null, null)
        );
    }

    @Test
    @DisplayName("should throw exception for null email")
    public void testNullEmail() {
        assertThrows(IllegalArgumentException.class, () ->
            UserFactory.createUser(UserType.STUDENT, null, "Pass123!",
                    "CS", "STUD001", null, null, null)
        );
    }

    @Test
    @DisplayName("should throw exception for empty email")
    public void testEmptyEmail() {
        assertThrows(IllegalArgumentException.class, () ->
            UserFactory.createUser(UserType.STUDENT, "", "Pass123!",
                    "CS", "STUD001", null, null, null)
        );
    }

    @Test
    @DisplayName("should throw exception for null password")
    public void testNullPassword() {
        assertThrows(IllegalArgumentException.class, () ->
            UserFactory.createUser(UserType.STUDENT, "student@york.edu", null,
                    "CS", "STUD001", null, null, null)
        );
    }

    @Test
    @DisplayName("should throw exception for empty password")
    public void testEmptyPassword() {
        assertThrows(IllegalArgumentException.class, () ->
            UserFactory.createUser(UserType.STUDENT, "student@york.edu", "",
                    "CS", "STUD001", null, null, null)
        );
    }

    @Test
    @DisplayName("should throw exception for unsupported user type")
    public void testUnsupportedUserType() {
        // Create a mock unsupported type by trying to create with null converted to enum
        assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser((UserType) null, "test@york.edu", "Pass123!",
                    "CS", "USR001", null, null, null);
        });
    }

    // ============ WHITESPACE TRIM TESTS ============

    @Test
    @DisplayName("should handle email with extra whitespace")
    public void testEmailWithWhitespace() {
        User user = UserFactory.createUser(UserType.STUDENT, "  student@york.edu  ", "SecurePass123!",
                "Computer Science", "STUD001", null, null, null);

        Student student = (Student) user;
        // Email is stored as-is; registration trims it
        assertEquals("  student@york.edu  ", student.getEmail());
    }

    // ============ SPECIAL FIELDS HANDLING TESTS ============

    @Test
    @DisplayName("should handle null extraField1 by using empty string")
    public void testNullExtraField1() {
        User user = UserFactory.createUser(UserType.STUDENT, "student@york.edu", "SecurePass123!",
                "Computer Science", "STUD001", null, "2", null);

        Student student = (Student) user;
        assertEquals("", student.getProgram());
    }

    @Test
    @DisplayName("should handle null extraField2 for Student")
    public void testNullExtraField2ForStudent() {
        User user = UserFactory.createUser(UserType.STUDENT, "student@york.edu", "SecurePass123!",
                "Computer Science", "STUD001", "EECS", null, null);

        Student student = (Student) user;
        assertEquals(1, student.getYearOfStudy()); // Should default to 1
    }

    // ============ CONSISTENCY TESTS ============

    @Test
    @DisplayName("should create users with consistent properties across multiple creations")
    public void testConsistentCreations() {
        User user1 = UserFactory.createUser(UserType.FACULTY, "prof1@york.edu", "SecurePass123!",
                "Computer Science", "FAC001", "Professor", null, null);
        User user2 = UserFactory.createUser(UserType.FACULTY, "prof2@york.edu", "SecurePass123!",
                "Computer Science", "FAC002", "Professor", null, null);

        Faculty faculty1 = (Faculty) user1;
        Faculty faculty2 = (Faculty) user2;

        assertEquals(faculty1.getUserType(), faculty2.getUserType());
        assertEquals(faculty1.getHourlyRate(), faculty2.getHourlyRate());
    }

    @Test
    @DisplayName("should create users with unique IDs")
    public void testUniqueUserIds() {
        User user1 = UserFactory.createUser(UserType.STUDENT, "s1@york.edu", "SecurePass123!",
                "CS", "STUD001", null, null, null);
        User user2 = UserFactory.createUser(UserType.STUDENT, "s2@york.edu", "SecurePass123!",
                "CS", "STUD002", null, null, null);

        assertNotEquals(user1.getUserId(), user2.getUserId());
    }

    // ============ OVERLOAD METHOD TESTS ============

    @Test
    @DisplayName("should handle overload method for Student")
    public void testOverloadMethodStudent() {
        User user = UserFactory.createUser(UserType.STUDENT, "student@york.edu", "SecurePass123!",
                "Computer Science", "STUD001");

        assertNotNull(user);
        assertInstanceOf(Student.class, user);
    }

    @Test
    @DisplayName("should handle overload method for Researcher")
    public void testOverloadMethodResearcher() {
        // Overload method creates with null extra fields - uses defaults
        User user = UserFactory.createUser(UserType.RESEARCHER, "r@york.edu", "Pass123!",
                "CS", "RES001");
        assertNotNull(user);
        assertInstanceOf(Researcher.class, user);
    }

    @Test
    @DisplayName("should handle overload method for Guest")
    public void testOverloadMethodGuest() {
        User user = UserFactory.createUser(UserType.GUEST, "g@external.com", "Pass123!",
                "Eng", "GUEST001");
        assertNotNull(user);
        assertInstanceOf(Guest.class, user);
    }

    // ============ INTEGER PARSING TESTS ============

    @Test
    @DisplayName("should parse year of study as integer")
    public void testYearOfStudyIntegerParsing() {
        User user = UserFactory.createUser(UserType.STUDENT, "student@york.edu", "SecurePass123!",
                "Computer Science", "STUD001", "EECS", "4", null);

        Student student = (Student) user;
        assertEquals(4, student.getYearOfStudy());
    }

    @Test
    @DisplayName("should handle invalid year format gracefully")
    public void testInvalidYearFormat() {
        assertThrows(NumberFormatException.class, () ->
            UserFactory.createUser(UserType.STUDENT, "student@york.edu", "SecurePass123!",
                    "Computer Science", "STUD001", "EECS", "not_a_number", null)
        );
    }

    // ============ BOOLEAN PARSING TESTS ============

    @Test
    @DisplayName("should parse boolean for admin head coordinator status")
    public void testBooleanParsingAdmin() {
        User user1 = UserFactory.createUser(UserType.ADMIN, "a1@york.edu", "Pass123!",
                "IT", "M1", null, "A1", "true");
        User user2 = UserFactory.createUser(UserType.ADMIN, "a2@york.edu", "Pass123!",
                "IT", "M2", null, "A2", "false");

        SystemAdministrator admin1 = (SystemAdministrator) user1;
        SystemAdministrator admin2 = (SystemAdministrator) user2;

        assertTrue(admin1.isHeadCoordinator());
        assertFalse(admin2.isHeadCoordinator());
    }

    @Test
    @DisplayName("should default to false for invalid boolean")
    public void testInvalidBooleanDefaultsFalse() {
        User user = UserFactory.createUser(UserType.ADMIN, "a@york.edu", "Pass123!",
                "IT", "M1", null, "A1", "something_invalid");

        SystemAdministrator admin = (SystemAdministrator) user;
        assertFalse(admin.isHeadCoordinator());
    }
}
