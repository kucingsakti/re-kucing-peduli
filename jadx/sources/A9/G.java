package A9;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0142o implements c0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC0151y f334u;

    public G(D d3, AbstractC0151y abstractC0151y) {
        p210v8.i.f(d3, "delegate");
        p210v8.i.f(abstractC0151y, "enhancement");
        this.f333t = d3;
        this.f334u = abstractC0151y;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        d0 d0VarB = AbstractC0130c.B(this.f333t.G0(z6), this.f334u.D0().G0(z6));
        p210v8.i.d(d0VarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (D) d0VarB;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        d0 d0VarB = AbstractC0130c.B(this.f333t.N0(k3), this.f334u);
        p210v8.i.d(d0VarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (D) d0VarB;
    }

    @Override // A9.AbstractC0142o
    public final D Q0() {
        return this.f333t;
    }

    @Override // A9.AbstractC0142o
    public final AbstractC0142o S0(D d3) {
        return new G(d3, this.f334u);
    }

    @Override // A9.AbstractC0142o, A9.AbstractC0151y
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final G l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        D d3 = this.f333t;
        p210v8.i.f(d3, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        AbstractC0151y abstractC0151y = this.f334u;
        p210v8.i.f(abstractC0151y, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new G(d3, abstractC0151y);
    }

    @Override // A9.c0
    public final AbstractC0151y a() {
        return this.f334u;
    }

    @Override // A9.c0
    public final d0 i() {
        return this.f333t;
    }

    @Override // A9.D
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f334u + ")] " + this.f333t;
    }
}
