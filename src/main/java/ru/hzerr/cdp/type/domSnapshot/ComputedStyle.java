package ru.hzerr.cdp.type.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("A subset of the full ComputedStyle as defined by the request whitelist.")
public class ComputedStyle {

	@Required
	@Description("Name/value pairs of computed style properties.")
	private List<NameValue> properties;

    public ComputedStyle() {
    }

	public List<NameValue> getProperties() {
		return this.properties;
	}
	public void setProperties(List<NameValue> properties) {
		this.properties = properties;
	}
}
