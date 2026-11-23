package p177s;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
