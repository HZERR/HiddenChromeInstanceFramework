package ru.hzerr.generated.autofill;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import java.util.List;

public class Address {

	@Required
	@Description("fields and values defining an address.")
	private List<AddressField> fields;

    public Address() {
    }

	public List<AddressField> getFields() {
		return this.fields;
	}
	public void setFields(List<AddressField> fields) {
		this.fields = fields;
	}
}
