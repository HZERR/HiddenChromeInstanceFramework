package ru.hzerr.cdp.type.storage;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class AttributionReportingNamedBudgetDef {

	@Required
	private String name;

	@Required
	private int budget;

    public AttributionReportingNamedBudgetDef() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBudget() {
		return this.budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
}
