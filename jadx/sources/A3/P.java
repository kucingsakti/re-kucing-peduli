package A3;

import java.util.ListIterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class P extends AbstractC0112j {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final F f237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AbstractC0119q f238v;

    public P(F f10, AbstractC0119q abstractC0119q) {
        this.f237u = f10;
        this.f238v = abstractC0119q;
    }

    @Override // A3.AbstractC0119q, A3.AbstractC0113k
    public final int e(Object[] objArr) {
        return this.f238v.e(objArr);
    }

    @Override // A3.AbstractC0113k
    public final Object[] f() {
        return this.f238v.f();
    }

    @Override // A3.AbstractC0119q, java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.f238v.forEach(consumer);
    }

    @Override // A3.AbstractC0113k
    public final int g() {
        return this.f238v.g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f238v.get(i10);
    }

    @Override // A3.AbstractC0113k
    public final int k() {
        return this.f238v.k();
    }

    @Override // A3.AbstractC0119q, java.util.List
    public final ListIterator listIterator(int i10) {
        return this.f238v.listIterator(i10);
    }

    @Override // A3.AbstractC0119q
    /* JADX INFO: renamed from: q */
    public final AbstractC0103a listIterator(int i10) {
        return this.f238v.listIterator(i10);
    }

    @Override // A3.AbstractC0112j
    public AbstractC0113k s() {
        return this.f237u;
    }

    public P(F f10, Object[] objArr) {
        this(f10, AbstractC0119q.o(objArr.length, objArr));
    }
}
