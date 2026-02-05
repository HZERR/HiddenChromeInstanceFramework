package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.animation.AnimationUpdatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class AnimationUpdatedEventProcessor extends AbstractChromeInstanceEventProcessor<AnimationUpdatedEvent> {

    public AnimationUpdatedEventProcessor() {
        super("Animation.animationUpdated", AnimationUpdatedEvent.class);
    }

    @Override
    protected abstract void onEvent(AnimationUpdatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Animation.animationUpdated"; }
}
