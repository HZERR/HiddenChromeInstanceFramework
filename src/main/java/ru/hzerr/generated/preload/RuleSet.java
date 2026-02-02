package ru.hzerr.generated.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Corresponds to SpeculationRuleSet")
public class RuleSet {

	@Required
	@TypeDescription("Unique id")
	private String id;

	@Required
	@Description("Identifies a document which the rule set is associated with.")
	@TypeDescription("Unique loader identifier.")
	private String loaderId;

	@Required
	@Description("Source text of JSON representing the rule set. If it comes from `<script>` tag, it is the textContent of the node. Note that it is a JSON for valid case.  See also: - https://wicg.github.io/nav-speculation/speculation-rules.html - https://github.com/WICG/nav-speculation/blob/main/triggers.md")
	private String sourceText;

	@Description("A speculation rule set is either added through an inline `<script>` tag or through an external resource via the 'Speculation-Rules' HTTP header. For the first case, we include the BackendNodeId of the relevant `<script>` tag. For the second case, we include the external URL where the rule set was loaded from, and also RequestId if Network domain is enabled.  See also: - https://wicg.github.io/nav-speculation/speculation-rules.html#speculation-rules-script - https://wicg.github.io/nav-speculation/speculation-rules.html#speculation-rules-header")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int backendNodeId;

	private String url;

	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Description("Error information `errorMessage` is null iff `errorType` is null.")
	private String errorType;

	@Deprecated
	@Description("TODO(https://crbug.com/1425354): Replace this property with structured error.")
	private String errorMessage;

	@Description("For more details, see: https://github.com/WICG/nav-speculation/blob/main/speculation-rules-tags.md")
	private String tag;

    public RuleSet() {
    }

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoaderId() {
		return this.loaderId;
	}
	public void setLoaderId(String loaderId) {
		this.loaderId = loaderId;
	}
	public String getSourceText() {
		return this.sourceText;
	}
	public void setSourceText(String sourceText) {
		this.sourceText = sourceText;
	}
	public int getBackendNodeId() {
		return this.backendNodeId;
	}
	public void setBackendNodeId(int backendNodeId) {
		this.backendNodeId = backendNodeId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getErrorType() {
		return this.errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
}
