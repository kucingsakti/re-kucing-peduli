package p028c8;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final b a = new b("No further exceptions");

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
