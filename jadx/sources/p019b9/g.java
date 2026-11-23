package p019b9;

import A9.AbstractC0130c;
import A9.AbstractC0142o;
import A9.AbstractC0151y;
import A9.C0133f;
import A9.D;
import A9.InterfaceC0139l;
import A9.K;
import A9.b0;
import A9.d0;
import A9.r;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0142o implements InterfaceC0139l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f7332t;

    public g(D d3) {
        i.f(d3, "delegate");
        this.f7332t = d3;
    }

    @Override // A9.AbstractC0142o, A9.AbstractC0151y
    public final boolean H() {
        return false;
    }

    @Override // A9.D, A9.d0
    public final d0 N0(K k3) {
        i.f(k3, "newAttributes");
        return new g(this.f7332t.N0(k3));
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        return z6 ? this.f7332t.G0(true) : this;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        i.f(k3, "newAttributes");
        return new g(this.f7332t.N0(k3));
    }

    @Override // A9.AbstractC0142o
    public final D Q0() {
        return this.f7332t;
    }

    @Override // A9.AbstractC0142o
    public final AbstractC0142o S0(D d3) {
        return new g(d3);
    }

    @Override // A9.InterfaceC0139l
    public final boolean b() {
        return true;
    }

    @Override // A9.InterfaceC0139l
    public final d0 d(AbstractC0151y abstractC0151y) {
        i.f(abstractC0151y, "replacement");
        d0 d0VarD0 = abstractC0151y.D0();
        if (!b0.f(d0VarD0) && !b0.e(d0VarD0)) {
            return d0VarD0;
        }
        if (d0VarD0 instanceof D) {
            D d3 = (D) d0VarD0;
            D dG0 = d3.G0(false);
            return !b0.f(d3) ? dG0 : new g(dG0);
        }
        if (!(d0VarD0 instanceof r)) {
            throw new IllegalStateException(("Incorrect type: " + d0VarD0).toString());
        }
        r rVar = (r) d0VarD0;
        D d8 = rVar.f383t;
        D dG1 = d8.G0(false);
        if (b0.f(d8)) {
            dG1 = new g(dG1);
        }
        D d10 = rVar.f384u;
        D dG2 = d10.G0(false);
        if (b0.f(d10)) {
            dG2 = new g(dG2);
        }
        return AbstractC0130c.B(C0133f.j(dG1, dG2), AbstractC0130c.f(d0VarD0));
    }
}
