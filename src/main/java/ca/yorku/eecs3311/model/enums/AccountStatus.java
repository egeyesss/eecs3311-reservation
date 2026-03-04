package ca.yorku.eecs3311.model.enums;

/** Represents the lifecycle states of a user account. */
public enum AccountStatus {
    /** Account has been created but not yet verified or approved. */
    PENDING,
    /** Account is in good standing and fully operational. */
    ACTIVE,
    /** Account has been temporarily disabled, e.g. due to policy violations. */
    SUSPENDED,
    /** Account has been permanently closed. */
    DEACTIVATED
}
