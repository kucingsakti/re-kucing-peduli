package com.rollbar.notifier.sender;

import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.result.Response;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface SenderFailureStrategy extends Closeable {

    public enum PayloadAction {
        NONE,
        CAN_BE_RETRIED
    }

    PayloadAction getAction(Payload payload, Response response);

    PayloadAction getAction(Payload payload, Exception exc);

    boolean isSendingSuspended();
}
