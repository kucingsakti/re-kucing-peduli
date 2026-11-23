package com.google.android.gms.measurement.internal;

import M2.h0;
import M2.m0;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzmc extends m0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final zzgm f9253A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashMap f9254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zzgm f9255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zzgm f9256x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zzgm f9257y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final zzgm f9258z;

    public zzmc(zznc zzncVar) {
        super(zzncVar);
        this.f9254v = new HashMap();
        this.f9255w = new zzgm(U0(), "last_delete_stale", 0L);
        this.f9256x = new zzgm(U0(), "backoff", 0L);
        this.f9257y = new zzgm(U0(), "last_upload", 0L);
        this.f9258z = new zzgm(U0(), "last_upload_attempt", 0L);
        this.f9253A = new zzgm(U0(), "midnight_offset", 0L);
    }

    @Override // M2.m0
    public final boolean c1() {
        return false;
    }

    public final String d1(String str, boolean z6) {
        W0();
        String str2 = z6 ? (String) e1(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestK2 = zznp.k2();
        if (messageDigestK2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestK2.digest(str2.getBytes())));
    }

    public final Pair e1(String str) throws Throwable {
        h0 h0Var;
        AdvertisingIdClient.Info advertisingIdInfo;
        W0();
        zzhj zzhjVar = (zzhj) this.f577s;
        zzhjVar.f9120F.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f9254v;
        h0 h0Var2 = (h0) map.get(str);
        if (h0Var2 != null && jElapsedRealtime < h0Var2.f3024c) {
            return new Pair(h0Var2.a, Boolean.valueOf(h0Var2.f3023b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        zzag zzagVar = zzhjVar.f9146y;
        zzagVar.getClass();
        long jC1 = zzagVar.c1(str, zzbf.f8976b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzhjVar.f9140s);
            } catch (PackageManager.NameNotFoundException unused) {
                if (h0Var2 != null && jElapsedRealtime < h0Var2.f3024c + zzagVar.c1(str, zzbf.f8978c)) {
                    return new Pair(h0Var2.a, Boolean.valueOf(h0Var2.f3023b));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            h0Var = id != null ? new h0(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jC1) : new h0("", advertisingIdInfo.isLimitAdTrackingEnabled(), jC1);
            map.put(str, h0Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(h0Var.a, Boolean.valueOf(h0Var.f3023b));
        } catch (Exception e10) {
            i().f9051E.a(e10, "Unable to get advertising id");
            h0Var = new h0("", false, jC1);
        }
    }
}
