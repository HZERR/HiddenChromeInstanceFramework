package ru.hzerr.generated.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.generated.runtime.RemoteObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.hzerr.annotation.Experimental;

@Description("JavaScript call frame. Array of call frames form the call stack.")
public class CallFrame {

	@Required
	@Description("Call frame identifier. This identifier is only valid while the virtual machine is paused.")
	@TypeDescription("Call frame identifier.")
	private String callFrameId;

	@Required
	@Description("Name of the JavaScript function called on this call frame.")
	private String functionName;

	@Description("Location in the source code.")
	private Location functionLocation;

	@Required
	@Description("Location in the source code.")
	private Location location;

	@Deprecated
	@Required
	@Description("JavaScript script name or url. Deprecated in favor of using the `location.scriptId` to resolve the URL via a previously sent `Debugger.scriptParsed` event.")
	private String url;

	@Required
	@Description("Scope chain for this call frame.")
	private List<Scope> scopeChain;

	@Required
	@Description("`this` object for this call frame.")
	@JsonProperty("this")
	private RemoteObject remoteObject;

	@Description("The value being returned, if the function is at return point.")
	private RemoteObject returnValue;

	@Experimental
	@Description("Valid only while the VM is paused and indicates whether this frame can be restarted or not. Note that a `true` value here does not guarantee that Debugger#restartFrame with this CallFrameId will be successful, but it is very likely.")
	private boolean canBeRestarted;

    public CallFrame() {
    }

	public String getCallFrameId() {
		return this.callFrameId;
	}
	public void setCallFrameId(String callFrameId) {
		this.callFrameId = callFrameId;
	}
	public String getFunctionName() {
		return this.functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	public Location getFunctionLocation() {
		return this.functionLocation;
	}
	public void setFunctionLocation(Location functionLocation) {
		this.functionLocation = functionLocation;
	}
	public Location getLocation() {
		return this.location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<Scope> getScopeChain() {
		return this.scopeChain;
	}
	public void setScopeChain(List<Scope> scopeChain) {
		this.scopeChain = scopeChain;
	}
	public RemoteObject getRemoteObject() {
		return this.remoteObject;
	}
	public void setRemoteObject(RemoteObject remoteObject) {
		this.remoteObject = remoteObject;
	}
	public RemoteObject getReturnValue() {
		return this.returnValue;
	}
	public void setReturnValue(RemoteObject returnValue) {
		this.returnValue = returnValue;
	}
	public boolean getCanBeRestarted() {
		return this.canBeRestarted;
	}
	public void setCanBeRestarted(boolean canBeRestarted) {
		this.canBeRestarted = canBeRestarted;
	}
}
