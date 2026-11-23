package Q9;

import N9.C0324g;
import N9.K;

/* JADX INFO: loaded from: classes.dex */
public final class n implements K {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f4381s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f4382t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f4383u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0324g f4384v;

    public n(p pVar, long j, Object obj, C0324g c0324g) {
        this.f4381s = pVar;
        this.f4382t = j;
        this.f4383u = obj;
        this.f4384v = c0324g;
    }

    @Override // N9.K
    public final void f() {
        p pVar = this.f4381s;
        synchronized (pVar) {
            if (this.f4382t < pVar.l()) {
                return;
            }
            Object[] objArr = pVar.f4396x;
            p210v8.i.c(objArr);
            long j = this.f4382t;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            q.b(objArr, j, q.a);
            pVar.g();
        }
    }
}
