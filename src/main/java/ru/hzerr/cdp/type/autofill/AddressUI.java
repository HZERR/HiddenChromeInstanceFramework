package ru.hzerr.cdp.type.autofill;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Defines how an address can be displayed like in chrome://settings/addresses. Address UI is a two dimensional array, each inner array is an \"address information line\", and when rendered in a UI surface should be displayed as such. The following address UI for instance: [[{name: \"GIVE_NAME\", value: \"Jon\"}, {name: \"FAMILY_NAME\", value: \"Doe\"}], [{name: \"CITY\", value: \"Munich\"}, {name: \"ZIP\", value: \"81456\"}]] should allow the receiver to render: Jon Doe Munich 81456")
public class AddressUI {

	@Required
	@Description("A two dimension array containing the representation of values from an address profile.")
	private List<AddressFields> addressFields;

    public AddressUI() {
    }

	public List<AddressFields> getAddressFields() {
		return this.addressFields;
	}
	public void setAddressFields(List<AddressFields> addressFields) {
		this.addressFields = addressFields;
	}
}
