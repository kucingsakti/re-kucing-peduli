package e2;

import A9.AbstractC0151y;
import C3.d;
import K0.o;
import L8.AbstractC0287v;
import L8.D;
import L8.G;
import L8.InterfaceC0271e;
import L8.InterfaceC0290y;
import L8.M;
import Q3.u0;
import android.database.Cursor;
import com.tonyodev.fetch2.database.DownloadDatabase_Impl;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import p047e9.C0618j;
import p047e9.X;
import p047e9.e0;
import p067g9.h;
import p076h8.m;
import p086i8.AbstractC0665d;
import p086i8.C;
import p086i8.s;
import p096j9.f;
import p112l7.j;
import p140o4.r;
import p210v8.i;
import p210v8.k;
import p220w9.e;
import p220w9.g;
import p230x9.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f10701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10702t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i10) {
        super(1);
        this.f10701s = i10;
        this.f10702t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    @Override // p200u8.b
    public final Object invoke(Object obj) {
        o oVar;
        Object next;
        D d3;
        V3.b bVarA;
        c cVar;
        f fVarI;
        InterfaceC0271e interfaceC0271eA;
        switch (this.f10701s) {
            case 0:
                List list = (List) obj;
                i.f(list, "it");
                int iIntValue = ((Number) list.get(0)).intValue() + 1;
                B8.c cVar2 = new B8.c(iIntValue, ((Number) list.get(1)).intValue() - 1, 1);
                return cVar2.isEmpty() ? s.f12328s : p086i8.k.s0(((ArrayList) this.f10702t).subList(iIntValue, cVar2.f770t + 1));
            case 1:
                Throwable th = (Throwable) obj;
                p050f1.k kVar = (p050f1.k) this.f10702t;
                if (th == null) {
                    if (!kVar.f11415s.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    kVar.f11415s.cancel(true);
                } else {
                    p157q1.k kVar2 = kVar.f11415s;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    kVar2.k(th);
                }
                return m.a;
            case 2:
                ((d) this.f10702t).cancel(false);
                return m.a;
            case 3:
                j jVar = (j) obj;
                i.g(jVar, "it");
                if (!jVar.f12966b) {
                    p085i7.f fVar = (p085i7.f) this.f10702t;
                    fVar.j();
                    r rVarQ = fVar.f12295u.q();
                    Object obj2 = rVarQ.f13783u;
                    o oVarC = o.c(0, "SELECT * FROM requests");
                    DownloadDatabase_Impl downloadDatabase_Impl = (DownloadDatabase_Impl) rVarQ.f13782t;
                    downloadDatabase_Impl.b();
                    Cursor cursorM = downloadDatabase_Impl.m(oVarC);
                    try {
                        int iE = u0.e(cursorM, "_id");
                        int iE2 = u0.e(cursorM, "_namespace");
                        int iE3 = u0.e(cursorM, "_url");
                        int iE4 = u0.e(cursorM, "_file");
                        int iE5 = u0.e(cursorM, "_group");
                        int iE6 = u0.e(cursorM, "_priority");
                        int iE7 = u0.e(cursorM, "_headers");
                        int iE8 = u0.e(cursorM, "_written_bytes");
                        int iE9 = u0.e(cursorM, "_total_bytes");
                        int iE10 = u0.e(cursorM, "_status");
                        int iE11 = u0.e(cursorM, "_error");
                        oVar = oVarC;
                        try {
                            int iE12 = u0.e(cursorM, "_network_type");
                            int iE13 = u0.e(cursorM, "_created");
                            int iE14 = u0.e(cursorM, "_tag");
                            int iE15 = u0.e(cursorM, "_enqueue_action");
                            int iE16 = u0.e(cursorM, "_identifier");
                            int iE17 = u0.e(cursorM, "_download_on_enqueue");
                            int iE18 = u0.e(cursorM, "_extras");
                            int iE19 = u0.e(cursorM, "_auto_retry_max_attempts");
                            int iE20 = u0.e(cursorM, "_auto_retry_attempts");
                            int i10 = iE14;
                            ArrayList arrayList = new ArrayList(cursorM.getCount());
                            while (cursorM.moveToNext()) {
                                DownloadInfo downloadInfo = new DownloadInfo();
                                ArrayList arrayList2 = arrayList;
                                downloadInfo.f10360s = cursorM.getInt(iE);
                                downloadInfo.g(cursorM.getString(iE2));
                                downloadInfo.i(cursorM.getString(iE3));
                                downloadInfo.f(cursorM.getString(iE4));
                                downloadInfo.f10364w = cursorM.getInt(iE5);
                                downloadInfo.f10365x = K3.d.s(cursorM.getInt(iE6));
                                downloadInfo.f10366y = K3.d.q(cursorM.getString(iE7));
                                int i11 = iE;
                                int i12 = iE2;
                                downloadInfo.f10367z = cursorM.getLong(iE8);
                                downloadInfo.f10346A = cursorM.getLong(iE9);
                                downloadInfo.f10347B = K3.d.t(cursorM.getInt(iE10));
                                downloadInfo.f10348C = K3.d.m(cursorM.getInt(iE11));
                                downloadInfo.f10349D = K3.d.r(cursorM.getInt(iE12));
                                downloadInfo.f10350E = cursorM.getLong(iE13);
                                int i13 = i10;
                                downloadInfo.f10351F = cursorM.getString(i13);
                                int i14 = iE15;
                                int i15 = iE13;
                                downloadInfo.f10352G = K3.d.f(cursorM.getInt(i14));
                                int i16 = iE11;
                                int i17 = iE16;
                                downloadInfo.f10353H = cursorM.getLong(i17);
                                int i18 = iE17;
                                downloadInfo.f10354I = cursorM.getInt(i18) != 0;
                                int i19 = iE18;
                                downloadInfo.f10355J = K3.d.o(cursorM.getString(i19));
                                iE17 = i18;
                                int i20 = iE19;
                                downloadInfo.f10356K = cursorM.getInt(i20);
                                iE19 = i20;
                                int i21 = iE20;
                                downloadInfo.f10357L = cursorM.getInt(i21);
                                arrayList2.add(downloadInfo);
                                iE20 = i21;
                                arrayList = arrayList2;
                                iE13 = i15;
                                i10 = i13;
                                iE = i11;
                                iE16 = i17;
                                iE18 = i19;
                                iE11 = i16;
                                iE15 = i14;
                                iE2 = i12;
                            }
                            ArrayList arrayList3 = arrayList;
                            cursorM.close();
                            oVar.g();
                            fVar.h(arrayList3, false);
                            fVar.h(arrayList3, true);
                            jVar.f12966b = true;
                        } catch (Throwable th2) {
                            th = th2;
                            cursorM.close();
                            oVar.g();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        oVar = oVarC;
                    }
                }
                return m.a;
            case 4:
                return obj == ((AbstractC0665d) this.f10702t) ? "(this Collection)" : String.valueOf(obj);
            case 5:
                i.e(obj, "it");
                ((J9.i) this.f10702t).add(obj);
                return m.a;
            case 6:
                InterfaceC0290y interfaceC0290y = (InterfaceC0290y) obj;
                i.f(interfaceC0290y, "it");
                return interfaceC0290y.s().q((I8.k) this.f10702t);
            case 7:
                i.f((InterfaceC0290y) obj, "it");
                return (AbstractC0151y) this.f10702t;
            case 8:
                Y1.a aVar = (Y1.a) obj;
                i.f(aVar, C.a(C.c("1267A7DC06F1")));
                r rVar = (r) this.f10702t;
                rVar.f13783u = aVar;
                ((CountDownLatch) rVar.f13784v).countDown();
                return m.a;
            case 9:
                p096j9.c cVar3 = (p096j9.c) obj;
                i.f(cVar3, "fqName");
                K8.o oVar2 = (K8.o) this.f10702t;
                c cVarC = oVar2.c(cVar3);
                if (cVarC == null) {
                    return null;
                }
                I4.c cVar4 = oVar2.f2667c;
                if (cVar4 != null) {
                    cVarC.a1(cVar4);
                    return cVarC;
                }
                i.n("components");
                throw null;
            case 10:
                p220w9.f fVar2 = (p220w9.f) obj;
                i.f(fVar2, "key");
                g gVar = (g) this.f10702t;
                gVar.getClass();
                I4.c cVar5 = gVar.a;
                Iterator it = ((Iterable) cVar5.f2087k).iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    p096j9.b bVar = fVar2.a;
                    if (!zHasNext) {
                        if (g.f15657c.contains(bVar)) {
                            return null;
                        }
                        p220w9.d dVarA = fVar2.f15656b;
                        if (dVarA == null && (dVarA = ((e) cVar5.f2081d).a(bVar)) == null) {
                            return null;
                        }
                        p096j9.b bVarF = bVar.f();
                        p067g9.a aVar2 = dVarA.f15654c;
                        p067g9.f fVar3 = dVarA.a;
                        C0618j c0618j = dVarA.f15653b;
                        if (bVarF != null) {
                            InterfaceC0271e interfaceC0271eA2 = gVar.a(bVarF, null);
                            p238y9.g gVar2 = interfaceC0271eA2 instanceof p238y9.g ? (p238y9.g) interfaceC0271eA2 : null;
                            if (gVar2 == null) {
                                return null;
                            }
                            f fVarI2 = bVar.i();
                            i.e(fVarI2, "classId.shortClassName");
                            if (!gVar2.l().m().contains(fVarI2)) {
                                return null;
                            }
                            bVarA = gVar2.f16067D;
                        } else {
                            p096j9.c cVarG = bVar.g();
                            i.e(cVarG, "classId.packageFqName");
                            Iterator it2 = AbstractC0287v.i((G) cVar5.f2083f, cVarG).iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    D d8 = (D) next;
                                    if (d8 instanceof c) {
                                        cVar = (c) d8;
                                        fVarI = bVar.i();
                                        i.e(fVarI, "classId.shortClassName");
                                        cVar.getClass();
                                    }
                                } else {
                                    next = null;
                                }
                                d3 = (D) next;
                                if (d3 == null) {
                                    return null;
                                }
                                X x8 = c0618j.f11120W;
                                i.e(x8, "classProto.typeTable");
                                p067g9.g gVar3 = new p067g9.g(x8);
                                h hVar = h.f11586b;
                                e0 e0Var = c0618j.f11122Y;
                                i.e(e0Var, "classProto.versionRequirementTable");
                                bVarA = gVar.a.a(d3, fVar3, gVar3, C3.b.h(e0Var), aVar2, null);
                                aVar2 = aVar2;
                            } while (!((p238y9.m) cVar.E0()).m().contains(fVarI));
                            d3 = (D) next;
                            if (d3 == null) {
                                return null;
                            }
                            X x10 = c0618j.f11120W;
                            i.e(x10, "classProto.typeTable");
                            p067g9.g gVar4 = new p067g9.g(x10);
                            h hVar2 = h.f11586b;
                            e0 e0Var2 = c0618j.f11122Y;
                            i.e(e0Var2, "classProto.versionRequirementTable");
                            bVarA = gVar.a.a(d3, fVar3, gVar4, C3.b.h(e0Var2), aVar2, null);
                            aVar2 = aVar2;
                        }
                        return new p238y9.g(bVarA, c0618j, fVar3, aVar2, dVarA.f15655d);
                    }
                    interfaceC0271eA = ((N8.c) it.next()).a(bVar);
                } while (interfaceC0271eA == null);
                return interfaceC0271eA;
            default:
                i.f((p096j9.b) obj, "it");
                ((c) this.f10702t).getClass();
                return M.a;
        }
    }
}
