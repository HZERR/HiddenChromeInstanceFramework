package ru.hzerr.cdp.processor.impl;

import ru.hzerr.cdp.processor.EventProcessingExceptionHandler;
import ru.hzerr.cdp.processor.EventProcessingHandler;

public class ChromeInstanceEventProcessorCreator {

	public static final String ACCESSIBILITY_LOAD_COMPLETE_EVENT_NAME = "Accessibility.loadComplete";
	public static final String ACCESSIBILITY_NODES_UPDATED_EVENT_NAME = "Accessibility.nodesUpdated";
	public static final String ANIMATION_CANCELED_EVENT_NAME = "Animation.animationCanceled";
	public static final String ANIMATION_CREATED_EVENT_NAME = "Animation.animationCreated";
	public static final String ANIMATION_STARTED_EVENT_NAME = "Animation.animationStarted";
	public static final String ANIMATION_UPDATED_EVENT_NAME = "Animation.animationUpdated";
	public static final String AUDITS_ISSUE_ADDED_EVENT_NAME = "Audits.issueAdded";
	public static final String AUTOFILL_ADDRESS_FORM_FILLED_EVENT_NAME = "Autofill.addressFormFilled";
	public static final String BACKGROUND_SERVICE_RECORDING_STATE_CHANGED_EVENT_NAME = "BackgroundService.recordingStateChanged";
	public static final String BACKGROUND_SERVICE_EVENT_RECEIVED_EVENT_NAME = "BackgroundService.backgroundServiceEventReceived";
	public static final String BLUETOOTH_EMULATION_GATT_OPERATION_RECEIVED_EVENT_NAME = "BluetoothEmulation.gattOperationReceived";
	public static final String BLUETOOTH_EMULATION_CHARACTERISTIC_OPERATION_RECEIVED_EVENT_NAME = "BluetoothEmulation.characteristicOperationReceived";
	public static final String BLUETOOTH_EMULATION_DESCRIPTOR_OPERATION_RECEIVED_EVENT_NAME = "BluetoothEmulation.descriptorOperationReceived";
	public static final String BROWSER_DOWNLOAD_WILL_BEGIN_EVENT_NAME = "Browser.downloadWillBegin";
	public static final String BROWSER_DOWNLOAD_PROGRESS_EVENT_NAME = "Browser.downloadProgress";
	public static final String CSS_FONTS_UPDATED_EVENT_NAME = "CSS.fontsUpdated";
	public static final String CSS_MEDIA_QUERY_RESULT_CHANGED_EVENT_NAME = "CSS.mediaQueryResultChanged";
	public static final String CSS_STYLE_SHEET_ADDED_EVENT_NAME = "CSS.styleSheetAdded";
	public static final String CSS_STYLE_SHEET_CHANGED_EVENT_NAME = "CSS.styleSheetChanged";
	public static final String CSS_STYLE_SHEET_REMOVED_EVENT_NAME = "CSS.styleSheetRemoved";
	public static final String CSS_COMPUTED_STYLE_UPDATED_EVENT_NAME = "CSS.computedStyleUpdated";
	public static final String CAST_SINKS_UPDATED_EVENT_NAME = "Cast.sinksUpdated";
	public static final String CAST_ISSUE_UPDATED_EVENT_NAME = "Cast.issueUpdated";
	public static final String DOM_ATTRIBUTE_MODIFIED_EVENT_NAME = "DOM.attributeModified";
	public static final String DOM_ADOPTED_STYLE_SHEETS_MODIFIED_EVENT_NAME = "DOM.adoptedStyleSheetsModified";
	public static final String DOM_ATTRIBUTE_REMOVED_EVENT_NAME = "DOM.attributeRemoved";
	public static final String DOM_CHARACTER_DATA_MODIFIED_EVENT_NAME = "DOM.characterDataModified";
	public static final String DOM_CHILD_NODE_COUNT_UPDATED_EVENT_NAME = "DOM.childNodeCountUpdated";
	public static final String DOM_CHILD_NODE_INSERTED_EVENT_NAME = "DOM.childNodeInserted";
	public static final String DOM_CHILD_NODE_REMOVED_EVENT_NAME = "DOM.childNodeRemoved";
	public static final String DOM_DISTRIBUTED_NODES_UPDATED_EVENT_NAME = "DOM.distributedNodesUpdated";
	public static final String DOM_DOCUMENT_UPDATED_EVENT_NAME = "DOM.documentUpdated";
	public static final String DOM_INLINE_STYLE_INVALIDATED_EVENT_NAME = "DOM.inlineStyleInvalidated";
	public static final String DOM_PSEUDO_ELEMENT_ADDED_EVENT_NAME = "DOM.pseudoElementAdded";
	public static final String DOM_TOP_LAYER_ELEMENTS_UPDATED_EVENT_NAME = "DOM.topLayerElementsUpdated";
	public static final String DOM_SCROLLABLE_FLAG_UPDATED_EVENT_NAME = "DOM.scrollableFlagUpdated";
	public static final String DOM_AFFECTED_BY_STARTING_STYLES_FLAG_UPDATED_EVENT_NAME = "DOM.affectedByStartingStylesFlagUpdated";
	public static final String DOM_PSEUDO_ELEMENT_REMOVED_EVENT_NAME = "DOM.pseudoElementRemoved";
	public static final String DOM_SET_CHILD_NODES_EVENT_NAME = "DOM.setChildNodes";
	public static final String DOM_SHADOW_ROOT_POPPED_EVENT_NAME = "DOM.shadowRootPopped";
	public static final String DOM_SHADOW_ROOT_PUSHED_EVENT_NAME = "DOM.shadowRootPushed";
	public static final String DOM_STORAGE_DOM_STORAGE_ITEM_ADDED_EVENT_NAME = "DOMStorage.domStorageItemAdded";
	public static final String DOM_STORAGE_DOM_STORAGE_ITEM_REMOVED_EVENT_NAME = "DOMStorage.domStorageItemRemoved";
	public static final String DOM_STORAGE_DOM_STORAGE_ITEM_UPDATED_EVENT_NAME = "DOMStorage.domStorageItemUpdated";
	public static final String DOM_STORAGE_DOM_STORAGE_ITEMS_CLEARED_EVENT_NAME = "DOMStorage.domStorageItemsCleared";
	public static final String DEVICE_ACCESS_DEVICE_REQUEST_PROMPTED_EVENT_NAME = "DeviceAccess.deviceRequestPrompted";
	public static final String EMULATION_VIRTUAL_TIME_BUDGET_EXPIRED_EVENT_NAME = "Emulation.virtualTimeBudgetExpired";
	public static final String FED_CM_DIALOG_SHOWN_EVENT_NAME = "FedCm.dialogShown";
	public static final String FED_CM_DIALOG_CLOSED_EVENT_NAME = "FedCm.dialogClosed";
	public static final String FETCH_REQUEST_PAUSED_EVENT_NAME = "Fetch.requestPaused";
	public static final String FETCH_AUTH_REQUIRED_EVENT_NAME = "Fetch.authRequired";
	public static final String INPUT_DRAG_INTERCEPTED_EVENT_NAME = "Input.dragIntercepted";
	public static final String INSPECTOR_DETACHED_EVENT_NAME = "Inspector.detached";
	public static final String INSPECTOR_TARGET_CRASHED_EVENT_NAME = "Inspector.targetCrashed";
	public static final String INSPECTOR_TARGET_RELOADED_AFTER_CRASH_EVENT_NAME = "Inspector.targetReloadedAfterCrash";
	public static final String INSPECTOR_WORKER_SCRIPT_LOADED_EVENT_NAME = "Inspector.workerScriptLoaded";
	public static final String LAYER_TREE_LAYER_PAINTED_EVENT_NAME = "LayerTree.layerPainted";
	public static final String LAYER_TREE_DID_CHANGE_EVENT_NAME = "LayerTree.layerTreeDidChange";
	public static final String LOG_ENTRY_ADDED_EVENT_NAME = "Log.entryAdded";
	public static final String MEDIA_PLAYER_PROPERTIES_CHANGED_EVENT_NAME = "Media.playerPropertiesChanged";
	public static final String MEDIA_PLAYER_EVENTS_ADDED_EVENT_NAME = "Media.playerEventsAdded";
	public static final String MEDIA_PLAYER_MESSAGES_LOGGED_EVENT_NAME = "Media.playerMessagesLogged";
	public static final String MEDIA_PLAYER_ERRORS_RAISED_EVENT_NAME = "Media.playerErrorsRaised";
	public static final String MEDIA_PLAYER_CREATED_EVENT_NAME = "Media.playerCreated";
	public static final String NETWORK_DATA_RECEIVED_EVENT_NAME = "Network.dataReceived";
	public static final String NETWORK_EVENT_SOURCE_MESSAGE_RECEIVED_EVENT_NAME = "Network.eventSourceMessageReceived";
	public static final String NETWORK_LOADING_FAILED_EVENT_NAME = "Network.loadingFailed";
	public static final String NETWORK_LOADING_FINISHED_EVENT_NAME = "Network.loadingFinished";
	@Deprecated
	public static final String NETWORK_REQUEST_INTERCEPTED_EVENT_NAME = "Network.requestIntercepted";
	public static final String NETWORK_REQUEST_SERVED_FROM_CACHE_EVENT_NAME = "Network.requestServedFromCache";
	public static final String NETWORK_REQUEST_WILL_BE_SENT_EVENT_NAME = "Network.requestWillBeSent";
	public static final String NETWORK_RESOURCE_CHANGED_PRIORITY_EVENT_NAME = "Network.resourceChangedPriority";
	public static final String NETWORK_SIGNED_EXCHANGE_RECEIVED_EVENT_NAME = "Network.signedExchangeReceived";
	public static final String NETWORK_RESPONSE_RECEIVED_EVENT_NAME = "Network.responseReceived";
	public static final String NETWORK_WEB_SOCKET_CLOSED_EVENT_NAME = "Network.webSocketClosed";
	public static final String NETWORK_WEB_SOCKET_CREATED_EVENT_NAME = "Network.webSocketCreated";
	public static final String NETWORK_WEB_SOCKET_FRAME_ERROR_EVENT_NAME = "Network.webSocketFrameError";
	public static final String NETWORK_WEB_SOCKET_FRAME_RECEIVED_EVENT_NAME = "Network.webSocketFrameReceived";
	public static final String NETWORK_WEB_SOCKET_FRAME_SENT_EVENT_NAME = "Network.webSocketFrameSent";
	public static final String NETWORK_WEB_SOCKET_HANDSHAKE_RESPONSE_RECEIVED_EVENT_NAME = "Network.webSocketHandshakeResponseReceived";
	public static final String NETWORK_WEB_SOCKET_WILL_SEND_HANDSHAKE_REQUEST_EVENT_NAME = "Network.webSocketWillSendHandshakeRequest";
	public static final String NETWORK_WEB_TRANSPORT_CREATED_EVENT_NAME = "Network.webTransportCreated";
	public static final String NETWORK_WEB_TRANSPORT_CONNECTION_ESTABLISHED_EVENT_NAME = "Network.webTransportConnectionEstablished";
	public static final String NETWORK_WEB_TRANSPORT_CLOSED_EVENT_NAME = "Network.webTransportClosed";
	public static final String NETWORK_DIRECT_TCP_SOCKET_CREATED_EVENT_NAME = "Network.directTCPSocketCreated";
	public static final String NETWORK_DIRECT_TCP_SOCKET_OPENED_EVENT_NAME = "Network.directTCPSocketOpened";
	public static final String NETWORK_DIRECT_TCP_SOCKET_ABORTED_EVENT_NAME = "Network.directTCPSocketAborted";
	public static final String NETWORK_DIRECT_TCP_SOCKET_CLOSED_EVENT_NAME = "Network.directTCPSocketClosed";
	public static final String NETWORK_DIRECT_TCP_SOCKET_CHUNK_SENT_EVENT_NAME = "Network.directTCPSocketChunkSent";
	public static final String NETWORK_DIRECT_TCP_SOCKET_CHUNK_RECEIVED_EVENT_NAME = "Network.directTCPSocketChunkReceived";
	public static final String NETWORK_DIRECT_UDP_SOCKET_JOINED_MULTICAST_GROUP_EVENT_NAME = "Network.directUDPSocketJoinedMulticastGroup";
	public static final String NETWORK_DIRECT_UDP_SOCKET_LEFT_MULTICAST_GROUP_EVENT_NAME = "Network.directUDPSocketLeftMulticastGroup";
	public static final String NETWORK_DIRECT_UDP_SOCKET_CREATED_EVENT_NAME = "Network.directUDPSocketCreated";
	public static final String NETWORK_DIRECT_UDP_SOCKET_OPENED_EVENT_NAME = "Network.directUDPSocketOpened";
	public static final String NETWORK_DIRECT_UDP_SOCKET_ABORTED_EVENT_NAME = "Network.directUDPSocketAborted";
	public static final String NETWORK_DIRECT_UDP_SOCKET_CLOSED_EVENT_NAME = "Network.directUDPSocketClosed";
	public static final String NETWORK_DIRECT_UDP_SOCKET_CHUNK_SENT_EVENT_NAME = "Network.directUDPSocketChunkSent";
	public static final String NETWORK_DIRECT_UDP_SOCKET_CHUNK_RECEIVED_EVENT_NAME = "Network.directUDPSocketChunkReceived";
	public static final String NETWORK_REQUEST_WILL_BE_SENT_EXTRA_INFO_EVENT_NAME = "Network.requestWillBeSentExtraInfo";
	public static final String NETWORK_RESPONSE_RECEIVED_EXTRA_INFO_EVENT_NAME = "Network.responseReceivedExtraInfo";
	public static final String NETWORK_RESPONSE_RECEIVED_EARLY_HINTS_EVENT_NAME = "Network.responseReceivedEarlyHints";
	public static final String NETWORK_TRUST_TOKEN_OPERATION_DONE_EVENT_NAME = "Network.trustTokenOperationDone";
	public static final String NETWORK_POLICY_UPDATED_EVENT_NAME = "Network.policyUpdated";
	public static final String NETWORK_REPORTING_API_REPORT_ADDED_EVENT_NAME = "Network.reportingApiReportAdded";
	public static final String NETWORK_REPORTING_API_REPORT_UPDATED_EVENT_NAME = "Network.reportingApiReportUpdated";
	public static final String NETWORK_REPORTING_API_ENDPOINTS_CHANGED_FOR_ORIGIN_EVENT_NAME = "Network.reportingApiEndpointsChangedForOrigin";
	public static final String OVERLAY_INSPECT_NODE_REQUESTED_EVENT_NAME = "Overlay.inspectNodeRequested";
	public static final String OVERLAY_NODE_HIGHLIGHT_REQUESTED_EVENT_NAME = "Overlay.nodeHighlightRequested";
	public static final String OVERLAY_SCREENSHOT_REQUESTED_EVENT_NAME = "Overlay.screenshotRequested";
	public static final String OVERLAY_INSPECT_MODE_CANCELED_EVENT_NAME = "Overlay.inspectModeCanceled";
	public static final String PAGE_DOM_CONTENT_EVENT_FIRED_EVENT_NAME = "Page.domContentEventFired";
	public static final String PAGE_FILE_CHOOSER_OPENED_EVENT_NAME = "Page.fileChooserOpened";
	public static final String PAGE_FRAME_ATTACHED_EVENT_NAME = "Page.frameAttached";
	@Deprecated
	public static final String PAGE_FRAME_CLEARED_SCHEDULED_NAVIGATION_EVENT_NAME = "Page.frameClearedScheduledNavigation";
	public static final String PAGE_FRAME_DETACHED_EVENT_NAME = "Page.frameDetached";
	public static final String PAGE_FRAME_SUBTREE_WILL_BE_DETACHED_EVENT_NAME = "Page.frameSubtreeWillBeDetached";
	public static final String PAGE_FRAME_NAVIGATED_EVENT_NAME = "Page.frameNavigated";
	public static final String PAGE_DOCUMENT_OPENED_EVENT_NAME = "Page.documentOpened";
	public static final String PAGE_FRAME_RESIZED_EVENT_NAME = "Page.frameResized";
	public static final String PAGE_FRAME_STARTED_NAVIGATING_EVENT_NAME = "Page.frameStartedNavigating";
	public static final String PAGE_FRAME_REQUESTED_NAVIGATION_EVENT_NAME = "Page.frameRequestedNavigation";
	@Deprecated
	public static final String PAGE_FRAME_SCHEDULED_NAVIGATION_EVENT_NAME = "Page.frameScheduledNavigation";
	public static final String PAGE_FRAME_STARTED_LOADING_EVENT_NAME = "Page.frameStartedLoading";
	public static final String PAGE_FRAME_STOPPED_LOADING_EVENT_NAME = "Page.frameStoppedLoading";
	@Deprecated
	public static final String PAGE_DOWNLOAD_WILL_BEGIN_EVENT_NAME = "Page.downloadWillBegin";
	@Deprecated
	public static final String PAGE_DOWNLOAD_PROGRESS_EVENT_NAME = "Page.downloadProgress";
	public static final String PAGE_INTERSTITIAL_HIDDEN_EVENT_NAME = "Page.interstitialHidden";
	public static final String PAGE_INTERSTITIAL_SHOWN_EVENT_NAME = "Page.interstitialShown";
	public static final String PAGE_JAVASCRIPT_DIALOG_CLOSED_EVENT_NAME = "Page.javascriptDialogClosed";
	public static final String PAGE_JAVASCRIPT_DIALOG_OPENING_EVENT_NAME = "Page.javascriptDialogOpening";
	public static final String PAGE_LIFECYCLE_EVENT_EVENT_NAME = "Page.lifecycleEvent";
	public static final String PAGE_BACK_FORWARD_CACHE_NOT_USED_EVENT_NAME = "Page.backForwardCacheNotUsed";
	public static final String PAGE_LOAD_EVENT_FIRED_EVENT_NAME = "Page.loadEventFired";
	public static final String PAGE_NAVIGATED_WITHIN_DOCUMENT_EVENT_NAME = "Page.navigatedWithinDocument";
	public static final String PAGE_SCREENCAST_FRAME_EVENT_NAME = "Page.screencastFrame";
	public static final String PAGE_SCREENCAST_VISIBILITY_CHANGED_EVENT_NAME = "Page.screencastVisibilityChanged";
	public static final String PAGE_WINDOW_OPEN_EVENT_NAME = "Page.windowOpen";
	public static final String PAGE_COMPILATION_CACHE_PRODUCED_EVENT_NAME = "Page.compilationCacheProduced";
	public static final String PERFORMANCE_METRICS_EVENT_NAME = "Performance.metrics";
	public static final String PERFORMANCE_TIMELINE_TIMELINE_EVENT_ADDED_EVENT_NAME = "PerformanceTimeline.timelineEventAdded";
	public static final String PRELOAD_RULE_SET_UPDATED_EVENT_NAME = "Preload.ruleSetUpdated";
	public static final String PRELOAD_RULE_SET_REMOVED_EVENT_NAME = "Preload.ruleSetRemoved";
	public static final String PRELOAD_ENABLED_STATE_UPDATED_EVENT_NAME = "Preload.preloadEnabledStateUpdated";
	public static final String PRELOAD_PREFETCH_STATUS_UPDATED_EVENT_NAME = "Preload.prefetchStatusUpdated";
	public static final String PRELOAD_PRERENDER_STATUS_UPDATED_EVENT_NAME = "Preload.prerenderStatusUpdated";
	public static final String PRELOADING_ATTEMPT_SOURCES_UPDATED_EVENT_NAME = "Preload.preloadingAttemptSourcesUpdated";
	@Deprecated
	public static final String SECURITY_CERTIFICATE_ERROR_EVENT_NAME = "Security.certificateError";
	public static final String SECURITY_VISIBLE_SECURITY_STATE_CHANGED_EVENT_NAME = "Security.visibleSecurityStateChanged";
	@Deprecated
	public static final String SECURITY_STATE_CHANGED_EVENT_NAME = "Security.securityStateChanged";
	public static final String SERVICE_WORKER_WORKER_ERROR_REPORTED_EVENT_NAME = "ServiceWorker.workerErrorReported";
	public static final String SERVICE_WORKER_WORKER_REGISTRATION_UPDATED_EVENT_NAME = "ServiceWorker.workerRegistrationUpdated";
	public static final String SERVICE_WORKER_WORKER_VERSION_UPDATED_EVENT_NAME = "ServiceWorker.workerVersionUpdated";
	public static final String STORAGE_CACHE_STORAGE_CONTENT_UPDATED_EVENT_NAME = "Storage.cacheStorageContentUpdated";
	public static final String STORAGE_CACHE_STORAGE_LIST_UPDATED_EVENT_NAME = "Storage.cacheStorageListUpdated";
	public static final String STORAGE_INDEXED_DB_CONTENT_UPDATED_EVENT_NAME = "Storage.indexedDBContentUpdated";
	public static final String STORAGE_INDEXED_DB_LIST_UPDATED_EVENT_NAME = "Storage.indexedDBListUpdated";
	public static final String STORAGE_INTEREST_GROUP_ACCESSED_EVENT_NAME = "Storage.interestGroupAccessed";
	public static final String STORAGE_INTEREST_GROUP_AUCTION_EVENT_OCCURRED_EVENT_NAME = "Storage.interestGroupAuctionEventOccurred";
	public static final String STORAGE_INTEREST_GROUP_AUCTION_NETWORK_REQUEST_CREATED_EVENT_NAME = "Storage.interestGroupAuctionNetworkRequestCreated";
	public static final String STORAGE_SHARED_STORAGE_ACCESSED_EVENT_NAME = "Storage.sharedStorageAccessed";
	public static final String STORAGE_SHARED_STORAGE_WORKLET_OPERATION_EXECUTION_FINISHED_EVENT_NAME = "Storage.sharedStorageWorkletOperationExecutionFinished";
	public static final String STORAGE_BUCKET_CREATED_OR_UPDATED_EVENT_NAME = "Storage.storageBucketCreatedOrUpdated";
	public static final String STORAGE_BUCKET_DELETED_EVENT_NAME = "Storage.storageBucketDeleted";
	public static final String STORAGE_ATTRIBUTION_REPORTING_SOURCE_REGISTERED_EVENT_NAME = "Storage.attributionReportingSourceRegistered";
	public static final String STORAGE_ATTRIBUTION_REPORTING_TRIGGER_REGISTERED_EVENT_NAME = "Storage.attributionReportingTriggerRegistered";
	public static final String STORAGE_ATTRIBUTION_REPORTING_REPORT_SENT_EVENT_NAME = "Storage.attributionReportingReportSent";
	public static final String STORAGE_ATTRIBUTION_REPORTING_VERBOSE_DEBUG_REPORT_SENT_EVENT_NAME = "Storage.attributionReportingVerboseDebugReportSent";
	public static final String TARGET_ATTACHED_TO_TARGET_EVENT_NAME = "Target.attachedToTarget";
	public static final String TARGET_DETACHED_FROM_TARGET_EVENT_NAME = "Target.detachedFromTarget";
	public static final String TARGET_RECEIVED_MESSAGE_FROM_TARGET_EVENT_NAME = "Target.receivedMessageFromTarget";
	public static final String TARGET_CREATED_EVENT_NAME = "Target.targetCreated";
	public static final String TARGET_DESTROYED_EVENT_NAME = "Target.targetDestroyed";
	public static final String TARGET_CRASHED_EVENT_NAME = "Target.targetCrashed";
	public static final String TARGET_INFO_CHANGED_EVENT_NAME = "Target.targetInfoChanged";
	public static final String TETHERING_ACCEPTED_EVENT_NAME = "Tethering.accepted";
	public static final String TRACING_BUFFER_USAGE_EVENT_NAME = "Tracing.bufferUsage";
	public static final String TRACING_DATA_COLLECTED_EVENT_NAME = "Tracing.dataCollected";
	public static final String TRACING_COMPLETE_EVENT_NAME = "Tracing.tracingComplete";
	public static final String WEB_AUDIO_CONTEXT_CREATED_EVENT_NAME = "WebAudio.contextCreated";
	public static final String WEB_AUDIO_CONTEXT_WILL_BE_DESTROYED_EVENT_NAME = "WebAudio.contextWillBeDestroyed";
	public static final String WEB_AUDIO_CONTEXT_CHANGED_EVENT_NAME = "WebAudio.contextChanged";
	public static final String WEB_AUDIO_AUDIO_LISTENER_CREATED_EVENT_NAME = "WebAudio.audioListenerCreated";
	public static final String WEB_AUDIO_AUDIO_LISTENER_WILL_BE_DESTROYED_EVENT_NAME = "WebAudio.audioListenerWillBeDestroyed";
	public static final String WEB_AUDIO_AUDIO_NODE_CREATED_EVENT_NAME = "WebAudio.audioNodeCreated";
	public static final String WEB_AUDIO_AUDIO_NODE_WILL_BE_DESTROYED_EVENT_NAME = "WebAudio.audioNodeWillBeDestroyed";
	public static final String WEB_AUDIO_AUDIO_PARAM_CREATED_EVENT_NAME = "WebAudio.audioParamCreated";
	public static final String WEB_AUDIO_AUDIO_PARAM_WILL_BE_DESTROYED_EVENT_NAME = "WebAudio.audioParamWillBeDestroyed";
	public static final String WEB_AUDIO_NODES_CONNECTED_EVENT_NAME = "WebAudio.nodesConnected";
	public static final String WEB_AUDIO_NODES_DISCONNECTED_EVENT_NAME = "WebAudio.nodesDisconnected";
	public static final String WEB_AUDIO_NODE_PARAM_CONNECTED_EVENT_NAME = "WebAudio.nodeParamConnected";
	public static final String WEB_AUDIO_NODE_PARAM_DISCONNECTED_EVENT_NAME = "WebAudio.nodeParamDisconnected";
	public static final String WEB_AUTHN_CREDENTIAL_ADDED_EVENT_NAME = "WebAuthn.credentialAdded";
	public static final String WEB_AUTHN_CREDENTIAL_DELETED_EVENT_NAME = "WebAuthn.credentialDeleted";
	public static final String WEB_AUTHN_CREDENTIAL_UPDATED_EVENT_NAME = "WebAuthn.credentialUpdated";
	public static final String WEB_AUTHN_CREDENTIAL_ASSERTED_EVENT_NAME = "WebAuthn.credentialAsserted";
	public static final String CONSOLE_MESSAGE_ADDED_EVENT_NAME = "Console.messageAdded";
	@Deprecated
	public static final String DEBUGGER_BREAKPOINT_RESOLVED_EVENT_NAME = "Debugger.breakpointResolved";
	public static final String DEBUGGER_PAUSED_EVENT_NAME = "Debugger.paused";
	public static final String DEBUGGER_RESUMED_EVENT_NAME = "Debugger.resumed";
	public static final String DEBUGGER_SCRIPT_FAILED_TO_PARSE_EVENT_NAME = "Debugger.scriptFailedToParse";
	public static final String DEBUGGER_SCRIPT_PARSED_EVENT_NAME = "Debugger.scriptParsed";
	public static final String HEAP_PROFILER_ADD_HEAP_SNAPSHOT_CHUNK_EVENT_NAME = "HeapProfiler.addHeapSnapshotChunk";
	public static final String HEAP_PROFILER_HEAP_STATS_UPDATE_EVENT_NAME = "HeapProfiler.heapStatsUpdate";
	public static final String HEAP_PROFILER_LAST_SEEN_OBJECT_ID_EVENT_NAME = "HeapProfiler.lastSeenObjectId";
	public static final String HEAP_PROFILER_REPORT_HEAP_SNAPSHOT_PROGRESS_EVENT_NAME = "HeapProfiler.reportHeapSnapshotProgress";
	public static final String HEAP_PROFILER_RESET_PROFILES_EVENT_NAME = "HeapProfiler.resetProfiles";
	public static final String PROFILER_CONSOLE_PROFILE_FINISHED_EVENT_NAME = "Profiler.consoleProfileFinished";
	public static final String PROFILER_CONSOLE_PROFILE_STARTED_EVENT_NAME = "Profiler.consoleProfileStarted";
	public static final String PROFILER_PRECISE_COVERAGE_DELTA_UPDATE_EVENT_NAME = "Profiler.preciseCoverageDeltaUpdate";
	public static final String RUNTIME_BINDING_CALLED_EVENT_NAME = "Runtime.bindingCalled";
	public static final String RUNTIME_CONSOLE_API_CALLED_EVENT_NAME = "Runtime.consoleAPICalled";
	public static final String RUNTIME_EXCEPTION_REVOKED_EVENT_NAME = "Runtime.exceptionRevoked";
	public static final String RUNTIME_EXCEPTION_THROWN_EVENT_NAME = "Runtime.exceptionThrown";
	public static final String RUNTIME_EXECUTION_CONTEXT_CREATED_EVENT_NAME = "Runtime.executionContextCreated";
	public static final String RUNTIME_EXECUTION_CONTEXT_DESTROYED_EVENT_NAME = "Runtime.executionContextDestroyed";
	public static final String RUNTIME_EXECUTION_CONTEXTS_CLEARED_EVENT_NAME = "Runtime.executionContextsCleared";
	public static final String RUNTIME_INSPECT_REQUESTED_EVENT_NAME = "Runtime.inspectRequested";

