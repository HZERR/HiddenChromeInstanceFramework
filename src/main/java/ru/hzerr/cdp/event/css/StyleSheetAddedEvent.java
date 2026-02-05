package ru.hzerr.cdp.event.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.css.CSSStyleSheetHeader;

@Description("Fired whenever an active document stylesheet is added.")
@Event("styleSheetAdded")
public class StyleSheetAddedEvent {

	@Required
	@Description("Added stylesheet metainfo.")
	private CSSStyleSheetHeader header;

    public StyleSheetAddedEvent() {
    }

	public CSSStyleSheetHeader getHeader() {
		return this.header;
	}
	public void setHeader(CSSStyleSheetHeader header) {
		this.header = header;
	}
}
