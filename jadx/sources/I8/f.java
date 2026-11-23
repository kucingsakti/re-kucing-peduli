package I8;

import A9.D;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f2108t;

    public /* synthetic */ f(i iVar, int i10) {
        this.f2107s = i10;
        this.f2108t = iVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        i iVar = this.f2108t;
        switch (this.f2107s) {
            case 0:
                return Arrays.asList(iVar.k().K(o.f2197k), iVar.k().K(o.f2199m), iVar.k().K(o.f2200n), iVar.k().K(o.f2198l));
            default:
                EnumMap enumMap = new EnumMap(k.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (k kVar : k.values()) {
                    String strG = kVar.f2128s.g();
                    if (strG == null) {
                        iVar.getClass();
                        i.a(46);
                        throw null;
                    }
                    D dP = iVar.j(strG).p();
                    if (dP == null) {
                        i.a(47);
                        throw null;
                    }
                    String strG2 = kVar.f2129t.g();
                    if (strG2 == null) {
                        i.a(46);
                        throw null;
                    }
                    D dP2 = iVar.j(strG2).p();
                    if (dP2 == null) {
                        i.a(47);
                        throw null;
                    }
                    enumMap.put(kVar, dP2);
                    map.put(dP, dP2);
                    map2.put(dP2, dP);
                }
                return new h(enumMap, map, map2);
        }
    }
}
