package K6;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {
    public final G6.a a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f2617b;

    public a(G6.a aVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.f2617b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        G6.a aVar = this.a;
        aVar.getClass();
        try {
            aVar.a(th != null ? new M6.a(th) : null);
        } catch (Exception e10) {
            G6.a.f1699e.b("Error while processing payload to send to Rollbar: {}", e10);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2617b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
