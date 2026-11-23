package O0;

import A0.m;
import A9.AbstractC0130c;
import A9.AbstractC0151y;
import A9.D;
import A9.b0;
import A9.r;
import B9.g;
import C9.f;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0277k;
import L8.P;
import U8.C0442c;
import U8.EnumC0440a;
import U8.u;
import Y8.F;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p019b9.h;
import p091j3.InterfaceC0671f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3507e;

    public a(InterfaceC0277k interfaceC0277k, boolean z6, Fa.e eVar, EnumC0440a enumC0440a, boolean z10) {
        i.f(eVar, "containerContext");
        this.f3505c = interfaceC0277k;
        this.a = z6;
        this.f3506d = eVar;
        this.f3507e = enumC0440a;
        this.f3504b = z10;
    }

    public static void b(Object obj, ArrayList arrayList, m mVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) mVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), arrayList, mVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:63:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:1: B:30:0x0071->B:65:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static p019b9.i c(P p10) {
        ?? arrayList;
        h hVar;
        AbstractC0151y abstractC0151yF;
        i.f(p10, "<this>");
        if (!(p10 instanceof F)) {
            return null;
        }
        List upperBounds = p10.getUpperBounds();
        i.e(upperBounds, "this.upperBounds");
        List<D9.c> list = upperBounds;
        boolean z6 = list instanceof Collection;
        if (z6 && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!g.B((D9.c) it.next())) {
                if (z6 && list.isEmpty()) {
                    if (!z6) {
                    }
                    for (D9.c cVar : list) {
                        i.f(cVar, "<this>");
                        if (AbstractC0130c.f((AbstractC0151y) cVar) != null) {
                            arrayList = new ArrayList();
                            for (D9.c cVar2 : list) {
                                i.f(cVar2, "<this>");
                                abstractC0151yF = AbstractC0130c.f((AbstractC0151y) cVar2);
                                if (abstractC0151yF != null) {
                                    arrayList.add(abstractC0151yF);
                                }
                            }
                        }
                    }
                    return null;
                }
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        if (!z6 && list.isEmpty()) {
                            return null;
                        }
                        while (r2.hasNext()) {
                            i.f(cVar, "<this>");
                            if (AbstractC0130c.f((AbstractC0151y) cVar) != null) {
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                    i.f(cVar2, "<this>");
                                    abstractC0151yF = AbstractC0130c.f((AbstractC0151y) cVar2);
                                    if (abstractC0151yF != null) {
                                        arrayList.add(abstractC0151yF);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    if (f((D9.c) it2.next()) != null) {
                        arrayList = upperBounds;
                    }
                }
                Iterable iterable = (Iterable) arrayList;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it3 = iterable.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            hVar = h.f7334t;
                            break;
                        }
                        if (!g.H((D9.c) it3.next())) {
                            hVar = h.f7335u;
                            break;
                        }
                    }
                } else {
                    hVar = h.f7334t;
                    break;
                }
                return new p019b9.i(hVar, arrayList != upperBounds);
            }
        }
        return null;
    }

    public static p096j9.e e(D d3) {
        f fVar = b0.a;
        InterfaceC0273g interfaceC0273gW = d3.D().w();
        InterfaceC0271e interfaceC0271e = interfaceC0273gW instanceof InterfaceC0271e ? (InterfaceC0271e) interfaceC0273gW : null;
        if (interfaceC0271e != null) {
            return p124m9.e.g(interfaceC0271e);
        }
        return null;
    }

    public static h f(D9.c cVar) {
        D dH;
        D dH2;
        i.f(cVar, "<this>");
        r rVarG = g.g(cVar);
        if (rVarG == null || (dH = g.N(rVarG)) == null) {
            dH = g.h(cVar);
            i.c(dH);
        }
        if (g.F(dH)) {
            return h.f7334t;
        }
        r rVarG2 = g.g(cVar);
        if (rVarG2 == null || (dH2 = g.Y(rVarG2)) == null) {
            dH2 = g.h(cVar);
            i.c(dH2);
        }
        if (g.F(dH2)) {
            return null;
        }
        return h.f7335u;
    }

    public boolean a(InterfaceC0671f interfaceC0671f) {
        int id = interfaceC0671f.getId();
        HashSet hashSet = (HashSet) this.f3506d;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        InterfaceC0671f interfaceC0671f2 = (InterfaceC0671f) ((HashMap) this.f3505c).get(Integer.valueOf(g()));
        if (interfaceC0671f2 != null) {
            j(interfaceC0671f2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!interfaceC0671f.isChecked()) {
            interfaceC0671f.setChecked(true);
        }
        return zAdd;
    }

    public ArrayList d(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.f3506d);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof InterfaceC0671f) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int g() {
        if (!this.a) {
            return -1;
        }
        HashSet hashSet = (HashSet) this.f3506d;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void h() {
        P0.d dVar = (P0.d) this.f3507e;
        if (dVar != null) {
            new HashSet((HashSet) this.f3506d);
            ChipGroup chipGroup = (ChipGroup) dVar.f3811t;
            p023c3.i iVar = chipGroup.f9634y;
            if (iVar != null) {
                chipGroup.f9635z.d(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((V.h) iVar).f5078t;
                if (chipGroup2.f9635z.a) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [h8.d, java.lang.Object] */
    public ArrayList i(D9.c cVar) {
        Fa.e eVar = (Fa.e) this.f3506d;
        u uVar = (u) eVar.f1662w.getValue();
        I4.a aVar = (I4.a) eVar.f1659t;
        i.f(cVar, "<this>");
        p019b9.a aVar2 = new p019b9.a(cVar, ((C0442c) aVar.f2061q).b(uVar, ((AbstractC0151y) cVar).q()), null);
        m mVar = new m(this, 26);
        ArrayList arrayList = new ArrayList(1);
        b(aVar2, arrayList, mVar);
        return arrayList;
    }

    public boolean j(InterfaceC0671f interfaceC0671f, boolean z6) {
        int id = interfaceC0671f.getId();
        HashSet hashSet = (HashSet) this.f3506d;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z6 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            interfaceC0671f.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (interfaceC0671f.isChecked()) {
            interfaceC0671f.setChecked(false);
        }
        return zRemove;
    }

    public a() {
        this.f3505c = new HashMap();
        this.f3506d = new HashSet();
    }

    public a(Context context, String str, I.D d3, boolean z6, boolean z10) {
        i.f(context, "context");
        i.f(d3, "callback");
        this.f3505c = context;
        this.f3506d = str;
        this.f3507e = d3;
        this.a = z6;
        this.f3504b = z10;
    }
}
