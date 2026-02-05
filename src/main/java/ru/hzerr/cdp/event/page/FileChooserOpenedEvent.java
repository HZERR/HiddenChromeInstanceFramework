package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Enum;

@Description("Emitted only when `page.interceptFileChooser` is enabled.")
@Event("fileChooserOpened")
public class FileChooserOpenedEvent {

	@Experimental
	@Required
	@Description("Id of the frame containing input node.")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("Input mode.")
	@Enum({"selectSingle", "selectMultiple"})
	private String mode;

	@Experimental
	@Description("Input node id. Only present for file choosers opened via an `<input type=\"file\">` element.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

    public FileChooserOpenedEvent() {
    }

	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
}
