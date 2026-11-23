package J7;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public final void a(f fVar) {
        try {
            b(fVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            p068ga.l.n(th);
            j.y(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(f fVar);
}
