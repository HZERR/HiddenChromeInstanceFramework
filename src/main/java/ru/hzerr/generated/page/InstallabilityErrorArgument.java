package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class InstallabilityErrorArgument {

	@Required
	@Description("Argument name (e.g. name:'minimum-icon-size-in-pixels').")
	private String name;

	@Required
	@Description("Argument value (e.g. value:'64').")
	private String value;

    public InstallabilityErrorArgument() {
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
}
