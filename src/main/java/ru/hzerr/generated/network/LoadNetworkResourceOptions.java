package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("An options object that may be extended later to better support CORS, CORB and streaming.")
public class LoadNetworkResourceOptions {

	@Required
	private boolean disableCache;

	@Required
	private boolean includeCredentials;

    public LoadNetworkResourceOptions() {
    }

	public boolean getDisableCache() {
		return this.disableCache;
	}
	public void setDisableCache(boolean disableCache) {
		this.disableCache = disableCache;
	}
	public boolean getIncludeCredentials() {
		return this.includeCredentials;
	}
	public void setIncludeCredentials(boolean includeCredentials) {
		this.includeCredentials = includeCredentials;
	}
}
