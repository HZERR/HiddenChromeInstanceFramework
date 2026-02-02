package ru.hzerr.cdp.type.autofill;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

public class CreditCard {

	@Required
	@Description("16-digit credit card number.")
	private String number;

	@Required
	@Description("Name of the credit card owner.")
	private String name;

	@Required
	@Description("2-digit expiry month.")
	private String expiryMonth;

	@Required
	@Description("4-digit expiry year.")
	private String expiryYear;

	@Required
	@Description("3-digit card verification code.")
	private String cvc;

    public CreditCard() {
    }

	public String getNumber() {
		return this.number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpiryMonth() {
		return this.expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public String getExpiryYear() {
		return this.expiryYear;
	}
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	public String getCvc() {
		return this.cvc;
	}
	public void setCvc(String cvc) {
		this.cvc = cvc;
	}
}
