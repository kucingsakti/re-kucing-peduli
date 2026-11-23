package U8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final LinkedHashMap a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f4975b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(p096j9.i.f12573q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(p096j9.i.f12574r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(p096j9.i.f12575s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(p096j9.b.j(new p096j9.c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(p096j9.b.j(new p096j9.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new p076h8.f(((p096j9.b) entry.getKey()).b(), ((p096j9.b) entry.getValue()).b()));
        }
        f4975b = p086i8.y.z(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(p096j9.b.j(new p096j9.c(str)));
        }
        return arrayList;
    }

    public static void b(p096j9.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, bVar);
        }
    }
}
