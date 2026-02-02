package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;

@Experimental
public class ContentSecurityPolicyStatus {

	@Required
	private String effectiveDirectives;

	@Required
	private boolean isEnforced;

	@Required
	@TypeExperimental
	private String source;

    public ContentSecurityPolicyStatus() {
    }

	public String getEffectiveDirectives() {
		return this.effectiveDirectives;
	}
	public void setEffectiveDirectives(String effectiveDirectives) {
		this.effectiveDirectives = effectiveDirectives;
	}
	public boolean getIsEnforced() {
		return this.isEnforced;
	}
	public void setIsEnforced(boolean isEnforced) {
		this.isEnforced = isEnforced;
	}
	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}
}
