package p238y9;

import C8.u;
import I4.c;
import J7.j;
import L8.InterfaceC0273g;
import V3.b;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p086i8.p;
import p086i8.s;
import p096j9.f;
import p200u8.a;
import p210v8.n;
import p210v8.v;
import p247z9.h;
import p247z9.i;
import p247z9.l;
import t9.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u[] f16096f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f16098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f16099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f16100e;

    static {
        v vVar = p210v8.u.a;
        f16096f = new u[]{vVar.f(new n(vVar.b(m.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), vVar.f(new n(vVar.b(m.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public m(b bVar, List list, List list2, List list3, a aVar) {
        p210v8.i.f(bVar, "c");
        p210v8.i.f(list, "functionList");
        p210v8.i.f(list2, "propertyList");
        p210v8.i.f(list3, "typeAliasList");
        this.f16097b = bVar;
        c cVar = (c) bVar.a;
        ((p220w9.i) cVar.f2080c).getClass();
        this.f16098c = new l(this, list, list2, list3);
        l lVar = (l) cVar.a;
        X9.u uVar = new X9.u(aVar, 1);
        lVar.getClass();
        this.f16099d = new i(lVar, uVar);
        c2.a aVar2 = new c2.a(this, 26);
        lVar.getClass();
        this.f16100e = new h(lVar, aVar2);
    }

    @Override // t9.o, t9.p
    public InterfaceC0273g a(f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "location");
        if (q(fVar)) {
            return ((c) this.f16097b.a).b(l(fVar));
        }
        l lVar = this.f16098c;
        if (!lVar.f16089c.keySet().contains(fVar)) {
            return null;
        }
        lVar.getClass();
        return (q) lVar.f16092f.invoke(fVar);
    }

    @Override // t9.o, t9.n
    public Collection b(f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        l lVar = this.f16098c;
        lVar.getClass();
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return !((Set) j.o(lVar.f16094h, l.j[1])).contains(fVar) ? s.f12328s : (Collection) lVar.f16091e.invoke(fVar);
    }

    @Override // t9.o, t9.n
    public Collection c(f fVar, T8.b bVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        l lVar = this.f16098c;
        lVar.getClass();
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return !((Set) j.o(lVar.f16093g, l.j[0])).contains(fVar) ? s.f12328s : (Collection) lVar.f16090d.invoke(fVar);
    }

    @Override // t9.o, t9.n
    public final Set d() {
        return (Set) j.o(this.f16098c.f16093g, l.j[0]);
    }

    @Override // t9.o, t9.n
    public final Set e() {
        return (Set) j.o(this.f16098c.f16094h, l.j[1]);
    }

    @Override // t9.o, t9.n
    public final Set g() {
        h hVar = this.f16100e;
        u uVar = f16096f[1];
        p210v8.i.f(hVar, "<this>");
        p210v8.i.f(uVar, R5.a.PUSH_MINIFIED_BUTTON_ICON);
        return (Set) hVar.invoke();
    }

    public abstract void h(ArrayList arrayList, p200u8.b bVar);

    public final Collection i(t9.f fVar, p200u8.b bVar) {
        p210v8.i.f(fVar, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (fVar.a(t9.f.f15232f)) {
            h(arrayList, bVar);
        }
        l lVar = this.f16098c;
        lVar.getClass();
        boolean zA = fVar.a(t9.f.j);
        p124m9.h hVar = p124m9.h.f13168b;
        s sVar = s.f12328s;
        if (zA) {
            i iVar = lVar.f16094h;
            Set<f> set = (Set) j.o(iVar, l.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (f fVar2 : set) {
                if (((Boolean) bVar.invoke(fVar2)).booleanValue()) {
                    p210v8.i.f(fVar2, MediationMetaData.KEY_NAME);
                    arrayList2.addAll(!((Set) j.o(iVar, l.j[1])).contains(fVar2) ? sVar : (Collection) lVar.f16091e.invoke(fVar2));
                }
            }
            p.I(arrayList2, hVar);
            arrayList.addAll(arrayList2);
        }
        if (fVar.a(t9.f.f15235i)) {
            i iVar2 = lVar.f16093g;
            Set<f> set2 = (Set) j.o(iVar2, l.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (f fVar3 : set2) {
                if (((Boolean) bVar.invoke(fVar3)).booleanValue()) {
                    p210v8.i.f(fVar3, MediationMetaData.KEY_NAME);
                    arrayList3.addAll(!((Set) j.o(iVar2, l.j[0])).contains(fVar3) ? sVar : (Collection) lVar.f16090d.invoke(fVar3));
                }
            }
            p.I(arrayList3, hVar);
            arrayList.addAll(arrayList3);
        }
        if (fVar.a(t9.f.f15237l)) {
            for (f fVar4 : m()) {
                if (((Boolean) bVar.invoke(fVar4)).booleanValue()) {
                    J9.l.b(arrayList, ((c) this.f16097b.a).b(l(fVar4)));
                }
            }
        }
        if (fVar.a(t9.f.f15233g)) {
            for (f fVar5 : lVar.f16089c.keySet()) {
                if (((Boolean) bVar.invoke(fVar5)).booleanValue()) {
                    lVar.getClass();
                    p210v8.i.f(fVar5, MediationMetaData.KEY_NAME);
                    J9.l.b(arrayList, (q) lVar.f16092f.invoke(fVar5));
                }
            }
        }
        return J9.l.e(arrayList);
    }

    public void j(f fVar, ArrayList arrayList) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
    }

    public void k(f fVar, ArrayList arrayList) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
    }

    public abstract p096j9.b l(f fVar);

    public final Set m() {
        return (Set) j.o(this.f16099d, f16096f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(f fVar) {
        p210v8.i.f(fVar, MediationMetaData.KEY_NAME);
        return m().contains(fVar);
    }

    public boolean r(p pVar) {
        return true;
    }
}
