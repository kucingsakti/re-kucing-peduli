package com.rollbar.notifier.sender.exception;

/* JADX INFO: loaded from: classes.dex */
public class SenderException extends RuntimeException {
    public SenderException(Exception exc) {
        super(exc);
    }

    public SenderException(Throwable th) {
        super(th);
    }
}
