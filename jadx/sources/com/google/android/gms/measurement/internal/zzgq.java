package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes.dex */
public final class zzgq {
    public final zzhj a;

    public zzgq(zznc zzncVar) {
        this.a = zzncVar.f9283D;
    }

    public final boolean a() {
        zzhj zzhjVar = this.a;
        try {
            PackageManagerWrapper packageManagerWrapperA = Wrappers.a(zzhjVar.f9140s);
            if (packageManagerWrapperA != null) {
                return packageManagerWrapperA.b(128, "com.android.vending").versionCode >= 80837300;
            }
            zzfw zzfwVar = zzhjVar.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9052F.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            zzfw zzfwVar2 = zzhjVar.f9115A;
            zzhj.g(zzfwVar2);
            zzfwVar2.f9052F.a(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
