package com.rollbar.notifier.sender;

import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.listener.SenderListener;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Sender extends Closeable {
    void addListener(SenderListener senderListener);

    void close(boolean z6) throws Exception;

    List<SenderListener> getListeners();

    void send(Payload payload);
}
