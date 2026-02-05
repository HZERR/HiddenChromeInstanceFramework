package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("A shared storage run or selectURL operation finished its execution. The following parameters are included in all events.")
@Event("sharedStorageWorkletOperationExecutionFinished")
public class SharedStorageWorkletOperationExecutionFinishedEvent {

	@Required
	@Description("Time that the operation finished.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number finishedTime;

	@Required
	@Description("Time, in microseconds, from start of shared storage JS API call until end of operation execution in the worklet.")
	private int executionTime;

	@Required
	@Description("Enum value indicating the Shared Storage API method invoked.")
	@TypeDescription("Enum of shared storage access methods.")
	private String method;

	@Required
	@Description("ID of the operation call.")
	private String operationId;

	@Required
	@Description("Hex representation of the DevTools token used as the TargetID for the associated shared storage worklet.")
	private String workletTargetId;

	@Required
	@Description("DevTools Frame Token for the primary frame tree's root.")
	@TypeDescription("Unique frame identifier.")
	private String mainFrameId;

	@Required
	@Description("Serialization of the origin owning the Shared Storage data.")
	private String ownerOrigin;

    public SharedStorageWorkletOperationExecutionFinishedEvent() {
    }

	public Number getFinishedTime() {
		return this.finishedTime;
	}
	public void setFinishedTime(Number finishedTime) {
		this.finishedTime = finishedTime;
	}
	public int getExecutionTime() {
		return this.executionTime;
	}
	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}
	public String getMethod() {
		return this.method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getOperationId() {
		return this.operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getWorkletTargetId() {
		return this.workletTargetId;
	}
	public void setWorkletTargetId(String workletTargetId) {
		this.workletTargetId = workletTargetId;
	}
	public String getMainFrameId() {
		return this.mainFrameId;
	}
	public void setMainFrameId(String mainFrameId) {
		this.mainFrameId = mainFrameId;
	}
	public String getOwnerOrigin() {
		return this.ownerOrigin;
	}
	public void setOwnerOrigin(String ownerOrigin) {
		this.ownerOrigin = ownerOrigin;
	}
}
