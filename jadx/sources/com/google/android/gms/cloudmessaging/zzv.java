package com.google.android.gms.cloudmessaging;

import P2.f;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p196u2.b;
import p196u2.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzv {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static zzv f7808e;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f7809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f7810c = new b(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7811d = 1;

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7809b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized zzv a(Context context) {
        try {
            if (f7808e == null) {
                f7808e = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7808e;
    }

    public final synchronized f b(c cVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(cVar.toString());
            }
            if (!this.f7810c.d(cVar)) {
                b bVar = new b(this);
                this.f7810c = bVar;
                bVar.d(cVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return cVar.f15298b.a;
    }
}
