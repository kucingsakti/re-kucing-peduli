package E3;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C0590q;
import com.google.android.gms.internal.measurement.C0596u;
import com.google.android.gms.internal.measurement.C0597v;
import com.google.android.gms.internal.measurement.C0598w;
import com.google.android.gms.internal.measurement.C0599x;
import com.google.android.gms.internal.measurement.C0601z;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.measurement.internal.zzkk;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class a implements zzkk {
    public final /* synthetic */ zzdq a;

    public a(zzdq zzdqVar) {
        this.a = zzdqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void a(String str, String str2, Bundle bundle) {
        zzdq zzdqVar = this.a;
        zzdqVar.b(new C0599x(zzdqVar, str, str2, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final List b(String str, String str2) {
        zzdq zzdqVar = this.a;
        zzdc zzdcVar = new zzdc();
        zzdqVar.b(new C0598w(zzdqVar, str, str2, zzdcVar));
        List list = (List) zzdc.i0(zzdcVar.h0(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void c(String str) {
        zzdq zzdqVar = this.a;
        zzdqVar.b(new C0597v(zzdqVar, str, 2));
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final Map d(String str, String str2, boolean z6) {
        zzdq zzdqVar = this.a;
        zzdc zzdcVar = new zzdc();
        zzdqVar.b(new A(zzdqVar, str, str2, z6, zzdcVar));
        Bundle bundleH0 = zzdcVar.h0(5000L);
        if (bundleH0 == null || bundleH0.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleH0.size());
        for (String str3 : bundleH0.keySet()) {
            Object obj = bundleH0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void e(String str, String str2, Bundle bundle) {
        zzdq zzdqVar = this.a;
        zzdqVar.b(new C0599x(zzdqVar, str, str2, bundle, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final long f() {
        zzdq zzdqVar = this.a;
        zzdc zzdcVar = new zzdc();
        zzdqVar.b(new C0601z(zzdqVar, zzdcVar, 3));
        Long l4 = (Long) zzdc.i0(zzdcVar.h0(500L), Long.class);
        if (l4 != null) {
            return l4.longValue();
        }
        long jNanoTime = System.nanoTime();
        zzdqVar.f8566b.getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i10 = zzdqVar.f8570f + 1;
        zzdqVar.f8570f = i10;
        return jNextLong + ((long) i10);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String g() {
        zzdq zzdqVar = this.a;
        zzdc zzdcVar = new zzdc();
        zzdqVar.b(new C0601z(zzdqVar, zzdcVar, 4));
        return (String) zzdc.i0(zzdcVar.h0(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String h() {
        zzdq zzdqVar = this.a;
        zzdc zzdcVar = new zzdc();
        zzdqVar.b(new C0601z(zzdqVar, zzdcVar, 2));
        return (String) zzdc.i0(zzdcVar.h0(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String i() {
        zzdq zzdqVar = this.a;
        zzdc zzdcVar = new zzdc();
        zzdqVar.b(new C0601z(zzdqVar, zzdcVar, 1));
        return (String) zzdc.i0(zzdcVar.h0(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final String j() {
        zzdq zzdqVar = this.a;
        zzdc zzdcVar = new zzdc();
        zzdqVar.b(new C0601z(zzdqVar, zzdcVar, 0));
        return (String) zzdc.i0(zzdcVar.h0(50L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final int k(String str) {
        zzdq zzdqVar = this.a;
        zzdc zzdcVar = new zzdc();
        zzdqVar.b(new C0590q(zzdqVar, str, zzdcVar, 1));
        Integer num = (Integer) zzdc.i0(zzdcVar.h0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void l(Bundle bundle) {
        zzdq zzdqVar = this.a;
        zzdqVar.b(new C0596u(zzdqVar, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzkk
    public final void m(String str) {
        zzdq zzdqVar = this.a;
        zzdqVar.b(new C0597v(zzdqVar, str, 1));
    }
}
