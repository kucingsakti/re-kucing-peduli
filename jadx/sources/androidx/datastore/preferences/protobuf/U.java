package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    public static final T a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f6438b;

    static {
        T t7;
        try {
            t7 = (T) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            t7 = null;
        }
        a = t7;
        f6438b = new T();
    }
}
