package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeExperimental;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Experimental
@Description("Indicates whether a frame has been identified as an ad and why.")
public class AdFrameStatus {

	@Required
	@TypeExperimental
	@TypeDescription("Indicates whether a frame has been identified as an ad.")
	private String adFrameType;

	@TypeExperimental
	private List<String> explanations;

    public AdFrameStatus() {
    }

	public String getAdFrameType() {
		return this.adFrameType;
	}
	public void setAdFrameType(String adFrameType) {
		this.adFrameType = adFrameType;
	}
	public List<String> getExplanations() {
		return this.explanations;
	}
	public void setExplanations(List<String> explanations) {
		this.explanations = explanations;
	}
}
