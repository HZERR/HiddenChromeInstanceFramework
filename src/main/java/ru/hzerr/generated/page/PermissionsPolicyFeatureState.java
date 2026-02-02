package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;

@Experimental
public class PermissionsPolicyFeatureState {

	@Required
	@TypeExperimental
	@TypeDescription("All Permissions Policy features. This enum should match the one defined in services/network/public/cpp/permissions_policy/permissions_policy_features.json5. LINT.IfChange(PermissionsPolicyFeature)")
	private String feature;

	@Required
	private boolean allowed;

	private PermissionsPolicyBlockLocator locator;

    public PermissionsPolicyFeatureState() {
    }

	public String getFeature() {
		return this.feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public boolean getAllowed() {
		return this.allowed;
	}
	public void setAllowed(boolean allowed) {
		this.allowed = allowed;
	}
	public PermissionsPolicyBlockLocator getLocator() {
		return this.locator;
	}
	public void setLocator(PermissionsPolicyBlockLocator locator) {
		this.locator = locator;
	}
}
