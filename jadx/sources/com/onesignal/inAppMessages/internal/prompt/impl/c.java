package com.onesignal.inAppMessages.internal.prompt.impl;

import J5.n;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p227x5.a {
    private final B5.a _locationManager;
    private final n _notificationsManager;

    public c(n nVar, B5.a aVar) {
        i.f(nVar, "_notificationsManager");
        i.f(aVar, "_locationManager");
        this._notificationsManager = nVar;
        this._locationManager = aVar;
    }

    @Override // p227x5.a
    public b createPrompt(String str) {
        i.f(str, "promptType");
        if (str.equals("push")) {
            return new d(this._notificationsManager);
        }
        if (str.equals("location")) {
            return new a(this._locationManager);
        }
        return null;
    }
}
