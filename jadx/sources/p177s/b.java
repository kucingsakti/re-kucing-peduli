package p177s;

import android.hardware.biometrics.BiometricManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int a(BiometricManager biometricManager, int i10) {
        return biometricManager.canAuthenticate(i10);
    }
}
