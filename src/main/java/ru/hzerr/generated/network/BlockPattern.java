package ru.hzerr.generated.network;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.Description;

@Experimental
public class BlockPattern {

	@Required
	@Description("URL pattern to match. Patterns use the URLPattern constructor string syntax (https://urlpattern.spec.whatwg.org/) and must be absolute. Example: `*://*:*/*.css`.")
	private String urlPattern;

	@Required
	@Description("Whether or not to block the pattern. If false, a matching request will not be blocked even if it matches a later `BlockPattern`.")
	private boolean block;

    public BlockPattern() {
    }

	public String getUrlPattern() {
		return this.urlPattern;
	}
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	public boolean getBlock() {
		return this.block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}
}
