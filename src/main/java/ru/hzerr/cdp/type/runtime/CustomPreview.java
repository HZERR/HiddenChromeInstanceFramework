package ru.hzerr.cdp.type.runtime;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

@Experimental
public class CustomPreview {

	@Required
	@Description("The JSON-stringified result of formatter.header(object, config) call. It contains json ML array that represents RemoteObject.")
	private String header;

	@Description("If formatter returns true as a result of formatter.hasBody call then bodyGetterId will contain RemoteObjectId for the function that returns result of formatter.body(object, config) call. The result value is json ML array.")
	@TypeDescription("Unique object identifier.")
	private String bodyGetterId;

    public CustomPreview() {
    }

	public String getHeader() {
		return this.header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getBodyGetterId() {
		return this.bodyGetterId;
	}
	public void setBodyGetterId(String bodyGetterId) {
		this.bodyGetterId = bodyGetterId;
	}
}
