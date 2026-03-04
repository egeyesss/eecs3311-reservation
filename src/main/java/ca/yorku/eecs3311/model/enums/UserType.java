package ca.yorku.eecs3311.model.enums;

public enum UserType {
    /** Enrolled student with standard booking privileges. */
    STUDENT,
    /** Faculty member with elevated booking privileges. */
    FACULTY,
    /** Researcher with access to specialized equipment and extended booking windows. */
    RESEARCHER,
    /** External or temporary user with limited booking access. */
    GUEST,
    /** Facility manager responsible for overseeing bookings and equipment. */
    MANAGER,
    /** System administrator with full access and configuration rights. */
    ADMIN
}
