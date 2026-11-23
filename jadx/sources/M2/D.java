package M2;

import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhc;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class D extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f2888s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f2889t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f2890u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ zzhc f2891v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(zzhc zzhcVar, Runnable runnable, boolean z6, String str) {
        super(runnable, null);
        this.f2891v = zzhcVar;
        long andIncrement = zzhc.f9103C.getAndIncrement();
        this.f2888s = andIncrement;
        this.f2890u = str;
        this.f2889t = z6;
        if (andIncrement == Long.MAX_VALUE) {
            zzhcVar.i().f9056x.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        D d3 = (D) obj;
        boolean z6 = d3.f2889t;
        boolean z10 = this.f2889t;
        if (z10 != z6) {
            return z10 ? -1 : 1;
        }
        long j = d3.f2888s;
        long j10 = this.f2888s;
        if (j10 < j) {
            return -1;
        }
        if (j10 > j) {
            return 1;
        }
        this.f2891v.i().f9057y.a(Long.valueOf(j10), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        zzfw zzfwVarI = this.f2891v.i();
        zzfwVarI.f9056x.a(th, this.f2890u);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(zzhc zzhcVar, Callable callable, boolean z6) {
        super(callable);
        this.f2891v = zzhcVar;
        long andIncrement = zzhc.f9103C.getAndIncrement();
        this.f2888s = andIncrement;
        this.f2890u = "Task exception on worker thread";
        this.f2889t = z6;
        if (andIncrement == Long.MAX_VALUE) {
            zzhcVar.i().f9056x.b("Tasks index overflow");
        }
    }
}
