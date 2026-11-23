package A3;

import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0119q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Q f239v = new Q(new Object[0]);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Object[] f240u;

    public Q(Object[] objArr) {
        this.f240u = objArr;
    }

    @Override // A3.AbstractC0119q, A3.AbstractC0113k
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f240u;
        System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
        return objArr2.length;
    }

    @Override // A3.AbstractC0113k
    public final Object[] f() {
        return this.f240u;
    }

    @Override // A3.AbstractC0113k
    public final int g() {
        return this.f240u.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f240u[i10];
    }

    @Override // A3.AbstractC0113k
    public final int k() {
        return 0;
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return false;
    }

    @Override // A3.AbstractC0119q, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final AbstractC0103a listIterator(int i10) {
        Object[] objArr = this.f240u;
        return D3.b.j(objArr.length, i10, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f240u.length;
    }

    @Override // A3.AbstractC0119q, A3.AbstractC0113k, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f240u, 1296);
    }
}
