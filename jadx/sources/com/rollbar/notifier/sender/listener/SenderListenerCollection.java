package com.rollbar.notifier.sender.listener;

import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.result.Response;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SenderListenerCollection implements SenderListener {
    private final List<SenderListener> listeners = new ArrayList();

    public void addListener(SenderListener senderListener) {
        this.listeners.add(senderListener);
    }

    public List<SenderListener> getListeners() {
        return Collections.unmodifiableList(this.listeners);
    }

    @Override // com.rollbar.notifier.sender.listener.SenderListener
    public void onError(Payload payload, Exception exc) {
        Iterator<SenderListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(payload, exc);
        }
    }

    @Override // com.rollbar.notifier.sender.listener.SenderListener
    public void onResponse(Payload payload, Response response) {
        Iterator<SenderListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onResponse(payload, response);
        }
    }
}
