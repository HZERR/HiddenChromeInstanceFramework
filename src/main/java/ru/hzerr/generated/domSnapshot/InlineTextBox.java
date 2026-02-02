package ru.hzerr.generated.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.generated.dom.Rect;

@Description("Details of post layout rendered text positions. The exact layout should not be regarded as stable and may change between versions.")
public class InlineTextBox {

	@Required
	@Description("The bounding box in document coordinates. Note that scroll offset of the document is ignored.")
	private Rect boundingBox;

	@Required
	@Description("The starting index in characters, for this post layout textbox substring. Characters that would be represented as a surrogate pair in UTF-16 have length 2.")
	private int startCharacterIndex;

	@Required
	@Description("The number of characters in this post layout textbox substring. Characters that would be represented as a surrogate pair in UTF-16 have length 2.")
	private int numCharacters;

    public InlineTextBox() {
    }

	public Rect getBoundingBox() {
		return this.boundingBox;
	}
	public void setBoundingBox(Rect boundingBox) {
		this.boundingBox = boundingBox;
	}
	public int getStartCharacterIndex() {
		return this.startCharacterIndex;
	}
	public void setStartCharacterIndex(int startCharacterIndex) {
		this.startCharacterIndex = startCharacterIndex;
	}
	public int getNumCharacters() {
		return this.numCharacters;
	}
	public void setNumCharacters(int numCharacters) {
		this.numCharacters = numCharacters;
	}
}
