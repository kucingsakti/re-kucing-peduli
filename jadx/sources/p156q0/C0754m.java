package p156q0;

import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.B;
import androidx.lifecycle.InterfaceC0523s;
import java.util.Objects;

/* JADX INFO: renamed from: q0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754m implements B {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0756o a;

    public C0754m(DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o) {
        this.a = dialogInterfaceOnCancelListenerC0756o;
    }

    @Override // androidx.lifecycle.B
    public final void a(Object obj) {
        if (((InterfaceC0523s) obj) != null) {
            DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o = this.a;
            if (dialogInterfaceOnCancelListenerC0756o.f14337A0) {
                View viewY = dialogInterfaceOnCancelListenerC0756o.Y();
                if (viewY.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0756o.f14341E0 != null) {
                    if (e.K(3)) {
                        Objects.toString(dialogInterfaceOnCancelListenerC0756o.f14341E0);
                    }
                    dialogInterfaceOnCancelListenerC0756o.f14341E0.setContentView(viewY);
                }
            }
        }
    }
}
