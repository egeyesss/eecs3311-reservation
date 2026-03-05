package ca.yorku.eecs3311.model.user;

import ca.yorku.eecs3311.model.enums.UserType;

public class UserFactory {

	private UserFactory() {}

	/**
	 * Creates a new User subclass instance based on UserType.
	 *
	 * @param type             the type of user to create
	 * @param email            user email
	 * @param password         user password
	 * @param department       user department
	 * @param credentialNumber student ID / faculty ID / researcher ID / guest ID / manager ID
	 * @param extraField1      program (Student) | position (Faculty) | researchArea (Researcher)
	 *                         | organization (Guest) | null (Manager/Admin)
	 * @param extraField2      yearOfStudy as String (Student) | grantNumber (Researcher)
	 *                         | sponsorEmail (Guest) | adminID (Admin) | null (Faculty/Manager)
	 * @param extraField3      "true"/"false" for isHeadCoordinator (Admin only) | null for all others
	 * @return fully constructed User subclass instance
	 */
	public static User createUser(UserType type, String email, String password, String department,
								  String credentialNumber, String extraField1,
								  String extraField2, String extraField3) {
		if (type == null) throw new IllegalArgumentException("UserType cannot be null.");
		if (email == null || email.trim().isEmpty()) throw new IllegalArgumentException("Email cannot be empty.");
		if (password == null || password.trim().isEmpty()) throw new IllegalArgumentException("Password cannot be empty.");

		switch (type) {
			case STUDENT:
				int year = (extraField2 != null) ? Integer.parseInt(extraField2) : 1;
				return new Student(email, password, department,
						credentialNumber,
						extraField1 != null ? extraField1 : "",
						year);

			case FACULTY:
				return new Faculty(email, password, department,
						credentialNumber,
						extraField1 != null ? extraField1 : "");

			case RESEARCHER:
				return new Researcher(email, password, department,
						credentialNumber,
						extraField1 != null ? extraField1 : "",
						extraField2 != null ? extraField2 : "");

			case GUEST:
				return new Guest(email, password, department,
						credentialNumber,
						extraField1 != null ? extraField1 : "",
						extraField2 != null ? extraField2 : "");

			case MANAGER:
				return new Manager(email, password, department, credentialNumber);

			case ADMIN:
				boolean isHead = Boolean.parseBoolean(extraField3);
				return new SystemAdministrator(email, password, department,
						credentialNumber,
						extraField2 != null ? extraField2 : credentialNumber,
						isHead);

			default:
				throw new IllegalArgumentException("Unsupported UserType: " + type);
		}
	}

	/**
	 * Convenience overload for simple user types (Manager, Faculty) that don't need extra fields.
	 */
	public static User createUser(UserType type, String email, String password,
								  String department, String credentialNumber) {
		return createUser(type, email, password, department, credentialNumber, null, null, null);
	}
}
