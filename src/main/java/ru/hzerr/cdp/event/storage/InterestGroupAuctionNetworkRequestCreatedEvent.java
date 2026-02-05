package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;
import java.util.List;

@Description("Specifies which auctions a particular network fetch may be related to, and in what role. Note that it is not ordered with respect to Network.requestWillBeSent (but will happen before loadingFinished loadingFailed).")
@Event("interestGroupAuctionNetworkRequestCreated")
public class InterestGroupAuctionNetworkRequestCreatedEvent {

	@Required
	@TypeDescription("Enum of network fetches auctions can do.")
	private String type;

	@Required
	@TypeDescription("Unique network request identifier. Note that this does not identify individual HTTP requests that are part of a network request.")
	private String requestId;

	@Required
	@Description("This is the set of the auctions using the worklet that issued this request.  In the case of trusted signals, it's possible that only some of them actually care about the keys being queried.")
	@TypeDescription("Protected audience interest group auction identifier.")
	private List<String> auctions;

    public InterestGroupAuctionNetworkRequestCreatedEvent() {
    }

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public List<String> getAuctions() {
		return this.auctions;
	}
	public void setAuctions(List<String> auctions) {
		this.auctions = auctions;
	}
}
