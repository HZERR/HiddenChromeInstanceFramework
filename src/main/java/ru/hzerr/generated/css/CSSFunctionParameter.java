package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("CSS function argument representation.")
public class CSSFunctionParameter {

	@Required
	@Description("The parameter name.")
	private String name;

	@Required
	@Description("The parameter type.")
	private String type;

    public CSSFunctionParameter() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
