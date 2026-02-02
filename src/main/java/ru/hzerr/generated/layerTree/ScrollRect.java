package ru.hzerr.generated.layerTree;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.generated.dom.Rect;
import ru.hzerr.annotation.Enum;

@Description("Rectangle where scrolling happens on the main thread.")
public class ScrollRect {

	@Required
	@Description("Rectangle itself.")
	private Rect rect;

	@Required
	@Description("Reason for rectangle to force scrolling on the main thread")
	@Enum({"RepaintsOnScroll", "TouchEventHandler", "WheelEventHandler"})
	private String type;

    public ScrollRect() {
    }

	public Rect getRect() {
		return this.rect;
	}
	public void setRect(Rect rect) {
		this.rect = rect;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