    private ChromeInstanceEventProcessorCreator() {
    }

    public static AccessibilityLoadCompleteEventProcessor createAccessibilityLoadCompleteEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.accessibility.LoadCompleteEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new AccessibilityLoadCompleteEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.accessibility.LoadCompleteEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static AccessibilityNodesUpdatedEventProcessor createAccessibilityNodesUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.accessibility.NodesUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new AccessibilityNodesUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.accessibility.NodesUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static AnimationCanceledEventProcessor createAnimationCanceledEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.animation.AnimationCanceledEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new AnimationCanceledEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.animation.AnimationCanceledEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static AnimationCreatedEventProcessor createAnimationCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.animation.AnimationCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new AnimationCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.animation.AnimationCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static AnimationStartedEventProcessor createAnimationStartedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.animation.AnimationStartedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new AnimationStartedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.animation.AnimationStartedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static AnimationUpdatedEventProcessor createAnimationUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.animation.AnimationUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new AnimationUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.animation.AnimationUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static AuditsIssueAddedEventProcessor createAuditsIssueAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.audits.IssueAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new AuditsIssueAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.audits.IssueAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static AutofillAddressFormFilledEventProcessor createAutofillAddressFormFilledEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.autofill.AddressFormFilledEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new AutofillAddressFormFilledEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.autofill.AddressFormFilledEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static BackgroundServiceRecordingStateChangedEventProcessor createBackgroundServiceRecordingStateChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.backgroundService.RecordingStateChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new BackgroundServiceRecordingStateChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.backgroundService.RecordingStateChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static BackgroundServiceEventReceivedEventProcessor createBackgroundServiceEventReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.backgroundService.BackgroundServiceEventReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new BackgroundServiceEventReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.backgroundService.BackgroundServiceEventReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static BluetoothEmulationGattOperationReceivedEventProcessor createBluetoothEmulationGattOperationReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.bluetoothEmulation.GattOperationReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new BluetoothEmulationGattOperationReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.bluetoothEmulation.GattOperationReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static BluetoothEmulationCharacteristicOperationReceivedEventProcessor createBluetoothEmulationCharacteristicOperationReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.bluetoothEmulation.CharacteristicOperationReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new BluetoothEmulationCharacteristicOperationReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.bluetoothEmulation.CharacteristicOperationReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static BluetoothEmulationDescriptorOperationReceivedEventProcessor createBluetoothEmulationDescriptorOperationReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.bluetoothEmulation.DescriptorOperationReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new BluetoothEmulationDescriptorOperationReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.bluetoothEmulation.DescriptorOperationReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static BrowserDownloadWillBeginEventProcessor createBrowserDownloadWillBeginEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.browser.DownloadWillBeginEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new BrowserDownloadWillBeginEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.browser.DownloadWillBeginEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static BrowserDownloadProgressEventProcessor createBrowserDownloadProgressEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.browser.DownloadProgressEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new BrowserDownloadProgressEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.browser.DownloadProgressEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static CSSFontsUpdatedEventProcessor createCSSFontsUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.css.FontsUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new CSSFontsUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.css.FontsUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static CSSMediaQueryResultChangedEventProcessor createCSSMediaQueryResultChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.css.MediaQueryResultChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new CSSMediaQueryResultChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.css.MediaQueryResultChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static CSSStyleSheetAddedEventProcessor createCSSStyleSheetAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.css.StyleSheetAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new CSSStyleSheetAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.css.StyleSheetAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static CSSStyleSheetChangedEventProcessor createCSSStyleSheetChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.css.StyleSheetChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new CSSStyleSheetChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.css.StyleSheetChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static CSSStyleSheetRemovedEventProcessor createCSSStyleSheetRemovedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.css.StyleSheetRemovedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new CSSStyleSheetRemovedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.css.StyleSheetRemovedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static CSSComputedStyleUpdatedEventProcessor createCSSComputedStyleUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.css.ComputedStyleUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new CSSComputedStyleUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.css.ComputedStyleUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static CastSinksUpdatedEventProcessor createCastSinksUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.cast.SinksUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new CastSinksUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.cast.SinksUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static CastIssueUpdatedEventProcessor createCastIssueUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.cast.IssueUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new CastIssueUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.cast.IssueUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMAttributeModifiedEventProcessor createDOMAttributeModifiedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.AttributeModifiedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMAttributeModifiedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.AttributeModifiedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMAdoptedStyleSheetsModifiedEventProcessor createDOMAdoptedStyleSheetsModifiedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.AdoptedStyleSheetsModifiedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMAdoptedStyleSheetsModifiedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.AdoptedStyleSheetsModifiedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMAttributeRemovedEventProcessor createDOMAttributeRemovedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.AttributeRemovedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMAttributeRemovedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.AttributeRemovedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMCharacterDataModifiedEventProcessor createDOMCharacterDataModifiedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.CharacterDataModifiedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMCharacterDataModifiedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.CharacterDataModifiedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMChildNodeCountUpdatedEventProcessor createDOMChildNodeCountUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.ChildNodeCountUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMChildNodeCountUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.ChildNodeCountUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMChildNodeInsertedEventProcessor createDOMChildNodeInsertedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.ChildNodeInsertedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMChildNodeInsertedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.ChildNodeInsertedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMChildNodeRemovedEventProcessor createDOMChildNodeRemovedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.ChildNodeRemovedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMChildNodeRemovedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.ChildNodeRemovedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMDistributedNodesUpdatedEventProcessor createDOMDistributedNodesUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.DistributedNodesUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMDistributedNodesUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.DistributedNodesUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMDocumentUpdatedEventProcessor createDOMDocumentUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.DocumentUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMDocumentUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.DocumentUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMInlineStyleInvalidatedEventProcessor createDOMInlineStyleInvalidatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.InlineStyleInvalidatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMInlineStyleInvalidatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.InlineStyleInvalidatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMPseudoElementAddedEventProcessor createDOMPseudoElementAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.PseudoElementAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMPseudoElementAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.PseudoElementAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMTopLayerElementsUpdatedEventProcessor createDOMTopLayerElementsUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.TopLayerElementsUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMTopLayerElementsUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.TopLayerElementsUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMScrollableFlagUpdatedEventProcessor createDOMScrollableFlagUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.ScrollableFlagUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMScrollableFlagUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.ScrollableFlagUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMAffectedByStartingStylesFlagUpdatedEventProcessor createDOMAffectedByStartingStylesFlagUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.AffectedByStartingStylesFlagUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMAffectedByStartingStylesFlagUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.AffectedByStartingStylesFlagUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMPseudoElementRemovedEventProcessor createDOMPseudoElementRemovedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.PseudoElementRemovedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMPseudoElementRemovedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.PseudoElementRemovedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMSetChildNodesEventProcessor createDOMSetChildNodesEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.SetChildNodesEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMSetChildNodesEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.SetChildNodesEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMShadowRootPoppedEventProcessor createDOMShadowRootPoppedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.ShadowRootPoppedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMShadowRootPoppedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.ShadowRootPoppedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMShadowRootPushedEventProcessor createDOMShadowRootPushedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.dom.ShadowRootPushedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMShadowRootPushedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.dom.ShadowRootPushedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMStorageDomStorageItemAddedEventProcessor createDOMStorageDomStorageItemAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.domStorage.DomStorageItemAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMStorageDomStorageItemAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.domStorage.DomStorageItemAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMStorageDomStorageItemRemovedEventProcessor createDOMStorageDomStorageItemRemovedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.domStorage.DomStorageItemRemovedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMStorageDomStorageItemRemovedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.domStorage.DomStorageItemRemovedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMStorageDomStorageItemUpdatedEventProcessor createDOMStorageDomStorageItemUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.domStorage.DomStorageItemUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMStorageDomStorageItemUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.domStorage.DomStorageItemUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DOMStorageDomStorageItemsClearedEventProcessor createDOMStorageDomStorageItemsClearedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.domStorage.DomStorageItemsClearedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DOMStorageDomStorageItemsClearedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.domStorage.DomStorageItemsClearedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DeviceAccessDeviceRequestPromptedEventProcessor createDeviceAccessDeviceRequestPromptedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.deviceAccess.DeviceRequestPromptedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DeviceAccessDeviceRequestPromptedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.deviceAccess.DeviceRequestPromptedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static EmulationVirtualTimeBudgetExpiredEventProcessor createEmulationVirtualTimeBudgetExpiredEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.emulation.VirtualTimeBudgetExpiredEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new EmulationVirtualTimeBudgetExpiredEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.emulation.VirtualTimeBudgetExpiredEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static FedCmDialogShownEventProcessor createFedCmDialogShownEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.fedCm.DialogShownEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new FedCmDialogShownEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.fedCm.DialogShownEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static FedCmDialogClosedEventProcessor createFedCmDialogClosedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.fedCm.DialogClosedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new FedCmDialogClosedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.fedCm.DialogClosedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static FetchRequestPausedEventProcessor createFetchRequestPausedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.fetch.RequestPausedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new FetchRequestPausedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.fetch.RequestPausedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static FetchAuthRequiredEventProcessor createFetchAuthRequiredEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.fetch.AuthRequiredEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new FetchAuthRequiredEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.fetch.AuthRequiredEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static InputDragInterceptedEventProcessor createInputDragInterceptedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.input.DragInterceptedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new InputDragInterceptedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.input.DragInterceptedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static InspectorDetachedEventProcessor createInspectorDetachedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.inspector.DetachedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new InspectorDetachedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.inspector.DetachedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static InspectorTargetCrashedEventProcessor createInspectorTargetCrashedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.inspector.TargetCrashedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new InspectorTargetCrashedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.inspector.TargetCrashedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static InspectorTargetReloadedAfterCrashEventProcessor createInspectorTargetReloadedAfterCrashEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.inspector.TargetReloadedAfterCrashEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new InspectorTargetReloadedAfterCrashEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.inspector.TargetReloadedAfterCrashEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static InspectorWorkerScriptLoadedEventProcessor createInspectorWorkerScriptLoadedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.inspector.WorkerScriptLoadedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new InspectorWorkerScriptLoadedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.inspector.WorkerScriptLoadedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static LayerTreeLayerPaintedEventProcessor createLayerTreeLayerPaintedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.layerTree.LayerPaintedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new LayerTreeLayerPaintedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.layerTree.LayerPaintedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static LayerTreeDidChangeEventProcessor createLayerTreeDidChangeEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.layerTree.LayerTreeDidChangeEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new LayerTreeDidChangeEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.layerTree.LayerTreeDidChangeEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static LogEntryAddedEventProcessor createLogEntryAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.log.EntryAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new LogEntryAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.log.EntryAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static MediaPlayerPropertiesChangedEventProcessor createMediaPlayerPropertiesChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.media.PlayerPropertiesChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new MediaPlayerPropertiesChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.media.PlayerPropertiesChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static MediaPlayerEventsAddedEventProcessor createMediaPlayerEventsAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.media.PlayerEventsAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new MediaPlayerEventsAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.media.PlayerEventsAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static MediaPlayerMessagesLoggedEventProcessor createMediaPlayerMessagesLoggedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.media.PlayerMessagesLoggedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new MediaPlayerMessagesLoggedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.media.PlayerMessagesLoggedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static MediaPlayerErrorsRaisedEventProcessor createMediaPlayerErrorsRaisedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.media.PlayerErrorsRaisedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new MediaPlayerErrorsRaisedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.media.PlayerErrorsRaisedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static MediaPlayerCreatedEventProcessor createMediaPlayerCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.media.PlayerCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new MediaPlayerCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.media.PlayerCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDataReceivedEventProcessor createNetworkDataReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DataReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDataReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DataReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkEventSourceMessageReceivedEventProcessor createNetworkEventSourceMessageReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.EventSourceMessageReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkEventSourceMessageReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.EventSourceMessageReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkLoadingFailedEventProcessor createNetworkLoadingFailedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.LoadingFailedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkLoadingFailedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.LoadingFailedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkLoadingFinishedEventProcessor createNetworkLoadingFinishedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.LoadingFinishedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkLoadingFinishedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.LoadingFinishedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    @Deprecated
	public static NetworkRequestInterceptedEventProcessor createNetworkRequestInterceptedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.RequestInterceptedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkRequestInterceptedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.RequestInterceptedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkRequestServedFromCacheEventProcessor createNetworkRequestServedFromCacheEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.RequestServedFromCacheEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkRequestServedFromCacheEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.RequestServedFromCacheEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkRequestWillBeSentEventProcessor createNetworkRequestWillBeSentEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.RequestWillBeSentEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkRequestWillBeSentEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.RequestWillBeSentEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkResourceChangedPriorityEventProcessor createNetworkResourceChangedPriorityEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.ResourceChangedPriorityEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkResourceChangedPriorityEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.ResourceChangedPriorityEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkSignedExchangeReceivedEventProcessor createNetworkSignedExchangeReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.SignedExchangeReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkSignedExchangeReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.SignedExchangeReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkResponseReceivedEventProcessor createNetworkResponseReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.ResponseReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkResponseReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.ResponseReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebSocketClosedEventProcessor createNetworkWebSocketClosedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebSocketClosedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebSocketClosedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebSocketClosedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebSocketCreatedEventProcessor createNetworkWebSocketCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebSocketCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebSocketCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebSocketCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebSocketFrameErrorEventProcessor createNetworkWebSocketFrameErrorEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebSocketFrameErrorEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebSocketFrameErrorEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebSocketFrameErrorEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebSocketFrameReceivedEventProcessor createNetworkWebSocketFrameReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebSocketFrameReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebSocketFrameReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebSocketFrameReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebSocketFrameSentEventProcessor createNetworkWebSocketFrameSentEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebSocketFrameSentEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebSocketFrameSentEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebSocketFrameSentEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebSocketHandshakeResponseReceivedEventProcessor createNetworkWebSocketHandshakeResponseReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebSocketHandshakeResponseReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebSocketHandshakeResponseReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebSocketHandshakeResponseReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebSocketWillSendHandshakeRequestEventProcessor createNetworkWebSocketWillSendHandshakeRequestEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebSocketWillSendHandshakeRequestEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebSocketWillSendHandshakeRequestEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebSocketWillSendHandshakeRequestEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebTransportCreatedEventProcessor createNetworkWebTransportCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebTransportCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebTransportCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebTransportCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebTransportConnectionEstablishedEventProcessor createNetworkWebTransportConnectionEstablishedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebTransportConnectionEstablishedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebTransportConnectionEstablishedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebTransportConnectionEstablishedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkWebTransportClosedEventProcessor createNetworkWebTransportClosedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.WebTransportClosedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkWebTransportClosedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.WebTransportClosedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectTCPSocketCreatedEventProcessor createNetworkDirectTCPSocketCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectTCPSocketCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectTCPSocketCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectTCPSocketCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectTCPSocketOpenedEventProcessor createNetworkDirectTCPSocketOpenedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectTCPSocketOpenedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectTCPSocketOpenedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectTCPSocketOpenedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectTCPSocketAbortedEventProcessor createNetworkDirectTCPSocketAbortedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectTCPSocketAbortedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectTCPSocketAbortedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectTCPSocketAbortedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectTCPSocketClosedEventProcessor createNetworkDirectTCPSocketClosedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectTCPSocketClosedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectTCPSocketClosedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectTCPSocketClosedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectTCPSocketChunkSentEventProcessor createNetworkDirectTCPSocketChunkSentEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectTCPSocketChunkSentEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectTCPSocketChunkSentEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectTCPSocketChunkSentEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectTCPSocketChunkReceivedEventProcessor createNetworkDirectTCPSocketChunkReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectTCPSocketChunkReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectTCPSocketChunkReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectTCPSocketChunkReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectUDPSocketJoinedMulticastGroupEventProcessor createNetworkDirectUDPSocketJoinedMulticastGroupEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectUDPSocketJoinedMulticastGroupEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectUDPSocketJoinedMulticastGroupEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectUDPSocketJoinedMulticastGroupEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectUDPSocketLeftMulticastGroupEventProcessor createNetworkDirectUDPSocketLeftMulticastGroupEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectUDPSocketLeftMulticastGroupEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectUDPSocketLeftMulticastGroupEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectUDPSocketLeftMulticastGroupEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectUDPSocketCreatedEventProcessor createNetworkDirectUDPSocketCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectUDPSocketCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectUDPSocketCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectUDPSocketCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectUDPSocketOpenedEventProcessor createNetworkDirectUDPSocketOpenedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectUDPSocketOpenedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectUDPSocketOpenedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectUDPSocketOpenedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectUDPSocketAbortedEventProcessor createNetworkDirectUDPSocketAbortedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectUDPSocketAbortedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectUDPSocketAbortedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectUDPSocketAbortedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectUDPSocketClosedEventProcessor createNetworkDirectUDPSocketClosedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectUDPSocketClosedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectUDPSocketClosedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectUDPSocketClosedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectUDPSocketChunkSentEventProcessor createNetworkDirectUDPSocketChunkSentEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectUDPSocketChunkSentEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectUDPSocketChunkSentEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectUDPSocketChunkSentEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkDirectUDPSocketChunkReceivedEventProcessor createNetworkDirectUDPSocketChunkReceivedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.DirectUDPSocketChunkReceivedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkDirectUDPSocketChunkReceivedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.DirectUDPSocketChunkReceivedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkRequestWillBeSentExtraInfoEventProcessor createNetworkRequestWillBeSentExtraInfoEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.RequestWillBeSentExtraInfoEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkRequestWillBeSentExtraInfoEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.RequestWillBeSentExtraInfoEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkResponseReceivedExtraInfoEventProcessor createNetworkResponseReceivedExtraInfoEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.ResponseReceivedExtraInfoEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkResponseReceivedExtraInfoEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.ResponseReceivedExtraInfoEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkResponseReceivedEarlyHintsEventProcessor createNetworkResponseReceivedEarlyHintsEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.ResponseReceivedEarlyHintsEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkResponseReceivedEarlyHintsEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.ResponseReceivedEarlyHintsEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkTrustTokenOperationDoneEventProcessor createNetworkTrustTokenOperationDoneEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.TrustTokenOperationDoneEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkTrustTokenOperationDoneEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.TrustTokenOperationDoneEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkPolicyUpdatedEventProcessor createNetworkPolicyUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.PolicyUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkPolicyUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.PolicyUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkReportingApiReportAddedEventProcessor createNetworkReportingApiReportAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.ReportingApiReportAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkReportingApiReportAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.ReportingApiReportAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkReportingApiReportUpdatedEventProcessor createNetworkReportingApiReportUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.ReportingApiReportUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkReportingApiReportUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.ReportingApiReportUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static NetworkReportingApiEndpointsChangedForOriginEventProcessor createNetworkReportingApiEndpointsChangedForOriginEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.network.ReportingApiEndpointsChangedForOriginEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new NetworkReportingApiEndpointsChangedForOriginEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.network.ReportingApiEndpointsChangedForOriginEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static OverlayInspectNodeRequestedEventProcessor createOverlayInspectNodeRequestedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.overlay.InspectNodeRequestedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new OverlayInspectNodeRequestedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.overlay.InspectNodeRequestedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static OverlayNodeHighlightRequestedEventProcessor createOverlayNodeHighlightRequestedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.overlay.NodeHighlightRequestedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new OverlayNodeHighlightRequestedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.overlay.NodeHighlightRequestedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static OverlayScreenshotRequestedEventProcessor createOverlayScreenshotRequestedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.overlay.ScreenshotRequestedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new OverlayScreenshotRequestedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.overlay.ScreenshotRequestedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static OverlayInspectModeCanceledEventProcessor createOverlayInspectModeCanceledEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.overlay.InspectModeCanceledEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new OverlayInspectModeCanceledEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.overlay.InspectModeCanceledEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageDomContentEventFiredEventProcessor createPageDomContentEventFiredEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.DomContentEventFiredEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageDomContentEventFiredEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.DomContentEventFiredEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFileChooserOpenedEventProcessor createPageFileChooserOpenedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FileChooserOpenedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFileChooserOpenedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FileChooserOpenedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameAttachedEventProcessor createPageFrameAttachedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameAttachedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameAttachedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameAttachedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    @Deprecated
	public static PageFrameClearedScheduledNavigationEventProcessor createPageFrameClearedScheduledNavigationEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameClearedScheduledNavigationEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameClearedScheduledNavigationEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameClearedScheduledNavigationEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameDetachedEventProcessor createPageFrameDetachedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameDetachedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameDetachedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameDetachedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameSubtreeWillBeDetachedEventProcessor createPageFrameSubtreeWillBeDetachedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameSubtreeWillBeDetachedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameSubtreeWillBeDetachedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameSubtreeWillBeDetachedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameNavigatedEventProcessor createPageFrameNavigatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameNavigatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameNavigatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameNavigatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageDocumentOpenedEventProcessor createPageDocumentOpenedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.DocumentOpenedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageDocumentOpenedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.DocumentOpenedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameResizedEventProcessor createPageFrameResizedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameResizedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameResizedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameResizedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameStartedNavigatingEventProcessor createPageFrameStartedNavigatingEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameStartedNavigatingEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameStartedNavigatingEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameStartedNavigatingEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameRequestedNavigationEventProcessor createPageFrameRequestedNavigationEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameRequestedNavigationEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameRequestedNavigationEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameRequestedNavigationEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    @Deprecated
	public static PageFrameScheduledNavigationEventProcessor createPageFrameScheduledNavigationEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameScheduledNavigationEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameScheduledNavigationEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameScheduledNavigationEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameStartedLoadingEventProcessor createPageFrameStartedLoadingEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameStartedLoadingEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameStartedLoadingEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameStartedLoadingEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageFrameStoppedLoadingEventProcessor createPageFrameStoppedLoadingEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.FrameStoppedLoadingEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageFrameStoppedLoadingEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.FrameStoppedLoadingEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    @Deprecated
	public static PageDownloadWillBeginEventProcessor createPageDownloadWillBeginEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.DownloadWillBeginEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageDownloadWillBeginEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.DownloadWillBeginEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    @Deprecated
	public static PageDownloadProgressEventProcessor createPageDownloadProgressEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.DownloadProgressEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageDownloadProgressEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.DownloadProgressEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageInterstitialHiddenEventProcessor createPageInterstitialHiddenEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.InterstitialHiddenEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageInterstitialHiddenEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.InterstitialHiddenEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageInterstitialShownEventProcessor createPageInterstitialShownEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.InterstitialShownEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageInterstitialShownEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.InterstitialShownEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageJavascriptDialogClosedEventProcessor createPageJavascriptDialogClosedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.JavascriptDialogClosedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageJavascriptDialogClosedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.JavascriptDialogClosedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageJavascriptDialogOpeningEventProcessor createPageJavascriptDialogOpeningEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.JavascriptDialogOpeningEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageJavascriptDialogOpeningEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.JavascriptDialogOpeningEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageLifecycleEventEventProcessor createPageLifecycleEventEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.LifecycleEventEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageLifecycleEventEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.LifecycleEventEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageBackForwardCacheNotUsedEventProcessor createPageBackForwardCacheNotUsedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.BackForwardCacheNotUsedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageBackForwardCacheNotUsedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.BackForwardCacheNotUsedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageLoadEventFiredEventProcessor createPageLoadEventFiredEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.LoadEventFiredEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageLoadEventFiredEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.LoadEventFiredEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageNavigatedWithinDocumentEventProcessor createPageNavigatedWithinDocumentEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.NavigatedWithinDocumentEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageNavigatedWithinDocumentEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.NavigatedWithinDocumentEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageScreencastFrameEventProcessor createPageScreencastFrameEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.ScreencastFrameEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageScreencastFrameEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.ScreencastFrameEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageScreencastVisibilityChangedEventProcessor createPageScreencastVisibilityChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.ScreencastVisibilityChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageScreencastVisibilityChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.ScreencastVisibilityChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageWindowOpenEventProcessor createPageWindowOpenEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.WindowOpenEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageWindowOpenEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.WindowOpenEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PageCompilationCacheProducedEventProcessor createPageCompilationCacheProducedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.page.CompilationCacheProducedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PageCompilationCacheProducedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.page.CompilationCacheProducedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PerformanceMetricsEventProcessor createPerformanceMetricsEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.performance.MetricsEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PerformanceMetricsEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.performance.MetricsEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PerformanceTimelineTimelineEventAddedEventProcessor createPerformanceTimelineTimelineEventAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.performanceTimeline.TimelineEventAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PerformanceTimelineTimelineEventAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.performanceTimeline.TimelineEventAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PreloadRuleSetUpdatedEventProcessor createPreloadRuleSetUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.preload.RuleSetUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PreloadRuleSetUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.preload.RuleSetUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PreloadRuleSetRemovedEventProcessor createPreloadRuleSetRemovedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.preload.RuleSetRemovedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PreloadRuleSetRemovedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.preload.RuleSetRemovedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PreloadEnabledStateUpdatedEventProcessor createPreloadEnabledStateUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.preload.PreloadEnabledStateUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PreloadEnabledStateUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.preload.PreloadEnabledStateUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PreloadPrefetchStatusUpdatedEventProcessor createPreloadPrefetchStatusUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.preload.PrefetchStatusUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PreloadPrefetchStatusUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.preload.PrefetchStatusUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PreloadPrerenderStatusUpdatedEventProcessor createPreloadPrerenderStatusUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.preload.PrerenderStatusUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PreloadPrerenderStatusUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.preload.PrerenderStatusUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static PreloadingAttemptSourcesUpdatedEventProcessor createPreloadingAttemptSourcesUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.preload.PreloadingAttemptSourcesUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new PreloadingAttemptSourcesUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.preload.PreloadingAttemptSourcesUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    @Deprecated
	public static SecurityCertificateErrorEventProcessor createSecurityCertificateErrorEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.security.CertificateErrorEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new SecurityCertificateErrorEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.security.CertificateErrorEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static SecurityVisibleSecurityStateChangedEventProcessor createSecurityVisibleSecurityStateChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.security.VisibleSecurityStateChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new SecurityVisibleSecurityStateChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.security.VisibleSecurityStateChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    @Deprecated
	public static SecurityStateChangedEventProcessor createSecurityStateChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.security.SecurityStateChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new SecurityStateChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.security.SecurityStateChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static ServiceWorkerWorkerErrorReportedEventProcessor createServiceWorkerWorkerErrorReportedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.serviceWorker.WorkerErrorReportedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new ServiceWorkerWorkerErrorReportedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.serviceWorker.WorkerErrorReportedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static ServiceWorkerWorkerRegistrationUpdatedEventProcessor createServiceWorkerWorkerRegistrationUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.serviceWorker.WorkerRegistrationUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new ServiceWorkerWorkerRegistrationUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.serviceWorker.WorkerRegistrationUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static ServiceWorkerWorkerVersionUpdatedEventProcessor createServiceWorkerWorkerVersionUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.serviceWorker.WorkerVersionUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new ServiceWorkerWorkerVersionUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.serviceWorker.WorkerVersionUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageCacheStorageContentUpdatedEventProcessor createStorageCacheStorageContentUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.CacheStorageContentUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageCacheStorageContentUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.CacheStorageContentUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageCacheStorageListUpdatedEventProcessor createStorageCacheStorageListUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.CacheStorageListUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageCacheStorageListUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.CacheStorageListUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageIndexedDBContentUpdatedEventProcessor createStorageIndexedDBContentUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.IndexedDBContentUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageIndexedDBContentUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.IndexedDBContentUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageIndexedDBListUpdatedEventProcessor createStorageIndexedDBListUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.IndexedDBListUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageIndexedDBListUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.IndexedDBListUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageInterestGroupAccessedEventProcessor createStorageInterestGroupAccessedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.InterestGroupAccessedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageInterestGroupAccessedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.InterestGroupAccessedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageInterestGroupAuctionEventOccurredEventProcessor createStorageInterestGroupAuctionEventOccurredEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.InterestGroupAuctionEventOccurredEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageInterestGroupAuctionEventOccurredEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.InterestGroupAuctionEventOccurredEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageInterestGroupAuctionNetworkRequestCreatedEventProcessor createStorageInterestGroupAuctionNetworkRequestCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.InterestGroupAuctionNetworkRequestCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageInterestGroupAuctionNetworkRequestCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.InterestGroupAuctionNetworkRequestCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageSharedStorageAccessedEventProcessor createStorageSharedStorageAccessedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.SharedStorageAccessedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageSharedStorageAccessedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.SharedStorageAccessedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageSharedStorageWorkletOperationExecutionFinishedEventProcessor createStorageSharedStorageWorkletOperationExecutionFinishedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.SharedStorageWorkletOperationExecutionFinishedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageSharedStorageWorkletOperationExecutionFinishedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.SharedStorageWorkletOperationExecutionFinishedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageBucketCreatedOrUpdatedEventProcessor createStorageBucketCreatedOrUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.StorageBucketCreatedOrUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageBucketCreatedOrUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.StorageBucketCreatedOrUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageBucketDeletedEventProcessor createStorageBucketDeletedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.StorageBucketDeletedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageBucketDeletedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.StorageBucketDeletedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageAttributionReportingSourceRegisteredEventProcessor createStorageAttributionReportingSourceRegisteredEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.AttributionReportingSourceRegisteredEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageAttributionReportingSourceRegisteredEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.AttributionReportingSourceRegisteredEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageAttributionReportingTriggerRegisteredEventProcessor createStorageAttributionReportingTriggerRegisteredEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.AttributionReportingTriggerRegisteredEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageAttributionReportingTriggerRegisteredEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.AttributionReportingTriggerRegisteredEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageAttributionReportingReportSentEventProcessor createStorageAttributionReportingReportSentEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.AttributionReportingReportSentEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageAttributionReportingReportSentEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.AttributionReportingReportSentEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static StorageAttributionReportingVerboseDebugReportSentEventProcessor createStorageAttributionReportingVerboseDebugReportSentEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.storage.AttributionReportingVerboseDebugReportSentEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new StorageAttributionReportingVerboseDebugReportSentEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.storage.AttributionReportingVerboseDebugReportSentEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TargetAttachedToTargetEventProcessor createTargetAttachedToTargetEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.target.AttachedToTargetEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TargetAttachedToTargetEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.target.AttachedToTargetEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TargetDetachedFromTargetEventProcessor createTargetDetachedFromTargetEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.target.DetachedFromTargetEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TargetDetachedFromTargetEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.target.DetachedFromTargetEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TargetReceivedMessageFromTargetEventProcessor createTargetReceivedMessageFromTargetEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.target.ReceivedMessageFromTargetEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TargetReceivedMessageFromTargetEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.target.ReceivedMessageFromTargetEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TargetCreatedEventProcessor createTargetCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.target.TargetCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TargetCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.target.TargetCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TargetDestroyedEventProcessor createTargetDestroyedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.target.TargetDestroyedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TargetDestroyedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.target.TargetDestroyedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TargetCrashedEventProcessor createTargetCrashedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.target.TargetCrashedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TargetCrashedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.target.TargetCrashedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TargetInfoChangedEventProcessor createTargetInfoChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.target.TargetInfoChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TargetInfoChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.target.TargetInfoChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TetheringAcceptedEventProcessor createTetheringAcceptedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.tethering.AcceptedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TetheringAcceptedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.tethering.AcceptedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TracingBufferUsageEventProcessor createTracingBufferUsageEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.tracing.BufferUsageEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TracingBufferUsageEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.tracing.BufferUsageEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TracingDataCollectedEventProcessor createTracingDataCollectedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.tracing.DataCollectedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TracingDataCollectedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.tracing.DataCollectedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static TracingCompleteEventProcessor createTracingCompleteEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.tracing.TracingCompleteEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new TracingCompleteEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.tracing.TracingCompleteEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioContextCreatedEventProcessor createWebAudioContextCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.ContextCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioContextCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.ContextCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioContextWillBeDestroyedEventProcessor createWebAudioContextWillBeDestroyedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.ContextWillBeDestroyedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioContextWillBeDestroyedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.ContextWillBeDestroyedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioContextChangedEventProcessor createWebAudioContextChangedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.ContextChangedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioContextChangedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.ContextChangedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioAudioListenerCreatedEventProcessor createWebAudioAudioListenerCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.AudioListenerCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioAudioListenerCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.AudioListenerCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioAudioListenerWillBeDestroyedEventProcessor createWebAudioAudioListenerWillBeDestroyedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.AudioListenerWillBeDestroyedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioAudioListenerWillBeDestroyedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.AudioListenerWillBeDestroyedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioAudioNodeCreatedEventProcessor createWebAudioAudioNodeCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.AudioNodeCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioAudioNodeCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.AudioNodeCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioAudioNodeWillBeDestroyedEventProcessor createWebAudioAudioNodeWillBeDestroyedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.AudioNodeWillBeDestroyedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioAudioNodeWillBeDestroyedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.AudioNodeWillBeDestroyedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioAudioParamCreatedEventProcessor createWebAudioAudioParamCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.AudioParamCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioAudioParamCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.AudioParamCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioAudioParamWillBeDestroyedEventProcessor createWebAudioAudioParamWillBeDestroyedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.AudioParamWillBeDestroyedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioAudioParamWillBeDestroyedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.AudioParamWillBeDestroyedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioNodesConnectedEventProcessor createWebAudioNodesConnectedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.NodesConnectedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioNodesConnectedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.NodesConnectedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioNodesDisconnectedEventProcessor createWebAudioNodesDisconnectedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.NodesDisconnectedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioNodesDisconnectedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.NodesDisconnectedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioNodeParamConnectedEventProcessor createWebAudioNodeParamConnectedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.NodeParamConnectedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioNodeParamConnectedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.NodeParamConnectedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAudioNodeParamDisconnectedEventProcessor createWebAudioNodeParamDisconnectedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAudio.NodeParamDisconnectedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAudioNodeParamDisconnectedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAudio.NodeParamDisconnectedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAuthnCredentialAddedEventProcessor createWebAuthnCredentialAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAuthn.CredentialAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAuthnCredentialAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAuthn.CredentialAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAuthnCredentialDeletedEventProcessor createWebAuthnCredentialDeletedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAuthn.CredentialDeletedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAuthnCredentialDeletedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAuthn.CredentialDeletedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAuthnCredentialUpdatedEventProcessor createWebAuthnCredentialUpdatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAuthn.CredentialUpdatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAuthnCredentialUpdatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAuthn.CredentialUpdatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static WebAuthnCredentialAssertedEventProcessor createWebAuthnCredentialAssertedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.webAuthn.CredentialAssertedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new WebAuthnCredentialAssertedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.webAuthn.CredentialAssertedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static ConsoleMessageAddedEventProcessor createConsoleMessageAddedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.console.MessageAddedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new ConsoleMessageAddedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.console.MessageAddedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    @Deprecated
	public static DebuggerBreakpointResolvedEventProcessor createDebuggerBreakpointResolvedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.debugger.BreakpointResolvedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DebuggerBreakpointResolvedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.debugger.BreakpointResolvedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DebuggerPausedEventProcessor createDebuggerPausedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.debugger.PausedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DebuggerPausedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.debugger.PausedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DebuggerResumedEventProcessor createDebuggerResumedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.debugger.ResumedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DebuggerResumedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.debugger.ResumedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DebuggerScriptFailedToParseEventProcessor createDebuggerScriptFailedToParseEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.debugger.ScriptFailedToParseEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DebuggerScriptFailedToParseEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.debugger.ScriptFailedToParseEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static DebuggerScriptParsedEventProcessor createDebuggerScriptParsedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.debugger.ScriptParsedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new DebuggerScriptParsedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.debugger.ScriptParsedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static HeapProfilerAddHeapSnapshotChunkEventProcessor createHeapProfilerAddHeapSnapshotChunkEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.heapProfiler.AddHeapSnapshotChunkEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new HeapProfilerAddHeapSnapshotChunkEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.heapProfiler.AddHeapSnapshotChunkEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static HeapProfilerHeapStatsUpdateEventProcessor createHeapProfilerHeapStatsUpdateEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.heapProfiler.HeapStatsUpdateEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new HeapProfilerHeapStatsUpdateEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.heapProfiler.HeapStatsUpdateEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static HeapProfilerLastSeenObjectIdEventProcessor createHeapProfilerLastSeenObjectIdEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.heapProfiler.LastSeenObjectIdEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new HeapProfilerLastSeenObjectIdEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.heapProfiler.LastSeenObjectIdEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static HeapProfilerReportHeapSnapshotProgressEventProcessor createHeapProfilerReportHeapSnapshotProgressEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.heapProfiler.ReportHeapSnapshotProgressEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new HeapProfilerReportHeapSnapshotProgressEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.heapProfiler.ReportHeapSnapshotProgressEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static HeapProfilerResetProfilesEventProcessor createHeapProfilerResetProfilesEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.heapProfiler.ResetProfilesEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new HeapProfilerResetProfilesEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.heapProfiler.ResetProfilesEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static ProfilerConsoleProfileFinishedEventProcessor createProfilerConsoleProfileFinishedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.profiler.ConsoleProfileFinishedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new ProfilerConsoleProfileFinishedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.profiler.ConsoleProfileFinishedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static ProfilerConsoleProfileStartedEventProcessor createProfilerConsoleProfileStartedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.profiler.ConsoleProfileStartedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new ProfilerConsoleProfileStartedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.profiler.ConsoleProfileStartedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static ProfilerPreciseCoverageDeltaUpdateEventProcessor createProfilerPreciseCoverageDeltaUpdateEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.profiler.PreciseCoverageDeltaUpdateEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new ProfilerPreciseCoverageDeltaUpdateEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.profiler.PreciseCoverageDeltaUpdateEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static RuntimeBindingCalledEventProcessor createRuntimeBindingCalledEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.runtime.BindingCalledEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new RuntimeBindingCalledEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.runtime.BindingCalledEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static RuntimeConsoleAPICalledEventProcessor createRuntimeConsoleAPICalledEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.runtime.ConsoleAPICalledEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new RuntimeConsoleAPICalledEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.runtime.ConsoleAPICalledEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static RuntimeExceptionRevokedEventProcessor createRuntimeExceptionRevokedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.runtime.ExceptionRevokedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new RuntimeExceptionRevokedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.runtime.ExceptionRevokedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static RuntimeExceptionThrownEventProcessor createRuntimeExceptionThrownEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.runtime.ExceptionThrownEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new RuntimeExceptionThrownEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.runtime.ExceptionThrownEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static RuntimeExecutionContextCreatedEventProcessor createRuntimeExecutionContextCreatedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.runtime.ExecutionContextCreatedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new RuntimeExecutionContextCreatedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.runtime.ExecutionContextCreatedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static RuntimeExecutionContextDestroyedEventProcessor createRuntimeExecutionContextDestroyedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.runtime.ExecutionContextDestroyedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new RuntimeExecutionContextDestroyedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.runtime.ExecutionContextDestroyedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static RuntimeExecutionContextsClearedEventProcessor createRuntimeExecutionContextsClearedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.runtime.ExecutionContextsClearedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new RuntimeExecutionContextsClearedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.runtime.ExecutionContextsClearedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }

    public static RuntimeInspectRequestedEventProcessor createRuntimeInspectRequestedEventProcessor(EventProcessingHandler<ru.hzerr.cdp.event.runtime.InspectRequestedEvent> eventHandler, EventProcessingExceptionHandler exceptionHandler) {
        return new RuntimeInspectRequestedEventProcessor() {

            @Override
            protected void onEvent(ru.hzerr.cdp.event.runtime.InspectRequestedEvent event) throws Exception {
                eventHandler.onEvent(event);
            }

            @Override
            protected void onEventProcessingException(Exception e) {
                exceptionHandler.onEventProcessingException(e);
            }
        };
    }
}
