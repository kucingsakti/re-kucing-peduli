package M0;

import L9.n;
import java.util.ArrayList;
import java.util.List;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2874d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public d(String str, boolean z6, List list, List list2) {
        i.f(list, "columns");
        i.f(list2, "orders");
        this.a = str;
        this.f2872b = z6;
        this.f2873c = list;
        this.f2874d = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add("ASC");
            }
        }
        this.f2874d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f2872b == dVar.f2872b && i.a(this.f2873c, dVar.f2873c) && i.a(this.f2874d, dVar.f2874d)) {
                String str = this.a;
                boolean zI = n.I(str, "index_", false);
                String str2 = dVar.a;
                return zI ? n.I(str2, "index_", false) : str.equals(str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.f2874d.hashCode() + ((this.f2873c.hashCode() + ((((n.I(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f2872b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.f2872b + ", columns=" + this.f2873c + ", orders=" + this.f2874d + "'}";
    }

    public d(String str, boolean z6, List list) {
        i.f(list, "columns");
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add("ASC");
        }
        this(str, z6, list, arrayList);
    }
}
