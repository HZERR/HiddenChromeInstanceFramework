package ru.hzerr.cdp.event.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;

@Description("Fires whenever a MediaQuery result changes (for example, after a browser window has been resized.) The current implementation considers only viewport-dependent media features.")
@Event("mediaQueryResultChanged")
public class MediaQueryResultChangedEvent {


    public MediaQueryResultChangedEvent() {
    }

}
