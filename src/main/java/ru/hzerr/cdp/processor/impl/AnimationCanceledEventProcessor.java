package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.event.animation.AnimationCanceledEvent;
import ru.hzerr.cdp.processor.AbstractChromeInstanceEventProcessor;

public abstract class AnimationCanceledEventProcessor extends AbstractChromeInstanceEventProcessor<AnimationCanceledEvent> {

    public AnimationCanceledEventProcessor() {
        super("Animation.animationCanceled", AnimationCanceledEvent.class);
    }

    @Override
    protected abstract void onEvent(AnimationCanceledEvent event) throws Exception;

    @Override
    protected abstract void onEventProcessingException(Exception e);

    @Override
    public String getEventName() { return "Animation.animationCanceled"; }
}
