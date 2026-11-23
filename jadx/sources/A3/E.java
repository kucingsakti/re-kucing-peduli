package A3;

import androidx.datastore.preferences.protobuf.C0488h;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f226b;

    public abstract boolean B(int i10);

    public abstract E a(Object obj);

    public void b(Object obj) {
        int i10 = this.a + 1;
        Object[] objArr = (Object[]) this.f226b;
        if (i10 > objArr.length) {
            this.f226b = Arrays.copyOf((Object[]) this.f226b, C8.E.k(objArr.length, i10));
        }
        Object[] objArr2 = (Object[]) this.f226b;
        int i11 = this.a;
        this.a = i11 + 1;
        objArr2[i11] = obj;
    }

    public abstract F c();

    public abstract void d(int i10);

    public abstract int e();

    public abstract boolean f();

    public abstract void g(int i10);

    public abstract int h(int i10);

    public abstract boolean i();

    public abstract C0488h j();

    public abstract double k();

    public abstract int l();

    public abstract int m();

    public abstract long n();

    public abstract float o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract String v();

    public abstract String w();

    public abstract int x();

    public abstract int y();

    public abstract long z();

    public E A() {
        return this;
    }
}
