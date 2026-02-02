package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Additional information about the frame document's security origin.")
public class SecurityOriginDetails {

	@Required
	@Description("Indicates whether the frame document's security origin is one of the local hostnames (e.g. \"localhost\") or IP addresses (IPv4 127.0.0.0/8 or IPv6 ::1).")
	private boolean isLocalhost;

    public SecurityOriginDetails() {
    }

	public boolean getIsLocalhost() {
		return this.isLocalhost;
	}
	public void setIsLocalhost(boolean isLocalhost) {
		this.isLocalhost = isLocalhost;
	}
}
