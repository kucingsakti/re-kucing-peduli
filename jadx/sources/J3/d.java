package J3;

import A1.r;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f2380t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Runnable f2381u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f2382v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f2383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2384x;

    public /* synthetic */ d(g gVar, Runnable runnable, long j, long j10, TimeUnit timeUnit, int i10) {
        this.f2379s = i10;
        this.f2380t = gVar;
        this.f2381u = runnable;
        this.f2382v = j;
        this.f2383w = j10;
        this.f2384x = timeUnit;
    }

    @Override // J3.h
    public final ScheduledFuture a(r rVar) {
        switch (this.f2379s) {
            case 0:
                g gVar = this.f2380t;
                return gVar.f2394t.scheduleAtFixedRate(new e(gVar, this.f2381u, rVar, 0), this.f2382v, this.f2383w, this.f2384x);
            default:
                g gVar2 = this.f2380t;
                return gVar2.f2394t.scheduleWithFixedDelay(new e(gVar2, this.f2381u, rVar, 2), this.f2382v, this.f2383w, this.f2384x);
        }
    }
}
