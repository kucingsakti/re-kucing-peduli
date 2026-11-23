package O3;

import android.util.Log;
import java.io.File;
import java.util.NavigableSet;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f3559t;

    public /* synthetic */ q(r rVar, int i10) {
        this.f3558s = i10;
        this.f3559t = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f3558s) {
            case 0:
                try {
                    o1.e eVar = this.f3559t.f3563e;
                    String str = (String) eVar.f13627t;
                    T3.c cVar = (T3.c) eVar.f13628u;
                    cVar.getClass();
                    boolean zDelete = new File((File) cVar.f4658c, str).delete();
                    if (!zDelete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(zDelete);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            default:
                o oVar = this.f3559t.f3565g;
                o1.e eVar2 = oVar.f3544c;
                String str2 = (String) eVar2.f13627t;
                T3.c cVar2 = (T3.c) eVar2.f13628u;
                cVar2.getClass();
                boolean z6 = true;
                if (new File((File) cVar2.f4658c, str2).exists()) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    String str3 = (String) eVar2.f13627t;
                    cVar2.getClass();
                    new File((File) cVar2.f4658c, str3).delete();
                } else {
                    NavigableSet navigableSetC = ((T3.a) oVar.f3553m.f14979t).c();
                    String str4 = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
                    if (str4 == null || !oVar.j.c(str4)) {
                        z6 = false;
                    }
                }
                return Boolean.valueOf(z6);
        }
    }
}
