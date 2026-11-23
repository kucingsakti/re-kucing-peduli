package androidx.lifecycle;

import A1.RunnableC0094c;
import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class A {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f6705k = new Object();
    public final Object a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p166r.f f6706b = new p166r.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6707c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f6709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f6710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6713i;
    public final RunnableC0094c j;

    public A() {
        Object obj = f6705k;
        this.f6710f = obj;
        this.j = new RunnableC0094c(this, 18);
        this.f6709e = obj;
        this.f6711g = -1;
    }

    public static void a(String str) {
        p155q.a.r().f14246c.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(E0.a.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(z zVar) {
        if (zVar.f6775t) {
            if (!zVar.d()) {
                zVar.a(false);
                return;
            }
            int i10 = zVar.f6776u;
            int i11 = this.f6711g;
            if (i10 >= i11) {
                return;
            }
            zVar.f6776u = i11;
            zVar.f6774s.a(this.f6709e);
        }
    }

    public final void c(z zVar) {
        if (this.f6712h) {
            this.f6713i = true;
            return;
        }
        this.f6712h = true;
        do {
            this.f6713i = false;
            if (zVar != null) {
                b(zVar);
                zVar = null;
            } else {
                p166r.f fVar = this.f6706b;
                fVar.getClass();
                p166r.d dVar = new p166r.d(fVar);
                fVar.f14456u.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((z) ((Map.Entry) dVar.next()).getValue());
                    if (this.f6713i) {
                        break;
                    }
                }
            }
        } while (this.f6713i);
        this.f6712h = false;
    }

    public final void d(InterfaceC0523s interfaceC0523s, B b3) {
        Object obj;
        a("observe");
        if (interfaceC0523s.g().f6763c == EnumC0519n.f6755s) {
            return;
        }
        y yVar = new y(this, interfaceC0523s, b3);
        p166r.f fVar = this.f6706b;
        p166r.c cVarD = fVar.d(b3);
        if (cVarD != null) {
            obj = cVarD.f14448t;
        } else {
            p166r.c cVar = new p166r.c(b3, yVar);
            fVar.f14457v++;
            p166r.c cVar2 = fVar.f14455t;
            if (cVar2 == null) {
                fVar.f14454s = cVar;
                fVar.f14455t = cVar;
            } else {
                cVar2.f14449u = cVar;
                cVar.f14450v = cVar2;
                fVar.f14455t = cVar;
            }
            obj = null;
        }
        z zVar = (z) obj;
        if (zVar != null && !zVar.c(interfaceC0523s)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (zVar != null) {
            return;
        }
        interfaceC0523s.g().a(yVar);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f6711g++;
        this.f6709e = obj;
        c(null);
    }
}
