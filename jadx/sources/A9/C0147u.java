package A9;

import L8.InterfaceC0273g;

/* JADX INFO: renamed from: A9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0147u extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L8.P[] f387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S[] f388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f389d;

    public C0147u(L8.P[] pArr, S[] sArr, boolean z6) {
        p210v8.i.f(pArr, "parameters");
        p210v8.i.f(sArr, "arguments");
        this.f387b = pArr;
        this.f388c = sArr;
        this.f389d = z6;
    }

    @Override // A9.W
    public final boolean b() {
        return this.f389d;
    }

    @Override // A9.W
    public final S d(AbstractC0151y abstractC0151y) {
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        L8.P p10 = interfaceC0273gW instanceof L8.P ? (L8.P) interfaceC0273gW : null;
        if (p10 != null) {
            int iD0 = p10.d0();
            L8.P[] pArr = this.f387b;
            if (iD0 < pArr.length && p210v8.i.a(pArr[iD0].I(), p10.I())) {
                return this.f388c[iD0];
            }
        }
        return null;
    }

    @Override // A9.W
    public final boolean e() {
        return this.f388c.length == 0;
    }
}
