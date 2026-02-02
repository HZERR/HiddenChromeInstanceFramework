package ru.hzerr.generated.layerTree;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;

@Description("Serialized fragment of layer picture along with its offset within the layer.")
public class PictureTile {

	@Required
	@Description("Offset from owning layer left boundary")
	private Number x;

	@Required
	@Description("Offset from owning layer top boundary")
	private Number y;

	@Required
	@Description("Base64-encoded snapshot data.")
	private byte[] picture;

    public PictureTile() {
    }

	public Number getX() {
		return this.x;
	}
	public void setX(Number x) {
		this.x = x;
	}
	public Number getY() {
		return this.y;
	}
	public void setY(Number y) {
		this.y = y;
	}
	public byte[] getPicture() {
		return this.picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
}
