package ru.hzerr.cdp.event.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired whenever a stylesheet is changed as a result of the client operation.")
@Event("styleSheetChanged")
public class StyleSheetChangedEvent {

	@Required
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

    public StyleSheetChangedEvent() {
    }

	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
}
