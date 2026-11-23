package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzny implements zznv {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8810b;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        zzhhVarD.c("measurement.collection.event_safelist", true);
        a = zzhhVarD.c("measurement.service.store_null_safelist", true);
        f8810b = zzhhVarD.c("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean c() {
        return ((Boolean) f8810b.a()).booleanValue();
    }
}
