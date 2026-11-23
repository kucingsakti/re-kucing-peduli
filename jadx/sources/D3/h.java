package D3;

import I3.p;
import N9.AbstractC0342z;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h implements I3.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f1057t = new h(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f1058u = new h(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f1059v = new h(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f1060w = new h(3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1061s;

    public /* synthetic */ h(int i10) {
        this.f1061s = i10;
    }

    @Override // I3.e
    public final Object h(Fa.e eVar) {
        switch (this.f1061s) {
            case 0:
                Object objB = eVar.b(new p(H3.a.class, Executor.class));
                p210v8.i.e(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0342z.h((Executor) objB);
            case 1:
                Object objB2 = eVar.b(new p(H3.c.class, Executor.class));
                p210v8.i.e(objB2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0342z.h((Executor) objB2);
            case 2:
                Object objB3 = eVar.b(new p(H3.b.class, Executor.class));
                p210v8.i.e(objB3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0342z.h((Executor) objB3);
            default:
                Object objB4 = eVar.b(new p(H3.d.class, Executor.class));
                p210v8.i.e(objB4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0342z.h((Executor) objB4);
        }
    }
}
