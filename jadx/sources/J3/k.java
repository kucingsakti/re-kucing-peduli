package J3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f2402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Handler f2403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ k[] f2404u;

    static {
        k kVar = new k("INSTANCE", 0);
        f2402s = kVar;
        f2404u = new k[]{kVar};
        f2403t = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f2404u.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f2403t.post(runnable);
    }
}
