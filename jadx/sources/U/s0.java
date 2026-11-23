package U;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public final B0 a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L.c[] f4846b;

    public s0() {
        this(new B0());
    }

    public final void a() {
        L.c[] cVarArr = this.f4846b;
        if (cVarArr != null) {
            L.c cVarF = cVarArr[0];
            L.c cVarF2 = cVarArr[1];
            B0 b3 = this.a;
            if (cVarF2 == null) {
                cVarF2 = b3.a.f(2);
            }
            if (cVarF == null) {
                cVarF = b3.a.f(1);
            }
            g(L.c.a(cVarF, cVarF2));
            L.c cVar = this.f4846b[J7.a.k(16)];
            if (cVar != null) {
                f(cVar);
            }
            L.c cVar2 = this.f4846b[J7.a.k(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            L.c cVar3 = this.f4846b[J7.a.k(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract B0 b();

    public void c(int i10, L.c cVar) {
        if (this.f4846b == null) {
            this.f4846b = new L.c[9];
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f4846b[J7.a.k(i11)] = cVar;
            }
        }
    }

    public abstract void e(L.c cVar);

    public abstract void g(L.c cVar);

    public s0(B0 b3) {
        this.a = b3;
    }

    public void d(L.c cVar) {
    }

    public void f(L.c cVar) {
    }

    public void h(L.c cVar) {
    }
}
