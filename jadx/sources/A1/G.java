package A1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0101j, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public File f55A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public H f56B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f57s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0102k f58t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f59u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f60v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p232y1.e f61w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f62x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f63y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile E1.q f64z;

    public G(C0102k c0102k, n nVar) {
        this.f58t = c0102k;
        this.f57s = nVar;
    }

    @Override // A1.InterfaceC0101j
    public final boolean a() {
        List list;
        ArrayList arrayListA = this.f58t.a();
        boolean z6 = false;
        if (!arrayListA.isEmpty()) {
            C0102k c0102k = this.f58t;
            com.bumptech.glide.h hVarA = c0102k.f107c.a();
            Class<?> cls = c0102k.f108d.getClass();
            Class cls2 = c0102k.f111g;
            Class cls3 = c0102k.f114k;
            o1.r rVar = hVarA.f7614h;
            U1.l lVar = (U1.l) ((AtomicReference) rVar.f13675t).getAndSet(null);
            if (lVar == null) {
                lVar = new U1.l(cls, cls2, cls3);
            } else {
                lVar.a = cls;
                lVar.f4879b = cls2;
                lVar.f4880c = cls3;
            }
            synchronized (((p212w.e) rVar.f13676u)) {
                list = (List) ((p212w.e) rVar.f13676u).get(lVar);
            }
            ((AtomicReference) rVar.f13675t).set(lVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = hVarA.a.a(cls).iterator();
                while (it.hasNext()) {
                    for (Class cls4 : hVarA.f7609c.r((Class) it.next(), cls2)) {
                        if (!hVarA.f7612f.h(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                hVarA.f7614h.t(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f62x;
                    if (list3 != null && this.f63y < list3.size()) {
                        this.f64z = null;
                        while (!z6 && this.f63y < this.f62x.size()) {
                            List list4 = this.f62x;
                            int i10 = this.f63y;
                            this.f63y = i10 + 1;
                            E1.r rVar2 = (E1.r) list4.get(i10);
                            File file = this.f55A;
                            C0102k c0102k2 = this.f58t;
                            this.f64z = rVar2.b(file, c0102k2.f109e, c0102k2.f110f, c0102k2.f113i);
                            if (this.f64z != null && this.f58t.c(this.f64z.f1326c.a()) != null) {
                                this.f64z.f1326c.d(this.f58t.f118o, this);
                                z6 = true;
                            }
                        }
                        return z6;
                    }
                    int i11 = this.f60v + 1;
                    this.f60v = i11;
                    if (i11 >= list2.size()) {
                        int i12 = this.f59u + 1;
                        this.f59u = i12;
                        if (i12 < arrayListA.size()) {
                            this.f60v = 0;
                        }
                    }
                    p232y1.e eVar = (p232y1.e) arrayListA.get(this.f59u);
                    Class cls5 = (Class) list2.get(this.f60v);
                    p232y1.l lVarE = this.f58t.e(cls5);
                    C0102k c0102k3 = this.f58t;
                    this.f56B = new H(c0102k3.f107c.a, eVar, c0102k3.f117n, c0102k3.f109e, c0102k3.f110f, lVarE, cls5, c0102k3.f113i);
                    File fileA = c0102k3.f112h.a().a(this.f56B);
                    this.f55A = fileA;
                    if (fileA != null) {
                        this.f61w = eVar;
                        this.f62x = this.f58t.f107c.a().g(fileA);
                        this.f63y = 0;
                    }
                }
            } else if (!File.class.equals(this.f58t.f114k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f58t.f108d.getClass() + " to " + this.f58t.f114k);
            }
        }
        return false;
    }

    @Override // A1.InterfaceC0101j
    public final void cancel() {
        E1.q qVar = this.f64z;
        if (qVar != null) {
            qVar.f1326c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Exception exc) {
        this.f57s.k(this.f56B, exc, this.f64z.f1326c, 4);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void g(Object obj) {
        this.f57s.f(this.f61w, obj, this.f64z.f1326c, 4, this.f56B);
    }
}
