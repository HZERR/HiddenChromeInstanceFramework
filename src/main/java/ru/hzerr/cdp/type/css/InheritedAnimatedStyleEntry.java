package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import java.util.List;

@Description("Inherited CSS style collection for animated styles from ancestor node.")
public class InheritedAnimatedStyleEntry {

	@Description("Styles coming from the animations of the ancestor, if any, in the style inheritance chain.")
	private List<CSSAnimationStyle> animationStyles;

	@Description("The style coming from the transitions of the ancestor, if any, in the style inheritance chain.")
	private CSSStyle transitionsStyle;

    public InheritedAnimatedStyleEntry() {
    }

	public List<CSSAnimationStyle> getAnimationStyles() {
		return this.animationStyles;
	}
	public void setAnimationStyles(List<CSSAnimationStyle> animationStyles) {
		this.animationStyles = animationStyles;
	}
	public CSSStyle getTransitionsStyle() {
		return this.transitionsStyle;
	}
	public void setTransitionsStyle(CSSStyle transitionsStyle) {
		this.transitionsStyle = transitionsStyle;
	}
}
