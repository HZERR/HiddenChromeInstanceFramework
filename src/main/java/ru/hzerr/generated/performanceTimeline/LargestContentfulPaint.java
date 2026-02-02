package ru.hzerr.generated.performanceTimeline;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("See https://github.com/WICG/LargestContentfulPaint and largest_contentful_paint.idl")
public class LargestContentfulPaint {

	@Required
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number renderTime;

	@Required
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number loadTime;

	@Required
	@Description("The number of pixels being painted.")
	private Number size;

	@Description("The id attribute of the element, if available.")
	private String elementId;

	@Description("The URL of the image (may be trimmed).")
	private String url;

	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int nodeId;

    public LargestContentfulPaint() {
    }

	public Number getRenderTime() {
		return this.renderTime;
	}
	public void setRenderTime(Number renderTime) {
		this.renderTime = renderTime;
	}
	public Number getLoadTime() {
		return this.loadTime;
	}
	public void setLoadTime(Number loadTime) {
		this.loadTime = loadTime;
	}
	public Number getSize() {
		return this.size;
	}
	public void setSize(Number size) {
		this.size = size;
	}
	public String getElementId() {
		return this.elementId;
	}
	public void setElementId(String elementId) {
		this.elementId = elementId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
}
