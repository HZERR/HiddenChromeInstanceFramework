package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("CSS rule collection for a single pseudo style.")
public class PseudoElementMatches {

	@Required
	@Description("Pseudo element type.")
	@TypeDescription("Pseudo element type.")
	private String pseudoType;

	@Description("Pseudo element custom ident.")
	private String pseudoIdentifier;

	@Required
	@Description("Matches of CSS rules applicable to the pseudo style.")
	private List<RuleMatch> matches;

    public PseudoElementMatches() {
    }

	public String getPseudoType() {
		return this.pseudoType;
	}
	public void setPseudoType(String pseudoType) {
		this.pseudoType = pseudoType;
	}
	public String getPseudoIdentifier() {
		return this.pseudoIdentifier;
	}
	public void setPseudoIdentifier(String pseudoIdentifier) {
		this.pseudoIdentifier = pseudoIdentifier;
	}
	public List<RuleMatch> getMatches() {
		return this.matches;
	}
	public void setMatches(List<RuleMatch> matches) {
		this.matches = matches;
	}
}
