package com.google.android.gms.common.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class UidVerifier {
    private UidVerifier() {
    }

    public static boolean a(Context context, int i10) {
        if (b(i10, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier googleSignatureVerifierA = GoogleSignatureVerifier.a(context);
                googleSignatureVerifierA.getClass();
                if (packageInfo != null) {
                    if (!GoogleSignatureVerifier.d(packageInfo, false)) {
                        if (GoogleSignatureVerifier.d(packageInfo, true)) {
                            if (!GooglePlayServicesUtilLight.a(googleSignatureVerifierA.a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("UidVerifier", 3);
            }
        }
        return false;
    }

    public static boolean b(int i10, Context context, String str) {
        PackageManagerWrapper packageManagerWrapperA = Wrappers.a(context);
        packageManagerWrapperA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) packageManagerWrapperA.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
