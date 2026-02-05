package ru.hzerr.cdp.event.storage;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;
import ru.hzerr.annotation.TypeDescription;

@Description("An auction involving interest groups is taking place. These events are target-specific.")
@Event("interestGroupAuctionEventOccurred")
public class InterestGroupAuctionEventOccurredEvent {

	@Required
	@TypeDescription("UTC time in seconds, counted from January 1, 1970.")
	private Number eventTime;

	@Required
	@TypeDescription("Enum of auction events.")
	private String type;

	@Required
	@TypeDescription("Protected audience interest group auction identifier.")
	private String uniqueAuctionId;

	@Description("Set for child auctions.")
	@TypeDescription("Protected audience interest group auction identifier.")
	private String parentAuctionId;

	@Description("Set for started and configResolved")
	private Object auctionConfig;

    public InterestGroupAuctionEventOccurredEvent() {
    }

	public Number getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(Number eventTime) {
		this.eventTime = eventTime;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUniqueAuctionId() {
		return this.uniqueAuctionId;
	}
	public void setUniqueAuctionId(String uniqueAuctionId) {
		this.uniqueAuctionId = uniqueAuctionId;
	}
	public String getParentAuctionId() {
		return this.parentAuctionId;
	}
	public void setParentAuctionId(String parentAuctionId) {
		this.parentAuctionId = parentAuctionId;
	}
	public Object getAuctionConfig() {
		return this.auctionConfig;
	}
	public void setAuctionConfig(Object auctionConfig) {
		this.auctionConfig = auctionConfig;
	}
}
