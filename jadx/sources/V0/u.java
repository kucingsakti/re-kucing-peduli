package V0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends q {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f5162b;

    public /* synthetic */ u() {
        this.a = 1;
    }

    @Override // V0.q, V0.n
    public void a(p pVar) {
        switch (this.a) {
            case 0:
                C0446a c0446a = (C0446a) this.f5162b;
                c0446a.f5099U.remove(pVar);
                if (!c0446a.v()) {
                    c0446a.z(c0446a, o.f5127e, false);
                    c0446a.f5143J = true;
                    c0446a.z(c0446a, o.f5126d, false);
                }
                break;
        }
    }

    @Override // V0.q, V0.n
    public void d(p pVar) {
        switch (this.a) {
            case 1:
                C0446a c0446a = (C0446a) this.f5162b;
                int i10 = c0446a.f5101W - 1;
                c0446a.f5101W = i10;
                if (i10 == 0) {
                    c0446a.f5102X = false;
                    c0446a.p();
                }
                pVar.C(this);
                break;
            case 2:
                this.f5162b.E();
                pVar.C(this);
                break;
        }
    }

    @Override // V0.q, V0.n
    public void e(p pVar) {
        switch (this.a) {
            case 1:
                C0446a c0446a = (C0446a) this.f5162b;
                if (!c0446a.f5102X) {
                    c0446a.N();
                    c0446a.f5102X = true;
                }
                break;
        }
    }

    public /* synthetic */ u(p pVar, int i10) {
        this.a = i10;
        this.f5162b = pVar;
    }
}
