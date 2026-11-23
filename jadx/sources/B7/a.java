package B7;

import M2.O;
import Q3.u0;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f761e;

    public a(Context context, p199u7.c cVar, A7.a aVar, com.unity3d.scar.adapter.common.c cVar2) {
        this.a = context;
        this.f758b = cVar;
        this.f759c = aVar;
        this.f761e = cVar2;
    }

    public abstract Object b();

    public void c(p199u7.b bVar) {
        AdRequest adRequestB = ((A7.a) this.f759c).b(((p199u7.c) this.f758b).f15351d);
        if (bVar != null) {
            ((u0) this.f760d).getClass();
        }
        d(adRequestB);
    }

    public abstract void d(AdRequest adRequest);

    public void e(p107l1.b bVar) {
        p210v8.i.f(bVar, "listener");
        synchronized (this.f759c) {
            if (((LinkedHashSet) this.f760d).remove(bVar) && ((LinkedHashSet) this.f760d).isEmpty()) {
                h();
            }
        }
    }

    public void f(Object obj) {
        synchronized (this.f759c) {
            Object obj2 = this.f761e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f761e = obj;
                ((O) ((Y1.c) this.f758b).f5672v).execute(new D4.a(p086i8.k.s0((LinkedHashSet) this.f760d), 17, this));
            }
        }
    }

    public abstract void g();

    public abstract void h();

    public a(Context context, Y1.c cVar) {
        this.f758b = cVar;
        Context applicationContext = context.getApplicationContext();
        p210v8.i.e(applicationContext, "context.applicationContext");
        this.a = applicationContext;
        this.f759c = new Object();
        this.f760d = new LinkedHashSet();
    }
}
