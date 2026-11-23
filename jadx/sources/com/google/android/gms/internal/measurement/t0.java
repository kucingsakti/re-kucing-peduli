package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0587o0 f8417b = new C0587o0(6);
    public Object a;

    @Override // com.google.android.gms.internal.measurement.v0
    public C0 a(Class cls) {
        for (v0 v0Var : (v0[]) this.a) {
            if (v0Var.b(cls)) {
                return v0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.v0
    public boolean b(Class cls) {
        for (v0 v0Var : (v0[]) this.a) {
            if (v0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i10, Object obj) {
        boolean z6 = obj instanceof zzia;
        C0569f0 c0569f0 = (C0569f0) this.a;
        if (z6) {
            c0569f0.x(1, 3);
            c0569f0.y(2, i10);
            c0569f0.n(3, (zzia) obj);
            c0569f0.x(1, 4);
            return;
        }
        zzkt zzktVar = (zzkt) obj;
        c0569f0.x(1, 3);
        c0569f0.y(2, i10);
        c0569f0.x(3, 2);
        c0569f0.w(zzktVar.a());
        zzktVar.d(c0569f0);
        c0569f0.x(1, 4);
    }

    public void d(int i10, Object obj, D0 d3) {
        C0569f0 c0569f0 = (C0569f0) this.a;
        c0569f0.x(i10, 3);
        d3.h((zzkt) obj, c0569f0.a);
        c0569f0.x(i10, 4);
    }
}
