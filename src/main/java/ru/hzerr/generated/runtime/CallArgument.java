package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

@Description("Represents function call argument. Either remote object id `objectId`, primitive `value`, unserializable primitive value or neither of (for undefined) them should be specified.")
public class CallArgument {

	@Description("Primitive value or serializable javascript object.")
	private Object value;

	@Description("Primitive value which can not be JSON-stringified.")
	@TypeDescription("Primitive value which cannot be JSON-stringified. Includes values `-0`, `NaN`, `Infinity`, `-Infinity`, and bigint literals.")
	private String unserializableValue;

	@Description("Remote object handle.")
	@TypeDescription("Unique object identifier.")
	private String objectId;

    public CallArgument() {
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
	public String getObjectId() {
		return this.objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
}
