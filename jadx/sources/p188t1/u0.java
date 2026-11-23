package p188t1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.kcstream.cing.MainApp;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p086i8.C;
import p204v1.d;
import p204v1.f;
import p204v1.j;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f15096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f15097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f15098i;
    public final j j;

    static {
        AbstractC0487g.r("2840", "0D6DBAC01EEAD7AE8870");
    }

    public u0(f fVar, j jVar) {
        super(fVar);
        this.f15096g = System.currentTimeMillis();
        this.j = jVar;
    }

    @Override // p188t1.Q
    public final boolean c() {
        return false;
    }

    public final void n(F f10) {
        e(C.a(C.c("0D6DBAC01EEAD7AE8870")), f10);
        if (f10.b()) {
            String strA = C.a(C.c("0D6DBAC01EEAD7AE8870"));
            this.j.f15406b.getClass();
            c(0, strA);
        }
        f10.a();
    }

    @Override // p188t1.Q
    public final void a(MainApp mainApp) {
    }
}
