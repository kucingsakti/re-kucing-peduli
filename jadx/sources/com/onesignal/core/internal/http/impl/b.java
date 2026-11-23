package com.onesignal.core.internal.http.impl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {
    private final com.onesignal.core.internal.config.b _configModelStore;

    public b(com.onesignal.core.internal.config.b bVar) {
        i.f(bVar, "_configModelStore");
        this._configModelStore = bVar;
    }

    @Override // com.onesignal.core.internal.http.impl.c
    public HttpURLConnection newHttpURLConnection(String str) throws IOException {
        i.f(str, "url");
        URLConnection uRLConnectionOpenConnection = new URL(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getApiUrl() + str).openConnection();
        i.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }
}
