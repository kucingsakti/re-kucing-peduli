package V0;

import android.view.ViewGroup;

/* JADX INFO: renamed from: V0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0449d extends q {
    public boolean a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f5104b;

    public C0449d(ViewGroup viewGroup) {
        this.f5104b = viewGroup;
    }

    @Override // V0.q, V0.n
    public final void a(p pVar) {
        oa.b.o(this.f5104b, false);
        this.a = true;
    }

    @Override // V0.q, V0.n
    public final void b() {
        oa.b.o(this.f5104b, false);
    }

    @Override // V0.q, V0.n
    public final void c() {
        oa.b.o(this.f5104b, true);
    }

    @Override // V0.q, V0.n
    public final void d(p pVar) {
        if (!this.a) {
            oa.b.o(this.f5104b, false);
        }
        pVar.C(this);
    }
}
