package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("This issue warns about improper usage of the <permission> element.")
public class PermissionElementIssueDetails {

	@Required
	private String issueType;

	@Description("The value of the type attribute.")
	private String type;

	@Description("The node ID of the <permission> element.")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int nodeId;

	@Description("True if the issue is a warning, false if it is an error.")
	private boolean isWarning;

	@Description("Fields for message construction: Used for messages that reference a specific permission name")
	private String permissionName;

	@Description("Used for messages about occlusion")
	private String occluderNodeInfo;

	@Description("Used for messages about occluder's parent")
	private String occluderParentNodeInfo;

	@Description("Used for messages about activation disabled reason")
	private String disableReason;

    public PermissionElementIssueDetails() {
    }

	public String getIssueType() {
		return this.issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public boolean getIsWarning() {
		return this.isWarning;
	}
	public void setIsWarning(boolean isWarning) {
		this.isWarning = isWarning;
	}
	public String getPermissionName() {
		return this.permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getOccluderNodeInfo() {
		return this.occluderNodeInfo;
	}
	public void setOccluderNodeInfo(String occluderNodeInfo) {
		this.occluderNodeInfo = occluderNodeInfo;
	}
	public String getOccluderParentNodeInfo() {
		return this.occluderParentNodeInfo;
	}
	public void setOccluderParentNodeInfo(String occluderParentNodeInfo) {
		this.occluderParentNodeInfo = occluderParentNodeInfo;
	}
	public String getDisableReason() {
		return this.disableReason;
	}
	public void setDisableReason(String disableReason) {
		this.disableReason = disableReason;
	}
}
