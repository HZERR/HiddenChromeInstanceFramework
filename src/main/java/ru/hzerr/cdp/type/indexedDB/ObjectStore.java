package ru.hzerr.cdp.type.indexedDB;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Object store.")
public class ObjectStore {

	@Required
	@Description("Object store name.")
	private String name;

	@Required
	@Description("Object store key path.")
	private KeyPath keyPath;

	@Required
	@Description("If true, object store has auto increment flag set.")
	private boolean autoIncrement;

	@Required
	@Description("Indexes in this object store.")
	private List<ObjectStoreIndex> indexes;

    public ObjectStore() {
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
	public boolean getAutoIncrement() {
		return this.autoIncrement;
	}
	public void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}
	public List<ObjectStoreIndex> getIndexes() {
		return this.indexes;
	}
	public void setIndexes(List<ObjectStoreIndex> indexes) {
		this.indexes = indexes;
	}
}
