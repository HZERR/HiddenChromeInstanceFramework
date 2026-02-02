package ru.hzerr.generated.audits;

import ru.hzerr.annotation.Description;

@Description("This struct holds a list of optional fields with additional information specific to the kind of issue. When adding a new issue code, please also add a new optional field to this type.")
public class InspectorIssueDetails {

	private CookieIssueDetails cookieIssueDetails;

	private MixedContentIssueDetails mixedContentIssueDetails;

	private BlockedByResponseIssueDetails blockedByResponseIssueDetails;

	private HeavyAdIssueDetails heavyAdIssueDetails;

	private ContentSecurityPolicyIssueDetails contentSecurityPolicyIssueDetails;

	private SharedArrayBufferIssueDetails sharedArrayBufferIssueDetails;

	private LowTextContrastIssueDetails lowTextContrastIssueDetails;

	private CorsIssueDetails corsIssueDetails;

	private AttributionReportingIssueDetails attributionReportingIssueDetails;

	private QuirksModeIssueDetails quirksModeIssueDetails;

	private PartitioningBlobURLIssueDetails partitioningBlobURLIssueDetails;

	@Deprecated
	private NavigatorUserAgentIssueDetails navigatorUserAgentIssueDetails;

	private GenericIssueDetails genericIssueDetails;

	private DeprecationIssueDetails deprecationIssueDetails;

	private ClientHintIssueDetails clientHintIssueDetails;

	private FederatedAuthRequestIssueDetails federatedAuthRequestIssueDetails;

	private BounceTrackingIssueDetails bounceTrackingIssueDetails;

	private CookieDeprecationMetadataIssueDetails cookieDeprecationMetadataIssueDetails;

	private StylesheetLoadingIssueDetails stylesheetLoadingIssueDetails;

	private PropertyRuleIssueDetails propertyRuleIssueDetails;

	private FederatedAuthUserInfoRequestIssueDetails federatedAuthUserInfoRequestIssueDetails;

	private SharedDictionaryIssueDetails sharedDictionaryIssueDetails;

	private ElementAccessibilityIssueDetails elementAccessibilityIssueDetails;

	private SRIMessageSignatureIssueDetails sriMessageSignatureIssueDetails;

	private UnencodedDigestIssueDetails unencodedDigestIssueDetails;

	private UserReidentificationIssueDetails userReidentificationIssueDetails;

	private PermissionElementIssueDetails permissionElementIssueDetails;

    public InspectorIssueDetails() {
    }

