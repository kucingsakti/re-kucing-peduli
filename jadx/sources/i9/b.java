package i9;

import L9.n;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.LinkedHashMap;
import java.util.List;
import p086i8.k;
import p086i8.l;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final String a = k.Z(l.C('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f12332b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listC = l.C("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int i10 = p068ga.l.i(0, listC.size() - 1, 2);
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listC.get(i11));
                int i12 = i11 + 1;
                linkedHashMap.put(sb.toString(), listC.get(i12));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(E0.a.l(sb2, (String) listC.get(i11), "Array"), "[" + ((String) listC.get(i12)));
                if (i11 == i10) {
                    break;
                } else {
                    i11 += 2;
                }
            }
        }
        linkedHashMap.put(a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : l.C("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : l.C("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, E0.a.h("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i13 = 0; i13 < 23; i13++) {
            String strG = AbstractC0487g.g(i13, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i13);
            a(linkedHashMap, strG, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i13, str4 + "/reflect/KFunction");
        }
        for (String str5 : l.C("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, p231y.a.c(str5, ".Companion"), a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f12332b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        i.f(str, "classId");
        String str2 = (String) f12332b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + n.F(str, '.', '$') + ';';
    }
}
