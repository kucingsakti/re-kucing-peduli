package com.onesignal.user.internal;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements p228x6.e {
    private final p208v6.d model;

    public d(p208v6.d dVar) {
        i.f(dVar, "model");
        this.model = dVar;
    }

    @Override // p228x6.e
    public String getId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final p208v6.d getModel() {
        return this.model;
    }
}
