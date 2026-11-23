package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0587o0 implements v0, zzci, zzcr, zzcv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0587o0 f8398b = new C0587o0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C0587o0(int i10) {
        this.a = i10;
    }

    public static zzme c(Object obj) {
        zzjk zzjkVar = (zzjk) obj;
        zzme zzmeVar = zzjkVar.zzb;
        if (zzmeVar != zzme.f8702f) {
            return zzmeVar;
        }
        zzme zzmeVarE = zzme.e();
        zzjkVar.zzb = zzmeVarE;
        return zzmeVarE;
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public C0 a(Class cls) {
        switch (this.a) {
            case 0:
                if (!zzjk.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0) zzjk.n(cls.asSubclass(zzjk.class)).q(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return zzjk.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
