package ru.hzerr.generated.css;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("CSS function at-rule representation.")
public class CSSFunctionRule {

	@Required
	@Description("Name of the function.")
	private Value name;

	@Description("The css style sheet identifier (absent for user agent stylesheet and user-specified stylesheet rules) this rule came from.")
	@TypeDescription("Unique identifier for a CSS stylesheet.")
	private String styleSheetId;

	@Required
	@Description("Parent stylesheet's origin.")
	@TypeDescription("Stylesheet type: \"injected\" for stylesheets injected via extension, \"user-agent\" for user-agent stylesheets, \"inspector\" for stylesheets created by the inspector (i.e. those holding the \"via inspector\" rules), \"regular\" for regular stylesheets.")
	private String origin;

	@Required
	@Description("List of parameters.")
	private List<CSSFunctionParameter> parameters;

	@Required
	@Description("Function body.")
	private List<CSSFunctionNode> children;

    public CSSFunctionRule() {
    }

	public Value getName() {
		return this.name;
	}
	public void setName(Value name) {
		this.name = name;
	}
	public String getStyleSheetId() {
		return this.styleSheetId;
	}
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}
	public String getOrigin() {
		return this.origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public List<CSSFunctionParameter> getParameters() {
		return this.parameters;
	}
	public void setParameters(List<CSSFunctionParameter> parameters) {
		this.parameters = parameters;
	}
	public List<CSSFunctionNode> getChildren() {
		return this.children;
	}
	public void setChildren(List<CSSFunctionNode> children) {
		this.children = children;
	}
}
