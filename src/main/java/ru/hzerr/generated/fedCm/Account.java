package ru.hzerr.generated.fedCm;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Corresponds to IdentityRequestAccount")
public class Account {

	@Required
	private String accountId;

	@Required
	private String email;

	@Required
	private String name;

	@Required
	private String givenName;

	@Required
	private String pictureUrl;

	@Required
	private String idpConfigUrl;

	@Required
	private String idpLoginUrl;

	@Required
	@TypeDescription("Whether this is a sign-up or sign-in action for this account, i.e. whether this account has ever been used to sign in to this RP before.")
	private String loginState;

	@Description("These two are only set if the loginState is signUp")
	private String termsOfServiceUrl;

	private String privacyPolicyUrl;

    public Account() {
    }

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGivenName() {
		return this.givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getPictureUrl() {
		return this.pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getIdpConfigUrl() {
		return this.idpConfigUrl;
	}
	public void setIdpConfigUrl(String idpConfigUrl) {
		this.idpConfigUrl = idpConfigUrl;
	}
	public String getIdpLoginUrl() {
		return this.idpLoginUrl;
	}
	public void setIdpLoginUrl(String idpLoginUrl) {
		this.idpLoginUrl = idpLoginUrl;
	}
	public String getLoginState() {
		return this.loginState;
	}
	public void setLoginState(String loginState) {
		this.loginState = loginState;
	}
	public String getTermsOfServiceUrl() {
		return this.termsOfServiceUrl;
	}
	public void setTermsOfServiceUrl(String termsOfServiceUrl) {
		this.termsOfServiceUrl = termsOfServiceUrl;
	}
	public String getPrivacyPolicyUrl() {
		return this.privacyPolicyUrl;
	}
	public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
	}
}
