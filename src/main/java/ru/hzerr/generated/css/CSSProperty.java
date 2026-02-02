package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Experimental;
import java.util.List;

@Description("CSS property declaration data.")
public class CSSProperty {

	@Required
	@Description("The property name.")
	private String name;

	@Required
	@Description("The property value.")
	private String value;

	@Description("Whether the property has \"!important\" annotation (implies `false` if absent).")
	private boolean important;

	@Description("Whether the property is implicit (implies `false` if absent).")
	private boolean implicit;

	@Description("The full property text as specified in the style.")
	private String text;

	@Description("Whether the property is understood by the browser (implies `true` if absent).")
	private boolean parsedOk;

	@Description("Whether the property is disabled by the user (present for source-based properties only).")
	private boolean disabled;

	@Description("The entire property range in the enclosing style declaration (if available).")
	private SourceRange range;

	@Experimental
	@Description("Parsed longhand components of this property if it is a shorthand. This field will be empty if the given property is not a shorthand.")
	private List<CSSProperty> longhandProperties;

    public CSSProperty() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean getImportant() {
		return this.important;
	}
	public void setImportant(boolean important) {
		this.important = important;
	}
	public boolean getImplicit() {
		return this.implicit;
	}
	public void setImplicit(boolean implicit) {
		this.implicit = implicit;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean getParsedOk() {
		return this.parsedOk;
	}
	public void setParsedOk(boolean parsedOk) {
		this.parsedOk = parsedOk;
	}
	public boolean getDisabled() {
		return this.disabled;
	}
	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
	public SourceRange getRange() {
		return this.range;
	}
	public void setRange(SourceRange range) {
		this.range = range;
	}
	public List<CSSProperty> getLonghandProperties() {
		return this.longhandProperties;
	}
	public void setLonghandProperties(List<CSSProperty> longhandProperties) {
		this.longhandProperties = longhandProperties;
	}
}
