package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class zzfx {
    public static zzfz a;

    public static synchronized void a(zzfz zzfzVar) {
        if (a != null) {
            throw new IllegalStateException("init() already called");
        }
        a = zzfzVar;
    }
}
