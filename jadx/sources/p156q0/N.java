package p156q0;

import androidx.fragment.app.b;
import androidx.fragment.app.e;
import androidx.lifecycle.Q;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public final class N extends Q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f14262h = new d(25);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14266e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14263b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14264c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f14265d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14267f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14268g = false;

    public N(boolean z6) {
        this.f14266e = z6;
    }

    @Override // androidx.lifecycle.Q
    public final void c() {
        if (e.K(3)) {
            toString();
        }
        this.f14267f = true;
    }

    public final void d(b bVar) {
        if (this.f14268g) {
            e.K(2);
            return;
        }
        HashMap map = this.f14263b;
        if (map.containsKey(bVar.f6655x)) {
            return;
        }
        map.put(bVar.f6655x, bVar);
        if (e.K(2)) {
            bVar.toString();
        }
    }

    public final void e(String str, boolean z6) {
        HashMap map = this.f14264c;
        N n10 = (N) map.get(str);
        if (n10 != null) {
            if (z6) {
                ArrayList<String> arrayList = new ArrayList();
                arrayList.addAll(n10.f14264c.keySet());
                for (String str2 : arrayList) {
                    e.K(3);
                    n10.e(str2, true);
                }
            }
            n10.c();
            map.remove(str);
        }
        HashMap map2 = this.f14265d;
        V v4 = (V) map2.get(str);
        if (v4 != null) {
            v4.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N.class == obj.getClass()) {
            N n10 = (N) obj;
            if (this.f14263b.equals(n10.f14263b) && this.f14264c.equals(n10.f14264c) && this.f14265d.equals(n10.f14265d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(b bVar) {
        if (this.f14268g) {
            e.K(2);
        } else {
            if (this.f14263b.remove(bVar.f6655x) == null || !e.K(2)) {
                return;
            }
            bVar.toString();
        }
    }

    public final int hashCode() {
        return this.f14265d.hashCode() + ((this.f14264c.hashCode() + (this.f14263b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f14263b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f14264c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f14265d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
