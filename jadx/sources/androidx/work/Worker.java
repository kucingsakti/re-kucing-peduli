package androidx.work;

import A1.RunnableC0094c;
import C3.d;
import P2.g;
import android.content.Context;
import p050f1.n;
import p050f1.p;
import p157q1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f7207s;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract n a();

    @Override // p050f1.p
    public final d getForegroundInfoAsync() {
        k kVar = new k();
        getBackgroundExecutor().execute(new g((Object) this, (Object) kVar, 6, false));
        return kVar;
    }

    @Override // p050f1.p
    public final d startWork() {
        this.f7207s = new k();
        getBackgroundExecutor().execute(new RunnableC0094c(this, 24));
        return this.f7207s;
    }
}
