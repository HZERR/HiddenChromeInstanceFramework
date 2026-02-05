package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("One of the interest groups was accessed. Note that these events are global to all targets sharing an interest group store.")
@Event("interestGroupAccessed")
public class InterestGroupAccessedEvent {

	@Required
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number accessTime;

	@Required
	@TypeDescription("Enum of interest group access types.")
	private String type;

	@Required
	private String ownerOrigin;

	@Required
	private String name;

	@Description("For topLevelBid/topLevelAdditionalBid, and when appropriate, win and additionalBidWin")
	private String componentSellerOrigin;

	@Description("For bid or somethingBid event, if done locally and not on a server.")
	private Number bid;

	private String bidCurrency;

	@Description("For non-global events --- links to interestGroupAuctionEvent")
	@TypeDescription("Protected audience interest group auction identifier.")
	private String uniqueAuctionId;

    public InterestGroupAccessedEvent() {
    }

	public Number getAccessTime() {
		return this.accessTime;
	}
	public void setAccessTime(Number accessTime) {
		this.accessTime = accessTime;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnerOrigin() {
		return this.ownerOrigin;
	}
	public void setOwnerOrigin(String ownerOrigin) {
		this.ownerOrigin = ownerOrigin;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComponentSellerOrigin() {
		return this.componentSellerOrigin;
	}
	public void setComponentSellerOrigin(String componentSellerOrigin) {
		this.componentSellerOrigin = componentSellerOrigin;
	}
	public Number getBid() {
		return this.bid;
	}
	public void setBid(Number bid) {
		this.bid = bid;
	}
	public String getBidCurrency() {
		return this.bidCurrency;
	}
	public void setBidCurrency(String bidCurrency) {
		this.bidCurrency = bidCurrency;
	}
	public String getUniqueAuctionId() {
		return this.uniqueAuctionId;
	}
	public void setUniqueAuctionId(String uniqueAuctionId) {
		this.uniqueAuctionId = uniqueAuctionId;
	}
}
