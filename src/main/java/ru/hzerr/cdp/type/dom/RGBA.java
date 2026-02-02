package ru.hzerr.cdp.type.dom;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("A structure holding an RGBA color.")
public class RGBA {

	@Required
	@Description("The red component, in the [0-255] range.")
	private int r;

	@Required
	@Description("The green component, in the [0-255] range.")
	private int g;

	@Required
	@Description("The blue component, in the [0-255] range.")
	private int b;

	@Description("The alpha component, in the [0-1] range (default: 1).")
	private Number a;

    public RGBA() {
    }

	public int getR() {
		return this.r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return this.g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getB() {
		return this.b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Number getA() {
		return this.a;
	}
	public void setA(Number a) {
		this.a = a;
	}
}
