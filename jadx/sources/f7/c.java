package f7;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f11438s = new c();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
