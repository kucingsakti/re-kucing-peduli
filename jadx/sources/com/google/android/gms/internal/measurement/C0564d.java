package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0564d implements Iterator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8379t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8380u;

    public /* synthetic */ C0564d(Object obj, int i10) {
        this.f8378s = i10;
        this.f8380u = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8378s) {
            case 0:
                return this.f8379t < ((zzas) this.f8380u).f8475s.length();
            case 1:
                return this.f8379t < ((zzas) this.f8380u).f8475s.length();
            default:
                return this.f8379t < ((zzaf) this.f8380u).s();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f8378s) {
            case 0:
                int i10 = this.f8379t;
                zzas zzasVar = (zzas) this.f8380u;
                if (i10 >= zzasVar.f8475s.length()) {
                    throw new NoSuchElementException();
                }
                String str = zzasVar.f8475s;
                int i11 = this.f8379t;
                this.f8379t = i11 + 1;
                return new zzas(String.valueOf(str.charAt(i11)));
            case 1:
                if (this.f8379t >= ((zzas) this.f8380u).f8475s.length()) {
                    throw new NoSuchElementException();
                }
                int i12 = this.f8379t;
                this.f8379t = i12 + 1;
                return new zzas(String.valueOf(i12));
            default:
                int i13 = this.f8379t;
                zzaf zzafVar = (zzaf) this.f8380u;
                if (i13 >= zzafVar.s()) {
                    throw new NoSuchElementException(AbstractC0487g.g(this.f8379t, "Out of bounds index: "));
                }
                int i14 = this.f8379t;
                this.f8379t = i14 + 1;
                return zzafVar.q(i14);
        }
    }
}
