package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Description;
import ru.hzerr.generated.dom.RGBA;
import ru.hzerr.annotation.Enum;

@Description("Style information for drawing a line.")
public class LineStyle {

	@Description("The color of the line (default: transparent)")
	private RGBA color;

	@Description("The line pattern (default: solid)")
	@Enum({"dashed", "dotted"})
	private String pattern;

    public LineStyle() {
    }

	public RGBA getColor() {
		return this.color;
	}
	public void setColor(RGBA color) {
		this.color = color;
	}
	public String getPattern() {
		return this.pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
}
