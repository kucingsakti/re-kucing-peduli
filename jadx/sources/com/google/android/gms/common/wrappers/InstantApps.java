package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class InstantApps {
    public static Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f8269b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = f8269b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f8269b = null;
        if (PlatformVersion.a()) {
            f8269b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f8269b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f8269b = Boolean.FALSE;
            }
        }
        a = applicationContext;
        return f8269b.booleanValue();
    }
}
