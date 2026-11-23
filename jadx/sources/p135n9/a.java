package p135n9;

import A9.AbstractC0151y;
import A9.D;
import A9.K;
import A9.O;
import A9.S;
import A9.d0;
import B9.f;
import D9.b;
import java.util.List;
import p086i8.s;
import p210v8.i;
import t9.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends D implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final S f13406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f13407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f13408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K f13409w;

    public a(S s9, c cVar, boolean z6, K k3) {
        i.f(s9, "typeProjection");
        i.f(k3, "attributes");
        this.f13406t = s9;
        this.f13407u = cVar;
        this.f13408v = z6;
        this.f13409w = k3;
    }

    @Override // A9.AbstractC0151y
    public final O D() {
        return this.f13407u;
    }

    @Override // A9.AbstractC0151y
    public final n E0() {
        return C9.i.a(1, true, new String[0]);
    }

    @Override // A9.D, A9.d0
    public final d0 G0(boolean z6) {
        if (z6 == this.f13408v) {
            return this;
        }
        return new a(this.f13406t, this.f13407u, z6, this.f13409w);
    }

    @Override // A9.AbstractC0151y
    public final boolean H() {
        return this.f13408v;
    }

    @Override // A9.d0
    public final d0 K0(f fVar) {
        i.f(fVar, "kotlinTypeRefiner");
        return new a(this.f13406t.d(fVar), this.f13407u, this.f13408v, this.f13409w);
    }

    @Override // A9.D
    /* JADX INFO: renamed from: O0 */
    public final D G0(boolean z6) {
        if (z6 == this.f13408v) {
            return this;
        }
        return new a(this.f13406t, this.f13407u, z6, this.f13409w);
    }

    @Override // A9.D
    /* JADX INFO: renamed from: P0 */
    public final D N0(K k3) {
        i.f(k3, "newAttributes");
        return new a(this.f13406t, this.f13407u, this.f13408v, k3);
    }

    @Override // A9.AbstractC0151y
    public final List l() {
        return s.f12328s;
    }

    @Override // A9.AbstractC0151y
    public final AbstractC0151y l0(f fVar) {
        i.f(fVar, "kotlinTypeRefiner");
        return new a(this.f13406t.d(fVar), this.f13407u, this.f13408v, this.f13409w);
    }

    @Override // A9.AbstractC0151y
    public final K o() {
        return this.f13409w;
    }

    @Override // A9.D
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f13406t);
        sb.append(')');
        sb.append(this.f13408v ? "?" : "");
        return sb.toString();
    }
}
