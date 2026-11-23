package A3;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: A3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0115m extends F {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient EnumSet f272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient int f273v;

    public C0115m(EnumSet enumSet) {
        this.f272u = enumSet;
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f272u.contains(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof C0115m) {
            collection = ((C0115m) collection).f272u;
        }
        return this.f272u.containsAll(collection);
    }

    @Override // A3.F, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0115m) {
            obj = ((C0115m) obj).f272u;
        }
        return this.f272u.equals(obj);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.f272u.forEach(consumer);
    }

    @Override // A3.F, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f273v;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f272u.hashCode();
        this.f273v = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f272u.isEmpty();
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return false;
    }

    @Override // A3.AbstractC0113k
    /* JADX INFO: renamed from: n */
    public final Z iterator() {
        Iterator it = this.f272u.iterator();
        it.getClass();
        return it instanceof Z ? (Z) it : new C0120s(it, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f272u.size();
    }

    @Override // A3.AbstractC0113k, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Spliterator spliterator() {
        return this.f272u.spliterator();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.f272u.toString();
    }
}
