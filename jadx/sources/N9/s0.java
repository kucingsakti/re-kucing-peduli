package N9;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static T a() {
        ThreadLocal threadLocal = a;
        T t7 = (T) threadLocal.get();
        if (t7 != null) {
            return t7;
        }
        C0321d c0321d = new C0321d(Thread.currentThread());
        threadLocal.set(c0321d);
        return c0321d;
    }
}
