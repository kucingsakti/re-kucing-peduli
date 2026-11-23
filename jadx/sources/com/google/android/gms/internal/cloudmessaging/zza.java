package com.google.android.gms.internal.cloudmessaging;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
