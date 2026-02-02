package ru.hzerr.generated.input;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.annotation.Description;

@Experimental
public class DragData {

	@Required
	private List<DragDataItem> items;

	@Description("List of filenames that should be included when dropping")
	private String[] files;

	@Required
	@Description("Bit field representing allowed drag operations. Copy = 1, Link = 2, Move = 16")
	private int dragOperationsMask;

    public DragData() {
    }

	public List<DragDataItem> getItems() {
		return this.items;
	}
	public void setItems(List<DragDataItem> items) {
		this.items = items;
	}
	public String[] getFiles() {
		return this.files;
	}
	public void setFiles(String[] files) {
		this.files = files;
	}
	public int getDragOperationsMask() {
		return this.dragOperationsMask;
	}
	public void setDragOperationsMask(int dragOperationsMask) {
		this.dragOperationsMask = dragOperationsMask;
	}
}
