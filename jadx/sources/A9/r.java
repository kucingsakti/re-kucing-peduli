package A9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends d0 implements D9.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final D f383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final D f384u;

    public r(D d3, D d8) {
        p210v8.i.f(d3, "lowerBound");
        p210v8.i.f(d8, "upperBound");
        this.f383t = d3;
        this.f384u = d8;
    }

    @Override // A9.AbstractC0151y
    public final O D() {
        return O0().D();
    }

    @Override // A9.AbstractC0151y
    public t9.n E0() {
        return O0().E0();
    }

    @Override // A9.AbstractC0151y
    public final boolean H() {
        return O0().H();
    }

    public abstract D O0();

    public abstract String P0(p114l9.g gVar, p114l9.g gVar2);

    @Override // A9.AbstractC0151y
    public final List l() {
        return O0().l();
    }

    @Override // A9.AbstractC0151y
    public final K o() {
        return O0().o();
    }

    public String toString() {
        return p114l9.g.f12984e.Y(this);
    }
}
