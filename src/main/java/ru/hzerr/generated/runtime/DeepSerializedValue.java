package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Represents deep serialized value.")
public class DeepSerializedValue {

	@Required
	@Enum({"undefined", "null", "string", "number", "boolean", "bigint", "regexp", "date", "symbol", "array", "object", "function", "map", "set", "weakmap", "weakset", "error", "proxy", "promise", "typedarray", "arraybuffer", "node", "window", "generator"})
	private String type;

	private Object value;

	private String objectId;

	@Description("Set if value reference met more then once during serialization. In such case, value is provided only to one of the serialized values. Unique per value in the scope of one CDP call.")
	private int weakLocalObjectReference;

    public DeepSerializedValue() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object getValue() {
		return this.value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public int getWeakLocalObjectReference() {
		return this.weakLocalObjectReference;
	}
	public void setWeakLocalObjectReference(int weakLocalObjectReference) {
		this.weakLocalObjectReference = weakLocalObjectReference;
	}
}
