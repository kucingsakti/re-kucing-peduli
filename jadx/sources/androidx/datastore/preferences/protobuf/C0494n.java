package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0494n {
    public static volatile C0494n a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0494n f6500b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        C0494n c0494n = new C0494n();
        Map map = Collections.EMPTY_MAP;
        f6500b = c0494n;
    }

    public static C0494n a() {
        C0494n c0494n;
        C0494n c0494n2 = a;
        if (c0494n2 != null) {
            return c0494n2;
        }
        synchronized (C0494n.class) {
            try {
                c0494n = a;
                if (c0494n == null) {
                    Class cls = AbstractC0493m.a;
                    if (cls != null) {
                        try {
                            c0494n = (C0494n) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                            c0494n = f6500b;
                        }
                    } else {
                        c0494n = f6500b;
                    }
                    a = c0494n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0494n;
    }
}
