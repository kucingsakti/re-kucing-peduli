package A9;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: A9.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0145s extends r implements InterfaceC0139l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0145s(D d3, D d8) {
        super(d3, d8);
        p210v8.i.f(d3, "lowerBound");
        p210v8.i.f(d8, "upperBound");
    }

    @Override // A9.d0
    public final d0 G0(boolean z6) {
        return C0133f.j(this.f383t.G0(z6), this.f384u.G0(z6));
    }

    @Override // A9.d0
    /* JADX INFO: renamed from: K0 */
    public final d0 l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        D d3 = this.f383t;
        p210v8.i.f(d3, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        D d8 = this.f384u;
        p210v8.i.f(d8, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new C0145s(d3, d8);
    }

    @Override // A9.d0
    public final d0 N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return C0133f.j(this.f383t.N0(k3), this.f384u.N0(k3));
    }

    @Override // A9.r
    public final D O0() {
        return this.f383t;
    }

    @Override // A9.r
    public final String P0(p114l9.g gVar, p114l9.g gVar2) {
        p210v8.i.f(gVar, "renderer");
        boolean zN = gVar2.a.n();
        D d3 = this.f384u;
        D d8 = this.f383t;
        if (!zN) {
            return gVar.F(gVar.Y(d8), gVar.Y(d3), qa.b.l(this));
        }
        return "(" + gVar.Y(d8) + ".." + gVar.Y(d3) + ')';
    }

    @Override // A9.InterfaceC0139l
    public final boolean b() {
        D d3 = this.f383t;
        return (d3.D().w() instanceof L8.P) && p210v8.i.a(d3.D(), this.f384u.D());
    }

    @Override // A9.InterfaceC0139l
    public final d0 d(AbstractC0151y abstractC0151y) {
        d0 d0VarJ;
        p210v8.i.f(abstractC0151y, "replacement");
        d0 d0VarD0 = abstractC0151y.D0();
        if (d0VarD0 instanceof r) {
            d0VarJ = d0VarD0;
        } else {
            if (!(d0VarD0 instanceof D)) {
                throw new NoWhenBranchMatchedException();
            }
            D d3 = (D) d0VarD0;
            d0VarJ = C0133f.j(d3, d3.G0(true));
        }
        return AbstractC0130c.h(d0VarJ, d0VarD0);
    }

    @Override // A9.AbstractC0151y
    public final AbstractC0151y l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        D d3 = this.f383t;
        p210v8.i.f(d3, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        D d8 = this.f384u;
        p210v8.i.f(d8, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return new C0145s(d3, d8);
    }

    @Override // A9.r
    public final String toString() {
        return "(" + this.f383t + ".." + this.f384u + ')';
    }
}
