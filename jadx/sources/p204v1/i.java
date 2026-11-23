package p204v1;

import B4.I;
import com.google.android.gms.internal.measurement.S;
import com.kcstream.cing.MainApp;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p086i8.C;
import p181s3.d;
import p188t1.G;
import p188t1.Q;
import p188t1.j0;
import p188t1.r0;
import p188t1.t0;
import p188t1.u0;
import p195u1.b;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final j0 a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15405b;

    static {
        System.loadLibrary(C.a(C.c("1367B7DC18ECD1BE")));
    }

    public i(MainApp mainApp, S s9, String str, G g8, f fVar, b bVar) {
        r0 r0Var = new r0(mainApp);
        f fVar2 = new f(g8, new S(new t0(mainApp), r0Var, 19, false), str, fVar, this);
        this.f15405b = fVar2;
        j jVar = new j(mainApp, (e) fVar.f15396e, r0Var);
        j0 j0Var = new j0(mainApp, s9, fVar2, g8, fVar, jVar);
        this.a = j0Var;
        b bVar2 = new b(mainApp, new u0(fVar2, jVar), r0Var);
        bVar2.a(mainApp);
        u0 u0Var = bVar2.f15382s;
        if (u0Var != null) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            u0Var.f15097h = scheduledExecutorServiceNewScheduledThreadPool;
            u0Var.f15098i = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new d(u0Var, 3), 15L, 10L, TimeUnit.SECONDS);
        }
        bVar2.f15386w.a(bVar2);
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new d(r0Var, 2), 0L, 5L, TimeUnit.SECONDS);
        for (Q q10 : j0Var.a()) {
            if (q10 != null && q10.c()) {
                q10.a(mainApp);
            }
        }
        new Thread(new h(this, mainApp, bVar)).start();
        Executors.newScheduledThreadPool(1).scheduleWithFixedDelay(new I(this.a, mainApp), 180L, 180L, TimeUnit.SECONDS);
        new Thread(new h(this, mainApp)).start();
    }
}
