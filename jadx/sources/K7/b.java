package K7;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final e a;

    static {
        try {
            e eVar = a.a;
            if (eVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = eVar;
        } catch (Throwable th) {
            throw p028c8.c.a(th);
        }
    }
}
