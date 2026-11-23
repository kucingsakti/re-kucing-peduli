package sa;

/* JADX INFO: renamed from: sa.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0798f0 extends e1 {
    public C0798f0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        if (c0787a.t()) {
            n10.d();
            n10.f14845h.append(c0787a.l());
            n10.g("<");
            n10.e(c0787a.l());
            n10.o(e1.f14925T);
            n10.a.a();
            return;
        }
        if (!c0787a.r('/')) {
            n10.e('<');
            n10.o(e1.f14920N);
        } else {
            n10.d();
            n10.o(e1.f14923R);
            n10.a.a();
        }
    }
}
