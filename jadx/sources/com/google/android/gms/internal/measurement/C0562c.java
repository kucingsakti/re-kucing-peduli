package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0562c implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Iterator f8375s;

    public C0562c(Iterator it) {
        this.f8375s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8375s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new zzas((String) this.f8375s.next());
    }
}
