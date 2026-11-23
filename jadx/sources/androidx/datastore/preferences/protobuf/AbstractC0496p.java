package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0496p {
    public static final C0495o a = new C0495o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0495o f6503b;

    static {
        C0495o c0495o;
        try {
            c0495o = (C0495o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c0495o = null;
        }
        f6503b = c0495o;
    }
}
