package p130n4;

import H3.b;
import H3.c;
import H3.d;
import I3.e;
import I3.p;
import N9.AbstractC0342z;
import java.util.concurrent.Executor;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f13398t = new a(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f13399u = new a(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f13400v = new a(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f13401w = new a(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13402s;

    public /* synthetic */ a(int i10) {
        this.f13402s = i10;
    }

    @Override // I3.e
    public final Object h(Fa.e eVar) {
        switch (this.f13402s) {
            case 0:
                Object objB = eVar.b(new p(H3.a.class, Executor.class));
                i.e(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0342z.h((Executor) objB);
            case 1:
                Object objB2 = eVar.b(new p(c.class, Executor.class));
                i.e(objB2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0342z.h((Executor) objB2);
            case 2:
                Object objB3 = eVar.b(new p(b.class, Executor.class));
                i.e(objB3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0342z.h((Executor) objB3);
            default:
                Object objB4 = eVar.b(new p(d.class, Executor.class));
                i.e(objB4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0342z.h((Executor) objB4);
        }
    }
}
