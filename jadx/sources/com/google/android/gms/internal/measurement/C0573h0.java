package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0573h0 {
    public final zzkt a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8389b;

    public C0573h0(zzkt zzktVar, int i10) {
        this.a = zzktVar;
        this.f8389b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0573h0)) {
            return false;
        }
        C0573h0 c0573h0 = (C0573h0) obj;
        return this.a == c0573h0.a && this.f8389b == c0573h0.f8389b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.f8389b;
    }
}
