package com.rollbar.notifier.sender;

import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.exception.ApiException;
import com.rollbar.notifier.sender.exception.SenderException;
import com.rollbar.notifier.sender.listener.SenderListener;
import com.rollbar.notifier.sender.listener.SenderListenerCollection;
import com.rollbar.notifier.sender.result.Response;
import java.io.IOException;
import java.util.List;
import va.a;
import va.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSender implements Sender {
    private a thisLogger = b.e(getClass());
    private final SenderListenerCollection listeners = new SenderListenerCollection();

    private void notifyError(Payload payload, Exception exc) {
        this.thisLogger.b("Error sending the payload.", exc);
        this.listeners.onError(payload, exc);
    }

    private void notifyResult(Payload payload, Response response) {
        this.thisLogger.d(response.getResult().getContent(), "Payload sent uuid: {}");
        this.listeners.onResponse(payload, response);
    }

    @Override // com.rollbar.notifier.sender.Sender
    public final void addListener(SenderListener senderListener) {
        this.listeners.addListener(senderListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public abstract Response doSend(Payload payload) throws Exception;

    @Override // com.rollbar.notifier.sender.Sender
    public final List<SenderListener> getListeners() {
        return this.listeners.getListeners();
    }

    @Override // com.rollbar.notifier.sender.Sender
    public final void send(Payload payload) {
        try {
            Response responseDoSend = doSend(payload);
            if (responseDoSend.getResult().isError()) {
                notifyError(payload, new SenderException((Exception) new ApiException(responseDoSend)));
            } else {
                notifyResult(payload, responseDoSend);
            }
        } catch (Exception e10) {
            notifyError(payload, new SenderException(e10));
        }
    }

    @Override // com.rollbar.notifier.sender.Sender
    public void close(boolean z6) throws Exception {
        close();
    }
}
