package p166r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f14454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f14455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final WeakHashMap f14456u = new WeakHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14457v = 0;

    public c d(Object obj) {
        c cVar = this.f14454s;
        while (cVar != null && !cVar.f14447s.equals(obj)) {
            cVar = cVar.f14449u;
        }
        return cVar;
    }

    public Object e(Object obj) {
        c cVarD = d(obj);
        if (cVarD == null) {
            return null;
        }
        this.f14457v--;
        WeakHashMap weakHashMap = this.f14456u;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarD);
            }
        }
        c cVar = cVarD.f14450v;
        if (cVar != null) {
            cVar.f14449u = cVarD.f14449u;
        } else {
            this.f14454s = cVarD.f14449u;
        }
        c cVar2 = cVarD.f14449u;
        if (cVar2 != null) {
            cVar2.f14450v = cVar;
        } else {
            this.f14455t = cVar;
        }
        cVarD.f14449u = null;
        cVarD.f14450v = null;
        return cVarD.f14448t;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f14457v != fVar.f14457v) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f14454s, this.f14455t, 0);
        this.f14456u.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
