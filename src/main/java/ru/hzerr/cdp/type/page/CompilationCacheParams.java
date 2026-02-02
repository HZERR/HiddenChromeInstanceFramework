package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Per-script compilation cache parameters for `Page.produceCompilationCache`")
public class CompilationCacheParams {

	@Required
	@Description("The URL of the script to produce a compilation cache entry for.")
	private String url;

	@Description("A hint to the backend whether eager compilation is recommended. (the actual compilation mode used is upon backend discretion).")
	private boolean eager;

    public CompilationCacheParams() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean getEager() {
		return this.eager;
	}
	public void setEager(boolean eager) {
		this.eager = eager;
	}
}
