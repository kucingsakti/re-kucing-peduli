package p238y9;

import A0.j;
import A0.m;
import A9.D;
import I4.c;
import J9.l;
import K9.a;
import K9.n;
import L8.C0280n;
import L8.InterfaceC0276j;
import M8.g;
import M8.h;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p.b1;
import p047e9.C0609a;
import p047e9.C0615g;
import p047e9.C0632y;
import p047e9.G;
import p047e9.Q;
import p047e9.T;
import p047e9.f0;
import p067g9.e;
import p086i8.s;
import p096j9.f;
import p104k9.C0678g;
import p200u8.b;
import p210v8.i;
import p220w9.q;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p210v8.k implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16086s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f16087t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, int i10) {
        super(1);
        this.f16086s = i10;
        this.f16087t = lVar;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        Collection<C0632y> collectionB;
        Collection<G> collectionB2;
        Q qA;
        Q qA2;
        switch (this.f16086s) {
            case 0:
                f fVar = (f) obj;
                i.f(fVar, "it");
                l lVar = this.f16087t;
                LinkedHashMap linkedHashMap = lVar.a;
                C0609a c0609a = C0632y.f11230N;
                i.e(c0609a, "PARSER");
                byte[] bArr = (byte[]) linkedHashMap.get(fVar);
                m mVar = lVar.f16095i;
                if (bArr != null) {
                    j jVar = new j(c0609a, new ByteArrayInputStream(bArr), mVar, 14);
                    collectionB = n.B(new a(new K9.k(jVar, new m(jVar, 11))));
                } else {
                    collectionB = s.f12328s;
                }
                ArrayList arrayList = new ArrayList(collectionB.size());
                for (C0632y c0632y : collectionB) {
                    q qVar = (q) mVar.f16097b.f5179i;
                    i.e(c0632y, "it");
                    p pVarE = qVar.e(c0632y);
                    if (!mVar.r(pVarE)) {
                        pVarE = null;
                    }
                    if (pVarE != null) {
                        arrayList.add(pVarE);
                    }
                }
                mVar.j(fVar, arrayList);
                return l.e(arrayList);
            case 1:
                f fVar2 = (f) obj;
                i.f(fVar2, "it");
                l lVar2 = this.f16087t;
                LinkedHashMap linkedHashMap2 = lVar2.f16088b;
                C0609a c0609a2 = G.f10785N;
                i.e(c0609a2, "PARSER");
                byte[] bArr2 = (byte[]) linkedHashMap2.get(fVar2);
                m mVar2 = lVar2.f16095i;
                if (bArr2 != null) {
                    j jVar2 = new j(c0609a2, new ByteArrayInputStream(bArr2), mVar2, 14);
                    collectionB2 = n.B(new a(new K9.k(jVar2, new m(jVar2, 11))));
                } else {
                    collectionB2 = s.f12328s;
                }
                ArrayList arrayList2 = new ArrayList(collectionB2.size());
                for (G g8 : collectionB2) {
                    q qVar2 = (q) mVar2.f16097b.f5179i;
                    i.e(g8, "it");
                    arrayList2.add(qVar2.f(g8));
                }
                mVar2.k(fVar2, arrayList2);
                return l.e(arrayList2);
            default:
                f fVar3 = (f) obj;
                i.f(fVar3, "it");
                l lVar3 = this.f16087t;
                byte[] bArr3 = (byte[]) lVar3.f16089c.get(fVar3);
                if (bArr3 != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr3);
                    m mVar3 = lVar3.f16095i;
                    T t7 = (T) T.f10900H.b(byteArrayInputStream, (C0678g) ((c) mVar3.f16097b.a).f2092p);
                    if (t7 != null) {
                        q qVar3 = (q) mVar3.f16097b.f5179i;
                        qVar3.getClass();
                        List list = t7.f10903C;
                        i.e(list, "proto.annotationList");
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(p086i8.m.H(list2, 10));
                        Iterator it = list2.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            V3.b bVar = qVar3.a;
                            if (!zHasNext) {
                                h iVar = arrayList3.isEmpty() ? g.a : new M8.i(arrayList3, 0);
                                C0280n c0280nI = J7.j.i((f0) e.f11564d.c(t7.f10909v));
                                p247z9.l lVar4 = (p247z9.l) ((c) bVar.a).a;
                                f fVarI = J7.a.i((p067g9.f) bVar.f5172b, t7.f10910w);
                                p067g9.g gVar = (p067g9.g) bVar.f5174d;
                                q qVar4 = new q(lVar4, (InterfaceC0276j) bVar.f5173c, iVar, fVarI, c0280nI, t7, (p067g9.f) bVar.f5172b, gVar, (p067g9.h) bVar.f5175e, (p029c9.f) bVar.f5177g);
                                List list3 = t7.f10911x;
                                i.e(list3, "proto.typeParameterList");
                                b1 b1Var = (b1) bVar.c(qVar4, list3, (p067g9.f) bVar.f5172b, (p067g9.g) bVar.f5174d, (p067g9.h) bVar.f5175e, (p067g9.a) bVar.f5176f).f5178h;
                                List listB = b1Var.b();
                                int i10 = t7.f10908u;
                                if ((i10 & 4) == 4) {
                                    qA = t7.f10912y;
                                    i.e(qA, "underlyingType");
                                } else {
                                    if ((i10 & 8) != 8) {
                                        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                                    }
                                    qA = gVar.a(t7.f10913z);
                                }
                                D dE = b1Var.e(qA, false);
                                int i11 = t7.f10908u;
                                if ((i11 & 16) == 16) {
                                    qA2 = t7.f10901A;
                                    i.e(qA2, "expandedType");
                                } else {
                                    if ((i11 & 32) != 32) {
                                        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                                    }
                                    qA2 = gVar.a(t7.f10902B);
                                }
                                qVar4.c1(listB, dE, b1Var.e(qA2, false));
                                return qVar4;
                            }
                            C0615g c0615g = (C0615g) it.next();
                            i.e(c0615g, "it");
                            arrayList3.add(qVar3.f15684b.h(c0615g, (p067g9.f) bVar.f5172b));
                        }
                    }
                }
                return null;
        }
    }
}
