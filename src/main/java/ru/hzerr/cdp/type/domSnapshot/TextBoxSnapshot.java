package ru.hzerr.cdp.type.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Table of details of the post layout rendered text positions. The exact layout should not be regarded as stable and may change between versions.")
public class TextBoxSnapshot {

	@Required
	@Description("Index of the layout tree node that owns this box collection.")
	private int[] layoutIndex;

	@Required
	@Description("The absolute position bounding box.")
	private List<List<Number>> bounds;

	@Required
	@Description("The starting index in characters, for this post layout textbox substring. Characters that would be represented as a surrogate pair in UTF-16 have length 2.")
	private int[] start;

	@Required
	@Description("The number of characters in this post layout textbox substring. Characters that would be represented as a surrogate pair in UTF-16 have length 2.")
	private int[] length;

    public TextBoxSnapshot() {
    }

	public int[] getLayoutIndex() {
		return this.layoutIndex;
	}
	public void setLayoutIndex(int[] layoutIndex) {
		this.layoutIndex = layoutIndex;
	}
	public List<List<Number>> getBounds() {
		return this.bounds;
	}
	public void setBounds(List<List<Number>> bounds) {
		this.bounds = bounds;
	}
	public int[] getStart() {
		return this.start;
	}
	public void setStart(int[] start) {
		this.start = start;
	}
	public int[] getLength() {
		return this.length;
	}
	public void setLength(int[] length) {
		this.length = length;
	}
}
