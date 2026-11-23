package com.bumptech.glide;

import A1.C0099h;
import A1.o;
import E1.s;
import E1.t;
import E1.u;
import com.google.android.gms.internal.measurement.S;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o1.r;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final u a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M1.c f7608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S f7609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M1.c f7610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.h f7611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M1.c f7612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ea.a f7613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f7614h = new r(8);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P1.b f7615i = new P1.b();
    public final C0099h j;

    public h() {
        C0099h c0099h = new C0099h(new T.d(20), new za.c(11), new K3.d(12));
        this.j = c0099h;
        this.a = new u(c0099h);
        this.f7608b = new M1.c(1);
        this.f7609c = new S(9);
        this.f7610d = new M1.c(2);
        this.f7611e = new com.bumptech.glide.load.data.h();
        this.f7612f = new M1.c(0);
        this.f7613g = new Ea.a(1, false);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        S s9 = this.f7609c;
        synchronized (s9) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) s9.f8359t);
                ((ArrayList) s9.f8359t).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) s9.f8359t).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) s9.f8359t).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Class cls2, s sVar) {
        u uVar = this.a;
        synchronized (uVar) {
            uVar.a.a(cls, cls2, sVar);
            uVar.f1327b.a.clear();
        }
    }

    public final void b(Class cls, p232y1.b bVar) {
        M1.c cVar = this.f7608b;
        synchronized (cVar) {
            cVar.a.add(new P1.a(cls, bVar));
        }
    }

    public final void c(Class cls, p232y1.k kVar) {
        M1.c cVar = this.f7610d;
        synchronized (cVar) {
            cVar.a.add(new P1.d(cls, kVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, p232y1.j jVar) {
        S s9 = this.f7609c;
        synchronized (s9) {
            s9.q(str).add(new P1.c(cls, cls2, jVar));
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Class cls4 : this.f7609c.r(cls, cls2)) {
            for (Class cls5 : this.f7612f.h(cls4, cls3)) {
                S s9 = this.f7609c;
                synchronized (s9) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) s9.f8359t).iterator();
                    while (it.hasNext()) {
                        List<P1.c> list = (List) ((HashMap) s9.f8360u).get((String) it.next());
                        if (list != null) {
                            for (P1.c cVar : list) {
                                if (cVar.a.isAssignableFrom(cls) && cls4.isAssignableFrom(cVar.f3835b)) {
                                    arrayList.add(cVar.f3836c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new o(cls, cls4, cls5, arrayList, this.f7612f.e(cls4, cls5), this.j));
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        Ea.a aVar = this.f7613g;
        synchronized (aVar) {
            arrayList = aVar.a;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    public final List g(Object obj) {
        List listUnmodifiableList;
        u uVar = this.a;
        uVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (uVar) {
            t tVar = (t) uVar.f1327b.a.get(cls);
            listUnmodifiableList = tVar == null ? null : tVar.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(uVar.a.c(cls));
                if (((t) uVar.f1327b.a.put(cls, new t(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z6 = true;
        for (int i10 = 0; i10 < size; i10++) {
            E1.r rVar = (E1.r) listUnmodifiableList.get(i10);
            if (rVar.a(obj)) {
                if (z6) {
                    arrayList = new ArrayList(size - i10);
                    z6 = false;
                }
                arrayList.add(rVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new Registry$NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.g h(Object obj) {
        com.bumptech.glide.load.data.g gVarB;
        com.bumptech.glide.load.data.h hVar = this.f7611e;
        synchronized (hVar) {
            try {
                U1.f.b(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) ((HashMap) hVar.f7652t).get(obj.getClass());
                if (fVar == null) {
                    for (com.bumptech.glide.load.data.f fVar2 : ((HashMap) hVar.f7652t).values()) {
                        if (fVar2.a().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.h.f7650u;
                }
                gVarB = fVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVarB;
    }

    public final void i(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.h hVar = this.f7611e;
        synchronized (hVar) {
            ((HashMap) hVar.f7652t).put(fVar.a(), fVar);
        }
    }

    public final void j(Class cls, Class cls2, M1.a aVar) {
        M1.c cVar = this.f7612f;
        synchronized (cVar) {
            cVar.a.add(new M1.b(cls, cls2, aVar));
        }
    }

    public final void k(p232y1.d dVar) {
        Ea.a aVar = this.f7613g;
        synchronized (aVar) {
            aVar.a.add(dVar);
        }
    }
}
