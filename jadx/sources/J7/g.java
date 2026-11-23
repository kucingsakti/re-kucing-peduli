package J7;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public final void a(i iVar) {
        try {
            b(iVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            p068ga.l.n(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(i iVar);
}
