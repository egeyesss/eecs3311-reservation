package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.user.*;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive test suite for UserDAO, covering CRUD operations
 * and CSV persistence across all user types.
 */
public class UserDAOManualTest {

    private UserDAO userDAO;
    private static final String TEST_FILE_PATH = "src/main/resources/data/users.csv";
    private String backupFilePath;

    @BeforeEach
    public void setUp() throws IOException {
        userDAO = new UserDAO();
        // Backup existing CSV before running tests
        Path testPath = Paths.get(TEST_FILE_PATH);
        if (Files.exists(testPath)) {
            backupFilePath = TEST_FILE_PATH + ".backup";
            Files.copy(testPath, Paths.get(backupFilePath));
        }
        // Clear the CSV file for testing
        File file = new File(TEST_FILE_PATH);
        file.getParentFile().mkdirs();
        Files.write(testPath, new byte[0]);
        // Write header
        String header = "userId,email,password,userType,accountStatus,registrationDate," +
                "department,credentialNumber,extraField1,extraField2,extraField3\n";
        Files.write(testPath, header.getBytes());
    }

    @AfterEach
    public void tearDown() throws IOException {
        // Restore backup if it exists
        if (backupFilePath != null) {
            Path testPath = Paths.get(TEST_FILE_PATH);
            Path backupPath = Paths.get(backupFilePath);
            if (Files.exists(backupPath)) {
                Files.copy(backupPath, testPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                Files.delete(backupPath);
            }
        }
    }

    // ============ STUDENT TESTS ============

    @Test
    @DisplayName("should save and retrieve Student by ID")
    public void testSaveAndFindStudentById() {
        Student student = new Student("student@york.edu", "SecurePass123!", "Computer Science",
                "STUD001", "EECS", 2);
        userDAO.save(student);

        User retrieved = userDAO.findById(student.getUserId());
        assertNotNull(retrieved);
        assertInstanceOf(Student.class, retrieved);
        Student retrievedStudent = (Student) retrieved;
        assertEquals("STUD001", retrievedStudent.getStudentID());
        assertEquals("EECS", retrievedStudent.getProgram());
        assertEquals(2, retrievedStudent.getYearOfStudy());
    }

    @Test
    @DisplayName("should save and retrieve Student by email (case-insensitive)")
    public void testFindStudentByEmailCaseInsensitive() {
        Student student = new Student("student@york.edu", "SecurePass123!", "Computer Science",
                "STUD001", "EECS", 3);
        userDAO.save(student);

        User retrieved = userDAO.findByEmail("STUDENT@YORK.EDU");
        assertNotNull(retrieved);
        assertInstanceOf(Student.class, retrieved);
        assertEquals("student@york.edu", retrieved.getEmail());
    }

    @Test
    @DisplayName("should return null when Student not found by ID")
    public void testFindStudentByIdNotFound() {
        User notFound = userDAO.findById("nonexistent-id-12345");
        assertNull(notFound);
    }

    @Test
    @DisplayName("should return null when Student not found by email")
    public void testFindStudentByEmailNotFound() {
        User notFound = userDAO.findByEmail("nonexistent@york.edu");
        assertNull(notFound);
    }

    @Test
    @DisplayName("should delete Student by ID")
    public void testDeleteStudent() {
        Student student = new Student("student@york.edu", "SecurePass123!", "Computer Science",
                "STUD001", "EECS", 1);
        userDAO.save(student);
        String studentId = student.getUserId();

        userDAO.delete(studentId);
        User deleted = userDAO.findById(studentId);
        assertNull(deleted);
    }

    @Test
    @DisplayName("should update Student information")
    public void testUpdateStudent() {
        Student student = new Student("student@york.edu", "SecurePass123!", "Computer Science",
                "STUD001", "EECS", 1);
        userDAO.save(student);
        String studentId = student.getUserId();

        student.setProgram("Computer Engineering");
        student.setYearOfStudy(3);
        student.setEmail("newemail@york.edu");
        userDAO.save(student);

        Student updated = (Student) userDAO.findById(studentId);
        assertEquals("Computer Engineering", updated.getProgram());
        assertEquals(3, updated.getYearOfStudy());
        assertEquals("newemail@york.edu", updated.getEmail());
    }

    // ============ FACULTY TESTS ============

    @Test
    @DisplayName("should save and retrieve Faculty")
    public void testSaveAndFindFaculty() {
        Faculty faculty = new Faculty("professor@york.edu", "SecurePass123!", "Computer Science",
                "FAC001", "Full Professor");
        userDAO.save(faculty);

        User retrieved = userDAO.findById(faculty.getUserId());
        assertNotNull(retrieved);
        assertInstanceOf(Faculty.class, retrieved);
        Faculty retrievedFaculty = (Faculty) retrieved;
        assertEquals("FAC001", retrievedFaculty.getFacultyID());
        assertEquals("Full Professor", retrievedFaculty.getPosition());
    }

    @Test
    @DisplayName("should update Faculty position")
    public void testUpdateFacultyPosition() {
        Faculty faculty = new Faculty("professor@york.edu", "SecurePass123!", "Computer Science",
                "FAC001", "Associate Professor");
        userDAO.save(faculty);

        faculty.setPosition("Full Professor");
        userDAO.save(faculty);

        Faculty updated = (Faculty) userDAO.findById(faculty.getUserId());
        assertEquals("Full Professor", updated.getPosition());
    }

    // ============ RESEARCHER TESTS ============

    @Test
    @DisplayName("should save and retrieve Researcher with grant info")
    public void testSaveAndFindResearcher() {
        Researcher researcher = new Researcher("researcher@york.edu", "SecurePass123!", "Computer Science",
                "RES001", "Machine Learning", "GRANT-2024-001");
        userDAO.save(researcher);

        User retrieved = userDAO.findById(researcher.getUserId());
        assertNotNull(retrieved);
        assertInstanceOf(Researcher.class, retrieved);
        Researcher retrievedResearcher = (Researcher) retrieved;
        assertEquals("RES001", retrievedResearcher.getResearcherID());
        assertEquals("Machine Learning", retrievedResearcher.getResearchArea());
        assertEquals("GRANT-2024-001", retrievedResearcher.getGrantNumber());
    }

    @Test
    @DisplayName("should update Researcher grant information")
    public void testUpdateResearcherGrant() {
        Researcher researcher = new Researcher("researcher@york.edu", "SecurePass123!", "Computer Science",
                "RES001", "AI", "GRANT-2024-001");
        userDAO.save(researcher);

        researcher.setGrantNumber("GRANT-2025-002");
        researcher.setResearchArea("Deep Learning");
        userDAO.save(researcher);

        Researcher updated = (Researcher) userDAO.findById(researcher.getUserId());
        assertEquals("GRANT-2025-002", updated.getGrantNumber());
        assertEquals("Deep Learning", updated.getResearchArea());
    }

    // ============ GUEST TESTS ============

    @Test
    @DisplayName("should save and retrieve Guest with sponsor info")
    public void testSaveAndFindGuest() {
        Guest guest = new Guest("guest@external.com", "SecurePass123!", "Engineering",
                "GUEST001", "Tech Corp", "sponsor@techcorp.com");
        userDAO.save(guest);

        User retrieved = userDAO.findById(guest.getUserId());
        assertNotNull(retrieved);
        assertInstanceOf(Guest.class, retrieved);
        Guest retrievedGuest = (Guest) retrieved;
        assertEquals("GUEST001", retrievedGuest.getGuestID());
        assertEquals("Tech Corp", retrievedGuest.getOrganization());
        assertEquals("sponsor@techcorp.com", retrievedGuest.getSponsorEmail());
    }

    @Test
    @DisplayName("should update Guest organization and sponsor")
    public void testUpdateGuest() {
        Guest guest = new Guest("guest@external.com", "SecurePass123!", "Engineering",
                "GUEST001", "Company A", "sponsor@a.com");
        userDAO.save(guest);

        guest.setOrganization("Company B");
        guest.setSponsorEmail("sponsor@b.com");
        userDAO.save(guest);

        Guest updated = (Guest) userDAO.findById(guest.getUserId());
        assertEquals("Company B", updated.getOrganization());
        assertEquals("sponsor@b.com", updated.getSponsorEmail());
    }

    // ============ MANAGER TESTS ============

    @Test
    @DisplayName("should save and retrieve Manager")
    public void testSaveAndFindManager() {
        Manager manager = new Manager("manager@york.edu", "SecurePass123!", "EECS", "MGR001");
        userDAO.save(manager);

        User retrieved = userDAO.findById(manager.getUserId());
        assertNotNull(retrieved);
        assertInstanceOf(Manager.class, retrieved);
        Manager retrievedManager = (Manager) retrieved;
        assertEquals("MGR001", retrievedManager.getManagerID());
        assertEquals(UserType.MANAGER, retrievedManager.getUserType());
    }

    @Test
    @DisplayName("should persist empty Manager state correctly")
    public void testManagerWithEmptyLabs() {
        Manager manager = new Manager("manager@york.edu", "SecurePass123!", "EECS", "MGR001");
        userDAO.save(manager);

        Manager retrieved = (Manager) userDAO.findById(manager.getUserId());
        assertTrue(retrieved.getAssignedLabs().isEmpty());
        assertTrue(retrieved.getPermissions().isEmpty());
    }

    // ============ SYSTEM ADMINISTRATOR TESTS ============

    @Test
    @DisplayName("should save and retrieve SystemAdministrator")
    public void testSaveAndFindSystemAdministrator() {
        SystemAdministrator admin = new SystemAdministrator("admin@york.edu", "SecurePass123!", "IT",
                "MGR-ADMIN", "ADMIN001", true);
        userDAO.save(admin);

        User retrieved = userDAO.findById(admin.getUserId());
        assertNotNull(retrieved);
        assertInstanceOf(SystemAdministrator.class, retrieved);
        SystemAdministrator retrievedAdmin = (SystemAdministrator) retrieved;
        assertEquals("ADMIN001", retrievedAdmin.getAdminID());
        assertTrue(retrievedAdmin.isHeadCoordinator());
        assertEquals(UserType.ADMIN, retrievedAdmin.getUserType());
    }

    @Test
    @DisplayName("should update SystemAdministrator head coordinator status")
    public void testUpdateAdminHeadCoordinatorStatus() {
        SystemAdministrator admin = new SystemAdministrator("admin@york.edu", "SecurePass123!", "IT",
                "MGR-ADMIN", "ADMIN001", false);
        userDAO.save(admin);

        admin.setHeadCoordinator(true);
        userDAO.save(admin);

        SystemAdministrator updated = (SystemAdministrator) userDAO.findById(admin.getUserId());
        assertTrue(updated.isHeadCoordinator());
    }

    // ============ ACCOUNT STATUS TESTS ============

    @Test
    @DisplayName("should preserve account status (PENDING)")
    public void testPreservePendingStatus() {
        Student student = new Student("student@york.edu", "SecurePass123!", "Computer Science",
                "STUD001", "EECS", 2);
        student.setAccountStatus(AccountStatus.PENDING);
        userDAO.save(student);

        Student retrieved = (Student) userDAO.findById(student.getUserId());
        assertEquals(AccountStatus.PENDING, retrieved.getAccountStatus());
    }

    @Test
    @DisplayName("should preserve account status (ACTIVE)")
    public void testPreserveActiveStatus() {
        Faculty faculty = new Faculty("professor@york.edu", "SecurePass123!", "Computer Science",
                "FAC001", "Full Professor");
        faculty.activate();
        userDAO.save(faculty);

        Faculty retrieved = (Faculty) userDAO.findById(faculty.getUserId());
        assertEquals(AccountStatus.ACTIVE, retrieved.getAccountStatus());
    }

    @Test
    @DisplayName("should preserve account status (SUSPENDED)")
    public void testPreserveSuspendedStatus() {
        Researcher researcher = new Researcher("researcher@york.edu", "SecurePass123!", "Computer Science",
                "RES001", "ML", "GRANT-001");
        researcher.suspend();
        userDAO.save(researcher);

        Researcher retrieved = (Researcher) userDAO.findById(researcher.getUserId());
        assertEquals(AccountStatus.SUSPENDED, retrieved.getAccountStatus());
    }

    @Test
    @DisplayName("should preserve account status (DEACTIVATED)")
    public void testPreserveDeactivatedStatus() {
        Guest guest = new Guest("guest@external.com", "SecurePass123!", "Engineering",
                "GUEST001", "Corp", "sponsor@corp.com");
        guest.deactivate();
        userDAO.save(guest);

        Guest retrieved = (Guest) userDAO.findById(guest.getUserId());
        assertEquals(AccountStatus.DEACTIVATED, retrieved.getAccountStatus());
    }

    // ============ MULTIPLE USER TESTS ============

    @Test
    @DisplayName("should load all users from CSV")
    public void testLoadAll() {
        Student student = new Student("student@york.edu", "Pass123!", "CS", "S001", "EECS", 2);
        Faculty faculty = new Faculty("prof@york.edu", "Pass123!", "CS", "F001", "Professor");
        Researcher researcher = new Researcher("res@york.edu", "Pass123!", "CS", "R001", "ML", "G001");

        userDAO.save(student);
        userDAO.save(faculty);
        userDAO.save(researcher);

        List<User> allUsers = userDAO.loadAll();
        assertEquals(3, allUsers.size());
    }

    @Test
    @DisplayName("should handle empty database")
    public void testLoadAllEmpty() {
        List<User> allUsers = userDAO.loadAll();
        assertTrue(allUsers.isEmpty());
    }

    @Test
    @DisplayName("should not find user after deletion")
    public void testDeleteAndVerifyNotFound() {
        Manager manager = new Manager("manager@york.edu", "Pass123!", "EECS", "MGR001");
        userDAO.save(manager);
        String managerId = manager.getUserId();

        userDAO.delete(managerId);
        assertNull(userDAO.findById(managerId));
    }

    // ============ EMAIL UNIQUENESS TESTS ============

    @Test
    @DisplayName("should handle multiple users without email collision")
    public void testMultipleUsersNoEmailCollision() {
        Student student = new Student("student1@york.edu", "Pass123!", "CS", "S001", "EECS", 1);
        Faculty faculty = new Faculty("faculty@york.edu", "Pass123!", "CS", "F001", "Prof");
        userDAO.save(student);
        userDAO.save(faculty);

        assertNotNull(userDAO.findByEmail("student1@york.edu"));
        assertNotNull(userDAO.findByEmail("faculty@york.edu"));
    }

    // ============ PERSISTENCE TESTS ============

    @Test
    @DisplayName("should persist Student across multiple DAO instances")
    public void testPersistenceAcrossDAOInstances() {
        UserDAO dao1 = new UserDAO();
        Student student = new Student("student@york.edu", "Pass123!", "CS", "S001", "EECS", 2);
        dao1.save(student);
        String studentId = student.getUserId();

        UserDAO dao2 = new UserDAO();
        Student retrieved = (Student) dao2.findById(studentId);
        assertNotNull(retrieved);
        assertEquals("S001", retrieved.getStudentID());
    }

    @Test
    @DisplayName("should maintain data integrity after save and reload")
    public void testDataIntegrityAfterSaveAndReload() {
        Student student = new Student("student@york.edu", "ComplexPass123!", "Computer Science",
                "STUD-2024-001", "Software Engineering", 3);
        student.activate();
        userDAO.save(student);

        Student retrieved = (Student) userDAO.findById(student.getUserId());
        assertEquals("STUD-2024-001", retrieved.getStudentID());
        assertEquals("Software Engineering", retrieved.getProgram());
        assertEquals(3, retrieved.getYearOfStudy());
        assertEquals(AccountStatus.ACTIVE, retrieved.getAccountStatus());
    }
}
