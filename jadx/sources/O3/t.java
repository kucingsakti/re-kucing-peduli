package O3;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Thread.UncaughtExceptionHandler {
    public final p040e1.j a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V3.b f3580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f3581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L3.b f3582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f3583e = new AtomicBoolean(false);

    public t(p040e1.j jVar, V3.b bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, L3.b bVar2) {
        this.a = jVar;
        this.f3580b = bVar;
        this.f3581c = uncaughtExceptionHandler;
        this.f3582d = bVar2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        AtomicBoolean atomicBoolean = this.f3583e;
        atomicBoolean.set(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3581c;
        if (thread == null || th == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        } else {
            try {
                if (this.f3582d.b()) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                } else {
                    this.a.J(this.f3580b, thread, th);
                }
            } catch (Exception unused) {
            } finally {
                Log.isLoggable("FirebaseCrashlytics", 3);
                uncaughtExceptionHandler.uncaughtException(thread, th);
                atomicBoolean.set(false);
            }
        }
    }
}
