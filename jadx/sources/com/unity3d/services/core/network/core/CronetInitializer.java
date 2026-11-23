package com.unity3d.services.core.network.core;

import P2.d;
import P2.f;
import R0.b;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p076h8.m;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/core/network/core/CronetInitializer;", "LR0/b;", "Lh8/m;", "<init>", "()V", "", "startTime", "", "success", "sendDuration", "(JZ)V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CronetInitializer implements b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$0(CronetInitializer cronetInitializer, long j, Task task) {
        i.f(cronetInitializer, "this$0");
        i.f(task, "it");
        cronetInitializer.sendDuration(j, task.k());
    }

    private final void sendDuration(long startTime, boolean success) {
        SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);
        sDKMetricsSender.sendMetric(success ? new Metric("native_cronet_play_services_success", Long.valueOf(millis), null, 4, null) : new Metric("native_cronet_play_services_failure", Long.valueOf(millis), null, 4, null));
    }

    @Override // R0.b
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m65create(context);
        return m.a;
    }

    @Override // R0.b
    public List<Class<? extends b>> dependencies() {
        return s.f12328s;
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public void m65create(final Context context) {
        DynamiteModule dynamiteModule;
        i.f(context, "context");
        long jNanoTime = System.nanoTime();
        GoogleApiAvailabilityLight googleApiAvailabilityLight = CronetProviderInstaller.a;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (CronetProviderInstaller.f9360b) {
            dynamiteModule = CronetProviderInstaller.f9361c;
        }
        if (dynamiteModule != null) {
            taskCompletionSource.b(null);
        } else {
            new Thread(new Runnable() { // from class: com.google.android.gms.net.zza
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    try {
                        CronetProviderInstaller.b(context2);
                        taskCompletionSource2.b(null);
                    } catch (Exception e10) {
                        taskCompletionSource2.a(e10);
                    }
                }
            }).start();
        }
        a aVar = new a(this, jNanoTime);
        f fVar = taskCompletionSource.a;
        fVar.getClass();
        fVar.f3854b.h(new d(TaskExecutors.a, aVar));
        fVar.s();
    }
}
