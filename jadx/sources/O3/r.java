package O3;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fa.e f3560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1.k f3561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o1.e f3563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o1.e f3564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f3565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x f3566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T3.c f3567i;
    public final K3.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final K3.a f3568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f3569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o1.h f3570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f3571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final L3.b f3572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A1.r f3573p;

    public r(D3.g gVar, x xVar, L3.b bVar, Fa.e eVar, K3.a aVar, K3.a aVar2, T3.c cVar, ExecutorService executorService, k kVar, A1.r rVar) {
        this.f3560b = eVar;
        gVar.a();
        this.a = gVar.a;
        this.f3566h = xVar;
        this.f3572o = bVar;
        this.j = aVar;
        this.f3568k = aVar2;
        this.f3569l = executorService;
        this.f3567i = cVar;
        this.f3570m = new o1.h(executorService);
        this.f3571n = kVar;
        this.f3573p = rVar;
        this.f3562d = System.currentTimeMillis();
        this.f3561c = new o1.k(8);
    }

    public static Task a(r rVar, V3.b bVar) {
        Boolean bool = Boolean.TRUE;
        o1.h hVar = rVar.f3570m;
        if (!bool.equals(((ThreadLocal) hVar.f13635v).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        o1.e eVar = rVar.f3563e;
        eVar.getClass();
        try {
            String str = (String) eVar.f13627t;
            T3.c cVar = (T3.c) eVar.f13628u;
            cVar.getClass();
            new File((File) cVar.f4658c, str).createNewFile();
        } catch (IOException unused) {
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            rVar.j.e(new p(rVar));
            rVar.f3565g.f();
            if (!bVar.g().f5167b.a) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                return Tasks.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!rVar.f3565g.d(bVar)) {
                Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
            }
            return rVar.f3565g.g(((TaskCompletionSource) ((AtomicReference) bVar.f5179i).get()).a);
        } catch (Exception e10) {
            return Tasks.d(e10);
        } finally {
            hVar.t(new q(rVar, 0));
        }
    }
}
