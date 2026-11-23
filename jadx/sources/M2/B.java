package M2;

import com.google.android.gms.measurement.internal.zzhc;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Thread.UncaughtExceptionHandler {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzhc f2883b;

    public B(zzhc zzhcVar, String str) {
        this.f2883b = zzhcVar;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f2883b.i().f9056x.a(th, this.a);
    }
}
