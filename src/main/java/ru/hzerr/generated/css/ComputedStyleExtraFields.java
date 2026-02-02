package ru.hzerr.generated.css;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class ComputedStyleExtraFields {

	@Required
	@Description("Returns whether or not this node is being rendered with base appearance, which happens when it has its appearance property set to base/base-select or it is in the subtree of an element being rendered with base appearance.")
	private boolean isAppearanceBase;

    public ComputedStyleExtraFields() {
    }

	public boolean getIsAppearanceBase() {
		return this.isAppearanceBase;
	}
	public void setIsAppearanceBase(boolean isAppearanceBase) {
		this.isAppearanceBase = isAppearanceBase;
	}
}
