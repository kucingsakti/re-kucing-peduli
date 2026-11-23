package A3;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: A3.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0127z extends AbstractC0113k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final M f292t;

    public C0127z(M m2) {
        this.f292t = m2;
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Z it = this.f292t.entrySet().iterator();
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        this.f292t.forEach(new C0125x(consumer, 1));
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C0120s(this);
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return true;
    }

    @Override // A3.AbstractC0113k
    /* JADX INFO: renamed from: n */
    public final Z iterator() {
        return new C0120s(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f292t.f234x.size();
    }

    @Override // A3.AbstractC0113k, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Spliterator spliterator() {
        Spliterator spliterator = this.f292t.entrySet().spliterator();
        r rVar = new r(1);
        spliterator.getClass();
        return new C0108f(spliterator, rVar);
    }
}
