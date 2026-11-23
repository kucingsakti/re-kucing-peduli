package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzpc implements zzoz {
    public static final U a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final U f8837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f8838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U f8839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final U f8840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final U f8841f;

    static {
        zzhh zzhhVarD = new zzhh(zzgw.a("com.google.android.gms.measurement")).e().d();
        a = zzhhVarD.c("measurement.test.boolean_flag", false);
        f8837b = zzhhVarD.a("measurement.test.cached_long_flag", -1L);
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = zzgz.f8651f;
        f8838c = new U(zzhhVarD, "measurement.test.double_flag", dValueOf, 3);
        f8839d = zzhhVarD.a("measurement.test.int_flag", -2L);
        f8840e = zzhhVarD.a("measurement.test.long_flag", -1L);
        f8841f = zzhhVarD.b("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final long a() {
        return ((Long) f8837b.a()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final double b() {
        return ((Double) f8838c.a()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final long c() {
        return ((Long) f8839d.a()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final long d() {
        return ((Long) f8840e.a()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final String e() {
        return (String) f8841f.a();
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean f() {
        return ((Boolean) a.a()).booleanValue();
    }
}
