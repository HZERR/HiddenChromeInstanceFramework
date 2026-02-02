package ru.hzerr.generated.network;

import ru.hzerr.annotation.Description;

@Description("Post data entry for HTTP request")
public class PostDataEntry {

	private byte[] bytes;

    public PostDataEntry() {
    }

	public byte[] getBytes() {
		return this.bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
}
