package ru.hzerr.generated.runtime;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import ru.hzerr.annotation.Experimental;

@Description("Description of an isolated world.")
public class ExecutionContextDescription {

	@Required
	@Description("Unique id of the execution context. It can be used to specify in which execution context script evaluation should be performed.")
	@TypeDescription("Id of an execution context.")
	private int id;

	@Required
	@Description("Execution context origin.")
	private String origin;

	@Required
	@Description("Human readable name describing given context.")
	private String name;

	@Experimental
	@Required
	@Description("A system-unique execution context identifier. Unlike the id, this is unique across multiple processes, so can be reliably used to identify specific context while backend performs a cross-process navigation.")
	private String uniqueId;

	@Description("Embedder-specific auxiliary data likely matching {isDefault: boolean, type: 'default'|'isolated'|'worker', frameId: string}")
	private Object auxData;

    public ExecutionContextDescription() {
    }

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public Object getAuxData() {
		return this.auxData;
	}
	public void setAuxData(Object auxData) {
		this.auxData = auxData;
	}
}
