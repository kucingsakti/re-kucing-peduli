package U1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4876c;

    public j(long j) {
        this.f4875b = j;
    }

    public final synchronized Object a(Object obj) {
        i iVar;
        iVar = (i) this.a.get(obj);
        return iVar != null ? iVar.a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public final synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j = iB;
        if (j >= this.f4875b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f4876c += j;
        }
        i iVar = (i) this.a.put(obj, obj2 == null ? null : new i(obj2, iB));
        if (iVar != null) {
            this.f4876c -= (long) iVar.f4874b;
            if (!iVar.a.equals(obj2)) {
                c(obj, iVar.a);
            }
        }
        e(this.f4875b);
        return iVar != null ? iVar.a : null;
    }

    public final synchronized void e(long j) {
        while (this.f4876c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            i iVar = (i) entry.getValue();
            this.f4876c -= (long) iVar.f4874b;
            Object key = entry.getKey();
            it.remove();
            c(key, iVar.a);
        }
    }

    public void c(Object obj, Object obj2) {
    }
}
