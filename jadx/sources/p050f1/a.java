package p050f1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p239z.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicInteger f11386s = new AtomicInteger(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f11387t;

    public a(boolean z6) {
        this.f11387t = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbC = e.c(this.f11387t ? "WM.task-" : "androidx.work-");
        sbC.append(this.f11386s.incrementAndGet());
        return new Thread(runnable, sbC.toString());
    }
}
