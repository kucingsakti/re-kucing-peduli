package com.google.android.gms.internal.base;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class zap {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
