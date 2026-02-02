package ru.hzerr.generated.schema;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Description of the protocol domain.")
public class Domain {

	@Required
	@Description("Domain name.")
	private String name;

	@Required
	@Description("Domain version.")
	private String version;

    public Domain() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
