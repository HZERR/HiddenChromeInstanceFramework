package ru.hzerr.cdp.event.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.cdp.type.css.FontFace;

@Description("Fires whenever a web font is updated.  A non-empty font parameter indicates a successfully loaded web font.")
@Event("fontsUpdated")
public class FontsUpdatedEvent {

	@Description("The web font that has loaded.")
	private FontFace font;

    public FontsUpdatedEvent() {
    }

	public FontFace getFont() {
		return this.font;
	}
	public void setFont(FontFace font) {
		this.font = font;
	}
}
