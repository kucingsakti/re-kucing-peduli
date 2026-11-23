package G0;

import N9.C0324g;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import p076h8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final MeasurementManager a;

    public c(Context context) {
        i.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) E7.a.w());
        i.e(systemService, "context.getSystemService…:class.java\n            )");
        this.a = E7.a.c(systemService);
    }

    public Object a(a aVar, p123m8.d<? super m> dVar) {
        new C0324g(1, qa.b.q(dVar)).w();
        E7.a.m();
        throw null;
    }

    public Object b(p123m8.d<? super Integer> dVar) {
        C0324g c0324g = new C0324g(1, qa.b.q(dVar));
        c0324g.w();
        this.a.getMeasurementApiStatus(new b(0), new Q.c(c0324g));
        return c0324g.v();
    }

    public Object c(Uri uri, InputEvent inputEvent, p123m8.d<? super m> dVar) {
        C0324g c0324g = new C0324g(1, qa.b.q(dVar));
        c0324g.w();
        this.a.registerSource(uri, inputEvent, new b(0), new Q.c(c0324g));
        Object objV = c0324g.v();
        return objV == p134n8.a.f13404s ? objV : m.a;
    }

    public Object d(Uri uri, p123m8.d<? super m> dVar) {
        C0324g c0324g = new C0324g(1, qa.b.q(dVar));
        c0324g.w();
        this.a.registerTrigger(uri, new b(0), new Q.c(c0324g));
        Object objV = c0324g.v();
        return objV == p134n8.a.f13404s ? objV : m.a;
    }

    public Object e(d dVar, p123m8.d<? super m> dVar2) {
        new C0324g(1, qa.b.q(dVar2)).w();
        E7.a.x();
        throw null;
    }

    public Object f(e eVar, p123m8.d<? super m> dVar) {
        new C0324g(1, qa.b.q(dVar)).w();
        E7.a.y();
        throw null;
    }
}
