package p180s2;

import android.util.SparseArray;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.HashMap;
import p051f2.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f14588b;

    static {
        HashMap map = new HashMap();
        f14588b = map;
        map.put(d.f11424s, 0);
        map.put(d.f11425t, 1);
        map.put(d.f11426u, 2);
        for (d dVar : map.keySet()) {
            a.append(((Integer) f14588b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f14588b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(AbstractC0487g.g(i10, "Unknown Priority for value "));
    }
}
