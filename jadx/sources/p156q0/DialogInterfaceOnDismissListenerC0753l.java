package p156q0;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: q0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0753l implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0756o f14334s;

    public DialogInterfaceOnDismissListenerC0753l(DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o) {
        this.f14334s = dialogInterfaceOnCancelListenerC0756o;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o = this.f14334s;
        Dialog dialog = dialogInterfaceOnCancelListenerC0756o.f14341E0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0756o.onDismiss(dialog);
        }
    }
}
