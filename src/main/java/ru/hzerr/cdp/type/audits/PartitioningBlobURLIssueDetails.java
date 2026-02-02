package ru.hzerr.cdp.type.audits;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class PartitioningBlobURLIssueDetails {

	@Required
	@Description("The BlobURL that failed to load.")
	private String url;

	@Required
	@Description("Additional information about the Partitioning Blob URL issue.")
	private String partitioningBlobURLInfo;

    public PartitioningBlobURLIssueDetails() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPartitioningBlobURLInfo() {
		return this.partitioningBlobURLInfo;
	}
	public void setPartitioningBlobURLInfo(String partitioningBlobURLInfo) {
		this.partitioningBlobURLInfo = partitioningBlobURLInfo;
	}
}
