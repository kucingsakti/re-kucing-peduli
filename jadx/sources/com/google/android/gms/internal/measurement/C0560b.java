package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0560b implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Iterator f8373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Iterator f8374t;

    public C0560b(Iterator it, Iterator it2) {
        this.f8373s = it;
        this.f8374t = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8373s.hasNext()) {
            return true;
        }
        return this.f8374t.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Iterator it = this.f8373s;
        if (it.hasNext()) {
            return new zzas(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f8374t;
        if (it2.hasNext()) {
            return new zzas((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
