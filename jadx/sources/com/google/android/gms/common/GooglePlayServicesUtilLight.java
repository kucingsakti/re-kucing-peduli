package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class GooglePlayServicesUtilLight {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7835b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7836c = false;
    public static final AtomicBoolean a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f7837d = new AtomicBoolean();

    @KeepForSdk
    public GooglePlayServicesUtilLight() {
    }

    public static boolean a(Context context) {
        try {
            if (!f7836c) {
                PackageInfo packageInfoB = Wrappers.a(context).b(64, "com.google.android.gms");
                GoogleSignatureVerifier.a(context);
                if (packageInfoB == null || GoogleSignatureVerifier.d(packageInfoB, false) || !GoogleSignatureVerifier.d(packageInfoB, true)) {
                    f7835b = false;
                } else {
                    f7835b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f7836c = true;
        }
        return f7835b || !"user".equals(Build.TYPE);
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
