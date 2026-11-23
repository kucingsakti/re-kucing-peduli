package com.google.android.gms.measurement.internal;

import M2.InterfaceC0296e;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.onesignal.core.activities.PermissionsActivity;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class zzag extends B1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f8894t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f8895u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0296e f8896v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f8897w;

    public static long j1() {
        return ((Long) zzbf.f8935E.a(null)).longValue();
    }

    public final double X0(String str, zzfj zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzfjVar.a(null)).doubleValue();
        }
        String strH = this.f8896v.H(str, zzfjVar.a);
        if (TextUtils.isEmpty(strH)) {
            return ((Double) zzfjVar.a(null)).doubleValue();
        }
        try {
            return ((Double) zzfjVar.a(Double.valueOf(Double.parseDouble(strH)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzfjVar.a(null)).doubleValue();
        }
    }

    public final int Y0(String str, boolean z6) {
        zzop.f8826t.get();
        if (((zzhj) this.f577s).f9146y.h1(null, zzbf.f8954N0)) {
            return z6 ? Math.max(Math.min(b1(str, zzbf.f8962S), PermissionsActivity.DELAY_TIME_CALLBACK_CALL), 100) : PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
        }
        return 100;
    }

    public final String Z0(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.i(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            i().f9056x.a(e10, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            i().f9056x.a(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            i().f9056x.a(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            i().f9056x.a(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final boolean a1(zzfj zzfjVar) {
        return h1(null, zzfjVar);
    }

    public final int b1(String str, zzfj zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzfjVar.a(null)).intValue();
        }
        String strH = this.f8896v.H(str, zzfjVar.a);
        if (TextUtils.isEmpty(strH)) {
            return ((Integer) zzfjVar.a(null)).intValue();
        }
        try {
            return ((Integer) zzfjVar.a(Integer.valueOf(Integer.parseInt(strH)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzfjVar.a(null)).intValue();
        }
    }

    public final long c1(String str, zzfj zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzfjVar.a(null)).longValue();
        }
        String strH = this.f8896v.H(str, zzfjVar.a);
        if (TextUtils.isEmpty(strH)) {
            return ((Long) zzfjVar.a(null)).longValue();
        }
        try {
            return ((Long) zzfjVar.a(Long.valueOf(Long.parseLong(strH)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzfjVar.a(null)).longValue();
        }
    }

    public final zzim d1(String str, boolean z6) {
        Object obj;
        Preconditions.e(str);
        Bundle bundleM1 = m1();
        if (bundleM1 == null) {
            i().f9056x.b("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM1.get(str);
        }
        zzim zzimVar = zzim.UNINITIALIZED;
        if (obj == null) {
            return zzimVar;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzim.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzim.DENIED;
        }
        if (z6 && "eu_consent_policy".equals(obj)) {
            return zzim.POLICY;
        }
        i().f9047A.a(str, "Invalid manifest metadata for");
        return zzimVar;
    }

    public final String e1(String str, zzfj zzfjVar) {
        return TextUtils.isEmpty(str) ? (String) zzfjVar.a(null) : (String) zzfjVar.a(this.f8896v.H(str, zzfjVar.a));
    }

    public final Boolean f1(String str) {
        Preconditions.e(str);
        Bundle bundleM1 = m1();
        if (bundleM1 == null) {
            i().f9056x.b("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleM1.containsKey(str)) {
            return Boolean.valueOf(bundleM1.getBoolean(str));
        }
        return null;
    }

    public final boolean g1(String str, zzfj zzfjVar) {
        return h1(str, zzfjVar);
    }

    public final boolean h1(String str, zzfj zzfjVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzfjVar.a(null)).booleanValue();
        }
        String strH = this.f8896v.H(str, zzfjVar.a);
        return TextUtils.isEmpty(strH) ? ((Boolean) zzfjVar.a(null)).booleanValue() : ((Boolean) zzfjVar.a(Boolean.valueOf("1".equals(strH)))).booleanValue();
    }

    public final boolean i1(String str) {
        return "1".equals(this.f8896v.H(str, "measurement.event_sampling_enabled"));
    }

    public final boolean k1() {
        Boolean boolF1 = f1("google_analytics_automatic_screen_reporting_enabled");
        return boolF1 == null || boolF1.booleanValue();
    }

    public final boolean l1() {
        if (this.f8894t == null) {
            Boolean boolF1 = f1("app_measurement_lite");
            this.f8894t = boolF1;
            if (boolF1 == null) {
                this.f8894t = Boolean.FALSE;
            }
        }
        return this.f8894t.booleanValue() || !((zzhj) this.f577s).f9144w;
    }

    public final Bundle m1() {
        zzhj zzhjVar = (zzhj) this.f577s;
        try {
            if (zzhjVar.f9140s.getPackageManager() == null) {
                i().f9056x.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = Wrappers.a(zzhjVar.f9140s).a(128, zzhjVar.f9140s.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            i().f9056x.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            i().f9056x.a(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }
}
