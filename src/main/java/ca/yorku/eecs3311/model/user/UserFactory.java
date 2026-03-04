package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.UserType;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

/**
 * Factory for creating User instances either from CSV rows or programmatically.
 */
public final class UserFactory {

	private UserFactory() { /* static factory */ }

	/**
	 * Create a User from a CSV line. Expected CSV order:
	 * userId,email,password,userType,accountStatus,registrationDate,department,<type-specific...>
	 *
	 * Type-specific fields (after department):
	 * - STUDENT: studentID,program,yearOfStudy
	 * - RESEARCHER: researcherID,researchArea,grantNumber
	 * - FACULTY: facultyID,position
	 * - GUEST: guestID,organization,sponsorEmail
	 * - MANAGER: managerID
	 * - ADMIN: managerID,adminID,isHeadCoordinator
	 */
	public static User createFromCSV(String csvLine) {
		if (csvLine == null) throw new IllegalArgumentException("csvLine is null");
		String[] parts = Arrays.stream(csvLine.split(",", -1)).map(String::trim).toArray(String[]::new);
		if (parts.length < 7) throw new IllegalArgumentException("CSV must have at least 7 columns");

		String userId = parts[0];
		String email = parts[1];
		String password = parts[2];
		UserType userType;
		AccountStatus accountStatus;
		LocalDateTime registrationDate;
		try {
			userType = UserType.valueOf(parts[3]);
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid userType: " + parts[3]);
		}
		try {
			accountStatus = AccountStatus.valueOf(parts[4]);
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid accountStatus: " + parts[4]);
		}
		try {
			registrationDate = LocalDateTime.parse(parts[5]);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Invalid registrationDate: " + parts[5]);
		}

		String department = parts[6];

		switch (userType) {
			case STUDENT: {
				if (parts.length < 10) throw new IllegalArgumentException("Not enough fields for STUDENT");
				String studentID = parts[7];
				String program = parts[8];
				int year = Integer.parseInt(parts[9]);
				return new Student(userId, email, password, accountStatus, registrationDate, department,
						studentID, program, year);
			}
			case RESEARCHER: {
				if (parts.length < 10) throw new IllegalArgumentException("Not enough fields for RESEARCHER");
				String researcherID = parts[7];
				String researchArea = parts[8];
				String grantNumber = parts[9];
				return new Researcher(userId, email, password, accountStatus, registrationDate, department,
						researcherID, researchArea, grantNumber);
			}
			case FACULTY: {
				if (parts.length < 9) throw new IllegalArgumentException("Not enough fields for FACULTY");
				String facultyID = parts[7];
				String position = parts[8];
				return new Faculty(userId, email, password, accountStatus, registrationDate, department,
						facultyID, position);
			}
			case GUEST: {
				if (parts.length < 10) throw new IllegalArgumentException("Not enough fields for GUEST");
				String guestID = parts[7];
				String organization = parts[8];
				String sponsorEmail = parts[9];
				return new Guest(userId, email, password, accountStatus, registrationDate, department,
						guestID, organization, sponsorEmail);
			}
			case MANAGER: {
				if (parts.length < 8) throw new IllegalArgumentException("Not enough fields for MANAGER");
				String managerID = parts[7];
				return new Manager(userId, email, password, accountStatus, registrationDate, department, managerID);
			}
			case ADMIN: {
				if (parts.length < 10) throw new IllegalArgumentException("Not enough fields for ADMIN");
				String managerID = parts[7];
				String adminID = parts[8];
				boolean isHead = Boolean.parseBoolean(parts[9]);
				return new SystemAdministrator(userId, email, password, accountStatus, registrationDate, department,
						managerID, adminID, isHead);
			}
			default:
				throw new IllegalArgumentException("Unhandled UserType: " + userType);
		}
	}

	/**
	 * Create a new (not-from-CSV) user. Extras are type-specific and follow the same order
	 * described in {@link #createFromCSV(String)} after department.
	 */
	public static User createNew(UserType userType, String email, String password, String department, String... extras) {
		switch (userType) {
			case STUDENT: {
				if (extras.length < 3) throw new IllegalArgumentException("STUDENT requires studentID, program, year");
				String studentID = extras[0];
				String program = extras[1];
				int year = Integer.parseInt(extras[2]);
				return new Student(email, password, department, studentID, program, year);
			}

			/**
			 * Convenience factory that matches the project context API:
			 * createUser(type, email, password, credentialNumber)
			 * <p>
			 * Department and other type-specific fields are filled with sensible defaults
			 * (empty strings or minimal defaults) so callers that only supply a credential
			 * number can register a user quickly.
			 */
			public static User createUser(UserType userType, String email, String password, String credentialNumber) {
				String department = "";
				switch (userType) {
					case STUDENT:
						return createNew(UserType.STUDENT, email, password, department,
								credentialNumber, "", "1");
					case RESEARCHER:
						return createNew(UserType.RESEARCHER, email, password, department,
								credentialNumber, "", "");
					case FACULTY:
						return createNew(UserType.FACULTY, email, password, department,
								credentialNumber, "");
					case GUEST:
						return createNew(UserType.GUEST, email, password, department,
								credentialNumber, "", "");
					case MANAGER:
						return createNew(UserType.MANAGER, email, password, department,
								credentialNumber);
					case ADMIN:
						return createNew(UserType.ADMIN, email, password, department,
								credentialNumber, credentialNumber + "_admin", "false");
					default:
						throw new IllegalArgumentException("Unhandled UserType: " + userType);
				}
			}
			case RESEARCHER: {
				if (extras.length < 3) throw new IllegalArgumentException("RESEARCHER requires researcherID, researchArea, grantNumber");
				String researcherID = extras[0];
				String researchArea = extras[1];
				String grantNumber = extras[2];
				return new Researcher(email, password, department, researcherID, researchArea, grantNumber);
			}
			case FACULTY: {
				if (extras.length < 2) throw new IllegalArgumentException("FACULTY requires facultyID and position");
				String facultyID = extras[0];
				String position = extras[1];
				return new Faculty(email, password, department, facultyID, position);
			}
			case GUEST: {
				if (extras.length < 3) throw new IllegalArgumentException("GUEST requires guestID, organization, sponsorEmail");
				String guestID = extras[0];
				String organization = extras[1];
				String sponsorEmail = extras[2];
				return new Guest(email, password, department, guestID, organization, sponsorEmail);
			}
			case MANAGER: {
				if (extras.length < 1) throw new IllegalArgumentException("MANAGER requires managerID");
				String managerID = extras[0];
				return new Manager(email, password, department, managerID);
			}
			case ADMIN: {
				if (extras.length < 3) throw new IllegalArgumentException("ADMIN requires managerID, adminID, isHeadCoordinator");
				String managerID = extras[0];
				String adminID = extras[1];
				boolean isHead = Boolean.parseBoolean(extras[2]);
				return new SystemAdministrator(email, password, department, managerID, adminID, isHead);
			}
			default:
				throw new IllegalArgumentException("Unhandled UserType: " + userType);
		}
	}

}

