package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.animation.AnimationStartedEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class AnimationStartedEventProcessor extends AbstractChromeInstanceEventProcessor<AnimationStartedEvent> {

    public AnimationStartedEventProcessor() {
        super("Animation.animationStarted", AnimationStartedEvent.class);
    }

    @Override
    protected abstract void onEvent(AnimationStartedEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Animation.animationStarted"; }
}
