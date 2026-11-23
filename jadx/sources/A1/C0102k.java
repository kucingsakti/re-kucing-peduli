package A1;

import androidx.datastore.preferences.protobuf.i0;
import com.bumptech.glide.Registry$NoSourceEncoderAvailableException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: A1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0102k {
    public final ArrayList a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f106b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class f111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p232y1.h f113i;
    public U1.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class f114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p232y1.e f117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f121r;

    public final ArrayList a() {
        boolean z6 = this.f116m;
        ArrayList arrayList = this.f106b;
        if (!z6) {
            this.f116m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                E1.q qVar = (E1.q) arrayListB.get(i10);
                if (!arrayList.contains(qVar.a)) {
                    arrayList.add(qVar.a);
                }
                int i11 = 0;
                while (true) {
                    List list = qVar.f1325b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z6 = this.f115l;
        ArrayList arrayList = this.a;
        if (!z6) {
            this.f115l = true;
            arrayList.clear();
            List listG = this.f107c.a().g(this.f108d);
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                E1.q qVarB = ((E1.r) listG.get(i10)).b(this.f108d, this.f109e, this.f110f, this.f113i);
                if (qVarB != null) {
                    arrayList.add(qVarB);
                }
            }
        }
        return arrayList;
    }

    public final D c(Class cls) {
        D d3;
        Class cls2;
        com.bumptech.glide.h hVarA = this.f107c.a();
        Class cls3 = this.f111g;
        Class cls4 = this.f114k;
        P1.b bVar = hVarA.f7615i;
        U1.l lVar = (U1.l) bVar.f3834b.getAndSet(null);
        if (lVar == null) {
            lVar = new U1.l();
        }
        lVar.a = cls;
        lVar.f4879b = cls3;
        lVar.f4880c = cls4;
        synchronized (bVar.a) {
            d3 = (D) bVar.a.get(lVar);
        }
        bVar.f3834b.set(lVar);
        hVarA.f7615i.getClass();
        if (P1.b.f3833c.equals(d3)) {
            return null;
        }
        if (d3 != null) {
            return d3;
        }
        D d8 = null;
        ArrayList arrayListE = hVarA.e(cls, cls3, cls4);
        if (arrayListE.isEmpty()) {
            cls2 = cls;
        } else {
            cls2 = cls;
            d8 = new D(cls2, cls3, cls4, arrayListE, hVarA.j);
        }
        D d10 = d8;
        hVarA.f7615i.a(cls2, cls3, cls4, d10);
        return d10;
    }

    public final p232y1.b d(Object obj) {
        p232y1.b bVar;
        M1.c cVar = this.f107c.a().f7608b;
        Class<?> cls = obj.getClass();
        synchronized (cVar) {
            Iterator it = cVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                P1.a aVar = (P1.a) it.next();
                if (aVar.a.isAssignableFrom(cls)) {
                    bVar = aVar.f3832b;
                    break;
                }
            }
        }
        if (bVar != null) {
            return bVar;
        }
        throw new Registry$NoSourceEncoderAvailableException("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final p232y1.l e(Class cls) {
        p232y1.l lVar = (p232y1.l) this.j.get(cls);
        if (lVar == null) {
            for (Map.Entry entry : (i0) this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (p232y1.l) entry.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.j.isEmpty() || !this.f120q) {
            return G1.c.f1689b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
