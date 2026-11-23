package com.rollbar.notifier.sender.listener;

import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.result.Response;

/* JADX INFO: loaded from: classes.dex */
public interface SenderListener {
    void onError(Payload payload, Exception exc);

    void onResponse(Payload payload, Response response);
}
