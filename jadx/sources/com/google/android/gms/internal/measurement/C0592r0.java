package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0592r0 implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Iterator f8411s;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8411s.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f8411s.next();
        if (!(entry.getValue() instanceof zzjx)) {
            return entry;
        }
        C0591q0 c0591q0 = new C0591q0();
        c0591q0.f8406s = entry;
        return c0591q0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8411s.remove();
    }
}
