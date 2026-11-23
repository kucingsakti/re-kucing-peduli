package A3;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: A3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0126y extends I {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC0121t f291w;

    public /* synthetic */ C0126y(AbstractC0121t abstractC0121t, int i10) {
        this.f290v = i10;
        this.f291w = abstractC0121t;
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f290v) {
            case 0:
                return ((M) this.f291w).containsKey(obj);
            default:
                return ((U) this.f291w).containsKey(obj);
        }
    }

    @Override // A3.I, java.lang.Iterable
    public void forEach(Consumer consumer) {
        switch (this.f290v) {
            case 0:
                consumer.getClass();
                ((M) this.f291w).forEach(new C0125x(consumer, 0));
                break;
            default:
                super.forEach(consumer);
                break;
        }
    }

    @Override // A3.I
    public final Object get(int i10) {
        switch (this.f290v) {
            case 0:
                return ((Map.Entry) ((M) this.f291w).entrySet().d().get(i10)).getKey();
            default:
                return ((U) this.f291w).f243w[i10].getKey();
        }
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        switch (this.f290v) {
            case 0:
                return iterator();
            default:
                return super.iterator();
        }
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        switch (this.f290v) {
        }
        return true;
    }

    @Override // A3.I, A3.AbstractC0113k
    /* JADX INFO: renamed from: n */
    public Z iterator() {
        switch (this.f290v) {
            case 0:
                return new C0120s(((M) this.f291w).entrySet().iterator(), 0);
            default:
                return super.iterator();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f290v) {
            case 0:
                return ((M) this.f291w).f234x.size();
            default:
                return ((U) this.f291w).f243w.length;
        }
    }

    @Override // A3.I, A3.AbstractC0113k, java.util.Collection, java.lang.Iterable, java.util.Set
    public Spliterator spliterator() {
        switch (this.f290v) {
            case 0:
                Spliterator spliterator = ((M) this.f291w).entrySet().spliterator();
                r rVar = new r(0);
                spliterator.getClass();
                return new C0108f(spliterator, rVar);
            default:
                return super.spliterator();
        }
    }
}
