package ca.yorku.eecs3311.model.enums;

/** Represents the operational states of a piece of equipment. */
public enum EquipmentStatus {
    /** Equipment is ready to be reserved or used. */
    AVAILABLE,
    /** Equipment is currently checked out or in active use. */
    IN_USE,
    /** Equipment is undergoing repairs or servicing and cannot be reserved. */
    UNDER_MAINTENANCE,
    /** Equipment has been taken out of service and is not bookable. */
    DISABLED
}
