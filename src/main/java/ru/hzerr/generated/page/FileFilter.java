package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;

@Experimental
public class FileFilter {

	private String name;

	private String[] accepts;

    public FileFilter() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getAccepts() {
		return this.accepts;
	}
	public void setAccepts(String[] accepts) {
		this.accepts = accepts;
	}
}
