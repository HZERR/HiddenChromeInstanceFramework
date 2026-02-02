package ru.hzerr.generated.profiler;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Specifies a number of samples attributed to a certain source position.")
public class PositionTickInfo {

	@Required
	@Description("Source line number (1-based).")
	private int line;

	@Required
	@Description("Number of samples attributed to the source line.")
	private int ticks;

    public PositionTickInfo() {
    }

	public int getLine() {
		return this.line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getTicks() {
		return this.ticks;
	}
	public void setTicks(int ticks) {
		this.ticks = ticks;
	}
}
