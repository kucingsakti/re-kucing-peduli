package com.google.android.gms.measurement.internal;

import B4.I;
import M2.C0313w;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzoj;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzko implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ I f9222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f9223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ IOException f9224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ byte[] f9225v;

    @Override // java.lang.Runnable
    public final void run() {
        zzhj zzhjVar = ((zzhl) this.f9222s.f632u).a;
        zzfw zzfwVar = zzhjVar.f9115A;
        int i10 = this.f9223t;
        IOException iOException = this.f9224u;
        if ((i10 != 200 && i10 != 204 && i10 != 304) || iOException != null) {
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), iOException);
            return;
        }
        C0313w c0313w = zzhjVar.f9147z;
        zzhj.e(c0313w);
        c0313w.f3142M.a(true);
        byte[] bArr = this.f9225v;
        if (bArr == null || bArr.length == 0) {
            zzhj.g(zzfwVar);
            zzfwVar.f9051E.b("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(strOptString)) {
                zzhj.g(zzfwVar);
                zzfwVar.f9051E.b("Deferred Deep Link is empty.");
                return;
            }
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            String strOptString4 = jSONObject.optString("gad_source", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            zzoj.a();
            zzag zzagVar = zzhjVar.f9146y;
            zzfj zzfjVar = zzbf.f8950L0;
            boolean zH1 = zzagVar.h1(null, zzfjVar);
            zznp zznpVar = zzhjVar.f9118D;
            if (zH1) {
                zzhj.e(zznpVar);
                if (!zznpVar.f2(strOptString)) {
                    zzhj.g(zzfwVar);
                    zzfwVar.f9047A.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                } else {
                    if (!TextUtils.isEmpty(strOptString3)) {
                        bundle.putString("gbraid", strOptString3);
                    }
                    if (!TextUtils.isEmpty(strOptString4)) {
                        bundle.putString("gad_source", strOptString4);
                    }
                }
            } else {
                zzhj.e(zznpVar);
                if (!zznpVar.f2(strOptString)) {
                    zzhj.g(zzfwVar);
                    zzfwVar.f9047A.c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                    return;
                }
            }
            zzoj.a();
            zzagVar.h1(null, zzfjVar);
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            zzhjVar.f9122H.B1("auto", "_cmp", bundle);
            zzhj.e(zznpVar);
            if (TextUtils.isEmpty(strOptString) || !zznpVar.F1(strOptString, dOptDouble)) {
                return;
            }
            ((zzhj) zznpVar.f577s).f9140s.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e10) {
            zzhj.g(zzfwVar);
            zzfwVar.f9056x.a(e10, "Failed to parse the Deferred Deep Link response. exception");
        }
    }
}
