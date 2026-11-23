package com.onesignal.notifications.internal;

import J5.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g implements m {
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public g(c cVar) {
        i.f(cVar, "notification");
        this.notification = cVar;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // J5.m
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z6) {
        this.discard = z6;
    }

    public final void setPreventDefault(boolean z6) {
        this.isPreventDefault = z6;
    }

    @Override // J5.m
    public c getNotification() {
        return this.notification;
    }

    @Override // J5.m
    public void preventDefault(boolean z6) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWillDisplayEvent.preventDefault(" + z6 + ')', null, 2, null);
        if (this.isPreventDefault && z6) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z6;
    }
}
