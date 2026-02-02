package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import java.util.List;

@Experimental
@Description("Object containing abbreviated remote object value.")
public class ObjectPreview {

	@Required
	@Description("Object type.")
	@Enum({"object", "function", "undefined", "string", "number", "boolean", "symbol", "bigint"})
	private String type;

	@Description("Object subtype hint. Specified for `object` type values only.")
	@Enum({"array", "null", "node", "regexp", "date", "map", "set", "weakmap", "weakset", "iterator", "generator", "error", "proxy", "promise", "typedarray", "arraybuffer", "dataview", "webassemblymemory", "wasmvalue", "trustedtype"})
	private String subtype;

	@Description("String representation of the object.")
	private String description;

	@Required
	@Description("True iff some of the properties or entries of the original object did not fit.")
	private boolean overflow;

	@Required
	@Description("List of the properties.")
	private List<PropertyPreview> properties;

	@Description("List of the entries. Specified for `map` and `set` subtype values only.")
	private List<EntryPreview> entries;

    public ObjectPreview() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubtype() {
		return this.subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getOverflow() {
		return this.overflow;
	}
	public void setOverflow(boolean overflow) {
		this.overflow = overflow;
	}
	public List<PropertyPreview> getProperties() {
		return this.properties;
	}
	public void setProperties(List<PropertyPreview> properties) {
		this.properties = properties;
	}
	public List<EntryPreview> getEntries() {
		return this.entries;
	}
	public void setEntries(List<EntryPreview> entries) {
		this.entries = entries;
	}
}
