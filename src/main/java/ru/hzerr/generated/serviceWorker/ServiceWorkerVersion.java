package ru.hzerr.generated.serviceWorker;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("ServiceWorker version.")
public class ServiceWorkerVersion {

	@Required
	private String versionId;

	@Required
	private String registrationId;

	@Required
	private String scriptURL;

	@Required
	private String runningStatus;

	@Required
	private String status;

	@Description("The Last-Modified header value of the main script.")
	private Number scriptLastModified;

	@Description("The time at which the response headers of the main script were received from the server. For cached script it is the last time the cache entry was validated.")
	private Number scriptResponseTime;

	private List<String> controlledClients;

	private String targetId;

	private String routerRules;

    public ServiceWorkerVersion() {
    }

	public String getVersionId() {
		return this.versionId;
	}
	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}
	public String getRegistrationId() {
		return this.registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getScriptURL() {
		return this.scriptURL;
	}
	public void setScriptURL(String scriptURL) {
		this.scriptURL = scriptURL;
	}
	public String getRunningStatus() {
		return this.runningStatus;
	}
	public void setRunningStatus(String runningStatus) {
		this.runningStatus = runningStatus;
	}
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Number getScriptLastModified() {
		return this.scriptLastModified;
	}
	public void setScriptLastModified(Number scriptLastModified) {
		this.scriptLastModified = scriptLastModified;
	}
	public Number getScriptResponseTime() {
		return this.scriptResponseTime;
	}
	public void setScriptResponseTime(Number scriptResponseTime) {
		this.scriptResponseTime = scriptResponseTime;
	}
	public List<String> getControlledClients() {
		return this.controlledClients;
	}
	public void setControlledClients(List<String> controlledClients) {
		this.controlledClients = controlledClients;
	}
	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getRouterRules() {
		return this.routerRules;
	}
	public void setRouterRules(String routerRules) {
		this.routerRules = routerRules;
	}
}
