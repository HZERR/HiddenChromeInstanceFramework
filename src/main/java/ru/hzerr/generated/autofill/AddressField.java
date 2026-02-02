package ru.hzerr.generated.autofill;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class AddressField {

	@Required
	@Description("address field name, for example GIVEN_NAME. The full list of supported field names: https://source.chromium.org/chromium/chromium/src/+/main:components/autofill/core/browser/field_types.cc;l=38")
	private String name;

	@Required
	@Description("address field value, for example Jon Doe.")
	private String value;

    public AddressField() {
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
