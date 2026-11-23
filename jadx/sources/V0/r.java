package V0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q {
    public final /* synthetic */ p212w.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f5157b;

    public r(s sVar, p212w.e eVar) {
        this.f5157b = sVar;
        this.a = eVar;
    }

    @Override // V0.q, V0.n
    public final void d(p pVar) {
        ((ArrayList) this.a.get(this.f5157b.f5159t)).remove(pVar);
        pVar.C(this);
    }
}
