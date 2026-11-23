package com.onesignal.user.internal;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements p228x6.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p208v6.d dVar) {
        super(dVar);
        i.f(dVar, "model");
    }

    @Override // p228x6.d
    public String getNumber() {
        return getModel().getAddress();
    }
}
