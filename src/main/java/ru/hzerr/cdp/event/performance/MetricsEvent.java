package ru.hzerr.cdp.event.performance;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import java.util.List;
import ru.hzerr.cdp.type.performance.Metric;

@Description("Current values of the metrics.")
@Event("metrics")
public class MetricsEvent {

	@Required
	@Description("Current values of the metrics.")
	private List<Metric> metrics;

	@Required
	@Description("Timestamp title.")
	private String title;

    public MetricsEvent() {
    }

	public List<Metric> getMetrics() {
		return this.metrics;
	}
	public void setMetrics(List<Metric> metrics) {
		this.metrics = metrics;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
