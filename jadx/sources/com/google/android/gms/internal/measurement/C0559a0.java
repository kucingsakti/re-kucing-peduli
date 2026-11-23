package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0559a0 implements zzig {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8370s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8371t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zzia f8372u;

    public C0559a0(zzia zziaVar) {
        this.f8372u = zziaVar;
        this.f8371t = zziaVar.n();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8370s < this.f8371t;
    }

    @Override // java.util.Iterator
    public final Byte next() {
        int i10 = this.f8370s;
        if (i10 >= this.f8371t) {
            throw new NoSuchElementException();
        }
        this.f8370s = i10 + 1;
        return Byte.valueOf(this.f8372u.m(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
