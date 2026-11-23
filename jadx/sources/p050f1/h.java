package p050f1;

import java.util.concurrent.Executor;
import p210v8.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f11411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ h[] f11412t;

    static {
        h hVar = new h("INSTANCE", 0);
        f11411s = hVar;
        f11412t = new h[]{hVar};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f11412t.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i.f(runnable, "command");
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
