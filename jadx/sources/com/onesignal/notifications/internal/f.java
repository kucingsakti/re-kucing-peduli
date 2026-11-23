package com.onesignal.notifications.internal;

import J5.k;
import android.content.Context;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements k {
    private final Context context;
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public f(Context context, c cVar) {
        i.f(context, "context");
        i.f(cVar, "notification");
        this.context = context;
        this.notification = cVar;
    }

    @Override // J5.k
    public Context getContext() {
        return this.context;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // J5.k
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z6) {
        this.discard = z6;
    }

    public final void setPreventDefault(boolean z6) {
        this.isPreventDefault = z6;
    }

    @Override // J5.k
    public c getNotification() {
        return this.notification;
    }

    @Override // J5.k
    public void preventDefault(boolean z6) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationReceivedEvent.preventDefault(" + z6 + ')', null, 2, null);
        if (this.isPreventDefault && z6) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z6;
    }
}
