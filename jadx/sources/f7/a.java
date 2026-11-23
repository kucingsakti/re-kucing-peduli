package f7;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import com.tailoredapps.biometricauth.BiometricAuthenticationCancelledException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ T7.b a;

    public a(T7.b bVar) {
        this.a = bVar;
    }

    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        if (i10 == 10) {
            this.a.c(new BiometricAuthenticationCancelledException());
            return;
        }
        T7.b bVar = this.a;
        if (charSequence == null) {
            charSequence = "";
        }
        bVar.d(new d7.a(i10, charSequence));
    }

    public final void onAuthenticationFailed() {
        this.a.d(d7.b.a);
    }

    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        T7.b bVar = this.a;
        if (charSequence == null) {
            charSequence = "";
        }
        bVar.d(new d7.c(i10, charSequence));
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        this.a.d(new d7.d((authenticationResult == null || (cryptoObject = authenticationResult.getCryptoObject()) == null) ? null : new p027c7.a(cryptoObject.getSignature(), cryptoObject.getCipher(), cryptoObject.getMac())));
    }
}
