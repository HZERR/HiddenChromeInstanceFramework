package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Experimental
@Description("CSS container query rule descriptor.")
public class CSSContainerQuery {

	@Required
	@Description("Container query text.")
	private String text;

	@Description("The associated rule header range in the enclosing stylesheet (if available).")
	private SourceRange range;

	@Description("Identifier of the stylesheet containing this object (if exists).")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Description("Optional name for the container.")
	private String name;

	@Description("Optional physical axes queried for the container.")
	@TypeDescription("ContainerSelector physical axes")
	private String physicalAxes;

	@Description("Optional logical axes queried for the container.")
	@TypeDescription("ContainerSelector logical axes")
	private String logicalAxes;

	@Description("true if the query contains scroll-state() queries.")
	private boolean queriesScrollState;

	@Description("true if the query contains anchored() queries.")
	private boolean queriesAnchored;

    public CSSContainerQuery() {
    }

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public SourceRange getRange() {
		return this.range;
	}
	public void setRange(SourceRange range) {
		this.range = range;
	}
	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhysicalAxes() {
		return this.physicalAxes;
	}
	public void setPhysicalAxes(String physicalAxes) {
		this.physicalAxes = physicalAxes;
	}
	public String getLogicalAxes() {
		return this.logicalAxes;
	}
	public void setLogicalAxes(String logicalAxes) {
		this.logicalAxes = logicalAxes;
	}
	public boolean getQueriesScrollState() {
		return this.queriesScrollState;
	}
	public void setQueriesScrollState(boolean queriesScrollState) {
		this.queriesScrollState = queriesScrollState;
	}
	public boolean getQueriesAnchored() {
		return this.queriesAnchored;
	}
	public void setQueriesAnchored(boolean queriesAnchored) {
		this.queriesAnchored = queriesAnchored;
	}
}
