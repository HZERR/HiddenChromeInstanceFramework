package ru.hzerr.generated.css;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Specificity: https://drafts.csswg.org/selectors/#specificity-rules")
public class Specificity {

	@Required
	@Description("The a component, which represents the number of ID selectors.")
	private int a;

	@Required
	@Description("The b component, which represents the number of class selectors, attributes selectors, and pseudo-classes.")
	private int b;

	@Required
	@Description("The c component, which represents the number of type selectors and pseudo-elements.")
	private int c;

    public Specificity() {
    }

	public int getA() {
		return this.a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return this.b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return this.c;
	}
	public void setC(int c) {
		this.c = c;
	}
}
