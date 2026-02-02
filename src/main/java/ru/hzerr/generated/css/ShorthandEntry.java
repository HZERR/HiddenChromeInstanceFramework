package ru.hzerr.generated.css;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class ShorthandEntry {

	@Required
	@Description("Shorthand name.")
	private String name;

	@Required
	@Description("Shorthand value.")
	private String value;

	@Description("Whether the property has \"!important\" annotation (implies `false` if absent).")
	private boolean important;

    public ShorthandEntry() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean getImportant() {
		return this.important;
	}
	public void setImportant(boolean important) {
		this.important = important;
	}
}
