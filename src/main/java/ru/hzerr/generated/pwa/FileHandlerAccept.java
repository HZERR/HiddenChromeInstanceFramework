package ru.hzerr.generated.pwa;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("The following types are the replica of https://crsrc.org/c/chrome/browser/web_applications/proto/web_app_os_integration_state.proto;drc=9910d3be894c8f142c977ba1023f30a656bc13fc;l=67")
public class FileHandlerAccept {

	@Required
	@Description("New name of the mimetype according to https://www.iana.org/assignments/media-types/media-types.xhtml")
	private String mediaType;

	@Required
	private String[] fileExtensions;

    public FileHandlerAccept() {
    }

	public String getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public String[] getFileExtensions() {
		return this.fileExtensions;
	}
	public void setFileExtensions(String[] fileExtensions) {
		this.fileExtensions = fileExtensions;
	}
}
