package p077ha;

import X9.E;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import p048ea.f;
import p086i8.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f11891b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r10 = E.class.getPackage();
        String name = r10 == null ? null : r10.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(E.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(p010aa.c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f11891b = y.A(linkedHashMap);
    }
}
