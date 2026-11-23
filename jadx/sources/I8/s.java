package I8;

import A9.AbstractC0151y;
import A9.b0;
import L8.D;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import O8.E;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p086i8.y;
import p086i8.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final Set a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f2213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f2214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f2215d;

    static {
        r[] rVarArrValues = r.values();
        ArrayList arrayList = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList.add(rVar.f2211t);
        }
        a = p086i8.k.w0(arrayList);
        q[] qVarArrValues = q.values();
        ArrayList arrayList2 = new ArrayList(qVarArrValues.length);
        for (q qVar : qVarArrValues) {
            arrayList2.add(qVar.f2208s);
        }
        p086i8.k.w0(arrayList2);
        f2213b = new HashMap();
        f2214c = new HashMap();
        y.x(new HashMap(z.s(4)), new p076h8.f[]{new p076h8.f(q.UBYTEARRAY, p096j9.f.j("ubyteArrayOf")), new p076h8.f(q.USHORTARRAY, p096j9.f.j("ushortArrayOf")), new p076h8.f(q.UINTARRAY, p096j9.f.j("uintArrayOf")), new p076h8.f(q.ULONGARRAY, p096j9.f.j("ulongArrayOf"))});
        r[] rVarArrValues2 = r.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (r rVar2 : rVarArrValues2) {
            linkedHashSet.add(rVar2.f2212u.i());
        }
        f2215d = linkedHashSet;
        for (r rVar3 : r.values()) {
            HashMap map = f2213b;
            p096j9.b bVar = rVar3.f2212u;
            p096j9.b bVar2 = rVar3.f2210s;
            map.put(bVar, bVar2);
            f2214c.put(bVar2, rVar3.f2212u);
        }
    }

    public static final boolean a(AbstractC0151y abstractC0151y) {
        InterfaceC0273g interfaceC0273gW;
        if (b0.l(abstractC0151y) || (interfaceC0273gW = abstractC0151y.D().w()) == null) {
            return false;
        }
        InterfaceC0276j interfaceC0276jV = interfaceC0273gW.v();
        return (interfaceC0276jV instanceof D) && p210v8.i.a(((E) ((D) interfaceC0276jV)).f3634w, o.f2197k) && a.contains(interfaceC0273gW.getName());
    }
}
