package ru.hzerr.generated.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("Details for an origin's shared storage.")
public class SharedStorageMetadata {

	@Required
	@Description("Time when the origin's shared storage was last created.")
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number creationTime;

	@Required
	@Description("Number of key-value pairs stored in origin's shared storage.")
	private int length;

	@Required
	@Description("Current amount of bits of entropy remaining in the navigation budget.")
	private Number remainingBudget;

	@Required
	@Description("Total number of bytes stored as key-value pairs in origin's shared storage.")
	private int bytesUsed;

    public SharedStorageMetadata() {
    }

	public Number getCreationTime() {
		return this.creationTime;
	}
	public void setCreationTime(Number creationTime) {
		this.creationTime = creationTime;
	}
	public int getLength() {
		return this.length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Number getRemainingBudget() {
		return this.remainingBudget;
	}
	public void setRemainingBudget(Number remainingBudget) {
		this.remainingBudget = remainingBudget;
	}
	public int getBytesUsed() {
		return this.bytesUsed;
	}
	public void setBytesUsed(int bytesUsed) {
		this.bytesUsed = bytesUsed;
	}
}
