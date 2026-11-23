package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
public enum zzim {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9163s;

    zzim(String str) {
        this.f9163s = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f9163s;
    }
}
