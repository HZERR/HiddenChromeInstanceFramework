package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Enum;

@Experimental
public class PropertyPreview {

	@Required
	@Description("Property name.")
	private String name;

	@Required
	@Description("Object type. Accessor means that the property itself is an accessor property.")
	@Enum({"object", "function", "undefined", "string", "number", "boolean", "symbol", "accessor", "bigint"})
	private String type;

	@Description("User-friendly property value string.")
	private String value;

	@Description("Nested value preview.")
	private ObjectPreview valuePreview;

	@Description("Object subtype hint. Specified for `object` type values only.")
	@Enum({"array", "null", "node", "regexp", "date", "map", "set", "weakmap", "weakset", "iterator", "generator", "error", "proxy", "promise", "typedarray", "arraybuffer", "dataview", "webassemblymemory", "wasmvalue", "trustedtype"})
	private String subtype;

    public PropertyPreview() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public ObjectPreview getValuePreview() {
		return this.valuePreview;
	}
	public void setValuePreview(ObjectPreview valuePreview) {
		this.valuePreview = valuePreview;
	}
	public String getSubtype() {
		return this.subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
}
