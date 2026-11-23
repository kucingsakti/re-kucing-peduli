package sa;

/* JADX INFO: loaded from: classes.dex */
public final enum G0 extends e1 {
    public G0() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        C0829v0 c0829v0 = e1.f14952u;
        int[] iArrB = n10.b(null, false);
        if (iArrB == null) {
            n10.e('&');
        } else {
            n10.g(new String(iArrB, 0, iArrB.length));
        }
        n10.o(c0829v0);
    }
}
