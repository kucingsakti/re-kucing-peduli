package androidx.work.impl.workers;

import C3.d;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import k1.b;
import kotlin.Metadata;
import p050f1.p;
import p050f1.q;
import p157q1.k;
import p179s1.a;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Lf1/p;", "Lk1/b;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConstraintTrackingWorker extends p implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WorkerParameters f7235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f7236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f7237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f7238v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p f7239w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.f(context, "appContext");
        i.f(workerParameters, "workerParameters");
        this.f7235s = workerParameters;
        this.f7236t = new Object();
        this.f7238v = new k();
    }

    @Override // k1.b
    public final void c(ArrayList arrayList) {
        i.f(arrayList, "workSpecs");
        q qVarA = q.a();
        int i10 = a.a;
        arrayList.toString();
        qVarA.getClass();
        synchronized (this.f7236t) {
            this.f7237u = true;
        }
    }

    @Override // k1.b
    public final void d(List list) {
    }

    @Override // p050f1.p
    public final void onStopped() {
        p pVar = this.f7239w;
        if (pVar == null || pVar.isStopped()) {
            return;
        }
        pVar.stop();
    }

    @Override // p050f1.p
    public final d startWork() {
        getBackgroundExecutor().execute(new B6.d(this, 29));
        k kVar = this.f7238v;
        i.e(kVar, "future");
        return kVar;
    }
}
