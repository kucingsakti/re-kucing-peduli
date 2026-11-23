package G9;

import A9.C0136i;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f1750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1751t;

    @Override // G9.a
    public final int e() {
        return this.f1751t;
    }

    @Override // G9.a
    public final void f(int i10, C0136i c0136i) {
        Object[] objArr = this.f1750s;
        if (objArr.length <= i10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            p210v8.i.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f1750s = objArrCopyOf;
        }
        Object[] objArr2 = this.f1750s;
        if (objArr2[i10] == null) {
            this.f1751t++;
        }
        objArr2[i10] = c0136i;
    }

    @Override // G9.a
    public final Object get(int i10) {
        Object[] objArr = this.f1750s;
        if (i10 < 0 || i10 > objArr.length - 1) {
            return null;
        }
        return objArr[i10];
    }

    @Override // G9.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
