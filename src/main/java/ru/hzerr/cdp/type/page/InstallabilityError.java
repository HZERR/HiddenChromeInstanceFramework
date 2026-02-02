package ru.hzerr.cdp.type.page;

import ru.hzerr.annotation.Experimental;
import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Required;
import java.util.List;

@Experimental
@Description("The installability error")
public class InstallabilityError {

	@Required
	@Description("The error id (e.g. 'manifest-missing-suitable-icon').")
	private String errorId;

	@Required
	@Description("The list of error arguments (e.g. {name:'minimum-icon-size-in-pixels', value:'64'}).")
	private List<InstallabilityErrorArgument> errorArguments;

    public InstallabilityError() {
    }

	public String getErrorId() {
		return this.errorId;
	}
	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}
	public List<InstallabilityErrorArgument> getErrorArguments() {
		return this.errorArguments;
	}
	public void setErrorArguments(List<InstallabilityErrorArgument> errorArguments) {
		this.errorArguments = errorArguments;
	}
}
