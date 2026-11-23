package com.onesignal.user.internal;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d implements p228x6.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p208v6.d dVar) {
        super(dVar);
        i.f(dVar, "model");
    }

    @Override // p228x6.a
    public String getEmail() {
        return getModel().getAddress();
    }
}
