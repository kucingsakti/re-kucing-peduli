package p099k4;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p082i4.i;
import p170r3.e;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f12697d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f12698e = TimeUnit.MINUTES.toMillis(30);
    public final i a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12700c;

    public d() {
        if (e.f14468u == null) {
            Pattern pattern = i.f12282c;
            e.f14468u = new e(23);
        }
        e eVar = e.f14468u;
        if (i.f12283d == null) {
            i.f12283d = new i(eVar);
        }
        this.a = i.f12283d;
    }

    public final synchronized long a(int i10) {
        try {
            if (!(i10 == 429 || (i10 >= 500 && i10 < 600))) {
                return f12697d;
            }
            double dPow = Math.pow(2.0d, this.f12700c);
            this.a.getClass();
            return (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f12698e);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    public final synchronized boolean b() {
        boolean z6;
        if (this.f12700c != 0) {
            this.a.a.getClass();
            if (System.currentTimeMillis() > this.f12699b) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = true;
        }
        return z6;
    }

    public final synchronized void c() {
        this.f12700c = 0;
    }

    public final synchronized void d(int i10) {
        try {
            if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
                c();
                return;
            }
            this.f12700c++;
            long jA = a(i10);
            this.a.a.getClass();
            this.f12699b = System.currentTimeMillis() + jA;
        } catch (Throwable th) {
            throw th;
        }
    }
}
