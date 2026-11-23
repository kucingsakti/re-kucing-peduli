package p045e7;

import A1.J;
import J7.h;
import O7.b;
import R7.a;
import android.view.View;
import com.tailoredapps.biometricauth.BiometricAuthenticationCancelledException;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f10716s;

    public e(h hVar) {
        this.f10716s = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f10716s;
        a aVar = hVar.U0;
        if (aVar != null) {
            b.g(aVar);
        }
        h hVarO0 = h.o0(hVar);
        if (hVarO0 != null) {
            ((U7.b) hVarO0).a(new BiometricAuthenticationCancelledException());
        }
        J j = hVar.f10729Q0;
        if (j == null) {
            i.n("cancellationSignal");
            throw null;
        }
        j.f();
        hVar.h0();
    }
}
