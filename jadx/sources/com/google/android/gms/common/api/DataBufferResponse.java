package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void g() {
        throw null;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final Object get(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        throw null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        throw null;
    }
}
