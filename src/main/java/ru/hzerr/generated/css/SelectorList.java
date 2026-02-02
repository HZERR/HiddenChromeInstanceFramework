package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Selector list data.")
public class SelectorList {

	@Required
	@Description("Selectors in the list.")
	private List<Value> selectors;

	@Required
	@Description("Rule selector text.")
	private String text;

    public SelectorList() {
    }

	public List<Value> getSelectors() {
		return this.selectors;
	}
	public void setSelectors(List<Value> selectors) {
		this.selectors = selectors;
	}
	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
