package ru.hzerr.generated.fetch;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Response to an AuthChallenge.")
public class AuthChallengeResponse {

	@Required
	@Description("The decision on what to do in response to the authorization challenge.  Default means deferring to the default behavior of the net stack, which will likely either the Cancel authentication or display a popup dialog box.")
	@Enum({"Default", "CancelAuth", "ProvideCredentials"})
	private String response;

	@Description("The username to provide, possibly empty. Should only be set if response is ProvideCredentials.")
	private String username;

	@Description("The password to provide, possibly empty. Should only be set if response is ProvideCredentials.")
	private String password;

    public AuthChallengeResponse() {
    }

	public String getResponse() {
		return this.response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
