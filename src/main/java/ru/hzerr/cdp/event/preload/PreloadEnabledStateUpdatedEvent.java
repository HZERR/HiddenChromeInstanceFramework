package ru.hzerr.cdp.event.preload;

import ru.hzerr.annotation.Description;
import ru.hzerr.annotation.Event;
import ru.hzerr.annotation.Required;

@Description("Fired when a preload enabled state is updated.")
@Event("preloadEnabledStateUpdated")
public class PreloadEnabledStateUpdatedEvent {

	@Required
	private boolean disabledByPreference;

	@Required
	private boolean disabledByDataSaver;

	@Required
	private boolean disabledByBatterySaver;

	@Required
	private boolean disabledByHoldbackPrefetchSpeculationRules;

	@Required
	private boolean disabledByHoldbackPrerenderSpeculationRules;

    public PreloadEnabledStateUpdatedEvent() {
    }

	public boolean getDisabledByPreference() {
		return this.disabledByPreference;
	}
	public void setDisabledByPreference(boolean disabledByPreference) {
		this.disabledByPreference = disabledByPreference;
	}
	public boolean getDisabledByDataSaver() {
		return this.disabledByDataSaver;
	}
	public void setDisabledByDataSaver(boolean disabledByDataSaver) {
		this.disabledByDataSaver = disabledByDataSaver;
	}
	public boolean getDisabledByBatterySaver() {
		return this.disabledByBatterySaver;
	}
	public void setDisabledByBatterySaver(boolean disabledByBatterySaver) {
		this.disabledByBatterySaver = disabledByBatterySaver;
	}
	public boolean getDisabledByHoldbackPrefetchSpeculationRules() {
		return this.disabledByHoldbackPrefetchSpeculationRules;
	}
	public void setDisabledByHoldbackPrefetchSpeculationRules(boolean disabledByHoldbackPrefetchSpeculationRules) {
		this.disabledByHoldbackPrefetchSpeculationRules = disabledByHoldbackPrefetchSpeculationRules;
	}
	public boolean getDisabledByHoldbackPrerenderSpeculationRules() {
		return this.disabledByHoldbackPrerenderSpeculationRules;
	}
	public void setDisabledByHoldbackPrerenderSpeculationRules(boolean disabledByHoldbackPrerenderSpeculationRules) {
		this.disabledByHoldbackPrerenderSpeculationRules = disabledByHoldbackPrerenderSpeculationRules;
	}
}
