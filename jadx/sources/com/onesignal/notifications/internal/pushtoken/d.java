package com.onesignal.notifications.internal.pushtoken;

import p208v6.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private final f status;
    private final String token;

    public d(String str, f fVar) {
        i.f(fVar, "status");
        this.token = str;
        this.status = fVar;
    }

    public final f getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }
}
