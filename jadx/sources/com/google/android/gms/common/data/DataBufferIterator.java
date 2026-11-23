package com.google.android.gms.common.data;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class DataBufferIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AbstractDataBuffer f8029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8030t = -1;

    public DataBufferIterator(AbstractDataBuffer abstractDataBuffer) {
        this.f8029s = abstractDataBuffer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8030t < this.f8029s.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(AbstractC0487g.g(this.f8030t, "Cannot advance the iterator beyond "));
        }
        int i10 = this.f8030t + 1;
        this.f8030t = i10;
        this.f8029s.get(i10);
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
