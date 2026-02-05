package ru.hzerr.cdp.event.debugger;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;
import ru.hzerr.cdp.type.runtime.StackTrace;

@Description("Fired when virtual machine fails to parse the script.")
@Event("scriptFailedToParse")
public class ScriptFailedToParseEvent {

	@Required
	@Description("Identifier of the script parsed.")
	@TypeDescription("Unique script identifier.")
	private String scriptId;

	@Required
	@Description("URL or name of the script parsed (if any).")
	private String url;

	@Required
	@Description("Line offset of the script within the resource with given URL (for script tags).")
	private int startLine;

	@Required
	@Description("Column offset of the script within the resource with given URL.")
	private int startColumn;

	@Required
	@Description("Last line of the script.")
	private int endLine;

	@Required
	@Description("Length of the last line of the script.")
	private int endColumn;

	@Required
	@Description("Specifies script creation context.")
	@TypeDescription("Id of an execution context.")
	private int executionContextId;

	@Required
	@Description("Content hash of the script, SHA-256.")
	private String hash;

	@Required
	@Description("For Wasm modules, the content of the `build_id` custom section. For JavaScript the `debugId` magic comment.")
	private String buildId;

	@Description("Embedder-specific auxiliary data likely matching {isDefault: boolean, type: 'default'|'isolated'|'worker', frameId: string}")
	private Object executionContextAuxData;

	@Description("URL of source map associated with script (if any).")
	private String sourceMapURL;

	@Description("True, if this script has sourceURL.")
	private boolean hasSourceURL;

	@Description("True, if this script is ES6 module.")
	private boolean isModule;

	@Description("This script length.")
	private int length;

	@Experimental
	@Description("JavaScript top stack frame of where the script parsed event was triggered if available.")
	private StackTrace stackTrace;

	@Experimental
	@Description("If the scriptLanguage is WebAssembly, the code section offset in the module.")
	private int codeOffset;

	@Experimental
	@Description("The language of the script.")
	@TypeDescription("Enum of possible script languages.")
	private String scriptLanguage;

	@Experimental
	@Description("The name the embedder supplied for this script.")
	private String embedderName;

    public ScriptFailedToParseEvent() {
    }

	public String getScriptId() {
		return this.scriptId;
	}
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getStartLine() {
		return this.startLine;
	}
	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}
	public int getStartColumn() {
		return this.startColumn;
	}
	public void setStartColumn(int startColumn) {
		this.startColumn = startColumn;
	}
	public int getEndLine() {
		return this.endLine;
	}
	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}
	public int getEndColumn() {
		return this.endColumn;
	}
	public void setEndColumn(int endColumn) {
		this.endColumn = endColumn;
	}
	public int getExecutionContextId() {
		return this.executionContextId;
	}
	public void setExecutionContextId(int executionContextId) {
		this.executionContextId = executionContextId;
	}
	public String getHash() {
		return this.hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getBuildId() {
		return this.buildId;
	}
	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}
	public Object getExecutionContextAuxData() {
		return this.executionContextAuxData;
	}
	public void setExecutionContextAuxData(Object executionContextAuxData) {
		this.executionContextAuxData = executionContextAuxData;
	}
	public String getSourceMapURL() {
		return this.sourceMapURL;
	}
	public void setSourceMapURL(String sourceMapURL) {
		this.sourceMapURL = sourceMapURL;
	}
	public boolean getHasSourceURL() {
		return this.hasSourceURL;
	}
	public void setHasSourceURL(boolean hasSourceURL) {
		this.hasSourceURL = hasSourceURL;
	}
	public boolean getIsModule() {
		return this.isModule;
	}
	public void setIsModule(boolean isModule) {
		this.isModule = isModule;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public StackTrace getStackTrace() {
		return this.stackTrace;
	}
	public void setStackTrace(StackTrace stackTrace) {
		this.stackTrace = stackTrace;
	}
	public int getCodeOffset() {
		return this.codeOffset;
	}
	public void setCodeOffset(int codeOffset) {
		this.codeOffset = codeOffset;
	}
	public String getScriptLanguage() {
		return this.scriptLanguage;
	}
	public void setScriptLanguage(String scriptLanguage) {
		this.scriptLanguage = scriptLanguage;
	}
	public String getEmbedderName() {
		return this.embedderName;
	}
	public void setEmbedderName(String embedderName) {
		this.embedderName = embedderName;
	}
}
