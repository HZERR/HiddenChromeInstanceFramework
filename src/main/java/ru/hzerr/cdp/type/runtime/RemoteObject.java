package ru.hzerr.cdp.type.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;

@Description("Mirror object referencing original JavaScript object.")
public class RemoteObject {

	@Required
	@Description("Object type.")
	@Enum({"object", "function", "undefined", "string", "number", "boolean", "symbol", "bigint"})
	private String type;

	@Description("Object subtype hint. Specified for `object` type values only. NOTE: If you change anything here, make sure to also update `subtype` in `ObjectPreview` and `PropertyPreview` below.")
	@Enum({"array", "null", "node", "regexp", "date", "map", "set", "weakmap", "weakset", "iterator", "generator", "error", "proxy", "promise", "typedarray", "arraybuffer", "dataview", "webassemblymemory", "wasmvalue", "trustedtype"})
	private String subtype;

	@Description("Object class (constructor) name. Specified for `object` type values only.")
	private String className;

	@Description("Remote object value in case of primitive values or JSON values (if it was requested).")
	private Object value;

	@Description("Primitive value which can not be JSON-stringified does not have `value`, but gets this property.")
	@TypeDescription("Primitive value which cannot be JSON-stringified. Includes values `-0`, `NaN`, `Infinity`, `-Infinity`, and bigint literals.")
	private String unserializableValue;

	@Description("String representation of the object.")
	private String description;

	@Experimental
	@Description("Deep serialized value.")
	private DeepSerializedValue deepSerializedValue;

	@Description("Unique object identifier (for non-primitive values).")
	@TypeDescription("Unique object identifier.")
	private String objectId;

	@Experimental
	@Description("Preview containing abbreviated property values. Specified for `object` type values only.")
	private ObjectPreview preview;

	@Experimental
	private CustomPreview customPreview;

    public RemoteObject() {
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
	public String getClassName() {
		return this.className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Object getValue() {
		return this.value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getUnserializableValue() {
		return this.unserializableValue;
	}
	public void setUnserializableValue(String unserializableValue) {
		this.unserializableValue = unserializableValue;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public DeepSerializedValue getDeepSerializedValue() {
		return this.deepSerializedValue;
	}
	public void setDeepSerializedValue(DeepSerializedValue deepSerializedValue) {
		this.deepSerializedValue = deepSerializedValue;
	}
	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public ObjectPreview getPreview() {
		return this.preview;
	}
	public void setPreview(ObjectPreview preview) {
		this.preview = preview;
	}
	public CustomPreview getCustomPreview() {
		return this.customPreview;
	}
	public void setCustomPreview(CustomPreview customPreview) {
		this.customPreview = customPreview;
	}
}
