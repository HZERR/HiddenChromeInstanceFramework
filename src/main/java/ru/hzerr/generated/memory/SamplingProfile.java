package ru.hzerr.generated.memory;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Array of heap profile samples.")
public class SamplingProfile {

	@Required
	private List<SamplingProfileNode> samples;

	@Required
	private List<Module> modules;

    public SamplingProfile() {
    }

	public List<SamplingProfileNode> getSamples() {
		return this.samples;
	}
	public void setSamples(List<SamplingProfileNode> samples) {
		this.samples = samples;
	}
	public List<Module> getModules() {
		return this.modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
}
