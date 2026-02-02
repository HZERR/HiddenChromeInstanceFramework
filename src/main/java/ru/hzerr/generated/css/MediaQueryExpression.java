package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Media query expression descriptor.")
public class MediaQueryExpression {

	@Required
	@Description("Media query expression value.")
	private Number value;

	@Required
	@Description("Media query expression units.")
	private String unit;

	@Required
	@Description("Media query expression feature.")
	private String feature;

	@Description("The associated range of the value text in the enclosing stylesheet (if available).")
	private SourceRange valueRange;

	@Description("Computed length of media query expression (if applicable).")
	private Number computedLength;

    public MediaQueryExpression() {
    }

	public Number getValue() {
		return this.value;
	}
	public void setValue(Number value) {
		this.value = value;
	}
	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getFeature() {
		return this.feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public SourceRange getValueRange() {
		return this.valueRange;
	}
	public void setValueRange(SourceRange valueRange) {
		this.valueRange = valueRange;
	}
	public Number getComputedLength() {
		return this.computedLength;
	}
	public void setComputedLength(Number computedLength) {
		this.computedLength = computedLength;
	}
}
