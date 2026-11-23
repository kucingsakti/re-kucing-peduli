package androidx.work;

import B6.d;
import N9.AbstractC0337u;
import N9.AbstractC0342z;
import N9.C0324g;
import N9.I;
import N9.InterfaceC0331n;
import N9.e0;
import N9.k0;
import P2.g;
import S9.e;
import Y1.c;
import android.content.Context;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlinx.coroutines.JobCancellationException;
import p050f1.f;
import p050f1.h;
import p050f1.p;
import p076h8.m;
import p078i.ExecutorC0659p;
import p157q1.a;
import p157q1.k;
import p210v8.i;
import qa.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\u00020$8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u0019\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lf1/p;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LC3/d;", "Lf1/o;", "startWork", "()LC3/d;", "Lf1/i;", "getForegroundInfo", "(Lm8/d;)Ljava/lang/Object;", "Lf1/g;", JsonStorageKeyNames.DATA_KEY, "Lh8/m;", "setProgress", "(Lf1/g;Lm8/d;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Lf1/i;Lm8/d;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "LN9/n;", "job", "LN9/n;", "getJob$work_runtime_ktx_release", "()LN9/n;", "Lq1/k;", "future", "Lq1/k;", "getFuture$work_runtime_ktx_release", "()Lq1/k;", "LN9/u;", "coroutineContext", "LN9/u;", "getCoroutineContext", "()LN9/u;", "getCoroutineContext$annotations", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class CoroutineWorker extends p {
    private final AbstractC0337u coroutineContext;
    private final k future;
    private final InterfaceC0331n job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.f(context, "appContext");
        i.f(workerParameters, "params");
        this.job = new e0();
        k kVar = new k();
        this.future = kVar;
        kVar.f(new d(this, 18), (ExecutorC0659p) ((c) getTaskExecutor()).f5670t);
        this.coroutineContext = I.a;
    }

    public static void a(CoroutineWorker coroutineWorker) {
        if (coroutineWorker.future.f14401s instanceof a) {
            k0 k0Var = (k0) coroutineWorker.job;
            k0Var.getClass();
            k0Var.k(new JobCancellationException(k0Var.n(), null, k0Var));
        }
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, p123m8.d<? super p050f1.i> dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(p123m8.d dVar);

    public AbstractC0337u getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(p123m8.d<? super p050f1.i> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // p050f1.p
    public final C3.d getForegroundInfoAsync() {
        e0 e0Var = new e0();
        e eVarB = AbstractC0342z.b(getCoroutineContext().plus(e0Var));
        p050f1.k kVar = new p050f1.k(e0Var);
        AbstractC0342z.n(eVarB, null, new p050f1.e(kVar, this, null), 3);
        return kVar;
    }

    /* JADX INFO: renamed from: getFuture$work_runtime_ktx_release, reason: from getter */
    public final k getFuture() {
        return this.future;
    }

    /* JADX INFO: renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final InterfaceC0331n getJob() {
        return this.job;
    }

    @Override // p050f1.p
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(p050f1.i iVar, p123m8.d<? super m> dVar) throws Throwable {
        C3.d foregroundAsync = setForegroundAsync(iVar);
        i.e(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            C0324g c0324g = new C0324g(1, b.q(dVar));
            c0324g.w();
            foregroundAsync.f(new g(c0324g, 5, foregroundAsync), h.f11411s);
            c0324g.y(new e2.b(foregroundAsync, 2));
            Object objV = c0324g.v();
            if (objV == p134n8.a.f13404s) {
                return objV;
            }
        }
        return m.a;
    }

    public final Object setProgress(p050f1.g gVar, p123m8.d<? super m> dVar) throws Throwable {
        C3.d progressAsync = setProgressAsync(gVar);
        i.e(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            C0324g c0324g = new C0324g(1, b.q(dVar));
            c0324g.w();
            progressAsync.f(new g(c0324g, 5, progressAsync), h.f11411s);
            c0324g.y(new e2.b(progressAsync, 2));
            Object objV = c0324g.v();
            if (objV == p134n8.a.f13404s) {
                return objV;
            }
        }
        return m.a;
    }

    @Override // p050f1.p
    public final C3.d startWork() {
        AbstractC0342z.n(AbstractC0342z.b(getCoroutineContext().plus(this.job)), null, new f(this, null), 3);
        return this.future;
    }
}
