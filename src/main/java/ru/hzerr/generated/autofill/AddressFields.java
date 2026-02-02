package ru.hzerr.generated.autofill;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("A list of address fields.")
public class AddressFields {

	@Required
	private List<AddressField> fields;

    public AddressFields() {
    }

	public List<AddressField> getFields() {
		return this.fields;
	}
	public void setFields(List<AddressField> fields) {
		this.fields = fields;
	}
}
