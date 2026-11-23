package N9;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3483s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f3484t;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3483s) {
            case 0:
                Thread thread = new Thread(runnable, this.f3484t);
                thread.setDaemon(true);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, this.f3484t);
                thread2.setPriority(10);
                return thread2;
        }
    }
}
