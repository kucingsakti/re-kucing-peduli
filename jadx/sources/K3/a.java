package K3;

import A1.C0099h;
import A1.r;
import O3.p;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o1.k;
import p040e1.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements N3.a, M3.a, p073h4.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f2576s;

    public /* synthetic */ a(b bVar) {
        this.f2576s = bVar;
    }

    @Override // p073h4.a
    public void c(p073h4.b bVar) {
        b bVar2 = this.f2576s;
        bVar2.getClass();
        Log.isLoggable("FirebaseCrashlytics", 3);
        F3.a aVar = (F3.a) bVar.get();
        j jVar = new j(aVar, 20);
        k kVar = new k();
        F3.b bVar3 = (F3.b) aVar;
        p170r3.e eVarB = bVar3.b("clx", kVar);
        if (eVarB == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            p170r3.e eVarB2 = bVar3.b("crash", kVar);
            if (eVarB2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            eVarB = eVarB2;
        }
        if (eVarB == null) {
            Log.w("FirebaseCrashlytics", "Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        r rVar = new r(25, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C0099h c0099h = new C0099h(jVar);
        synchronized (bVar2) {
            try {
                Iterator it = ((ArrayList) bVar2.a).iterator();
                while (it.hasNext()) {
                    rVar.e((p) it.next());
                }
                kVar.f13639t = rVar;
                kVar.f13638s = c0099h;
                bVar2.f2578c = rVar;
                bVar2.f2577b = c0099h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N3.a
    public void e(p pVar) {
        b bVar = this.f2576s;
        synchronized (bVar) {
            if (((N3.a) bVar.f2578c) instanceof N3.b) {
                ((ArrayList) bVar.a).add(pVar);
            }
            ((N3.a) bVar.f2578c).e(pVar);
        }
    }

    @Override // M3.a
    public void z(Bundle bundle) {
        ((M3.a) this.f2576s.f2577b).z(bundle);
    }
}
