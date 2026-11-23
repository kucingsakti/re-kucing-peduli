package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes.dex */
public final class T extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        zzgz.f8653h.incrementAndGet();
    }
}
