package E0;

import A9.AbstractC0151y;
import C8.u;
import D9.c;
import E4.F;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.M;
import L9.n;
import N9.AbstractC0342z;
import N9.C0333p;
import N9.D;
import N9.Y;
import N9.z0;
import O3.y;
import O8.C0363t;
import O8.N;
import O9.d;
import P9.g;
import P9.i;
import Q3.u0;
import R8.AbstractC0408c;
import R8.t;
import U8.C0442c;
import U8.EnumC0440a;
import V.h;
import Y8.C0477f;
import Y8.j;
import Y8.o;
import Y8.p;
import Y8.r;
import Y8.s;
import Y8.v;
import Y8.w;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.kcstream.cing.activity.SearchActivity;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import p019b9.e;
import p039e0.l;
import p047e9.C0627t;
import p076h8.m;
import p086i8.C;
import p096j9.f;
import p210v8.k;
import y0.B;
import y0.C0864b;
import y0.C0872j;
import y0.C0873k;
import y0.C0874l;
import y0.E;
import y0.O;
import y0.x;
import y0.z;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1289u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i10, Object obj2) {
        super(1);
        this.f1287s = i10;
        this.f1288t = obj;
        this.f1289u = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:106:0x0241  */
    /* JADX WARN: Code duplicated, block: B:109:0x0246  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:112:0x024e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0252  */
    /* JADX WARN: Code duplicated, block: B:115:0x025a  */
    /* JADX WARN: Code duplicated, block: B:120:0x026a A[LOOP:5: B:67:0x0187->B:120:0x026a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:322:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:? A[LOOP:3: B:55:0x0159->B:323:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[LOOP:4: B:59:0x0166->B:325:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[LOOP:7: B:145:0x02f2->B:336:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0159 A[LOOP:3: B:55:0x0159->B:323:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x016f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01df  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0202  */
    /* JADX WARN: Code duplicated, block: B:84:0x0204  */
    /* JADX WARN: Code duplicated, block: B:89:0x0212  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    /* JADX WARN: Code duplicated, block: B:92:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x0228  */
    /* JADX WARN: Code duplicated, block: B:98:0x0230  */
    @Override // p200u8.b
    public final Object invoke(Object obj) throws Throwable {
        h hVarI;
        InterfaceC0271e interfaceC0271eA;
        Q8.b bVarI;
        e eVar;
        c cVar;
        boolean z6;
        InterfaceC0273g interfaceC0273gW;
        Object objC;
        ArrayList arrayListA;
        Iterator it;
        String str;
        boolean z10;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        long j10;
        long j11;
        P9.a aVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long j12;
        long j13;
        long j14;
        g gVar;
        Object obj2;
        i iVar;
        Object fVar;
        long andIncrement;
        boolean z11;
        long j15;
        int i10;
        i iVar2;
        i iVar3;
        z0 z0Var;
        i iVarI;
        m mVar;
        l lVar;
        m mVar2;
        Throwable cancellationException;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj3;
        y yVar;
        x xVar;
        x xVarF;
        int i11 = 2;
        boolean z12 = true;
        switch (this.f1287s) {
            case 0:
                Throwable th = (Throwable) obj;
                p231y.i iVar4 = (p231y.i) this.f1288t;
                if (th == null) {
                    Object objY = ((D) this.f1289u).y();
                    if (objY instanceof Y) {
                        throw new IllegalStateException("This job has not completed yet");
                    }
                    if (objY instanceof C0333p) {
                        throw ((C0333p) objY).a;
                    }
                    Object objU = AbstractC0342z.u(objY);
                    iVar4.f15826d = true;
                    p231y.k kVar = iVar4.f15824b;
                    if (kVar != null && kVar.f15829t.o(objU)) {
                        iVar4.a = null;
                        iVar4.f15824b = null;
                        iVar4.f15825c = null;
                    }
                } else if (th instanceof CancellationException) {
                    iVar4.f15826d = true;
                    p231y.k kVar2 = iVar4.f15824b;
                    if (kVar2 != null && kVar2.f15829t.cancel(true)) {
                        iVar4.a = null;
                        iVar4.f15824b = null;
                        iVar4.f15825c = null;
                    }
                } else {
                    iVar4.f15826d = true;
                    p231y.k kVar3 = iVar4.f15824b;
                    if (kVar3 != null && kVar3.f15829t.p(th)) {
                        iVar4.a = null;
                        iVar4.f15824b = null;
                        iVar4.f15825c = null;
                    }
                }
                return m.a;
            case 1:
                p210v8.i.f((Ga.b) obj, "it");
                SearchActivity searchActivity = (SearchActivity) this.f1288t;
                int iZ = SearchActivity.z(searchActivity) + 1;
                u[] uVarArr = SearchActivity.f0;
                u uVar = uVarArr[0];
                Integer numValueOf = Integer.valueOf(iZ);
                p081i3.b bVar = searchActivity.f10210X;
                bVar.getClass();
                p210v8.i.f(uVar, "property");
                bVar.f12212t = numValueOf;
                if (SearchActivity.z(searchActivity) < ((Number) searchActivity.f10212Z.y(uVarArr[1], searchActivity)).intValue()) {
                    String str2 = (String) this.f1289u;
                    ((RelativeLayout) searchActivity.A().f2070c).setVisibility(8);
                    AbstractC0342z.n(searchActivity, null, new F(searchActivity, str2, null), 3);
                } else {
                    Ca.b bVar2 = searchActivity.f10216e0;
                    if (bVar2 == null) {
                        p210v8.i.n("getSearch");
                        throw null;
                    }
                    bVar2.f1022k = false;
                    int iA = bVar2.a();
                    bVar2.f1026d = bVar2.f1031i.size();
                    bVar2.a.c(iA, 1, null);
                }
                return m.a;
            case 2:
                ((d) this.f1288t).f3802t.removeCallbacks((C3.c) this.f1289u);
                return m.a;
            case 3:
                f fVar2 = (f) obj;
                p210v8.i.f(fVar2, "accessorName");
                N n10 = (N) this.f1288t;
                if (p210v8.i.a(n10.getName(), fVar2)) {
                    return com.bumptech.glide.d.u(n10);
                }
                p pVar = (p) this.f1289u;
                return p086i8.k.g0(p.v(pVar, fVar2), p.w(pVar, fVar2));
            case 4:
                f fVar3 = (f) obj;
                p210v8.i.f(fVar3, MediationMetaData.KEY_NAME);
                p pVar2 = (p) this.f1288t;
                boolean zContains = ((Set) pVar2.f5790r.invoke()).contains(fVar3);
                Fa.e eVar2 = (Fa.e) this.f1289u;
                InterfaceC0271e interfaceC0271e = pVar2.f5786n;
                if (zContains) {
                    I4.a aVar2 = (I4.a) eVar2.f1659t;
                    p096j9.b bVarF = p165q9.d.f(interfaceC0271e);
                    p210v8.i.c(bVarF);
                    p096j9.b bVarD = bVarF.d(fVar3);
                    P0.d dVar = (P0.d) aVar2.f2047b;
                    dVar.getClass();
                    p096j9.c cVarG = bVarD.g();
                    p210v8.i.e(cVarG, "classId.packageFqName");
                    String strF = n.F(bVarD.h().b(), '.', '$');
                    if (!cVarG.d()) {
                        strF = cVarG.b() + '.' + strF;
                    }
                    Class clsA = C.A((ClassLoader) dVar.f3811t, strF);
                    R8.n nVar = clsA != null ? new R8.n(clsA) : null;
                    if (nVar != null) {
                        j jVar = new j(eVar2, interfaceC0271e, nVar, null);
                        ((U8.m) ((I4.a) eVar2.f1659t).f2063s).getClass();
                        return jVar;
                    }
                } else if (((Set) pVar2.f5791s.invoke()).contains(fVar3)) {
                    p095j8.b bVar3 = new p095j8.b();
                    ((p176r9.a) ((p176r9.e) ((I4.a) eVar2.f1659t).f2068x)).c(eVar2, interfaceC0271e, fVar3, bVar3);
                    p095j8.b bVarA = com.bumptech.glide.d.a(bVar3);
                    int iE = bVarA.e();
                    if (iE != 0) {
                        if (iE == 1) {
                            return (InterfaceC0271e) p086i8.k.k0(bVarA);
                        }
                        throw new IllegalStateException(("Multiple classes with same name are generated: " + bVarA).toString());
                    }
                } else {
                    t tVar = (t) ((Map) pVar2.f5792t.invoke()).get(fVar3);
                    if (tVar != null) {
                        p247z9.l lVar2 = (p247z9.l) ((I4.a) eVar2.f1659t).a;
                        o oVar = new o(pVar2, i11);
                        lVar2.getClass();
                        p247z9.i iVar5 = new p247z9.i(lVar2, oVar);
                        I4.a aVar3 = (I4.a) eVar2.f1659t;
                        return C0363t.l((p247z9.l) aVar3.a, pVar2.f5786n, fVar3, iVar5, u0.k(eVar2, tVar), ((Q8.d) aVar3.j).a(tVar));
                    }
                }
                return null;
            case 5:
                s sVar = (s) obj;
                p210v8.i.f(sVar, "request");
                w wVar = (w) this.f1288t;
                p096j9.b bVar4 = new p096j9.b(wVar.f5808o.f3634w, sVar.a);
                Fa.e eVar3 = (Fa.e) this.f1289u;
                Fa.e eVar4 = wVar.f5713b;
                I4.a aVar4 = (I4.a) eVar3.f1659t;
                R8.n nVar2 = sVar.f5803b;
                if (nVar2 != null) {
                    p210v8.i.f((p220w9.i) ((p029c9.d) ((I4.a) eVar4.f1659t).f2049d).c().f2080c, "<this>");
                    i9.f fVar4 = i9.f.f12337g;
                    p040e1.j jVar2 = (p040e1.j) aVar4.f2048c;
                    jVar2.getClass();
                    p210v8.i.f(fVar4, "jvmMetadataVersion");
                    Class clsA2 = C.A((ClassLoader) jVar2.f10697t, nVar2.c().b());
                    hVarI = (clsA2 == null || (bVarI = p068ga.d.i(clsA2)) == null) ? null : new h(bVarI, 13);
                } else {
                    p210v8.i.f((p220w9.i) ((p029c9.d) ((I4.a) eVar4.f1659t).f2049d).c().f2080c, "<this>");
                    hVarI = ((p040e1.j) aVar4.f2048c).I(bVar4, i9.f.f12337g);
                }
                Q8.b bVar5 = hVarI != null ? (Q8.b) hVarI.f5078t : null;
                p096j9.b bVarA2 = bVar5 != null ? AbstractC0408c.a(bVar5.a) : null;
                if (bVarA2 == null || (bVarA2.f12541b.e().d() && !bVarA2.f12542c)) {
                    xa.d tVar2 = Y8.u.f5805c;
                    if (bVar5 != null) {
                        if (((p037d9.a) bVar5.f4340b.f665b) == p037d9.a.CLASS) {
                            p029c9.d dVar2 = (p029c9.d) ((I4.a) eVar4.f1659t).f2049d;
                            dVar2.getClass();
                            p220w9.d dVarF = dVar2.f(bVar5);
                            if (dVarF == null) {
                                interfaceC0271eA = null;
                            } else {
                                interfaceC0271eA = ((p220w9.g) dVar2.c().f2096t).a(AbstractC0408c.a(bVar5.a), dVarF);
                            }
                            if (interfaceC0271eA != null) {
                                tVar2 = new Y8.t(interfaceC0271eA);
                            }
                        } else {
                            tVar2 = v.f5806c;
                        }
                    }
                    if (tVar2 instanceof Y8.t) {
                        return ((Y8.t) tVar2).f5804c;
                    }
                    if (!(tVar2 instanceof v)) {
                        if (!(tVar2 instanceof Y8.u)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (nVar2 == null) {
                            P0.d dVar3 = (P0.d) aVar4.f2047b;
                            dVar3.getClass();
                            p096j9.c cVarG2 = bVar4.g();
                            p210v8.i.e(cVarG2, "classId.packageFqName");
                            String strF2 = n.F(bVar4.h().b(), '.', '$');
                            if (!cVarG2.d()) {
                                strF2 = cVarG2.b() + '.' + strF2;
                            }
                            Class clsA3 = C.A((ClassLoader) dVar3.f3811t, strF2);
                            nVar2 = clsA3 != null ? new R8.n(clsA3) : null;
                        }
                        p096j9.c cVarC = nVar2 != null ? nVar2.c() : null;
                        if (cVarC != null && !cVarC.d()) {
                            p096j9.c cVarE = cVarC.e();
                            r rVar = wVar.f5808o;
                            if (p210v8.i.a(cVarE, rVar.f3634w)) {
                                j jVar3 = new j(eVar3, rVar, nVar2, null);
                                ((U8.m) aVar4.f2063s).getClass();
                                return jVar3;
                            }
                        }
                    }
                }
                return null;
            case 6:
                p210v8.i.f((IOException) obj, "it");
                Z9.g gVar2 = (Z9.g) this.f1288t;
                K0.g gVar3 = (K0.g) this.f1289u;
                synchronized (gVar2) {
                    gVar3.e();
                }
                return m.a;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                p019b9.p pVar3 = (p019b9.p) this.f1288t;
                if (pVar3 != null && (eVar = (e) pVar3.a.get(Integer.valueOf(iIntValue))) != null) {
                    return eVar;
                }
                if (iIntValue >= 0) {
                    e[] eVarArr = (e[]) this.f1289u;
                    if (iIntValue <= eVarArr.length - 1) {
                        return eVarArr[iIntValue];
                    }
                }
                return e.f7325e;
            case 8:
                p210v8.i.f(obj, "$this$extractNullability");
                p019b9.a aVar5 = (p019b9.a) this.f1289u;
                O0.a aVar6 = (O0.a) this.f1288t;
                M8.b bVar6 = (M8.b) obj;
                if (bVar6 instanceof W8.h) {
                }
                boolean z13 = bVar6 instanceof C0477f;
                Fa.e eVar5 = (Fa.e) aVar6.f3506d;
                if (z13) {
                    ((X8.a) ((I4.a) eVar5.f1659t).f2064t).getClass();
                    if (!((C0477f) bVar6).f5750g) {
                        if (((EnumC0440a) aVar6.f3507e) != EnumC0440a.TYPE_PARAMETER_BOUNDS) {
                            cVar = aVar5.a;
                            if (cVar != null) {
                                f fVar5 = I8.i.f2112e;
                                interfaceC0273gW = ((AbstractC0151y) cVar).D().w();
                                if (interfaceC0273gW != null && I8.i.r(interfaceC0273gW) != null) {
                                    ((C0442c) ((I4.a) eVar5.f1659t).f2061q).getClass();
                                    objC = C0442c.c(bVar6, I8.n.f2182t);
                                    if (objC != null) {
                                        arrayListA = C0442c.a(objC, false);
                                        if (!arrayListA.isEmpty()) {
                                            it = arrayListA.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    str = (String) it.next();
                                                    HashMap map = M8.n.f3239t;
                                                    if (p210v8.i.a(str, "TYPE")) {
                                                        ((X8.a) ((I4.a) eVar5.f1659t).f2064t).getClass();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z6 = false;
                        }
                    }
                    z6 = true;
                } else {
                    cVar = aVar5.a;
                    if (cVar != null) {
                        f fVar6 = I8.i.f2112e;
                        interfaceC0273gW = ((AbstractC0151y) cVar).D().w();
                        if (interfaceC0273gW != null) {
                            ((C0442c) ((I4.a) eVar5.f1659t).f2061q).getClass();
                            objC = C0442c.c(bVar6, I8.n.f2182t);
                            if (objC != null) {
                                arrayListA = C0442c.a(objC, false);
                                if (!arrayListA.isEmpty()) {
                                    it = arrayListA.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            str = (String) it.next();
                                            HashMap map2 = M8.n.f3239t;
                                            if (p210v8.i.a(str, "TYPE")) {
                                                ((X8.a) ((I4.a) eVar5.f1659t).f2064t).getClass();
                                                z6 = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 9:
                Throwable th2 = (Throwable) obj;
                ((A0.m) this.f1288t).invoke(th2);
                o1.m mVar3 = (o1.m) this.f1289u;
                P9.a aVar7 = (P9.a) mVar3.f13643u;
                aVar7.getClass();
                y yVar2 = P9.c.f3927r;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = P9.a.j;
                    if (atomicReferenceFieldUpdater2.compareAndSet(aVar7, yVar2, th2)) {
                        z10 = true;
                    } else if (atomicReferenceFieldUpdater2.get(aVar7) != yVar2) {
                        z10 = false;
                    }
                }
                do {
                    atomicLongFieldUpdater = P9.a.f3902c;
                    j = atomicLongFieldUpdater.get(aVar7);
                    int i12 = (int) (j >> 60);
                    j10 = 1152921504606846975L;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            j11 = (((long) 3) << 60) + (j & 1152921504606846975L);
                        }
                        aVar7.f();
                        if (z10) {
                            while (true) {
                                atomicReferenceFieldUpdater = P9.a.f3909k;
                                obj3 = atomicReferenceFieldUpdater.get(aVar7);
                                if (obj3 == null) {
                                    yVar = P9.c.f3925p;
                                } else {
                                    yVar = P9.c.f3926q;
                                }
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(aVar7, obj3, yVar)) {
                                        if (obj3 != null) {
                                            p210v8.x.e(1, obj3);
                                            ((p200u8.b) obj3).invoke((Throwable) P9.a.j.get(aVar7));
                                        }
                                    } else if (atomicReferenceFieldUpdater.get(aVar7) != obj3) {
                                    }
                                }
                            }
                        }
                        while (true) {
                            aVar = (P9.a) mVar3.f13643u;
                            aVar.getClass();
                            atomicLongFieldUpdater2 = P9.a.f3903d;
                            j12 = atomicLongFieldUpdater2.get(aVar);
                            j13 = P9.a.f3902c.get(aVar);
                            if (aVar.m(j13, z12)) {
                                fVar = new P9.f((Throwable) P9.a.j.get(aVar));
                            } else {
                                j14 = j13 & j10;
                                gVar = P9.h.a;
                                if (j12 >= j14) {
                                    fVar = gVar;
                                } else {
                                    obj2 = P9.c.f3920k;
                                    iVar = (i) P9.a.f3907h.get(aVar);
                                    while (true) {
                                        if (aVar.m(P9.a.f3902c.get(aVar), z12)) {
                                            fVar = new P9.f((Throwable) P9.a.j.get(aVar));
                                        } else {
                                            andIncrement = atomicLongFieldUpdater2.getAndIncrement(aVar);
                                            long j16 = P9.c.f3912b;
                                            z11 = z12;
                                            j15 = andIncrement / j16;
                                            i10 = (int) (andIncrement % j16);
                                            if (iVar.f4577u != j15) {
                                                iVarI = aVar.i(j15, iVar);
                                                if (iVarI == null) {
                                                    continue;
                                                } else {
                                                    iVar2 = iVarI;
                                                }
                                                z12 = z11;
                                            } else {
                                                iVar2 = iVar;
                                            }
                                            fVar = aVar.u(iVar2, i10, andIncrement, obj2);
                                            iVar3 = iVar2;
                                            if (fVar == P9.c.f3922m) {
                                                if (obj2 instanceof z0) {
                                                    z0Var = (z0) obj2;
                                                } else {
                                                    z0Var = null;
                                                }
                                                if (z0Var != null) {
                                                    z0Var.a(iVar3, i10);
                                                }
                                                aVar.w(andIncrement);
                                                iVar3.h();
                                                fVar = gVar;
                                            } else if (fVar == P9.c.f3924o) {
                                                if (andIncrement < aVar.k()) {
                                                    iVar3.a();
                                                }
                                                iVar = iVar3;
                                                z12 = z11;
                                            } else {
                                                if (fVar != P9.c.f3923n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                iVar3.a();
                                            }
                                        }
                                    }
                                    if (fVar instanceof g) {
                                        fVar = null;
                                    }
                                    mVar = m.a;
                                    if (fVar == null) {
                                        mVar2 = null;
                                    } else {
                                        lVar = (l) fVar;
                                        if (lVar instanceof p039e0.k) {
                                            p039e0.k kVar4 = (p039e0.k) lVar;
                                            if (th2 == null) {
                                                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                                            } else {
                                                cancellationException = th2;
                                            }
                                            kVar4.f10626b.F(new C0333p(cancellationException, false));
                                        }
                                        mVar2 = mVar;
                                    }
                                    if (mVar2 == null) {
                                        return mVar;
                                    }
                                    z12 = z11;
                                    j10 = 1152921504606846975L;
                                }
                            }
                            z11 = z12;
                            if (fVar instanceof g) {
                                fVar = null;
                            }
                            mVar = m.a;
                            if (fVar == null) {
                                mVar2 = null;
                            } else {
                                lVar = (l) fVar;
                                if (lVar instanceof p039e0.k) {
                                    p039e0.k kVar5 = (p039e0.k) lVar;
                                    if (th2 == null) {
                                        cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                                    } else {
                                        cancellationException = th2;
                                    }
                                    kVar5.f10626b.F(new C0333p(cancellationException, false));
                                }
                                mVar2 = mVar;
                            }
                            if (mVar2 == null) {
                                return mVar;
                            }
                            z12 = z11;
                            j10 = 1152921504606846975L;
                        }
                    } else {
                        j11 = (j & 1152921504606846975L) + (((long) 2) << 60);
                        atomicLongFieldUpdater = atomicLongFieldUpdater;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(aVar7, j, j11));
                aVar7.f();
                if (z10) {
                    while (true) {
                        atomicReferenceFieldUpdater = P9.a.f3909k;
                        obj3 = atomicReferenceFieldUpdater.get(aVar7);
                        if (obj3 == null) {
                            yVar = P9.c.f3925p;
                        } else {
                            yVar = P9.c.f3926q;
                        }
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(aVar7, obj3, yVar)) {
                                if (obj3 != null) {
                                    p210v8.x.e(1, obj3);
                                    ((p200u8.b) obj3).invoke((Throwable) P9.a.j.get(aVar7));
                                }
                            } else if (atomicReferenceFieldUpdater.get(aVar7) != obj3) {
                            }
                        }
                    }
                }
                while (true) {
                    aVar = (P9.a) mVar3.f13643u;
                    aVar.getClass();
                    atomicLongFieldUpdater2 = P9.a.f3903d;
                    j12 = atomicLongFieldUpdater2.get(aVar);
                    j13 = P9.a.f3902c.get(aVar);
                    if (aVar.m(j13, z12)) {
                        fVar = new P9.f((Throwable) P9.a.j.get(aVar));
                    } else {
                        j14 = j13 & j10;
                        gVar = P9.h.a;
                        if (j12 >= j14) {
                            fVar = gVar;
                        } else {
                            obj2 = P9.c.f3920k;
                            iVar = (i) P9.a.f3907h.get(aVar);
                            while (true) {
                                if (aVar.m(P9.a.f3902c.get(aVar), z12)) {
                                    fVar = new P9.f((Throwable) P9.a.j.get(aVar));
                                } else {
                                    andIncrement = atomicLongFieldUpdater2.getAndIncrement(aVar);
                                    long j17 = P9.c.f3912b;
                                    z11 = z12;
                                    j15 = andIncrement / j17;
                                    i10 = (int) (andIncrement % j17);
                                    if (iVar.f4577u != j15) {
                                        iVarI = aVar.i(j15, iVar);
                                        if (iVarI == null) {
                                            continue;
                                        } else {
                                            iVar2 = iVarI;
                                        }
                                        z12 = z11;
                                    } else {
                                        iVar2 = iVar;
                                    }
                                    fVar = aVar.u(iVar2, i10, andIncrement, obj2);
                                    iVar3 = iVar2;
                                    if (fVar == P9.c.f3922m) {
                                        if (obj2 instanceof z0) {
                                            z0Var = (z0) obj2;
                                        } else {
                                            z0Var = null;
                                        }
                                        if (z0Var != null) {
                                            z0Var.a(iVar3, i10);
                                        }
                                        aVar.w(andIncrement);
                                        iVar3.h();
                                        fVar = gVar;
                                    } else if (fVar == P9.c.f3924o) {
                                        if (andIncrement < aVar.k()) {
                                            iVar3.a();
                                        }
                                        iVar = iVar3;
                                        z12 = z11;
                                    } else {
                                        if (fVar != P9.c.f3923n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        iVar3.a();
                                    }
                                }
                            }
                            if (fVar instanceof g) {
                                fVar = null;
                            }
                            mVar = m.a;
                            if (fVar == null) {
                                mVar2 = null;
                            } else {
                                lVar = (l) fVar;
                                if (lVar instanceof p039e0.k) {
                                    p039e0.k kVar6 = (p039e0.k) lVar;
                                    if (th2 == null) {
                                        cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                                    } else {
                                        cancellationException = th2;
                                    }
                                    kVar6.f10626b.F(new C0333p(cancellationException, false));
                                }
                                mVar2 = mVar;
                            }
                            if (mVar2 == null) {
                                return mVar;
                            }
                            z12 = z11;
                            j10 = 1152921504606846975L;
                        }
                    }
                    z11 = z12;
                    if (fVar instanceof g) {
                        fVar = null;
                    }
                    mVar = m.a;
                    if (fVar == null) {
                        mVar2 = null;
                    } else {
                        lVar = (l) fVar;
                        if (lVar instanceof p039e0.k) {
                            p039e0.k kVar7 = (p039e0.k) lVar;
                            if (th2 == null) {
                                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                cancellationException = th2;
                            }
                            kVar7.f10626b.F(new C0333p(cancellationException, false));
                        }
                        mVar2 = mVar;
                    }
                    if (mVar2 == null) {
                        return mVar;
                    }
                    z12 = z11;
                    j10 = 1152921504606846975L;
                }
                break;
            case 10:
                E e10 = (E) obj;
                p210v8.i.f(e10, "$this$navOptions");
                U.r rVar2 = e10.a;
                rVar2.a = 0;
                rVar2.f4845b = 0;
                x xVar2 = (x) this.f1288t;
                if (xVar2 instanceof z) {
                    int i13 = x.f15993B;
                    Iterator it2 = K9.n.x(xVar2, C0864b.f15900A).iterator();
                    do {
                        boolean zHasNext = it2.hasNext();
                        B b3 = (B) this.f1289u;
                        if (zHasNext) {
                            xVar = (x) it2.next();
                            xVarF = b3.f();
                        } else {
                            int i14 = z.f16006F;
                            e10.f15870d = p068ga.l.e(b3.h()).f16002z;
                            e10.f15871e = true;
                        }
                    } while (!p210v8.i.a(xVar, xVarF != null ? xVarF.f15996t : null));
                }
                return m.a;
            case 11:
                C0872j c0872j = (C0872j) obj;
                p210v8.i.f(c0872j, "backStackEntry");
                x xVar3 = c0872j.f15928t;
                if (!(xVar3 instanceof x)) {
                    xVar3 = null;
                }
                if (xVar3 != null) {
                    Bundle bundleB = c0872j.b();
                    y0.D d3 = (y0.D) this.f1289u;
                    O o10 = (O) this.f1288t;
                    x xVarC = o10.c(xVar3, bundleB, d3);
                    if (xVarC != null) {
                        if (xVarC.equals(xVar3)) {
                            return c0872j;
                        }
                        C0874l c0874lB = o10.b();
                        Bundle bundleE = xVarC.e(c0872j.b());
                        B b7 = c0874lB.f15944h;
                        return p204v1.g.l(b7.a, xVarC, bundleE, b7.i(), b7.f15846o);
                    }
                }
                return null;
            default:
                f fVar7 = (f) obj;
                p210v8.i.f(fVar7, MediationMetaData.KEY_NAME);
                o1.h hVar = (o1.h) this.f1288t;
                C0627t c0627t = (C0627t) ((LinkedHashMap) hVar.f13632s).get(fVar7);
                if (c0627t == null) {
                    return null;
                }
                p238y9.g gVar4 = (p238y9.g) this.f1289u;
                return C0363t.l((p247z9.l) ((I4.c) gVar4.f16067D.a).a, gVar4, fVar7, (p247z9.i) hVar.f13634u, new p238y9.a((p247z9.l) ((I4.c) gVar4.f16067D.a).a, new C0873k(gVar4, c0627t)), M.a);
        }
    }
}
