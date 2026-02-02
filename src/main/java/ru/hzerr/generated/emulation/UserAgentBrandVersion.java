package ru.hzerr.generated.emulation;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Used to specify User Agent Client Hints to emulate. See https://wicg.github.io/ua-client-hints")
public class UserAgentBrandVersion {

	@Required
	private String brand;

	@Required
	private String version;

    public UserAgentBrandVersion() {
    }

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
