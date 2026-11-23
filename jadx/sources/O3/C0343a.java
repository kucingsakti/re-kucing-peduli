package O3;

import A1.RunnableC0094c;
import android.os.Handler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: O3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0343a {
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f3510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f3515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f3516h;

    public C0343a(h7.c cVar, p163q7.i iVar, Handler handler, p112l7.a aVar, p163q7.f fVar, V3.b bVar, p085i7.g gVar) {
        p210v8.i.g(handler, "uiHandler");
        p210v8.i.g(aVar, "fetchHandler");
        p210v8.i.g(fVar, "logger");
        this.f3512d = iVar;
        this.f3513e = handler;
        this.f3514f = aVar;
        this.f3515g = fVar;
        this.f3516h = bVar;
        this.a = new Object();
        this.f3510b = new LinkedHashSet();
        RunnableC0094c runnableC0094c = new RunnableC0094c(this, 29);
        this.f3511c = runnableC0094c;
        iVar.d(new c2.a(this, 11));
        synchronized (iVar.a) {
            if (!iVar.f14432b) {
                iVar.f14434d.postDelayed(runnableC0094c, 150L);
            }
        }
    }

    public C0343a a(J4.c cVar) {
        synchronized (this.a) {
            ((p163q7.i) this.f3512d).d(new p112l7.b(this, cVar, 0));
        }
        return this;
    }

    public void b(List list, p204v1.g gVar) {
        p112l7.c cVar = new p112l7.c(this, list, 0);
        synchronized (this.a) {
            ((p163q7.i) this.f3512d).d(new A0.j(this, cVar, gVar, 8));
        }
    }

    public void c(List list, p230x9.d dVar) {
        p112l7.c cVar = new p112l7.c(this, list, 1);
        synchronized (this.a) {
            ((p163q7.i) this.f3512d).d(new A0.j(this, cVar, dVar, 9));
        }
    }

    public void d() {
        synchronized (this.a) {
        }
    }

    public void e(List list, za.c cVar) {
        synchronized (this.a) {
            ((p163q7.i) this.f3512d).d(new A0.j(this, list, cVar, 11));
        }
    }

    public void f() {
        p163q7.i iVar = (p163q7.i) this.f3512d;
        RunnableC0094c runnableC0094c = (RunnableC0094c) this.f3511c;
        p210v8.i.g(runnableC0094c, "runnable");
        synchronized (iVar.a) {
            if (!iVar.f14432b) {
                iVar.f14434d.postDelayed(runnableC0094c, 150L);
            }
        }
    }

    public void g(List list, K3.d dVar) {
        synchronized (this.a) {
            ((p163q7.i) this.f3512d).d(new A0.j(this, list, dVar, 12));
        }
    }

    public void h(List list, p053f4.e eVar) {
        synchronized (this.a) {
            ((p163q7.i) this.f3512d).d(new A0.j(this, list, eVar, 13));
        }
    }

    public C0343a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, o1.c cVar) {
        this.a = str;
        this.f3510b = str2;
        this.f3515g = arrayList;
        this.f3511c = str3;
        this.f3512d = str4;
        this.f3513e = str5;
        this.f3514f = str6;
        this.f3516h = cVar;
    }
}
