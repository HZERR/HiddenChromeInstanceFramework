package ru.hzerr.cdp.event.input;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.cdp.type.input.DragData;

@Experimental
@Description("Emitted only when `Input.setInterceptDrags` is enabled. Use this data with `Input.dispatchDragEvent` to restore normal drag and drop behavior.")
@Event("dragIntercepted")
public class DragInterceptedEvent {

	@Required
	private DragData data;

    public DragInterceptedEvent() {
    }

	public DragData getData() {
		return this.data;
	}
	public void setData(DragData data) {
		this.data = data;
	}
}
