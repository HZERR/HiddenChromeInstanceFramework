package ru.hzerr.cdp.event.autofill;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.cdp.type.autofill.FilledField;
import ru.hzerr.cdp.type.autofill.AddressUI;

@Description("Emitted when an address form is filled.")
@Event("addressFormFilled")
public class AddressFormFilledEvent {

	@Required
	@Description("Information about the fields that were filled")
	private List<FilledField> filledFields;

	@Required
	@Description("An UI representation of the address used to fill the form. Consists of a 2D array where each child represents an address/profile line.")
	private AddressUI addressUi;

    public AddressFormFilledEvent() {
    }

	public List<FilledField> getFilledFields() {
		return this.filledFields;
	}
	public void setFilledFields(List<FilledField> filledFields) {
		this.filledFields = filledFields;
	}
	public AddressUI getAddressUi() {
		return this.addressUi;
	}
	public void setAddressUi(AddressUI addressUi) {
		this.addressUi = addressUi;
	}
}
