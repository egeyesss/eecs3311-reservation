package ca.yorku.eecs3311.model.enums;

/** Represents the supported payment methods for a booking. */
public enum PaymentMethod {
    /** Payment via personal credit card. */
    CREDIT_CARD,
    /** Payment via personal debit card. */
    DEBIT_CARD,
    /** Payment charged to an institutional (department/faculty) account. */
    INSTITUTIONAL_ACCOUNT,
    /** Payment covered by a research grant fund. */
    RESEARCH_GRANT
}
