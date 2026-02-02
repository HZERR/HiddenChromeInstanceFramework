package ru.hzerr.cdp.type.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Description("Inherited pseudo element matches from pseudos of an ancestor node.")
public class InheritedPseudoElementMatches {

	@Required
	@Description("Matches of pseudo styles from the pseudos of an ancestor node.")
	private List<PseudoElementMatches> pseudoElements;

    public InheritedPseudoElementMatches() {
    }

	public List<PseudoElementMatches> getPseudoElements() {
		return this.pseudoElements;
	}
	public void setPseudoElements(List<PseudoElementMatches> pseudoElements) {
		this.pseudoElements = pseudoElements;
	}
}
