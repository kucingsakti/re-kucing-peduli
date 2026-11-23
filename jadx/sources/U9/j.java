package U9;

import G9.p;
import S9.u;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f5055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f5056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f5057h;

    static {
        String property;
        int i10 = u.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        f5051b = S9.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = u.a;
        if (i11 < 2) {
            i11 = 2;
        }
        f5052c = S9.a.j(i11, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        f5053d = S9.a.j(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        f5054e = TimeUnit.SECONDS.toNanos(S9.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5055f = f.a;
        f5056g = new p(0);
        f5057h = new p(1);
    }
}
