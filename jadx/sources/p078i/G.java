package p078i;

import android.app.Dialog;
import p156q0.DialogInterfaceOnCancelListenerC0756o;

/* JADX INFO: loaded from: classes.dex */
public class G extends DialogInterfaceOnCancelListenerC0756o {
    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public Dialog k0() {
        return new F(m(), j0());
    }

    @Override // p156q0.DialogInterfaceOnCancelListenerC0756o
    public final void m0(Dialog dialog, int i10) {
        if (!(dialog instanceof F)) {
            super.m0(dialog, i10);
            return;
        }
        F f10 = (F) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        f10.d().g(1);
    }
}
