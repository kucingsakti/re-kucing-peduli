package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    @Override // com.google.android.gms.common.data.DataBuffer
    public final Object get(int i10) {
        synchronized (this) {
            throw null;
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        synchronized (this) {
            throw null;
        }
    }
}
