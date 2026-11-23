package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B0 f8333c = new B0();
    public final t0 a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8334b = new ConcurrentHashMap();

    public B0() {
        v0[] v0VarArr = {C0587o0.f8398b, t0.f8417b};
        t0 t0Var = new t0();
        t0Var.a = v0VarArr;
        t0 t0Var2 = new t0();
        Charset charset = zzjm.a;
        t0Var2.a = t0Var;
        this.a = t0Var2;
    }

    public final D0 a(Class cls) {
        D0 d0L;
        Charset charset = zzjm.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f8334b;
        D0 d3 = (D0) concurrentHashMap.get(cls);
        if (d3 != null) {
            return d3;
        }
        t0 t0Var = this.a;
        t0Var.getClass();
        zzjk.class.isAssignableFrom(cls);
        C0 c0A = ((t0) t0Var.a).a(cls);
        boolean z6 = (c0A.f8337d & 2) == 2;
        C0577j0 c0577j0 = AbstractC0575i0.a;
        if (z6) {
            d0L = new y0(c0A.a);
        } else {
            if (u0.a[c0A.a().ordinal()] == 1) {
                c0577j0 = null;
            }
            d0L = x0.l(c0A, c0577j0);
        }
        D0 d8 = (D0) concurrentHashMap.putIfAbsent(cls, d0L);
        return d8 != null ? d8 : d0L;
    }
}
