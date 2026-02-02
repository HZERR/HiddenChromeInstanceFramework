package ru.hzerr.cdp.type.target;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;

@Experimental
@Description("A filter used by target query/discovery/auto-attach operations.")
public class FilterEntry {

	@Description("If set, causes exclusion of matching targets from the list.")
	private boolean exclude;

	@Description("If not present, matches any type.")
	private String type;

    public FilterEntry() {
    }

	public boolean getExclude() {
		return this.exclude;
	}
	public void setExclude(boolean exclude) {
		this.exclude = exclude;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
