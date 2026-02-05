package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.animation.AnimationCreatedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class AnimationCreatedEventProcessor extends AbstractChromeInstanceEventProcessor<AnimationCreatedEvent> {

    public AnimationCreatedEventProcessor() {
        super("Animation.animationCreated", AnimationCreatedEvent.class);
    }

    @Override
    protected abstract void onEvent(AnimationCreatedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Animation.animationCreated"; }
}
