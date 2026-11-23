package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class PlatformVersion {
    private PlatformVersion() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }
}
