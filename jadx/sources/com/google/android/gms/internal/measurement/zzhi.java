package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzhi implements Q {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p212w.e f8666t = new p212w.e(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile Map f8667s;

    public static zzhi a(Context context, zzgy zzgyVar) {
        zzhi zzhiVar;
        if (zzgi.a()) {
            throw null;
        }
        synchronized (zzhi.class) {
            try {
                zzhiVar = (zzhi) f8666t.get(null);
                if (zzhiVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhiVar;
    }

    public static synchronized void b() {
        Iterator it = ((p212w.d) f8666t.values()).iterator();
        if (it.hasNext()) {
            ((zzhi) it.next()).getClass();
            throw null;
        }
        f8666t.clear();
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final Object k(String str) {
        Map map = this.f8667s;
        map.getClass();
        return map.get(str);
    }
}
