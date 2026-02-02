package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Information about the suggested solution to a cookie issue.")
public class CookieIssueInsight {

	@Required
	@TypeDescription("Represents the category of insight that a cookie issue falls under.")
	private String type;

	@Description("Link to table entry in third-party cookie migration readiness list.")
	private String tableEntryUrl;

    public CookieIssueInsight() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTableEntryUrl() {
		return this.tableEntryUrl;
	}
	public void setTableEntryUrl(String tableEntryUrl) {
		this.tableEntryUrl = tableEntryUrl;
	}
}
