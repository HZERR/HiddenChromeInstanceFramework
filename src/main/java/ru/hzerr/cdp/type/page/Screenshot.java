package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;

@Experimental
public class Screenshot {

	@Required
	private ImageResource image;

	@Required
	private String formFactor;

	private String label;

    public Screenshot() {
    }

	public ImageResource getImage() {
		return this.image;
	}
	public void setImage(ImageResource image) {
		this.image = image;
	}
	public String getFormFactor() {
		return this.formFactor;
	}
	public void setFormFactor(String formFactor) {
		this.formFactor = formFactor;
	}
	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
