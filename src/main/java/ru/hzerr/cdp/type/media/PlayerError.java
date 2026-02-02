package ru.hzerr.cdp.type.media;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Corresponds to kMediaError")
public class PlayerError {

	@Required
	private String errorType;

	@Required
	@Description("Code is the numeric enum entry for a specific set of error codes, such as PipelineStatusCodes in media/base/pipeline_status.h")
	private int code;

	@Required
	@Description("A trace of where this error was caused / where it passed through.")
	private List<PlayerErrorSourceLocation> stack;

	@Required
	@Description("Errors potentially have a root cause error, ie, a DecoderError might be caused by an WindowsError")
	private List<PlayerError> cause;

	@Required
	@Description("Extra data attached to an error, such as an HRESULT, Video Codec, etc.")
	private Object data;

    public PlayerError() {
    }

	public String getErrorType() {
		return this.errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public int getCode() {
		return this.code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public List<PlayerErrorSourceLocation> getStack() {
		return this.stack;
	}
	public void setStack(List<PlayerErrorSourceLocation> stack) {
		this.stack = stack;
	}
	public List<PlayerError> getCause() {
		return this.cause;
	}
	public void setCause(List<PlayerError> cause) {
		this.cause = cause;
	}
	public Object getData() {
		return this.data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
