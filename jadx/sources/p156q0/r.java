package p156q0;

import android.view.View;
import androidx.fragment.app.b;

/* JADX INFO: loaded from: classes.dex */
public final class r extends y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f14353s;

    public r(b bVar) {
        this.f14353s = bVar;
    }

    @Override // p156q0.y
    public final View c(int i10) {
        b bVar = this.f14353s;
        View view = bVar.c0;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + bVar + " does not have a view");
    }

    @Override // p156q0.y
    public final boolean d() {
        return this.f14353s.c0 != null;
    }
}
