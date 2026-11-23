package p050f1;

import C3.d;
import M2.RunnableC0315y;
import M2.e0;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p147p1.q;
import p157q1.k;
import p168r1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public p(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f7212f;
    }

    public d getForegroundInfoAsync() {
        k kVar = new k();
        kVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final g getInputData() {
        return this.mWorkerParams.f7208b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f7210d.f5672v;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f7211e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f7209c;
    }

    public a getTaskExecutor() {
        return this.mWorkerParams.f7213g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f7210d.f5670t;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f7210d.f5671u;
    }

    public y getWorkerFactory() {
        return this.mWorkerParams.f7214h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final d setForegroundAsync(i iVar) {
        p147p1.p pVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        pVar.getClass();
        k kVar = new k();
        pVar.a.t(new e0(pVar, kVar, id, iVar, applicationContext, 2));
        return kVar;
    }

    public d setProgressAsync(g gVar) {
        q qVar = this.mWorkerParams.f7215i;
        getApplicationContext();
        UUID id = getId();
        qVar.getClass();
        k kVar = new k();
        qVar.f14195b.t(new RunnableC0315y(qVar, id, gVar, kVar, 8));
        return kVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract d startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
