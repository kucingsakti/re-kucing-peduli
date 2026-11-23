package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements G5.a {
    @Override // G5.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // G5.a
    public Location getLastLocation() {
        return null;
    }

    @Override // G5.a
    public Object start(p123m8.d<? super Boolean> dVar) {
        return Boolean.FALSE;
    }

    @Override // G5.a
    public Object stop(p123m8.d<? super m> dVar) {
        return m.a;
    }

    @Override // G5.a, com.onesignal.common.events.d
    public void subscribe(G5.b bVar) {
        i.f(bVar, "handler");
    }

    @Override // G5.a, com.onesignal.common.events.d
    public void unsubscribe(G5.b bVar) {
        i.f(bVar, "handler");
    }
}
