package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Representation of a custom property registration through CSS.registerProperty")
public class CSSPropertyRegistration {

	@Required
	private String propertyName;

	private Value initialValue;

	@Required
	private boolean inherits;

	@Required
	private String syntax;

    public CSSPropertyRegistration() {
    }

	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public Value getInitialValue() {
		return this.initialValue;
	}
	public void setInitialValue(Value initialValue) {
		this.initialValue = initialValue;
	}
	public boolean getInherits() {
		return this.inherits;
	}
	public void setInherits(boolean inherits) {
		this.inherits = inherits;
	}
	public String getSyntax() {
		return this.syntax;
	}
	public void setSyntax(String syntax) {
		this.syntax = syntax;
	}
}
