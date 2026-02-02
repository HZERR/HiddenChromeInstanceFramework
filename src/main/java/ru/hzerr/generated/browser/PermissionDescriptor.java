package ru.hzerr.generated.browser;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Definition of PermissionDescriptor defined in the Permissions API: https://w3c.github.io/permissions/#dom-permissiondescriptor.")
public class PermissionDescriptor {

	@Required
	@Description("Name of permission. See https://cs.chromium.org/chromium/src/third_party/blink/renderer/modules/permissions/permission_descriptor.idl for valid permission names.")
	private String name;

	@Description("For \"midi\" permission, may also specify sysex control.")
	private boolean sysex;

	@Description("For \"push\" permission, may specify userVisibleOnly. Note that userVisibleOnly = true is the only currently supported type.")
	private boolean userVisibleOnly;

	@Description("For \"clipboard\" permission, may specify allowWithoutSanitization.")
	private boolean allowWithoutSanitization;

	@Description("For \"fullscreen\" permission, must specify allowWithoutGesture:true.")
	private boolean allowWithoutGesture;

	@Description("For \"camera\" permission, may specify panTiltZoom.")
	private boolean panTiltZoom;

    public PermissionDescriptor() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getSysex() {
		return this.sysex;
	}
	public void setSysex(boolean sysex) {
		this.sysex = sysex;
	}
	public boolean getUserVisibleOnly() {
		return this.userVisibleOnly;
	}
	public void setUserVisibleOnly(boolean userVisibleOnly) {
		this.userVisibleOnly = userVisibleOnly;
	}
	public boolean getAllowWithoutSanitization() {
		return this.allowWithoutSanitization;
	}
	public void setAllowWithoutSanitization(boolean allowWithoutSanitization) {
		this.allowWithoutSanitization = allowWithoutSanitization;
	}
	public boolean getAllowWithoutGesture() {
		return this.allowWithoutGesture;
	}
	public void setAllowWithoutGesture(boolean allowWithoutGesture) {
		this.allowWithoutGesture = allowWithoutGesture;
	}
	public boolean getPanTiltZoom() {
		return this.panTiltZoom;
	}
	public void setPanTiltZoom(boolean panTiltZoom) {
		this.panTiltZoom = panTiltZoom;
	}
}
