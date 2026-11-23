package com.google.android.gms.common.data;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException(AbstractC0487g.g(this.f8030t, "Cannot advance the iterator beyond "));
        }
        int i10 = this.f8030t + 1;
        this.f8030t = i10;
        if (i10 == 0) {
            this.f8029s.get(0);
            throw null;
        }
        if (i10 >= 0) {
            throw null;
        }
        Preconditions.l(false);
        throw null;
    }
}
