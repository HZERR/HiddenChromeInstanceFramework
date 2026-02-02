package ru.hzerr.cdp.type.indexedDB;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Database with an array of object stores.")
public class DatabaseWithObjectStores {

	@Required
	@Description("Database name.")
	private String name;

	@Required
	@Description("Database version (type is not 'integer', as the standard requires the version number to be 'unsigned long long')")
	private Number version;

	@Required
	@Description("Object stores in this database.")
	private List<ObjectStore> objectStores;

    public DatabaseWithObjectStores() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Number getVersion() {
		return this.version;
	}
	public void setVersion(Number version) {
		this.version = version;
	}
	public List<ObjectStore> getObjectStores() {
		return this.objectStores;
	}
	public void setObjectStores(List<ObjectStore> objectStores) {
		this.objectStores = objectStores;
	}
}
