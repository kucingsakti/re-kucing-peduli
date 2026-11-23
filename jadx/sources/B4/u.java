package B4;

import android.app.Dialog;
import android.content.DialogInterface;
import p156q0.DialogInterfaceOnCancelListenerC0756o;

/* JADX INFO: loaded from: classes.dex */
public final class u implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f715t;

    public /* synthetic */ u(Object obj, int i10) {
        this.f714s = i10;
        this.f715t = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f714s) {
            case 0:
                dialogInterface.dismiss();
                B.n(((B) this.f715t).f607e);
                break;
            case 1:
                dialogInterface.dismiss();
                B.n(((B) this.f715t).f608f);
                break;
            default:
                DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o = (DialogInterfaceOnCancelListenerC0756o) this.f715t;
                Dialog dialog = dialogInterfaceOnCancelListenerC0756o.f14341E0;
                if (dialog != null) {
                    dialogInterfaceOnCancelListenerC0756o.onCancel(dialog);
                }
                break;
        }
    }
}
