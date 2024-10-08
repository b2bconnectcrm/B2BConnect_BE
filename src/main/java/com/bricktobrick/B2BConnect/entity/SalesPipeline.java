package com.bricktobrick.B2BConnect.entity;

public enum SalesPipeline {
	OPEN("OPEN", " Open"),
	COLDCALLING("COLD_CALLING_MEETING", " Cold Calling/Meeting"),
	PROPOSAL("PROPOSAL", " Proposal"),
	NEGOTIATION("NEGOTIATION", " Negotiation"),
	DEALSOFFERED("DEALS_OFFERED", " Deal Offered"),
	CLOSURE("CLOSURE", " Closure"),
	CONVERSION("CONVERSION", " Conversion");
	
	private final String name;
	private final String description;

	private SalesPipeline(String name, String description) {
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
