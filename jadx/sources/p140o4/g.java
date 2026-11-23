package p140o4;

import E4.B;
import O3.z;
import P2.f;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p081i3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Service {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ExecutorService f13753s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B f13754t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f13755u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13756v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13757w;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13753s = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f13755u = new Object();
        this.f13757w = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            A.b(intent);
        }
        synchronized (this.f13755u) {
            try {
                int i10 = this.f13757w - 1;
                this.f13757w = i10;
                if (i10 == 0) {
                    stopSelfResult(this.f13756v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.f13754t == null) {
                this.f13754t = new B(new b(this, 9));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13754t;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f13753s.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f13755u) {
            this.f13756v = i11;
            this.f13757w++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) r.n().f13785w).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13753s.execute(new z(this, intent2, taskCompletionSource, 8));
        f fVar = taskCompletionSource.a;
        if (fVar.j()) {
            a(intent);
            return 2;
        }
        fVar.m(new G0.b(0), new B(this, intent));
        return 3;
    }
}
