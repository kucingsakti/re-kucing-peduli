package K3;

import M2.I;
import O3.B;
import O3.r;
import O3.z;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f2579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f2580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ V3.b f2581u;

    public c(boolean z6, r rVar, V3.b bVar) {
        this.f2579s = z6;
        this.f2580t = rVar;
        this.f2581u = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!this.f2579s) {
            return null;
        }
        r rVar = this.f2580t;
        I i10 = new I(rVar, 5, this.f2581u);
        ExecutorService executorService = B.a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ExecutorService executorService2 = rVar.f3569l;
        executorService2.execute(new z(i10, executorService2, taskCompletionSource, 0));
        return null;
    }
}
