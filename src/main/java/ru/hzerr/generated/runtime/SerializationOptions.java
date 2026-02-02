package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Enum;

@Description("Represents options for serialization. Overrides `generatePreview` and `returnByValue`.")
public class SerializationOptions {

	@Required
	@Enum({"deep", "json", "idOnly"})
	private String serialization;

	@Description("Deep serialization depth. Default is full depth. Respected only in `deep` serialization mode.")
	private int maxDepth;

	@Description("Embedder-specific parameters. For example if connected to V8 in Chrome these control DOM serialization via `maxNodeDepth: integer` and `includeShadowTree: \"none\" | \"open\" | \"all\"`. Values can be only of type string or integer.")
	private Object additionalParameters;

    public SerializationOptions() {
    }

	public String getSerialization() {
		return this.serialization;
	}
	public void setSerialization(String serialization) {
		this.serialization = serialization;
	}
	public int getMaxDepth() {
		return this.maxDepth;
	}
	public void setMaxDepth(int maxDepth) {
		this.maxDepth = maxDepth;
	}
	public Object getAdditionalParameters() {
		return this.additionalParameters;
	}
	public void setAdditionalParameters(Object additionalParameters) {
		this.additionalParameters = additionalParameters;
	}
}
