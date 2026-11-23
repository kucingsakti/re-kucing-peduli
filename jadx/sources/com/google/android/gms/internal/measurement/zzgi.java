package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public class zzgi {
    public static UserManager a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f8639b = !a();

    private zzgi() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
