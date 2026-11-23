package X2;

import android.app.Dialog;
import p078i.G;

/* JADX INFO: loaded from: classes.dex */
public class i extends G {
    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public final void g0() {
        Dialog dialog = this.f14341E0;
        if (dialog instanceof h) {
            h hVar = (h) dialog;
            if (hVar.f5405x == null) {
                hVar.h();
            }
            boolean z6 = hVar.f5405x.f9513a0;
        }
        i0(false, false);
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public final void h0() {
        Dialog dialog = this.f14341E0;
        if (dialog instanceof h) {
            h hVar = (h) dialog;
            if (hVar.f5405x == null) {
                hVar.h();
            }
            boolean z6 = hVar.f5405x.f9513a0;
        }
        super.h0();
    }

    @Override // p078i.G, p156q0.DialogInterfaceOnCancelListenerC0756o
    public Dialog k0() {
        return new h(m(), j0());
    }
}
