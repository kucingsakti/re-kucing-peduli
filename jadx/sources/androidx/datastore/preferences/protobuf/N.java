package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {
    public static final M a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f6420b;

    static {
        M m2;
        try {
            m2 = (M) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            m2 = null;
        }
        a = m2;
        f6420b = new M();
    }
}
