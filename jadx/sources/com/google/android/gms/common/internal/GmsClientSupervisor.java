package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class GmsClientSupervisor {
    public static final Object a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p233y2.d f8110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f8111c;

    public static p233y2.d a(Context context) {
        synchronized (a) {
            try {
                if (f8110b == null) {
                    f8110b = new p233y2.d(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8110b;
    }

    public static HandlerThread b() {
        synchronized (a) {
            try {
                HandlerThread handlerThread = f8111c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f8111c = handlerThread2;
                handlerThread2.start();
                return f8111c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
