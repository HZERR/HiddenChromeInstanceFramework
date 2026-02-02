package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

@Experimental
public class ServiceWorkerRouterInfo {

	@Description("ID of the rule matched. If there is a matched rule, this field will be set, otherwiser no value will be set.")
	private int ruleIdMatched;

	@Description("The router source of the matched rule. If there is a matched rule, this field will be set, otherwise no value will be set.")
	@TypeDescription("Source of service worker router.")
	private String matchedSourceType;

	@Description("The actual router source used.")
	@TypeDescription("Source of service worker router.")
	private String actualSourceType;

    public ServiceWorkerRouterInfo() {
    }

	public int getRuleIdMatched() {
		return this.ruleIdMatched;
	}
	public void setRuleIdMatched(int ruleIdMatched) {
		this.ruleIdMatched = ruleIdMatched;
	}
	public String getMatchedSourceType() {
		return this.matchedSourceType;
	}
	public void setMatchedSourceType(String matchedSourceType) {
		this.matchedSourceType = matchedSourceType;
	}
	public String getActualSourceType() {
		return this.actualSourceType;
	}
	public void setActualSourceType(String actualSourceType) {
		this.actualSourceType = actualSourceType;
	}
}
