package Y9;

import java.util.concurrent.ThreadFactory;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f5819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f5820t;

    public /* synthetic */ b(String str, boolean z6) {
        this.f5819s = str;
        this.f5820t = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f5819s;
        i.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f5820t);
        return thread;
    }
}
