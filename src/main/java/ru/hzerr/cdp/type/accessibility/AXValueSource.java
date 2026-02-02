package ru.hzerr.cdp.type.accessibility;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("A single source for a computed AX property.")
public class AXValueSource {

	@Required
	@Description("What type of source this is.")
	@TypeDescription("Enum of possible property sources.")
	private String type;

	@Description("The value of this property source.")
	private AXValue value;

	@Description("The name of the relevant attribute, if any.")
	private String attribute;

	@Description("The value of the relevant attribute, if any.")
	private AXValue attributeValue;

	@Description("Whether this source is superseded by a higher priority source.")
	private boolean superseded;

	@Description("The native markup source for this value, e.g. a `<label>` element.")
	@TypeDescription("Enum of possible native property sources (as a subtype of a particular AXValueSourceType).")
	private String nativeSource;

	@Description("The value, such as a node or node list, of the native source.")
	private AXValue nativeSourceValue;

	@Description("Whether the value for this property is invalid.")
	private boolean invalid;

	@Description("Reason for the value being invalid, if it is.")
	private String invalidReason;

    public AXValueSource() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public AXValue getValue() {
		return this.value;
	}
	public void setValue(AXValue value) {
		this.value = value;
	}
	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public AXValue getAttributeValue() {
		return this.attributeValue;
	}
	public void setAttributeValue(AXValue attributeValue) {
		this.attributeValue = attributeValue;
	}
	public boolean getSuperseded() {
		return this.superseded;
	}
	public void setSuperseded(boolean superseded) {
		this.superseded = superseded;
	}
	public String getNativeSource() {
		return this.nativeSource;
	}
	public void setNativeSource(String nativeSource) {
		this.nativeSource = nativeSource;
	}
	public AXValue getNativeSourceValue() {
		return this.nativeSourceValue;
	}
	public void setNativeSourceValue(AXValue nativeSourceValue) {
		this.nativeSourceValue = nativeSourceValue;
	}
	public boolean getInvalid() {
		return this.invalid;
	}
	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}
	public String getInvalidReason() {
		return this.invalidReason;
	}
	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}
}
