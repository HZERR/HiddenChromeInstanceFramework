package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import java.util.List;

@Experimental
public class WebAppManifest {

	private String backgroundColor;

	@Description("The extra description provided by the manifest.")
	private String description;

	private String dir;

	private String display;

	@Description("The overrided display mode controlled by the user.")
	private String[] displayOverrides;

	@Description("The handlers to open files.")
	private List<FileHandler> fileHandlers;

	private List<ImageResource> icons;

	private String id;

	private String lang;

	@Description("TODO(crbug.com/1231886): This field is non-standard and part of a Chrome experiment. See: https://github.com/WICG/web-app-launch/blob/main/launch_handler.md")
	private LaunchHandler launchHandler;

	private String name;

	private String orientation;

	private boolean preferRelatedApplications;

	@Description("The handlers to open protocols.")
	private List<ProtocolHandler> protocolHandlers;

	private List<RelatedApplication> relatedApplications;

	private String scope;

	@Description("Non-standard, see https://github.com/WICG/manifest-incubations/blob/gh-pages/scope_extensions-explainer.md")
	private List<ScopeExtension> scopeExtensions;

	@Description("The screenshots used by chromium.")
	private List<Screenshot> screenshots;

	private ShareTarget shareTarget;

	private String shortName;

	private List<Shortcut> shortcuts;

	private String startUrl;

	private String themeColor;

    public WebAppManifest() {
    }

	public String getBackgroundColor() {
		return this.backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDir() {
		return this.dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getDisplay() {
		return this.display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String[] getDisplayOverrides() {
		return this.displayOverrides;
	}
	public void setDisplayOverrides(String[] displayOverrides) {
		this.displayOverrides = displayOverrides;
	}
	public List<FileHandler> getFileHandlers() {
		return this.fileHandlers;
	}
	public void setFileHandlers(List<FileHandler> fileHandlers) {
		this.fileHandlers = fileHandlers;
	}
	public List<ImageResource> getIcons() {
		return this.icons;
	}
	public void setIcons(List<ImageResource> icons) {
		this.icons = icons;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLang() {
		return this.lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public LaunchHandler getLaunchHandler() {
		return this.launchHandler;
	}
	public void setLaunchHandler(LaunchHandler launchHandler) {
		this.launchHandler = launchHandler;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrientation() {
		return this.orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public boolean getPreferRelatedApplications() {
		return this.preferRelatedApplications;
	}
	public void setPreferRelatedApplications(boolean preferRelatedApplications) {
		this.preferRelatedApplications = preferRelatedApplications;
	}
	public List<ProtocolHandler> getProtocolHandlers() {
		return this.protocolHandlers;
	}
	public void setProtocolHandlers(List<ProtocolHandler> protocolHandlers) {
		this.protocolHandlers = protocolHandlers;
	}
	public List<RelatedApplication> getRelatedApplications() {
		return this.relatedApplications;
	}
	public void setRelatedApplications(List<RelatedApplication> relatedApplications) {
		this.relatedApplications = relatedApplications;
	}
	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public List<ScopeExtension> getScopeExtensions() {
		return this.scopeExtensions;
	}
	public void setScopeExtensions(List<ScopeExtension> scopeExtensions) {
		this.scopeExtensions = scopeExtensions;
	}
	public List<Screenshot> getScreenshots() {
		return this.screenshots;
	}
	public void setScreenshots(List<Screenshot> screenshots) {
		this.screenshots = screenshots;
	}
	public ShareTarget getShareTarget() {
		return this.shareTarget;
	}
	public void setShareTarget(ShareTarget shareTarget) {
		this.shareTarget = shareTarget;
	}
	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public List<Shortcut> getShortcuts() {
		return this.shortcuts;
	}
	public void setShortcuts(List<Shortcut> shortcuts) {
		this.shortcuts = shortcuts;
	}
	public String getStartUrl() {
		return this.startUrl;
	}
	public void setStartUrl(String startUrl) {
		this.startUrl = startUrl;
	}
	public String getThemeColor() {
		return this.themeColor;
	}
	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}
}
