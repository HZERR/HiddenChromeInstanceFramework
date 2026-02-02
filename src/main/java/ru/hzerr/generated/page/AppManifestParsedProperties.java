package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Parsed app manifest properties.")
public class AppManifestParsedProperties {

	@Required
	@Description("Computed scope value")
	private String scope;

    public AppManifestParsedProperties() {
    }

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
}
