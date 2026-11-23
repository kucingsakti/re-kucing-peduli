package p107l1;

import B7.a;
import Y1.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import o1.o;
import p050f1.q;
import p117m1.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f12895e;

    public b(a aVar) {
        i.f(aVar, "tracker");
        this.a = aVar;
        this.f12892b = new ArrayList();
        this.f12893c = new ArrayList();
    }

    public abstract boolean a(o oVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        i.f(iterable, "workSpecs");
        this.f12892b.clear();
        this.f12893c.clear();
        ArrayList arrayList = this.f12892b;
        for (Object obj : iterable) {
            if (a((o) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f12892b;
        ArrayList arrayList3 = this.f12893c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((o) it.next()).a);
        }
        if (this.f12892b.isEmpty()) {
            this.a.e(this);
        } else {
            a aVar = this.a;
            aVar.getClass();
            synchronized (aVar.f759c) {
                try {
                    if (((LinkedHashSet) aVar.f760d).add(this)) {
                        if (((LinkedHashSet) aVar.f760d).size() == 1) {
                            aVar.f761e = aVar.b();
                            q qVarA = q.a();
                            int i10 = f.a;
                            Objects.toString(aVar.f761e);
                            qVarA.getClass();
                            aVar.g();
                        }
                        Object obj2 = aVar.f761e;
                        this.f12894d = obj2;
                        d(this.f12895e, obj2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f12895e, this.f12894d);
    }

    public final void d(c cVar, Object obj) {
        if (this.f12892b.isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            cVar.F(this.f12892b);
            return;
        }
        ArrayList arrayList = this.f12892b;
        i.f(arrayList, "workSpecs");
        synchronized (cVar.f5672v) {
            try {
                ArrayList<o> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (cVar.j(((o) obj2).a)) {
                        arrayList2.add(obj2);
                    }
                }
                for (o oVar : arrayList2) {
                    q qVarA = q.a();
                    int i10 = k1.c.a;
                    Objects.toString(oVar);
                    qVarA.getClass();
                }
                k1.b bVar = (k1.b) cVar.f5670t;
                if (bVar != null) {
                    bVar.d(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
