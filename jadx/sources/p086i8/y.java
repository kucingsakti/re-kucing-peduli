package p086i8;

import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p076h8.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends z {
    public static Map A(Map map) {
        i.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? C(map) : z.u(map);
        }
        return t.f12329s;
    }

    public static final void B(List list, LinkedHashMap linkedHashMap) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            linkedHashMap.put(fVar.f11789s, fVar.f11790t);
        }
    }

    public static LinkedHashMap C(Map map) {
        i.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Object v(Map map, Comparable comparable) {
        i.f(map, "<this>");
        if (map instanceof x) {
            return ((x) map).d();
        }
        Object obj = map.get(comparable);
        if (obj != null || map.containsKey(comparable)) {
            return obj;
        }
        throw new NoSuchElementException("Key " + comparable + " is missing in the map.");
    }

    public static Map w(f... fVarArr) {
        if (fVarArr.length <= 0) {
            return t.f12329s;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.s(fVarArr.length));
        x(linkedHashMap, fVarArr);
        return linkedHashMap;
    }

    public static final void x(HashMap map, f[] fVarArr) {
        for (f fVar : fVarArr) {
            map.put(fVar.f11789s, fVar.f11790t);
        }
    }

    public static List y(Map map) {
        i.f(map, "<this>");
        int size = map.size();
        s sVar = s.f12328s;
        if (size == 0) {
            return sVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return sVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return d.u(new f(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new f(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new f(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map z(List list) {
        boolean z6 = list instanceof Collection;
        t tVar = t.f12329s;
        if (z6) {
            List list2 = list;
            int size = list2.size();
            if (size != 0) {
                if (size == 1) {
                    return z.t((f) (list instanceof List ? list.get(0) : list.iterator().next()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(z.s(list2.size()));
                B(list, linkedHashMap);
                return linkedHashMap;
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            B(list, linkedHashMap2);
            int size2 = linkedHashMap2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashMap2 : z.u(linkedHashMap2);
            }
        }
        return tVar;
    }
}
