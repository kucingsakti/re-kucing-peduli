package A1;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: A1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0093b implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f86s;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f86s) {
            case 0:
                return new Thread(new RunnableC0092a(runnable, 0), "glide-active-resources");
            default:
                return new R.i(runnable);
        }
    }
}
