package ru.hzerr.cdp.type.accessibility;

import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.TypeDescription;

public class AXProperty {

	@Required
	@Description("The name of this property.")
	@TypeDescription("Values of AXProperty name: - from 'busy' to 'roledescription': states which apply to every AX node - from 'live' to 'root': attributes which apply to nodes in live regions - from 'autocomplete' to 'valuetext': attributes which apply to widgets - from 'checked' to 'selected': states which apply to widgets - from 'activedescendant' to 'owns': relationships between elements other than parent/child/sibling - from 'activeFullscreenElement' to 'uninteresting': reasons why this noode is hidden")
	private String name;

	@Required
	@Description("The value of this property.")
	private AXValue value;

    public AXProperty() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AXValue getValue() {
		return this.value;
	}
	public void setValue(AXValue value) {
		this.value = value;
	}
}
