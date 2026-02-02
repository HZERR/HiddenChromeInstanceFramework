package ru.hzerr.generated.emulation;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import java.util.List;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Used to specify User Agent Client Hints to emulate. See https://wicg.github.io/ua-client-hints Missing optional values will be filled in by the target with what it would normally use.")
public class UserAgentMetadata {

	@Description("Brands appearing in Sec-CH-UA.")
	private List<UserAgentBrandVersion> brands;

	@Description("Brands appearing in Sec-CH-UA-Full-Version-List.")
	private List<UserAgentBrandVersion> fullVersionList;

	@Deprecated
	private String fullVersion;

	@Required
	private String platform;

	@Required
	private String platformVersion;

	@Required
	private String architecture;

	@Required
	private String model;

	@Required
	private boolean mobile;

	private String bitness;

	private boolean wow64;

	@Description("Used to specify User Agent form-factor values. See https://wicg.github.io/ua-client-hints/#sec-ch-ua-form-factors")
	private String[] formFactors;

    public UserAgentMetadata() {
    }

	public List<UserAgentBrandVersion> getBrands() {
		return this.brands;
	}
	public void setBrands(List<UserAgentBrandVersion> brands) {
		this.brands = brands;
	}
	public List<UserAgentBrandVersion> getFullVersionList() {
		return this.fullVersionList;
	}
	public void setFullVersionList(List<UserAgentBrandVersion> fullVersionList) {
		this.fullVersionList = fullVersionList;
	}
	public String getFullVersion() {
		return this.fullVersion;
	}
	public void setFullVersion(String fullVersion) {
		this.fullVersion = fullVersion;
	}
	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getPlatformVersion() {
		return this.platformVersion;
	}
	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}
	public String getArchitecture() {
		return this.architecture;
	}
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean getMobile() {
		return this.mobile;
	}
	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}
	public String getBitness() {
		return this.bitness;
	}
	public void setBitness(String bitness) {
		this.bitness = bitness;
	}
	public boolean getWow64() {
		return this.wow64;
	}
	public void setWow64(boolean wow64) {
		this.wow64 = wow64;
	}
	public String[] getFormFactors() {
		return this.formFactors;
	}
	public void setFormFactors(String[] formFactors) {
		this.formFactors = formFactors;
	}
}
