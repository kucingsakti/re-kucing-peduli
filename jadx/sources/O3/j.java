package O3;

import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f3527d = new h(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f3528e = new i(0);
    public final T3.c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3529b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3530c = null;

    public j(T3.c cVar) {
        this.a = cVar;
    }

    public static void a(T3.c cVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
