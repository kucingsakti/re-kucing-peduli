package G0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1682s;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1682s) {
            case 0:
                runnable.run();
                break;
            default:
                p155q.a.r().f14246c.f14249d.execute(runnable);
                break;
        }
    }
}
