package p045e7;

import J7.n;
import N7.b;
import N7.c;
import N7.d;
import T7.k;
import V.h;
import android.util.Log;
import d7.a;
import d7.e;
import java.util.concurrent.TimeUnit;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d, c, b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f10717s = new f();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f10718t = new f();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f f10719u = new f();

    @Override // N7.d
    public boolean a(Object obj) {
        e eVar = (e) obj;
        i.f(eVar, "event");
        return (eVar instanceof d7.d) || (eVar instanceof a);
    }

    @Override // N7.b
    public void accept(Object obj) {
        Log.i("BiometricAuth", "Timer error", (Throwable) obj);
    }

    @Override // N7.c
    public Object apply(Object obj) {
        e eVar = (e) obj;
        i.f(eVar, "event");
        if (!(eVar instanceof a)) {
            return new k(eVar, 3);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n nVar = p046e8.f.a;
        P7.a.a(timeUnit, "unit is null");
        P7.a.a(nVar, "scheduler is null");
        return new X7.a(new k(nVar), new h(eVar, 21), 0);
    }
}
