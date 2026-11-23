package y0;

import androidx.lifecycle.V;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: y0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0878p extends androidx.lifecycle.Q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p230x9.d f15957c = new p230x9.d(28);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15958b = new LinkedHashMap();

    @Override // androidx.lifecycle.Q
    public final void c() {
        LinkedHashMap linkedHashMap = this.f15958b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((V) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f15958b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        p210v8.i.e(string, "sb.toString()");
        return string;
    }
}
