package ru.hzerr.generated.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class ScopeExtension {

	@Required
	@Description("Instead of using tuple, this field always returns the serialized string for easy understanding and comparison.")
	private String origin;

	@Required
	private boolean hasOriginWildcard;

    public ScopeExtension() {
    }

	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public boolean getHasOriginWildcard() {
		return this.hasOriginWildcard;
	}
	public void setHasOriginWildcard(boolean hasOriginWildcard) {
		this.hasOriginWildcard = hasOriginWildcard;
	}
}
