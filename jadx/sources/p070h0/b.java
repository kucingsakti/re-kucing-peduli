package p070h0;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p086i8.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final LinkedHashMap a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11635b;

    public b(LinkedHashMap linkedHashMap, boolean z6) {
        this.a = linkedHashMap;
        this.f11635b = new AtomicBoolean(z6);
    }

    public final Object a(e eVar) {
        i.f(eVar, "key");
        return this.a.get(eVar);
    }

    public final void b(e eVar, Object obj) {
        i.f(eVar, "key");
        AtomicBoolean atomicBoolean = this.f11635b;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            linkedHashMap.remove(eVar);
        } else {
            if (!(obj instanceof Set)) {
                linkedHashMap.put(eVar, obj);
                return;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(k.w0((Iterable) obj));
            i.e(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
            linkedHashMap.put(eVar, setUnmodifiableSet);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return i.a(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k.Z(this.a.entrySet(), ",\n", "{\n", "\n}", a.f11634s, 24);
    }

    public /* synthetic */ b(boolean z6) {
        this(new LinkedHashMap(), z6);
    }
}
