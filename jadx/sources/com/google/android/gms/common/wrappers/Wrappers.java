package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class Wrappers {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Wrappers f8270b = new Wrappers();
    public PackageManagerWrapper a = null;

    public static PackageManagerWrapper a(Context context) {
        PackageManagerWrapper packageManagerWrapper;
        Wrappers wrappers = f8270b;
        synchronized (wrappers) {
            try {
                if (wrappers.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    wrappers.a = new PackageManagerWrapper(context);
                }
                packageManagerWrapper = wrappers.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return packageManagerWrapper;
    }
}
