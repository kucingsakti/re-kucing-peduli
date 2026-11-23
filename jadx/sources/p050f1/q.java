package p050f1;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f11416b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile q f11417c;
    public final int a;

    public q(int i10) {
        this.a = i10;
    }

    public static q a() {
        q qVar;
        synchronized (f11416b) {
            try {
                if (f11417c == null) {
                    f11417c = new q(3);
                }
                qVar = f11417c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public static String c(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public final void b(String str, String str2) {
        if (this.a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void d(String str, String str2) {
        if (this.a <= 5) {
            Log.w(str, str2);
        }
    }
}
