package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Enum;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Authorization challenge for HTTP status code 401 or 407.")
public class AuthChallenge {

	@Description("Source of the authentication challenge.")
	@Enum({"Server", "Proxy"})
	private String source;

	@Required
	@Description("Origin of the challenger.")
	private String origin;

	@Required
	@Description("The authentication scheme used, such as basic or digest")
	private String scheme;

	@Required
	@Description("The realm of the challenge. May be empty.")
	private String realm;

    public AuthChallenge() {
    }

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getScheme() {
		return this.scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	public String getRealm() {
		return this.realm;
	}
	public void setRealm(String realm) {
		this.realm = realm;
	}
}
