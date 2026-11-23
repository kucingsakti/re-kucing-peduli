package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.internal.k;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectTypeAdapter extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f10038c = new AnonymousClass1(t.f10160s);
    public final i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f10039b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements v {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ t f10040s;

        public AnonymousClass1(t tVar) {
            this.f10040s = tVar;
        }

        @Override // com.google.gson.v
        public final u a(i iVar, p243z4.a aVar) {
            if (aVar.a == Object.class) {
                return new ObjectTypeAdapter(iVar, this.f10040s);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(i iVar, t tVar) {
        this.a = iVar;
        this.f10039b = tVar;
    }

    public static v d(t tVar) {
        return tVar == t.f10160s ? f10038c : new AnonymousClass1(tVar);
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iX = aVar.X();
        int iD = p239z.e.d(iX);
        if (iD == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (iD != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new k(true);
        }
        if (arrayList == null) {
            return e(aVar, iX);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.n()) {
                String strG = arrayList instanceof Map ? aVar.G() : null;
                int iX2 = aVar.X();
                int iD2 = p239z.e.d(iX2);
                if (iD2 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (iD2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new k(true);
                }
                boolean z6 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = e(aVar, iX2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strG, arrayList2);
                }
                if (z6) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.h();
                } else {
                    aVar.i();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.n();
            return;
        }
        Class<?> cls = obj.getClass();
        i iVar = this.a;
        iVar.getClass();
        u uVarC = iVar.c(new p243z4.a(cls));
        if (!(uVarC instanceof ObjectTypeAdapter)) {
            uVarC.c(bVar, obj);
        } else {
            bVar.c();
            bVar.i();
        }
    }

    public final Serializable e(A4.a aVar, int i10) throws IOException {
        int iD = p239z.e.d(i10);
        if (iD == 5) {
            return aVar.T();
        }
        if (iD == 6) {
            return this.f10039b.f(aVar);
        }
        if (iD == 7) {
            return Boolean.valueOf(aVar.t());
        }
        if (iD != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(E0.a.q(i10)));
        }
        aVar.J();
        return null;
    }
}
