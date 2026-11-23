package J7;

import M2.J;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static T7.k a(Throwable th) {
        P7.a.a(th, "exception is null");
        return new T7.k(new J(th, 1), 2);
    }

    public final void b(p pVar) {
        try {
            c(pVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            p068ga.l.n(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void c(p pVar);
}
