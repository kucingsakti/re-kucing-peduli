package H1;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f1894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f1895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final File f1896i;
    public static volatile u j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile int f1897k;
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1901e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f1902f = new AtomicBoolean(false);

    static {
        int i10 = Build.VERSION.SDK_INT;
        f1894g = i10 < 29;
        f1895h = i10 >= 26;
        f1896i = new File("/proc/self/fd");
        f1897k = -1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    /* JADX WARN: Code duplicated, block: B:14:0x0062  */
    public u() {
        boolean zContains;
        boolean z6;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT != 27) {
                zContains = false;
            } else {
                zContains = Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
            }
            z6 = zContains ? false : true;
        } else {
            Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.MODEL.startsWith((String) it.next())) {
                    }
                } else {
                    if (Build.VERSION.SDK_INT != 27) {
                        zContains = false;
                    } else {
                        zContains = Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
                    }
                    if (zContains) {
                    }
                }
            }
        }
        this.a = z6;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1898b = 20000;
            this.f1899c = 0;
        } else {
            this.f1898b = 700;
            this.f1899c = 128;
        }
    }

    public static u a() {
        if (j == null) {
            synchronized (u.class) {
                try {
                    if (j == null) {
                        j = new u();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public final boolean b(int i10, int i11, boolean z6, boolean z10) {
        boolean z11;
        if (!z6) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!this.a) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!f1895h) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (f1894g && !this.f1902f.get()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z10) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        int i12 = this.f1899c;
        if (i10 < i12) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i11 < i12) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        synchronized (this) {
            try {
                int i13 = this.f1900d + 1;
                this.f1900d = i13;
                if (i13 >= 50) {
                    this.f1900d = 0;
                    int length = f1896i.list().length;
                    long j10 = f1897k != -1 ? f1897k : this.f1898b;
                    boolean z12 = ((long) length) < j10;
                    this.f1901e = z12;
                    if (!z12 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j10);
                    }
                }
                z11 = this.f1901e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z11) {
            return true;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }
}
