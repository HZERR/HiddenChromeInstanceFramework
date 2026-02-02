package ru.hzerr.cdp.type.domDebugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.cdp.type.runtime.RemoteObject;

@Description("Object event listener.")
public class EventListener {

	@Required
	@Description("`EventListener`'s type.")
	private String type;

	@Required
	@Description("`EventListener`'s useCapture.")
	private boolean useCapture;

	@Required
	@Description("`EventListener`'s passive flag.")
	private boolean passive;

	@Required
	@Description("`EventListener`'s once flag.")
	private boolean once;

	@Required
	@Description("Script id of the handler code.")
	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Required
	@Description("Line number in the script (0-based).")
	private int lineNumber;

	@Required
	@Description("Column number in the script (0-based).")
	private int columnNumber;

	@Description("Event handler function value.")
	private RemoteObject handler;

	@Description("Event original handler function value.")
	private RemoteObject originalHandler;

	@Description("Node the listener is added to (if any).")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

    public EventListener() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean getUseCapture() {
		return this.useCapture;
	}
	public void setUseCapture(boolean useCapture) {
		this.useCapture = useCapture;
	}
	public boolean getPassive() {
		return this.passive;
	}
	public void setPassive(boolean passive) {
		this.passive = passive;
	}
	public boolean getOnce() {
		return this.once;
	}
	public void setOnce(boolean once) {
		this.once = once;
	}
	public String getScriptId() {
		return this.scriptId;
	}
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	public int getLineNumber() {
		return this.lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public int getColumnNumber() {
		return this.columnNumber;
	}
	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}
	public RemoteObject getHandler() {
		return this.handler;
	}
	public void setHandler(RemoteObject handler) {
		this.handler = handler;
	}
	public RemoteObject getOriginalHandler() {
		return this.originalHandler;
	}
	public void setOriginalHandler(RemoteObject originalHandler) {
		this.originalHandler = originalHandler;
	}
	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
}
