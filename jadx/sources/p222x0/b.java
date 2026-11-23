package p222x0;

import C0.p;
import android.content.Context;
import com.kcstream.cing.MainApp;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f15705f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static b f15706g;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15707b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15708c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15709d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f15710e;

    public b(Context context) {
        this.a = context;
        this.f15710e = new p(this, context.getMainLooper(), 3);
    }

    public static b a(MainApp mainApp) {
        b bVar;
        synchronized (f15705f) {
            try {
                if (f15706g == null) {
                    f15706g = new b(mainApp.getApplicationContext());
                }
                bVar = f15706g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
