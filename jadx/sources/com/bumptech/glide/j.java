package com.bumptech.glide;

import H1.t;
import U1.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.datastore.preferences.protobuf.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Q1.a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Context f7617H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final l f7618I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Class f7619J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final f f7620K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public m f7621L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Object f7622M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f7623N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public j f7624O;
    public j P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f7625Q = true;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f7626R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f7627S;

    static {
    }

    public j(b bVar, l lVar, Class cls, Context context) {
        Q1.e eVar;
        this.f7618I = lVar;
        this.f7619J = cls;
        this.f7617H = context;
        p212w.e eVar2 = lVar.f7632s.f7589u.f7599f;
        m mVar = (m) eVar2.get(cls);
        if (mVar == null) {
            for (Map.Entry entry : (i0) eVar2.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        this.f7621L = mVar == null ? f.f7594k : mVar;
        this.f7620K = bVar.f7589u;
        Iterator it = lVar.f7630A.iterator();
        while (it.hasNext()) {
            t((G4.i) it.next());
        }
        synchronized (lVar) {
            eVar = lVar.f7631B;
        }
        a(eVar);
    }

    public final j A(Object obj) {
        if (this.f3944E) {
            return clone().A(obj);
        }
        this.f7622M = obj;
        this.f7626R = true;
        k();
        return this;
    }

    public final j B(J1.b bVar) {
        if (this.f3944E) {
            return clone().B(bVar);
        }
        this.f7621L = bVar;
        this.f7625Q = false;
        k();
        return this;
    }

    @Override // Q1.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (super.equals(jVar)) {
            return Objects.equals(this.f7619J, jVar.f7619J) && this.f7621L.equals(jVar.f7621L) && Objects.equals(this.f7622M, jVar.f7622M) && Objects.equals(this.f7623N, jVar.f7623N) && Objects.equals(this.f7624O, jVar.f7624O) && Objects.equals(this.P, jVar.P) && this.f7625Q == jVar.f7625Q && this.f7626R == jVar.f7626R;
        }
        return false;
    }

    @Override // Q1.a
    public final int hashCode() {
        return n.g(this.f7626R ? 1 : 0, n.g(this.f7625Q ? 1 : 0, n.h(n.h(n.h(n.h(n.h(n.h(n.h(super.hashCode(), this.f7619J), this.f7621L), this.f7622M), this.f7623N), this.f7624O), this.P), null)));
    }

    public final j t(G4.i iVar) {
        if (this.f3944E) {
            return clone().t(iVar);
        }
        if (iVar != null) {
            if (this.f7623N == null) {
                this.f7623N = new ArrayList();
            }
            this.f7623N.add(iVar);
        }
        k();
        return this;
    }

    @Override // Q1.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final j a(Q1.a aVar) {
        U1.f.b(aVar);
        return (j) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Q1.c v(Object obj, R1.c cVar, Q1.d dVar, m mVar, g gVar, int i10, int i11, Q1.a aVar) {
        Q1.d dVar2;
        Q1.d bVar;
        Q1.a aVar2;
        Q1.c fVar;
        g gVar2;
        if (this.P != null) {
            bVar = new Q1.b(obj, dVar);
            dVar2 = bVar;
        } else {
            dVar2 = null;
            bVar = dVar;
        }
        j jVar = this.f7624O;
        if (jVar == null) {
            Object obj2 = this.f7622M;
            ArrayList arrayList = this.f7623N;
            f fVar2 = this.f7620K;
            aVar2 = aVar;
            fVar = new Q1.f(this.f7617H, fVar2, obj, obj2, this.f7619J, aVar2, i10, i11, gVar, cVar, arrayList, bVar, fVar2.f7600g, mVar.f7670s);
        } else {
            if (this.f7627S) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            m mVar2 = jVar.f7625Q ? mVar : jVar.f7621L;
            if (Q1.a.f(jVar.f3947s, 8)) {
                gVar2 = this.f7624O.f3949u;
            } else {
                int iOrdinal = gVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    gVar2 = g.f7603s;
                } else if (iOrdinal == 2) {
                    gVar2 = g.f7604t;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f3949u);
                    }
                    gVar2 = g.f7605u;
                }
            }
            g gVar3 = gVar2;
            j jVar2 = this.f7624O;
            int i12 = jVar2.f3952x;
            int i13 = jVar2.f3951w;
            if (n.j(i10, i11)) {
                j jVar3 = this.f7624O;
                if (!n.j(jVar3.f3952x, jVar3.f3951w)) {
                    i12 = aVar.f3952x;
                    i13 = aVar.f3951w;
                }
            }
            int i14 = i13;
            int i15 = i12;
            Q1.g gVar4 = new Q1.g(obj, bVar);
            Object obj3 = this.f7622M;
            ArrayList arrayList2 = this.f7623N;
            Q1.g gVar5 = gVar4;
            f fVar3 = this.f7620K;
            Q1.f fVar4 = new Q1.f(this.f7617H, fVar3, obj, obj3, this.f7619J, aVar, i10, i11, gVar, cVar, arrayList2, gVar5, fVar3.f7600g, mVar.f7670s);
            this.f7627S = true;
            j jVar4 = this.f7624O;
            Q1.c cVarV = jVar4.v(obj, cVar, gVar5, mVar2, gVar3, i15, i14, jVar4);
            this.f7627S = false;
            gVar5.f3985c = fVar4;
            gVar5.f3986d = cVarV;
            aVar2 = aVar;
            fVar = gVar5;
        }
        if (dVar2 == null) {
            return fVar;
        }
        j jVar5 = this.P;
        int i16 = jVar5.f3952x;
        int i17 = jVar5.f3951w;
        if (n.j(i10, i11)) {
            j jVar6 = this.P;
            if (!n.j(jVar6.f3952x, jVar6.f3951w)) {
                i16 = aVar2.f3952x;
                i17 = aVar2.f3951w;
            }
        }
        int i18 = i17;
        j jVar7 = this.P;
        Q1.b bVar2 = dVar2;
        Q1.c cVarV2 = jVar7.v(obj, cVar, bVar2, jVar7.f7621L, jVar7.f3949u, i16, i18, jVar7);
        bVar2.f3956c = fVar;
        bVar2.f3957d = cVarV2;
        return bVar2;
    }

    @Override // Q1.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        j jVar = (j) super.clone();
        jVar.f7621L = jVar.f7621L.clone();
        if (jVar.f7623N != null) {
            jVar.f7623N = new ArrayList(jVar.f7623N);
        }
        j jVar2 = jVar.f7624O;
        if (jVar2 != null) {
            jVar.f7624O = jVar2.clone();
        }
        j jVar3 = jVar.P;
        if (jVar3 != null) {
            jVar.P = jVar3.clone();
        }
        return jVar;
    }

    public final void x(R1.c cVar, Q1.a aVar) {
        U1.f.b(cVar);
        if (!this.f7626R) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Q1.c cVarV = v(new Object(), cVar, null, this.f7621L, aVar.f3949u, aVar.f3952x, aVar.f3951w, aVar);
        Q1.c cVarI = cVar.i();
        if (cVarV.b(cVarI) && (aVar.f3950v || !cVarI.k())) {
            U1.f.c(cVarI, "Argument must not be null");
            if (cVarI.isRunning()) {
                return;
            }
            cVarI.i();
            return;
        }
        this.f7618I.l(cVar);
        cVar.f(cVarV);
        l lVar = this.f7618I;
        synchronized (lVar) {
            lVar.f7637x.f3315s.add(cVar);
            p195u1.b bVar = lVar.f7635v;
            ((Set) bVar.f15290u).add(cVarV);
            if (bVar.f15289t) {
                cVarV.clear();
                Log.isLoggable("RequestTracker", 2);
                ((HashSet) bVar.f15291v).add(cVarV);
            } else {
                cVarV.i();
            }
        }
    }

    public final void y(ImageView imageView) {
        Q1.a aVarH;
        R1.c aVar;
        n.a();
        U1.f.b(imageView);
        if (!Q1.a.f(this.f3947s, 2048) && imageView.getScaleType() != null) {
            switch (i.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarH = clone().h(H1.m.f1876d, new H1.h());
                    break;
                case 2:
                    aVarH = clone().h(H1.m.f1875c, new H1.i());
                    aVarH.f3945F = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVarH = clone().h(H1.m.f1874b, new t());
                    aVarH.f3945F = true;
                    break;
                case 6:
                    aVarH = clone().h(H1.m.f1875c, new H1.i());
                    aVarH.f3945F = true;
                    break;
                default:
                    aVarH = this;
                    break;
            }
        } else {
            aVarH = this;
        }
        this.f7620K.f7596c.getClass();
        Class cls = this.f7619J;
        if (Bitmap.class.equals(cls)) {
            aVar = new R1.a(imageView, 0);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            aVar = new R1.a(imageView, 1);
        }
        x(aVar, aVarH);
    }

    public final j z(G4.i iVar) {
        if (this.f3944E) {
            return clone().z(iVar);
        }
        this.f7623N = null;
        return t(iVar);
    }
}
