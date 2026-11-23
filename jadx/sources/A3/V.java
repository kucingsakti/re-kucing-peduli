package A3;

import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes.dex */
public final class V extends B {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final V f246A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object[] f247z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object[] f248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int f249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient Object[] f250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f251y;

    static {
        Object[] objArr = new Object[0];
        f247z = objArr;
        f246A = new V(objArr, 0, objArr, 0);
    }

    public V(Object[] objArr, int i10, Object[] objArr2, int i11) {
        this.f248v = objArr;
        this.f249w = i10;
        this.f250x = objArr2;
        this.f251y = i11;
    }

    @Override // A3.AbstractC0113k, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f250x;
            if (objArr.length != 0) {
                int iF = C4.a.F(obj.hashCode());
                while (true) {
                    int i10 = iF & this.f251y;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iF = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // A3.AbstractC0113k
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f248v;
        System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
        return objArr2.length;
    }

    @Override // A3.AbstractC0113k
    public final Object[] f() {
        return this.f248v;
    }

    @Override // A3.AbstractC0113k
    public final int g() {
        return this.f248v.length;
    }

    @Override // A3.F, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f249w;
    }

    @Override // A3.AbstractC0113k
    public final int k() {
        return 0;
    }

    @Override // A3.AbstractC0113k
    public final boolean m() {
        return false;
    }

    @Override // A3.AbstractC0113k
    /* JADX INFO: renamed from: n */
    public final Z iterator() {
        Object[] objArr = this.f248v;
        return D3.b.j(objArr.length, 0, objArr);
    }

    @Override // A3.F
    public final boolean r() {
        return true;
    }

    @Override // A3.B
    public final AbstractC0119q s() {
        return this.f250x.length == 0 ? Q.f239v : new P(this, this.f248v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f248v.length;
    }

    @Override // A3.AbstractC0113k, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.f248v, 1297);
    }
}
