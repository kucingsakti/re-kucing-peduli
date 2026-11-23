package com.onesignal.session.internal.outcomes.impl;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private final p075h6.c channel;
    private final String influenceId;

    public a(String str, p075h6.c cVar) {
        p210v8.i.f(str, "influenceId");
        p210v8.i.f(cVar, "channel");
        this.influenceId = str;
        this.channel = cVar;
    }

    public final p075h6.c getChannel() {
        return this.channel;
    }

    public final String getInfluenceId() {
        return this.influenceId;
    }
}
