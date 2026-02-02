package ru.hzerr.cdp.type.browser;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
@Description("Chrome histogram.")
public class Histogram {

	@Required
	@Description("Name.")
	private String name;

	@Required
	@Description("Sum of sample values.")
	private int sum;

	@Required
	@Description("Total number of samples.")
	private int count;

	@Required
	@Description("Buckets.")
	private List<Bucket> buckets;

    public Histogram() {
    }

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return this.sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Bucket> getBuckets() {
		return this.buckets;
	}
	public void setBuckets(List<Bucket> buckets) {
		this.buckets = buckets;
	}
}
