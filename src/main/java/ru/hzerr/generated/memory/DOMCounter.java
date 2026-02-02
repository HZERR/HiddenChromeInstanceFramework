package ru.hzerr.generated.memory;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("DOM object counter data.")
public class DOMCounter {

	@Required
	@Description("Object name. Note: object names should be presumed volatile and clients should not expect the returned names to be consistent across runs.")
	private String name;

	@Required
	@Description("Object count.")
	private int count;

    public DOMCounter() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
