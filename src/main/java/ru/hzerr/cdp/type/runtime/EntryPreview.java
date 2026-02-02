package ru.hzerr.cdp.type.runtime;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Experimental
public class EntryPreview {

	@Description("Preview of the key. Specified for map-like collection entries.")
	private ObjectPreview key;

	@Required
	@Description("Preview of the value.")
	private ObjectPreview value;

    public EntryPreview() {
    }

	public ObjectPreview getKey() {
		return this.key;
	}
	public void setKey(ObjectPreview key) {
		this.key = key;
	}
	public ObjectPreview getValue() {
		return this.value;
	}
	public void setValue(ObjectPreview value) {
		this.value = value;
	}
}
