package A3;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: A3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0124w extends B {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient AbstractC0121t f287v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient AbstractC0119q f288w;

    public C0124w(AbstractC0121t abstractC0121t, AbstractC0119q abstractC0119q) {
        this.f287v = abstractC0121t;
        this.f288w = abstractC0119q;
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f287v.get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // A3.AbstractC0113k
    public final int e(Object[] objArr) {
        return this.f288w.e(objArr);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.f288w.forEach(consumer);
    }

    @Override // A3.F, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f287v.hashCode();
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return this.f288w.iterator();
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        this.f287v.getClass();
        return false;
    }

    @Override // A3.AbstractC0113k
    /* JADX INFO: renamed from: n */
    public final Z iterator() {
        return this.f288w.iterator();
    }

    @Override // A3.F
    public final boolean r() {
        this.f287v.getClass();
        return false;
    }

    @Override // A3.B
    public final AbstractC0119q s() {
        return new P(this, this.f288w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f287v.size();
    }

    @Override // A3.AbstractC0113k, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Spliterator spliterator() {
        return this.f288w.spliterator();
    }
}