	public CookieIssueDetails getCookieIssueDetails() {
		return this.cookieIssueDetails;
	}
	public void setCookieIssueDetails(CookieIssueDetails cookieIssueDetails) {
		this.cookieIssueDetails = cookieIssueDetails;
	}
	public MixedContentIssueDetails getMixedContentIssueDetails() {
		return this.mixedContentIssueDetails;
	}
	public void setMixedContentIssueDetails(MixedContentIssueDetails mixedContentIssueDetails) {
		this.mixedContentIssueDetails = mixedContentIssueDetails;
	}
	public BlockedByResponseIssueDetails getBlockedByResponseIssueDetails() {
		return this.blockedByResponseIssueDetails;
	}
	public void setBlockedByResponseIssueDetails(BlockedByResponseIssueDetails blockedByResponseIssueDetails) {
		this.blockedByResponseIssueDetails = blockedByResponseIssueDetails;
	}
	public HeavyAdIssueDetails getHeavyAdIssueDetails() {
		return this.heavyAdIssueDetails;
	}
	public void setHeavyAdIssueDetails(HeavyAdIssueDetails heavyAdIssueDetails) {
		this.heavyAdIssueDetails = heavyAdIssueDetails;
	}
	public ContentSecurityPolicyIssueDetails getContentSecurityPolicyIssueDetails() {
		return this.contentSecurityPolicyIssueDetails;
	}
	public void setContentSecurityPolicyIssueDetails(ContentSecurityPolicyIssueDetails contentSecurityPolicyIssueDetails) {
		this.contentSecurityPolicyIssueDetails = contentSecurityPolicyIssueDetails;
	}
	public SharedArrayBufferIssueDetails getSharedArrayBufferIssueDetails() {
		return this.sharedArrayBufferIssueDetails;
	}
	public void setSharedArrayBufferIssueDetails(SharedArrayBufferIssueDetails sharedArrayBufferIssueDetails) {
		this.sharedArrayBufferIssueDetails = sharedArrayBufferIssueDetails;
	}
	public LowTextContrastIssueDetails getLowTextContrastIssueDetails() {
		return this.lowTextContrastIssueDetails;
	}
	public void setLowTextContrastIssueDetails(LowTextContrastIssueDetails lowTextContrastIssueDetails) {
		this.lowTextContrastIssueDetails = lowTextContrastIssueDetails;
	}
	public CorsIssueDetails getCorsIssueDetails() {
		return this.corsIssueDetails;
	}
	public void setCorsIssueDetails(CorsIssueDetails corsIssueDetails) {
		this.corsIssueDetails = corsIssueDetails;
	}
	public AttributionReportingIssueDetails getAttributionReportingIssueDetails() {
		return this.attributionReportingIssueDetails;
	}
	public void setAttributionReportingIssueDetails(AttributionReportingIssueDetails attributionReportingIssueDetails) {
		this.attributionReportingIssueDetails = attributionReportingIssueDetails;
	}
	public QuirksModeIssueDetails getQuirksModeIssueDetails() {
		return this.quirksModeIssueDetails;
	}
	public void setQuirksModeIssueDetails(QuirksModeIssueDetails quirksModeIssueDetails) {
		this.quirksModeIssueDetails = quirksModeIssueDetails;
	}
	public PartitioningBlobURLIssueDetails getPartitioningBlobURLIssueDetails() {
		return this.partitioningBlobURLIssueDetails;
	}
	public void setPartitioningBlobURLIssueDetails(PartitioningBlobURLIssueDetails partitioningBlobURLIssueDetails) {
		this.partitioningBlobURLIssueDetails = partitioningBlobURLIssueDetails;
	}
	public NavigatorUserAgentIssueDetails getNavigatorUserAgentIssueDetails() {
		return this.navigatorUserAgentIssueDetails;
	}
	public void setNavigatorUserAgentIssueDetails(NavigatorUserAgentIssueDetails navigatorUserAgentIssueDetails) {
		this.navigatorUserAgentIssueDetails = navigatorUserAgentIssueDetails;
	}
	public GenericIssueDetails getGenericIssueDetails() {
		return this.genericIssueDetails;
	}
	public void setGenericIssueDetails(GenericIssueDetails genericIssueDetails) {
		this.genericIssueDetails = genericIssueDetails;
	}
	public DeprecationIssueDetails getDeprecationIssueDetails() {
		return this.deprecationIssueDetails;
	}
	public void setDeprecationIssueDetails(DeprecationIssueDetails deprecationIssueDetails) {
		this.deprecationIssueDetails = deprecationIssueDetails;
	}
	public ClientHintIssueDetails getClientHintIssueDetails() {
		return this.clientHintIssueDetails;
	}
	public void setClientHintIssueDetails(ClientHintIssueDetails clientHintIssueDetails) {
		this.clientHintIssueDetails = clientHintIssueDetails;
	}
	public FederatedAuthRequestIssueDetails getFederatedAuthRequestIssueDetails() {
		return this.federatedAuthRequestIssueDetails;
	}
	public void setFederatedAuthRequestIssueDetails(FederatedAuthRequestIssueDetails federatedAuthRequestIssueDetails) {
		this.federatedAuthRequestIssueDetails = federatedAuthRequestIssueDetails;
	}
	public BounceTrackingIssueDetails getBounceTrackingIssueDetails() {
		return this.bounceTrackingIssueDetails;
	}
	public void setBounceTrackingIssueDetails(BounceTrackingIssueDetails bounceTrackingIssueDetails) {
		this.bounceTrackingIssueDetails = bounceTrackingIssueDetails;
	}
	public CookieDeprecationMetadataIssueDetails getCookieDeprecationMetadataIssueDetails() {
		return this.cookieDeprecationMetadataIssueDetails;
	}
	public void setCookieDeprecationMetadataIssueDetails(CookieDeprecationMetadataIssueDetails cookieDeprecationMetadataIssueDetails) {
		this.cookieDeprecationMetadataIssueDetails = cookieDeprecationMetadataIssueDetails;
	}
	public StylesheetLoadingIssueDetails getStylesheetLoadingIssueDetails() {
		return this.stylesheetLoadingIssueDetails;
	}
	public void setStylesheetLoadingIssueDetails(StylesheetLoadingIssueDetails stylesheetLoadingIssueDetails) {
		this.stylesheetLoadingIssueDetails = stylesheetLoadingIssueDetails;
	}
	public PropertyRuleIssueDetails getPropertyRuleIssueDetails() {
		return this.propertyRuleIssueDetails;
	}
	public void setPropertyRuleIssueDetails(PropertyRuleIssueDetails propertyRuleIssueDetails) {
		this.propertyRuleIssueDetails = propertyRuleIssueDetails;
	}
	public FederatedAuthUserInfoRequestIssueDetails getFederatedAuthUserInfoRequestIssueDetails() {
		return this.federatedAuthUserInfoRequestIssueDetails;
	}
	public void setFederatedAuthUserInfoRequestIssueDetails(FederatedAuthUserInfoRequestIssueDetails federatedAuthUserInfoRequestIssueDetails) {
		this.federatedAuthUserInfoRequestIssueDetails = federatedAuthUserInfoRequestIssueDetails;
	}
	public SharedDictionaryIssueDetails getSharedDictionaryIssueDetails() {
		return this.sharedDictionaryIssueDetails;
	}
	public void setSharedDictionaryIssueDetails(SharedDictionaryIssueDetails sharedDictionaryIssueDetails) {
		this.sharedDictionaryIssueDetails = sharedDictionaryIssueDetails;
	}
	public ElementAccessibilityIssueDetails getElementAccessibilityIssueDetails() {
		return this.elementAccessibilityIssueDetails;
	}
	public void setElementAccessibilityIssueDetails(ElementAccessibilityIssueDetails elementAccessibilityIssueDetails) {
		this.elementAccessibilityIssueDetails = elementAccessibilityIssueDetails;
	}
	public SRIMessageSignatureIssueDetails getSriMessageSignatureIssueDetails() {
		return this.sriMessageSignatureIssueDetails;
	}
	public void setSriMessageSignatureIssueDetails(SRIMessageSignatureIssueDetails sriMessageSignatureIssueDetails) {
		this.sriMessageSignatureIssueDetails = sriMessageSignatureIssueDetails;
	}
	public UnencodedDigestIssueDetails getUnencodedDigestIssueDetails() {
		return this.unencodedDigestIssueDetails;
	}
	public void setUnencodedDigestIssueDetails(UnencodedDigestIssueDetails unencodedDigestIssueDetails) {
		this.unencodedDigestIssueDetails = unencodedDigestIssueDetails;
	}
	public UserReidentificationIssueDetails getUserReidentificationIssueDetails() {
		return this.userReidentificationIssueDetails;
	}
	public void setUserReidentificationIssueDetails(UserReidentificationIssueDetails userReidentificationIssueDetails) {
		this.userReidentificationIssueDetails = userReidentificationIssueDetails;
	}
	public PermissionElementIssueDetails getPermissionElementIssueDetails() {
		return this.permissionElementIssueDetails;
	}
	public void setPermissionElementIssueDetails(PermissionElementIssueDetails permissionElementIssueDetails) {
		this.permissionElementIssueDetails = permissionElementIssueDetails;
	}
}
