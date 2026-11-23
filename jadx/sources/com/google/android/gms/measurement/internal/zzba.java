package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzba {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzbc f8921f;

    public zzba(zzhj zzhjVar, String str, String str2, String str3, long j, Bundle bundle) {
        zzbc zzbcVar;
        Preconditions.e(str2);
        Preconditions.e(str3);
        this.a = str2;
        this.f8917b = str3;
        this.f8918c = TextUtils.isEmpty(str) ? null : str;
        this.f8919d = j;
        this.f8920e = 0L;
        if (bundle == null || bundle.isEmpty()) {
            zzbcVar = new zzbc(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfw zzfwVar = zzhjVar.f9115A;
                    zzhj.g(zzfwVar);
                    zzfwVar.f9056x.b("Param name can't be null");
                    it.remove();
                } else {
                    zznp zznpVar = zzhjVar.f9118D;
                    zzhj.e(zznpVar);
                    Object objQ1 = zznpVar.Q1(bundle2.get(next), next);
                    if (objQ1 == null) {
                        zzfw zzfwVar2 = zzhjVar.f9115A;
                        zzhj.g(zzfwVar2);
                        zzfwVar2.f9047A.a(zzhjVar.f9119E.f(next), "Param value can't be null");
                        it.remove();
                    } else {
                        zznp zznpVar2 = zzhjVar.f9118D;
                        zzhj.e(zznpVar2);
                        zznpVar2.q1(bundle2, next, objQ1);
                    }
                }
            }
            zzbcVar = new zzbc(bundle2);
        }
        this.f8921f = zzbcVar;
    }

    public final zzba a(zzhj zzhjVar, long j) {
        return new zzba(zzhjVar, this.f8918c, this.a, this.f8917b, this.f8919d, j, this.f8921f);
    }

    public final String toString() {
        return "Event{appId='" + this.a + "', name='" + this.f8917b + "', params=" + String.valueOf(this.f8921f) + "}";
    }

    public zzba(zzhj zzhjVar, String str, String str2, String str3, long j, long j10, zzbc zzbcVar) {
        Preconditions.e(str2);
        Preconditions.e(str3);
        Preconditions.i(zzbcVar);
        this.a = str2;
        this.f8917b = str3;
        this.f8918c = TextUtils.isEmpty(str) ? null : str;
        this.f8919d = j;
        this.f8920e = j10;
        if (j10 != 0 && j10 > j) {
            zzfw zzfwVar = zzhjVar.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.c("Event created with reverse previous/current timestamps. appId, name", zzfw.a1(str2), zzfw.a1(str3));
        }
        this.f8921f = zzbcVar;
    }
}
