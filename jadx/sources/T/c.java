package T;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public final Object[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4585b;

    public c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i10];
    }

    public Object a() {
        int i10 = this.f4585b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i11];
        i.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f4585b--;
        return obj;
    }

    public void b(p239z.b bVar) {
        int i10 = this.f4585b;
        Object[] objArr = this.a;
        if (i10 < objArr.length) {
            objArr[i10] = bVar;
            this.f4585b = i10 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z6;
        i.f(obj, "instance");
        int i10 = this.f4585b;
        int i11 = 0;
        while (true) {
            objArr = this.a;
            if (i11 >= i10) {
                z6 = false;
                break;
            }
            if (objArr[i11] == obj) {
                z6 = true;
                break;
            }
            i11++;
        }
        if (z6) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f4585b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = obj;
        this.f4585b = i12 + 1;
        return true;
    }

    public c() {
        this.a = new Object[256];
    }
}
