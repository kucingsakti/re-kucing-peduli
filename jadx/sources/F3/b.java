package F3;

import A3.AbstractC0119q;
import G3.d;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C0599x;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import o1.k;
import p170r3.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f1484c;
    public final AppMeasurementSdk a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1485b;

    public b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.i(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.f1485b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        boolean z6;
        Object obj;
        boolean z10 = false;
        if (G3.b.f1692c.contains(str)) {
            return;
        }
        if (!G3.b.f1691b.contains(str2)) {
            AbstractC0119q abstractC0119q = G3.b.f1693d;
            int size = abstractC0119q.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z6 = true;
                    break;
                }
                Object obj2 = abstractC0119q.get(i10);
                i10++;
                if (bundle.containsKey((String) obj2)) {
                    z6 = false;
                    break;
                }
            }
        } else {
            z6 = false;
            break;
        }
        if (z6) {
            if (!"_cmp".equals(str2)) {
                z10 = true;
            } else if (!G3.b.f1692c.contains(str)) {
                AbstractC0119q abstractC0119q2 = G3.b.f1693d;
                int size2 = abstractC0119q2.size();
                int i11 = 0;
                do {
                    if (i11 < size2) {
                        obj = abstractC0119q2.get(i11);
                        i11++;
                    } else {
                        switch (str) {
                            case "fcm":
                                bundle.putString("_cis", "fcm_integration");
                                break;
                            case "fdl":
                                bundle.putString("_cis", "fdl_integration");
                                break;
                            case "fiam":
                                bundle.putString("_cis", "fiam_integration");
                                break;
                        }
                        z10 = true;
                    }
                } while (!bundle.containsKey((String) obj));
            }
            if (z10) {
                if ("clx".equals(str) && "_ae".equals(str2)) {
                    bundle.putLong("_r", 1L);
                }
                zzdq zzdqVar = this.a.a;
                zzdqVar.getClass();
                zzdqVar.b(new C0599x(zzdqVar, str, str2, bundle, 1));
            }
        }
    }

    public final e b(String str, k kVar) {
        Object obj;
        G3.c cVar;
        G3.a aVar;
        if (!G3.b.f1692c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f1485b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (zEquals) {
                    aVar = new G3.a();
                    aVar.f1690b = kVar;
                    appMeasurementSdk.a(new d(aVar));
                    aVar.a = new HashSet();
                } else if ("clx".equals(str)) {
                    cVar = new G3.c();
                    cVar.a = kVar;
                    appMeasurementSdk.a(new G3.e(cVar));
                } else {
                    obj = null;
                }
                if (obj != null) {
                    obj = cVar;
                    obj = aVar;
                    concurrentHashMap.put(str, obj);
                    return new e(3);
                }
            }
        }
        obj = cVar;
        obj = aVar;
        return null;
    }
}
