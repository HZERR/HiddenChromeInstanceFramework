package ru.hzerr.cdp.type.indexedDB;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Object store index.")
public class ObjectStoreIndex {

	@Required
	@Description("Index name.")
	private String name;

	@Required
	@Description("Index key path.")
	private KeyPath keyPath;

	@Required
	@Description("If true, index is unique.")
	private boolean unique;

	@Required
	@Description("If true, index allows multiple entries for a key.")
	private boolean multiEntry;

    public ObjectStoreIndex() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public KeyPath getKeyPath() {
		return this.keyPath;
	}
	public void setKeyPath(KeyPath keyPath) {
		this.keyPath = keyPath;
	}
	public boolean getUnique() {
		return this.unique;
	}
	public void setUnique(boolean unique) {
		this.unique = unique;
	}
	public boolean getMultiEntry() {
		return this.multiEntry;
	}
	public void setMultiEntry(boolean multiEntry) {
		this.multiEntry = multiEntry;
	}
}
