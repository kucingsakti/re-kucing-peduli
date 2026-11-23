package sa;

/* JADX INFO: renamed from: sa.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0808k0 extends e1 {
    public C0808k0() {
        super("CharacterReferenceInData", 1);
    }

    @Override // sa.e1
    public final void i(N n10, C0787a c0787a) {
        Z z6 = e1.f14948s;
        int[] iArrB = n10.b(null, false);
        if (iArrB == null) {
            n10.e('&');
        } else {
            n10.g(new String(iArrB, 0, iArrB.length));
        }
        n10.o(z6);
    }
}
