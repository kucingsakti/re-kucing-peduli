package M2;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcz;

/* JADX INFO: renamed from: M2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0300i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile zzcz f3025d;
    public final M a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3.c f3026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f3027c;

    public AbstractC0300i(M m2) {
        Preconditions.i(m2);
        this.a = m2;
        this.f3026b = new C3.c(this, m2, 10, false);
    }

    public final void a() {
        this.f3027c = 0L;
        d().removeCallbacks(this.f3026b);
    }

    public final void b(long j) {
        a();
        if (j >= 0) {
            this.f3027c = this.a.a().a();
            if (d().postDelayed(this.f3026b, j)) {
                return;
            }
            this.a.i().f9056x.a(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public abstract void c();

    public final Handler d() {
        zzcz zzczVar;
        if (f3025d != null) {
            return f3025d;
        }
        synchronized (AbstractC0300i.class) {
            try {
                if (f3025d == null) {
                    f3025d = new zzcz(this.a.b().getMainLooper());
                }
                zzczVar = f3025d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzczVar;
    }
}
