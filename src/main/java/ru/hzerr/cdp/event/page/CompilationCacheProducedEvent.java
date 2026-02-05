package ru.hzerr.cdp.event.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Experimental
@Description("Issued for every compilation cache generated.")
@Event("compilationCacheProduced")
public class CompilationCacheProducedEvent {

	@Required
	private String url;

	@Required
	@Description("Base64-encoded data")
	private byte[] data;

    public CompilationCacheProducedEvent() {
    }

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public byte[] getData() {
		return this.data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
}
