package p112l7;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final Object a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f12950b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Handler f12951c = new Handler(Looper.getMainLooper());

    public static void a() {
        synchronized (a) {
            LinkedHashMap linkedHashMap = f12950b;
            d dVar = (d) linkedHashMap.get("LibGlobalFetchLib");
            if (dVar != null) {
                dVar.a.b();
                if (dVar.a.e() == 0) {
                    dVar.a.a();
                    dVar.f12948g.e();
                    dVar.f12945d.p();
                    dVar.f12943b.close();
                    dVar.f12947f.j();
                    dVar.f12949h.c();
                    linkedHashMap.remove("LibGlobalFetchLib");
                }
            }
        }
    }
}
