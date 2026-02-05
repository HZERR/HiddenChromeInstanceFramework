package ru.hzerr.cdp.event.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Fired whenever an active document stylesheet is removed.")
@Event("styleSheetRemoved")
public class StyleSheetRemovedEvent {

	@Required
	@Description("Identifier of the removed stylesheet.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

    public StyleSheetRemovedEvent() {
    }

	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
}
