package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Bundles a candidate URL with its reporting metadata.")
public class SharedStorageUrlWithMetadata {

	@Required
	@Description("Spec of candidate URL.")
	private String url;

	@Required
	@Description("Any associated reporting metadata.")
	private List<SharedStorageReportingMetadata> reportingMetadata;

    public SharedStorageUrlWithMetadata() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<SharedStorageReportingMetadata> getReportingMetadata() {
		return this.reportingMetadata;
	}
	public void setReportingMetadata(List<SharedStorageReportingMetadata> reportingMetadata) {
		this.reportingMetadata = reportingMetadata;
	}
}
