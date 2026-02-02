package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Information about font variation axes for variable fonts")
public class FontVariationAxis {

	@Required
	@Description("The font-variation-setting tag (a.k.a. \"axis tag\").")
	private String tag;

	@Required
	@Description("Human-readable variation name in the default language (normally, \"en\").")
	private String name;

	@Required
	@Description("The minimum value (inclusive) the font supports for this tag.")
	private Number minValue;

	@Required
	@Description("The maximum value (inclusive) the font supports for this tag.")
	private Number maxValue;

	@Required
	@Description("The default value.")
	private Number defaultValue;

    public FontVariationAxis() {
    }

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getMinValue() {
		return this.minValue;
	}
	public void setMinValue(Number minValue) {
		this.minValue = minValue;
	}
	public Number getMaxValue() {
		return this.maxValue;
	}
	public void setMaxValue(Number maxValue) {
		this.maxValue = maxValue;
	}
	public Number getDefaultValue() {
		return this.defaultValue;
	}
	public void setDefaultValue(Number defaultValue) {
		this.defaultValue = defaultValue;
	}
}
