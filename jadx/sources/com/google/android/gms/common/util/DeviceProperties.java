package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DeviceProperties {
    public static Boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f8257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f8258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f8259d;

    private DeviceProperties() {
    }

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    public static boolean b(Context context) {
        if (a(context) && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f8257b == null) {
            f8257b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f8257b.booleanValue()) {
            return !PlatformVersion.a() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }
}
