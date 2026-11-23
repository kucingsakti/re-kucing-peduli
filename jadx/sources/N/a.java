package N;

import A1.r;
import V.h;
import android.hardware.fingerprint.FingerprintManager;
import d7.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ h a;

    public a(h hVar) {
        this.a = hVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        h hVar = this.a;
        hVar.getClass();
        if (charSequence == null) {
            charSequence = "";
        }
        ((T7.b) hVar.f5078t).d(new d7.a(i10, charSequence));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        h hVar = this.a;
        ((T7.b) hVar.f5078t).d(d7.b.a);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        h hVar = this.a;
        hVar.getClass();
        if (charSequence == null) {
            charSequence = "";
        }
        ((T7.b) hVar.f5078t).d(new d7.c(i10, charSequence));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        p027c7.a aVar;
        r rVar = new r(b.f(b.b(authenticationResult)), 26);
        h hVar = this.a;
        hVar.getClass();
        c cVar = (c) rVar.f167t;
        if (cVar != null) {
            aVar = new p027c7.a(cVar.a, cVar.f3259b, cVar.f3260c);
        } else {
            aVar = null;
        }
        ((T7.b) hVar.f5078t).d(new d(aVar));
    }
}
