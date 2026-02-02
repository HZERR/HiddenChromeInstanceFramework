package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;

@Experimental
@Description("Default font sizes.")
public class FontSizes {

	@Description("Default standard font size.")
	private int standard;

	@Description("Default fixed font size.")
	private int fixed;

    public FontSizes() {
    }

	public int getStandard() {
		return this.standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getFixed() {
		return this.fixed;
	}
	public void setFixed(int fixed) {
		this.fixed = fixed;
	}
}
