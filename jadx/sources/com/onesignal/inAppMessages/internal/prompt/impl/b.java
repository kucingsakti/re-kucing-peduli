package com.onesignal.inAppMessages.internal.prompt.impl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    private boolean prompted;

    public enum a {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    public abstract String getPromptKey();

    public abstract Object handlePrompt(p123m8.d<? super a> dVar);

    public final boolean hasPrompted() {
        return this.prompted;
    }

    public final void setPrompted(boolean z6) {
        this.prompted = z6;
    }

    public String toString() {
        return "OSInAppMessagePrompt{key=" + getPromptKey() + " prompted=" + this.prompted + '}';
    }
}
