package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("CSS style coming from animations with the name of the animation.")
public class CSSAnimationStyle {

	@Description("The name of the animation.")
	private String name;

	@Required
	@Description("The style coming from the animation.")
	private CSSStyle style;

    public CSSAnimationStyle() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CSSStyle getStyle() {
		return this.style;
	}
	public void setStyle(CSSStyle style) {
		this.style = style;
	}
}
