package ru.hzerr.generated.systemInfo;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Represents process info.")
public class ProcessInfo {

	@Required
	@Description("Specifies process type.")
	private String type;

	@Required
	@Description("Specifies process id.")
	private int id;

	@Required
	@Description("Specifies cumulative CPU usage in seconds across all threads of the process since the process start.")
	private Number cpuTime;

    public ProcessInfo() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Number getCpuTime() {
		return this.cpuTime;
	}
	public void setCpuTime(Number cpuTime) {
		this.cpuTime = cpuTime;
	}
}
