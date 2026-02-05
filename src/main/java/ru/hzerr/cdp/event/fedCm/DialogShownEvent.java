package ru.hzerr.cdp.event.fedCm;

import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;
import ru.hzerr.cdp.type.fedCm.Account;
import ru.hzerr.annotation.Description;

@Event("dialogShown")
public class DialogShownEvent {

	@Required
	private String dialogId;

	@Required
	@TypeDescription("The types of FedCM dialogs.")
	private String dialogType;

	@Required
	private List<Account> accounts;

	@Required
	@Description("These exist primarily so that the caller can verify the RP context was used appropriately.")
	private String title;

	private String subtitle;

    public DialogShownEvent() {
    }

	public String getDialogId() {
		return this.dialogId;
	}
	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
	}
	public String getDialogType() {
		return this.dialogType;
	}
	public void setDialogType(String dialogType) {
		this.dialogType = dialogType;
	}
	public List<Account> getAccounts() {
		return this.accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubtitle() {
		return this.subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
}
