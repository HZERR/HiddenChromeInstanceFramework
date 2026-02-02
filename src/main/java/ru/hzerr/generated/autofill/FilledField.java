package ru.hzerr.generated.autofill;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class FilledField {

	@Required
	@Description("The type of the field, e.g text, password etc.")
	private String htmlType;

	@Required
	@Description("the html id")
	private String id;

	@Required
	@Description("the html name")
	private String name;

	@Required
	@Description("the field value")
	private String value;

	@Required
	@Description("The actual field type, e.g FAMILY_NAME")
	private String autofillType;

	@Required
	@Description("The filling strategy")
	@TypeDescription("Specified whether a filled field was done so by using the html autocomplete attribute or autofill heuristics.")
	private String fillingStrategy;

	@Required
	@Description("The frame the field belongs to")
	@TypeDescription("Unique frame identifier.")
	private String frameId;

	@Required
	@Description("The form field's DOM node")
	@TypeDescription("Unique DOM node identifier used to reference a node that may not have been pushed to the front-end.")
	private int fieldId;

    public FilledField() {
    }

	public String getHtmlType() {
		return this.htmlType;
	}
	public void setHtmlType(String htmlType) {
		this.htmlType = htmlType;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getAutofillType() {
		return this.autofillType;
	}
	public void setAutofillType(String autofillType) {
		this.autofillType = autofillType;
	}
	public String getFillingStrategy() {
		return this.fillingStrategy;
	}
	public void setFillingStrategy(String fillingStrategy) {
		this.fillingStrategy = fillingStrategy;
	}
	public String getFrameId() {
		return this.frameId;
	}
	public void setFrameId(String frameId) {
		this.frameId = frameId;
	}
	public int getFieldId() {
		return this.fieldId;
	}
	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}
}
