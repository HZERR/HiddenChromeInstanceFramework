package ru.hzerr.generated.domSnapshot;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("Data that is only present on rare nodes.")
public class RareStringData {

	@Required
	private int[] index;

	@Required
	@TypeDescription("Index of the string in the strings table.")
	private List<Integer> value;

    public RareStringData() {
    }

	public int[] getIndex() {
		return this.index;
	}
	public void setIndex(int[] index) {
		this.index = index;
	}
	public List<Integer> getValue() {
		return this.value;
	}
	public void setValue(List<Integer> value) {
		this.value = value;
	}
}
