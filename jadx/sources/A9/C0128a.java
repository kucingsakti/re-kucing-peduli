package A9;

/* JADX INFO: renamed from: A9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128a extends AbstractC0142o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f356t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D f357u;

    public C0128a(D d3, D d8) {
        p210v8.i.f(d3, "delegate");
        p210v8.i.f(d8, "abbreviation");
        this.f356t = d3;
        this.f357u = d8;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return new C0128a(this.f356t.N0(k3), this.f357u);
    }

    @Override // A9.AbstractC0142o
    public final D Q0() {
        return this.f356t;
    }

    @Override // A9.AbstractC0142o
    public final AbstractC0142o S0(D d3) {
        return new C0128a(d3, this.f357u);
    }

    @Override // A9.D
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final C0128a G0(boolean z6) {
        return new C0128a(this.f356t.G0(z6), this.f357u.G0(z6));
    }

    @Override // A9.AbstractC0142o, A9.AbstractC0151y
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0128a l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        D d3 = this.f356t;
        p210v8.i.f(d3, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        D d8 = this.f357u;
        p210v8.i.f(d8, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new C0128a(d3, d8);
    }
}
