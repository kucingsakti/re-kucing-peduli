package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzow implements zzot {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8832b;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        a = zzhhVarD.c("measurement.item_scoped_custom_parameters.client", true);
        f8832b = zzhhVarD.c("measurement.item_scoped_custom_parameters.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean c() {
        return ((Boolean) f8832b.a()).booleanValue();
    }
}
