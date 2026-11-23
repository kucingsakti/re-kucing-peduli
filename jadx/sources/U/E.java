package U;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f4778v;

    public E() {
        if (p170r3.e.f14469v == null) {
            p170r3.e.f14469v = new p170r3.e(24);
        }
    }

    public int a(int i10) {
        if (i10 < this.f4777u) {
            return ((ByteBuffer) this.f4778v).getShort(this.f4776t + i10);
        }
        return 0;
    }

    public void b() {
        if (((p095j8.e) this.f4778v).f12534z != this.f4777u) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i10 = this.f4775s;
            p095j8.e eVar = (p095j8.e) this.f4778v;
            if (i10 >= eVar.f12532x || eVar.f12529u[i10] >= 0) {
                return;
            } else {
                this.f4775s = i10 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        C0412b c0412b;
        if (Build.VERSION.SDK_INT >= this.f4776t) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f4776t) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f4775s);
            if (!((Class) this.f4778v).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = U.d(view);
            if (accessibilityDelegateD == null) {
                c0412b = null;
            } else {
                c0412b = accessibilityDelegateD instanceof C0410a ? ((C0410a) accessibilityDelegateD).a : new C0412b(accessibilityDelegateD);
            }
            if (c0412b == null) {
                c0412b = new C0412b();
            }
            U.n(view, c0412b);
            view.setTag(this.f4775s, obj);
            U.h(view, this.f4777u);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f4775s < ((p095j8.e) this.f4778v).f12532x;
    }

    public void remove() {
        b();
        if (this.f4776t == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        p095j8.e eVar = (p095j8.e) this.f4778v;
        eVar.c();
        eVar.l(this.f4776t);
        this.f4776t = -1;
        this.f4777u = eVar.f12534z;
    }
}
