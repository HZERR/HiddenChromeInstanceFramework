package ru.hzerr.generated.cacheStorage;

import ru.hzerr.annotation.Required;

public class Header {

	@Required
	private String name;

	@Required
	private String value;

    public Header() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
