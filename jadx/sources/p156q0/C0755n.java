package p156q0;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: q0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0755n extends y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f14335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0756o f14336t;

    public C0755n(DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o, r rVar) {
        this.f14336t = dialogInterfaceOnCancelListenerC0756o;
        this.f14335s = rVar;
    }

    @Override // p156q0.y
    public final View c(int i10) {
        r rVar = this.f14335s;
        if (rVar.d()) {
            return rVar.c(i10);
        }
        Dialog dialog = this.f14336t.f14341E0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // p156q0.y
    public final boolean d() {
        return this.f14335s.d() || this.f14336t.f14345I0;
    }
}
