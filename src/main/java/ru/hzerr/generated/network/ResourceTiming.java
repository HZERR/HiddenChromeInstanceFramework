package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Experimental;

@Description("Timing information for the request.")
public class ResourceTiming {

	@Required
	@Description("Timing's requestTime is a baseline in seconds, while the other numbers are ticks in milliseconds relatively to this requestTime.")
	private Number requestTime;

	@Required
	@Description("Started resolving proxy.")
	private Number proxyStart;

	@Required
	@Description("Finished resolving proxy.")
	private Number proxyEnd;

	@Required
	@Description("Started DNS address resolve.")
	private Number dnsStart;

	@Required
	@Description("Finished DNS address resolve.")
	private Number dnsEnd;

	@Required
	@Description("Started connecting to the remote host.")
	private Number connectStart;

	@Required
	@Description("Connected to the remote host.")
	private Number connectEnd;

	@Required
	@Description("Started SSL handshake.")
	private Number sslStart;

	@Required
	@Description("Finished SSL handshake.")
	private Number sslEnd;

	@Experimental
	@Required
	@Description("Started running ServiceWorker.")
	private Number workerStart;

	@Experimental
	@Required
	@Description("Finished Starting ServiceWorker.")
	private Number workerReady;

	@Experimental
	@Required
	@Description("Started fetch event.")
	private Number workerFetchStart;

	@Experimental
	@Required
	@Description("Settled fetch event respondWith promise.")
	private Number workerRespondWithSettled;

	@Experimental
	@Description("Started ServiceWorker static routing source evaluation.")
	private Number workerRouterEvaluationStart;

	@Experimental
	@Description("Started cache lookup when the source was evaluated to `cache`.")
	private Number workerCacheLookupStart;

	@Required
	@Description("Started sending request.")
	private Number sendStart;

	@Required
	@Description("Finished sending request.")
	private Number sendEnd;

	@Experimental
	@Required
	@Description("Time the server started pushing request.")
	private Number pushStart;

	@Experimental
	@Required
	@Description("Time the server finished pushing request.")
	private Number pushEnd;

	@Experimental
	@Required
	@Description("Started receiving response headers.")
	private Number receiveHeadersStart;

	@Required
	@Description("Finished receiving response headers.")
	private Number receiveHeadersEnd;

    public ResourceTiming() {
    }

	public Number getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(Number requestTime) {
		this.requestTime = requestTime;
	}
	public Number getProxyStart() {
		return this.proxyStart;
	}
	public void setProxyStart(Number proxyStart) {
		this.proxyStart = proxyStart;
	}
	public Number getProxyEnd() {
		return this.proxyEnd;
	}
	public void setProxyEnd(Number proxyEnd) {
		this.proxyEnd = proxyEnd;
	}
	public Number getDnsStart() {
		return this.dnsStart;
	}
	public void setDnsStart(Number dnsStart) {
		this.dnsStart = dnsStart;
	}
	public Number getDnsEnd() {
		return this.dnsEnd;
	}
	public void setDnsEnd(Number dnsEnd) {
		this.dnsEnd = dnsEnd;
	}
	public Number getConnectStart() {
		return this.connectStart;
	}
	public void setConnectStart(Number connectStart) {
		this.connectStart = connectStart;
	}
	public Number getConnectEnd() {
		return this.connectEnd;
	}
	public void setConnectEnd(Number connectEnd) {
		this.connectEnd = connectEnd;
	}
	public Number getSslStart() {
		return this.sslStart;
	}
	public void setSslStart(Number sslStart) {
		this.sslStart = sslStart;
	}
	public Number getSslEnd() {
		return this.sslEnd;
	}
	public void setSslEnd(Number sslEnd) {
		this.sslEnd = sslEnd;
	}
	public Number getWorkerStart() {
		return this.workerStart;
	}
	public void setWorkerStart(Number workerStart) {
		this.workerStart = workerStart;
	}
	public Number getWorkerReady() {
		return this.workerReady;
	}
	public void setWorkerReady(Number workerReady) {
		this.workerReady = workerReady;
	}
	public Number getWorkerFetchStart() {
		return this.workerFetchStart;
	}
	public void setWorkerFetchStart(Number workerFetchStart) {
		this.workerFetchStart = workerFetchStart;
	}
	public Number getWorkerRespondWithSettled() {
		return this.workerRespondWithSettled;
	}
	public void setWorkerRespondWithSettled(Number workerRespondWithSettled) {
		this.workerRespondWithSettled = workerRespondWithSettled;
	}
	public Number getWorkerRouterEvaluationStart() {
		return this.workerRouterEvaluationStart;
	}
	public void setWorkerRouterEvaluationStart(Number workerRouterEvaluationStart) {
		this.workerRouterEvaluationStart = workerRouterEvaluationStart;
	}
	public Number getWorkerCacheLookupStart() {
		return this.workerCacheLookupStart;
	}
	public void setWorkerCacheLookupStart(Number workerCacheLookupStart) {
		this.workerCacheLookupStart = workerCacheLookupStart;
	}
	public Number getSendStart() {
		return this.sendStart;
	}
	public void setSendStart(Number sendStart) {
		this.sendStart = sendStart;
	}
	public Number getSendEnd() {
		return this.sendEnd;
	}
	public void setSendEnd(Number sendEnd) {
		this.sendEnd = sendEnd;
	}
	public Number getPushStart() {
		return this.pushStart;
	}
	public void setPushStart(Number pushStart) {
		this.pushStart = pushStart;
	}
	public Number getPushEnd() {
		return this.pushEnd;
	}
	public void setPushEnd(Number pushEnd) {
		this.pushEnd = pushEnd;
	}
	public Number getReceiveHeadersStart() {
		return this.receiveHeadersStart;
	}
	public void setReceiveHeadersStart(Number receiveHeadersStart) {
		this.receiveHeadersStart = receiveHeadersStart;
	}
	public Number getReceiveHeadersEnd() {
		return this.receiveHeadersEnd;
	}
	public void setReceiveHeadersEnd(Number receiveHeadersEnd) {
		this.receiveHeadersEnd = receiveHeadersEnd;
	}
}
