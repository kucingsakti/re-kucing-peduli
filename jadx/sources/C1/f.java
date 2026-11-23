package C1;

import A1.F;
import A1.t;
import U1.j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f931d;

    @Override // U1.j
    public final int b(Object obj) {
        F f10 = (F) obj;
        if (f10 == null) {
            return 1;
        }
        return f10.a();
    }

    @Override // U1.j
    public final void c(Object obj, Object obj2) {
        F f10 = (F) obj2;
        t tVar = this.f931d;
        if (tVar == null || f10 == null) {
            return;
        }
        tVar.f174e.m(f10, true);
    }

    public final void f(int i10) {
        long j;
        if (i10 >= 40) {
            e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (this) {
                j = this.f4875b;
            }
            e(j / 2);
        }
    }
}
