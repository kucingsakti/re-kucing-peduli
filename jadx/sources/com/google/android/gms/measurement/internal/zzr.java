package com.google.android.gms.measurement.internal;

import M2.C0313w;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zzr {
    public final zzhj a;

    public zzr(zzhj zzhjVar) {
        this.a = zzhjVar;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        zzhj zzhjVar = this.a;
        zzhc zzhcVar = zzhjVar.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        if (zzhjVar.h()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        C0313w c0313w = zzhjVar.f9147z;
        zzhj.e(c0313w);
        c0313w.P.b(string);
        zzhj.e(c0313w);
        zzhjVar.f9120F.getClass();
        c0313w.f3145Q.b(System.currentTimeMillis());
    }

    public final boolean b() {
        C0313w c0313w = this.a.f9147z;
        zzhj.e(c0313w);
        return c0313w.f3145Q.a() > 0;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        zzhj zzhjVar = this.a;
        zzhjVar.f9120F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0313w c0313w = zzhjVar.f9147z;
        zzhj.e(c0313w);
        return jCurrentTimeMillis - c0313w.f3145Q.a() > zzhjVar.f9146y.c1(null, zzbf.f8966U);
    }
}
