package ru.hzerr.generated.overlay;

import ru.hzerr.annotation.Description;

public class ContainerQueryContainerHighlightConfig {

	@Description("The style of the container border.")
	private LineStyle containerBorder;

	@Description("The style of the descendants' borders.")
	private LineStyle descendantBorder;

    public ContainerQueryContainerHighlightConfig() {
    }

	public LineStyle getContainerBorder() {
		return this.containerBorder;
	}
	public void setContainerBorder(LineStyle containerBorder) {
		this.containerBorder = containerBorder;
	}
	public LineStyle getDescendantBorder() {
		return this.descendantBorder;
	}
	public void setDescendantBorder(LineStyle descendantBorder) {
		this.descendantBorder = descendantBorder;
	}
}
