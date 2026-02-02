package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Media query descriptor.")
public class MediaQuery {

	@Required
	@Description("Array of media query expressions.")
	private List<MediaQueryExpression> expressions;

	@Required
	@Description("Whether the media query condition is satisfied.")
	private boolean active;

    public MediaQuery() {
    }

	public List<MediaQueryExpression> getExpressions() {
		return this.expressions;
	}
	public void setExpressions(List<MediaQueryExpression> expressions) {
		this.expressions = expressions;
	}
	public boolean getActive() {
		return this.active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
