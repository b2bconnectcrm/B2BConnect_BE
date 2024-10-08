package com.bricktobrick.B2BConnect.entity;

public enum Stage {
	STARTED("STARTED", " started"), GATHETRINFORMATION("GATHETR_INFORMATION", "Gather Information"),
	DOWNPAYMENTSTAGE("DOWNPAYMENT_STAGE", "Downpayment Stage"), SENDQUOTATION("SEND_QUOTATION", " Send Quotation"),
	NEGOTIATION("NEGOTIATION", " Negotiation"), FOLLOWUP("FOLLOW_UP", " Follow-up"),
	BOOKINGCONFIRMED("BOOKING_CONFIRMED", " Booking Confirmed"),
	PAYMENTMILESTONE("PAYMENT_MILESTONE", "Payment Milestone"),
	PAYMENTCOMPLETED("PAYMENTCOMPLETED", "Payment Completed"), RETENTION("RETENTION", "Retention"),
	CLOSEDLOST("CLOSED_LOST", "Closed Lost"),
	CLOSEDLOSTTOCOMPETITION("CLOSEDLOST_TO_COMPETITION", "Closed Lost to Competition"),
	POSTPONEDDECISION("POSTPONED_DECISION", "Postponed Decision"),
	PENDINGFORBANKLOAN("PENDING_FOR_BANKLOAN", "Pending for Bank Loan");

	private final String name;
	private final String description;

	private Stage(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}
