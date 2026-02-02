package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Experimental;

@Description("Data for a simple selector (these are delimited by commas in a selector list).")
public class Value {

	@Required
	@Description("Value text.")
	private String text;

	@Description("Value range in the underlying resource (if available).")
	private SourceRange range;

	@Experimental
	@Description("Specificity of the selector.")
	private Specificity specificity;

    public Value() {
    }

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public SourceRange getRange() {
		return this.range;
	}
	public void setRange(SourceRange range) {
		this.range = range;
	}
	public Specificity getSpecificity() {
		return this.specificity;
	}
	public void setSpecificity(Specificity specificity) {
		this.specificity = specificity;
	}
}
