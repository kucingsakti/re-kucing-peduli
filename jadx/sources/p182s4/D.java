package p182s4;

import N9.AbstractC0342z;
import Q9.e;
import V.h;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import o1.f;
import p060g0.b;
import p123m8.i;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC0783u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0786x f14605e = new C0786x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f14606f = f.m(AbstractC0782t.a, new h(C0785w.f14720s));
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f14607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f14608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f14609d;

    public D(Context context, i iVar) {
        p210v8.i.f(context, "context");
        this.a = context;
        this.f14607b = iVar;
        this.f14608c = new AtomicReference();
        f14605e.getClass();
        this.f14609d = new e(new e(((p039e0.f) f14606f.a(C0786x.a[0], context)).getData(), new z(3, null), 0), this, 1);
        AbstractC0342z.n(AbstractC0342z.b(iVar), null, new C0784v(this, null), 3);
    }
}
