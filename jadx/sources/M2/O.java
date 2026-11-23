package M2;

import A1.RunnableC0092a;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import com.google.android.gms.measurement.internal.zziv;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class O implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2922t;

    public /* synthetic */ O(Object obj, int i10) {
        this.f2921s = i10;
        this.f2922t = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2921s) {
            case 0:
                ((zziv) this.f2922t).l().f1(runnable);
                break;
            case 1:
                ((zza) this.f2922t).post(runnable);
                break;
            case 2:
                ((ExecutorService) this.f2922t).execute(new RunnableC0092a(runnable, 3));
                break;
            case 3:
                ((Handler) ((Y1.c) this.f2922t).f5671u).post(runnable);
                break;
            default:
                ((Handler) this.f2922t).post(runnable);
                break;
        }
    }

    public O(int i10) {
        this.f2921s = i10;
        switch (i10) {
            case 4:
                this.f2922t = new Handler(Looper.getMainLooper());
                break;
            default:
                zza zzaVar = new zza(Looper.getMainLooper());
                Looper.getMainLooper();
                this.f2922t = zzaVar;
                break;
        }
    }
}
