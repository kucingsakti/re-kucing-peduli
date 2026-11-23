package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class zzhh {
    public final Uri a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8665e;

    public zzhh(Uri uri) {
        this(uri, "", "", false, false);
    }

    public final U a(String str, long j) {
        Long lValueOf = Long.valueOf(j);
        Object obj = zzgz.f8651f;
        return new U(this, str, lValueOf, 1);
    }

    public final U b(String str, String str2) {
        Object obj = zzgz.f8651f;
        return new U(this, str, str2, 2);
    }

    public final U c(String str, boolean z6) {
        Boolean boolValueOf = Boolean.valueOf(z6);
        Object obj = zzgz.f8651f;
        return new U(this, str, boolValueOf, 0);
    }

    public final zzhh d() {
        return new zzhh(this.a, this.f8662b, this.f8663c, this.f8664d, true);
    }

    public final zzhh e() {
        if (!this.f8662b.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzhh(this.a, this.f8662b, this.f8663c, true, this.f8665e);
    }

    public zzhh(Uri uri, String str, String str2, boolean z6, boolean z10) {
        this.a = uri;
        this.f8662b = str;
        this.f8663c = str2;
        this.f8664d = z6;
        this.f8665e = z10;
    }
}
