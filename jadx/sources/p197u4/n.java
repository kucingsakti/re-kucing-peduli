package p197u4;

import N9.AbstractC0342z;
import android.util.Log;
import java.io.IOException;
import p039e0.f;
import p070h0.b;
import p070h0.e;
import p070h0.g;
import p076h8.m;
import p123m8.j;
import p134n8.a;
import p144o8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f15343c = new e("firebase_sessions_enabled");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f15344d = new e("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f15345e = new e("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f15346f = new e("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f15347g = new e("firebase_sessions_cache_updated_time");
    public final f a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f15348b;

    public n(f fVar) throws Throwable {
        this.a = fVar;
        AbstractC0342z.q(j.f13164s, new k(this, null));
    }

    public static final void a(n nVar, b bVar) {
        nVar.getClass();
        nVar.f15348b = new f((Boolean) bVar.a(f15343c), (Double) bVar.a(f15344d), (Integer) bVar.a(f15345e), (Integer) bVar.a(f15346f), (Long) bVar.a(f15347g));
    }

    public final boolean b() {
        Integer num;
        f fVar = this.f15348b;
        if (fVar == null) {
            i.n("sessionConfigs");
            throw null;
        }
        if (fVar != null) {
            Long l4 = fVar.f15324e;
            return l4 == null || (num = fVar.f15323d) == null || (System.currentTimeMillis() - l4.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        i.n("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(e eVar, Object obj, c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.f15338u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f15338u = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj2 = lVar.f15336s;
        a aVar = a.f13404s;
        int i11 = lVar.f15338u;
        try {
            if (i11 == 0) {
                J7.a.v(obj2);
                f fVar = this.a;
                m mVar = new m(obj, eVar, this, null);
                lVar.f15338u = 1;
                if (fVar.a(new g(mVar, null), lVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj2);
            }
        } catch (IOException e10) {
            Log.w("SettingsCache", "Failed to update cache config value: " + e10);
        }
        return m.a;
    }
}
