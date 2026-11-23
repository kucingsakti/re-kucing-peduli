package A9;

import java.util.List;

/* JADX INFO: renamed from: A9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0142o extends D {
    @Override // A9.AbstractC0151y
    public final O D() {
        return Q0().D();
    }

    @Override // A9.AbstractC0151y
    public final t9.n E0() {
        return Q0().E0();
    }

    @Override // A9.AbstractC0151y
    public boolean H() {
        return Q0().H();
    }

    public abstract D Q0();

    @Override // A9.AbstractC0151y
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public D l0(B9.f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        D dQ0 = Q0();
        p210v8.i.f(dQ0, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return S0(dQ0);
    }

    public abstract AbstractC0142o S0(D d3);

    @Override // A9.AbstractC0151y
    public final List l() {
        return Q0().l();
    }

    @Override // A9.AbstractC0151y
    public K o() {
        return Q0().o();
    }
}
