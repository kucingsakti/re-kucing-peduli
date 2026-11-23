package J0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class J extends A {
    public boolean a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0264n f2247b;

    public J(C0264n c0264n) {
        this.f2247b = c0264n;
    }

    @Override // J0.A
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.a) {
            this.a = false;
            this.f2247b.l();
        }
    }

    @Override // J0.A
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.a = true;
    }
}
