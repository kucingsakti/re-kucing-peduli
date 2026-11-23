package p212w;

import androidx.datastore.preferences.protobuf.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e extends i implements Map {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i0 f15493v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b f15494w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f15495x;

    public e(e eVar) {
        super(0);
        h(eVar);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i0 i0Var = this.f15493v;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(this, 3);
        this.f15493v = i0Var2;
        return i0Var2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f15494w;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f15494w = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(Collection collection) {
        int i10 = this.f15506u;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f15506u;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f15506u);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f15495x;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f15495x = dVar2;
        return dVar2;
    }
}
