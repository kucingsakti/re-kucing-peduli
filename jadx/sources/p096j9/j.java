package p096j9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p086i8.m;
import p086i8.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    static {
        new c("java.lang").c(f.j("annotation"));
    }

    public static final b a(String str) {
        c cVar = i.a;
        return new b(i.a, f.j(str));
    }

    public static final b b(String str) {
        c cVar = i.a;
        return new b(i.f12560c, f.j(str));
    }

    public static final void c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iS = z.s(m.H(setEntrySet, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final b d(f fVar) {
        c cVar = i.a;
        b bVar = i.f12565h;
        return new b(bVar.g(), f.j(fVar.h().concat(bVar.i().h())));
    }

    public static final b e(String str) {
        c cVar = i.a;
        return new b(i.f12559b, f.j(str));
    }

    public static final b f(b bVar) {
        c cVar = i.a;
        return new b(i.a, f.j("U".concat(bVar.i().h())));
    }
}
