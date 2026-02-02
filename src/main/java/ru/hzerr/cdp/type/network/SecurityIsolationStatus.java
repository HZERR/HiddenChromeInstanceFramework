package ru.hzerr.cdp.type.network;

import ru.hzerr.annotation.Experimental;
import java.util.List;

@Experimental
public class SecurityIsolationStatus {

	private CrossOriginOpenerPolicyStatus coop;

	private CrossOriginEmbedderPolicyStatus coep;

	private List<ContentSecurityPolicyStatus> csp;

    public SecurityIsolationStatus() {
    }

	public CrossOriginOpenerPolicyStatus getCoop() {
		return this.coop;
	}
	public void setCoop(CrossOriginOpenerPolicyStatus coop) {
		this.coop = coop;
	}
	public CrossOriginEmbedderPolicyStatus getCoep() {
		return this.coep;
	}
	public void setCoep(CrossOriginEmbedderPolicyStatus coep) {
		this.coep = coep;
	}
	public List<ContentSecurityPolicyStatus> getCsp() {
		return this.csp;
	}
	public void setCsp(List<ContentSecurityPolicyStatus> csp) {
		this.csp = csp;
	}
}
