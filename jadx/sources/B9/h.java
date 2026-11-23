package B9;

import A9.A;
import A9.D;
import A9.K;
import A9.O;
import A9.S;
import A9.d0;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends D implements D9.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d0 f782v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K f783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f785y;

    public h(int i10, j jVar, d0 d0Var, K k3, boolean z6, boolean z10) {
        AbstractC0487g.p(i10, "captureStatus");
        p210v8.i.f(jVar, "constructor");
        p210v8.i.f(k3, "attributes");
        this.f780t = i10;
        this.f781u = jVar;
        this.f782v = d0Var;
        this.f783w = k3;
        this.f784x = z6;
        this.f785y = z10;
    }

    @Override // A9.AbstractC0151y
    public final O D() {
        return this.f781u;
    }

    @Override // A9.AbstractC0151y
    public final t9.n E0() {
        return C9.i.a(1, true, new String[0]);
    }

    @Override // A9.D, A9.d0
    public final d0 G0(boolean z6) {
        return new h(this.f780t, this.f781u, this.f782v, this.f783w, z6, 32);
    }

    @Override // A9.AbstractC0151y
    public final boolean H() {
        return this.f784x;
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        return new h(this.f780t, this.f781u, this.f782v, this.f783w, z6, 32);
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        p210v8.i.f(k3, "newAttributes");
        return new h(this.f780t, this.f781u, this.f782v, k3, this.f784x, this.f785y);
    }

    @Override // A9.AbstractC0151y
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h l0(f fVar) {
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        j jVar = this.f781u;
        jVar.getClass();
        S sD = jVar.a.d(fVar);
        A a = jVar.f788b != null ? new A(jVar, fVar) : null;
        j jVar2 = jVar.f789c;
        if (jVar2 == null) {
            jVar2 = jVar;
        }
        j jVar3 = new j(sD, a, jVar2, jVar.f790d);
        d0 d0Var = this.f782v;
        return new h(this.f780t, jVar3, d0Var != null ? d0Var : null, this.f783w, this.f784x, 32);
    }

    @Override // A9.AbstractC0151y
    public final List l() {
        return p086i8.s.f12328s;
    }

    @Override // A9.AbstractC0151y
    public final K o() {
        return this.f783w;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(int i10, j jVar, d0 d0Var, K k3, boolean z6, int i11) {
        if ((i11 & 8) != 0) {
            K.f338t.getClass();
            k3 = K.f339u;
        }
        this(i10, jVar, d0Var, k3, (i11 & 16) != 0 ? false : z6, false);
    }
}
