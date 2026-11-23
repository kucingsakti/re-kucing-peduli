package com.google.android.gms.measurement.internal;

import A1.q;
import M2.C0309s;
import M2.n0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzna extends n0 {
    public final q a1(String str) {
        C0309s c0309sO1;
        zzpn.a();
        q qVar = null;
        if (((zzhj) this.f577s).f9146y.h1(null, zzbf.f9008s0)) {
            V0();
            if (zznp.a2(str)) {
                i().f9052F.b("sgtm feature flag enabled.");
                C0309s c0309sO2 = Y0().O1(str);
                if (c0309sO2 == null) {
                    return new q(b1(str), 1);
                }
                String strG = c0309sO2.g();
                com.google.android.gms.internal.measurement.zzfi.zzd zzdVarO1 = Z0().o1(str);
                if (zzdVarO1 == null || (c0309sO1 = Y0().O1(str)) == null || ((!zzdVarO1.T() || zzdVarO1.J().z() != 100) && !V0().Y1(str, c0309sO1.l()) && (TextUtils.isEmpty(strG) || strG.hashCode() % 100 >= zzdVarO1.J().z()))) {
                    return new q(b1(str), 1);
                }
                if (c0309sO2.p()) {
                    i().f9052F.b("sgtm upload enabled in manifest.");
                    com.google.android.gms.internal.measurement.zzfi.zzd zzdVarO2 = Z0().o1(c0309sO2.f());
                    if (zzdVarO2 != null && zzdVarO2.T()) {
                        String strD = zzdVarO2.J().D();
                        if (!TextUtils.isEmpty(strD)) {
                            String strC = zzdVarO2.J().C();
                            i().f9052F.c("sgtm configured with upload_url, server_info", strD, TextUtils.isEmpty(strC) ? "Y" : "N");
                            if (TextUtils.isEmpty(strC)) {
                                qVar = new q(strD, 3);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strC);
                                if (!TextUtils.isEmpty(c0309sO2.l())) {
                                    map.put("x-gtm-server-preview", c0309sO2.l());
                                }
                                qVar = new q(3);
                                qVar.f164c = strD;
                                qVar.f165d = map;
                                qVar.f163b = 3;
                            }
                        }
                    }
                }
                if (qVar != null) {
                    return qVar;
                }
            }
        }
        return new q(b1(str), 1);
    }

    public final String b1(String str) {
        zzgt zzgtVarZ0 = Z0();
        zzgtVarZ0.W0();
        zzgtVarZ0.u1(str);
        String str2 = (String) zzgtVarZ0.f9088D.get(str);
        if (TextUtils.isEmpty(str2)) {
            return (String) zzbf.f9005r.a(null);
        }
        Uri uri = Uri.parse((String) zzbf.f9005r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(str2 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
