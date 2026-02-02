package ru.hzerr.cdp.type.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Debug symbols available for a wasm script.")
public class DebugSymbols {

	@Required
	@Description("Type of the debug symbols.")
	@Enum({"SourceMap", "EmbeddedDWARF", "ExternalDWARF"})
	private String type;

	@Description("URL of the external symbol source.")
	private String externalURL;

    public DebugSymbols() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExternalURL() {
		return this.externalURL;
	}
	public void setExternalURL(String externalURL) {
		this.externalURL = externalURL;
	}
}
