package com.google.android.gms.measurement.internal;

import M2.AbstractC0301j;
import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzav {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzav f8904f = new zzav((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f8906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f8908e;

    public zzav(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        this.f8908e = enumMap;
        enumMap.put(zzin.zza.AD_USER_DATA, bool == null ? zzim.UNINITIALIZED : bool.booleanValue() ? zzim.GRANTED : zzim.DENIED);
        this.a = i10;
        this.f8905b = e();
        this.f8906c = bool2;
        this.f8907d = str;
    }

    public static zzav a(int i10, Bundle bundle) {
        if (bundle == null) {
            return new zzav((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        for (zzin.zza zzaVar : zzio.DMA.f9175s) {
            enumMap.put(zzaVar, zzin.c(bundle.getString(zzaVar.f9171s)));
        }
        return new zzav(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static zzav b(String str) {
        if (str == null || str.length() <= 0) {
            return f8904f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        zzin.zza[] zzaVarArr = zzio.DMA.f9175s;
        int length = zzaVarArr.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(zzaVarArr[i12], zzin.b(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new zzav(enumMap, i10, (Boolean) null, (String) null);
    }

    public static Boolean c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i10 = AbstractC0301j.a[zzin.c(bundle.getString("ad_personalization")).ordinal()];
        if (i10 == 3) {
            return Boolean.FALSE;
        }
        if (i10 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final zzim d() {
        zzim zzimVar = (zzim) this.f8908e.get(zzin.zza.AD_USER_DATA);
        return zzimVar == null ? zzim.UNINITIALIZED : zzimVar;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (zzin.zza zzaVar : zzio.DMA.f9175s) {
            sb.append(":");
            sb.append(zzin.a((zzim) this.f8908e.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzav)) {
            return false;
        }
        zzav zzavVar = (zzav) obj;
        if (this.f8905b.equalsIgnoreCase(zzavVar.f8905b) && Objects.equals(this.f8906c, zzavVar.f8906c)) {
            return Objects.equals(this.f8907d, zzavVar.f8907d);
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f8906c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = bool == Boolean.TRUE ? 7 : 13;
        }
        String str = this.f8907d;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i10 * 29) + this.f8905b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzin.g(this.a));
        for (zzin.zza zzaVar : zzio.DMA.f9175s) {
            sb.append(",");
            sb.append(zzaVar.f9171s);
            sb.append("=");
            zzim zzimVar = (zzim) this.f8908e.get(zzaVar);
            if (zzimVar == null) {
                sb.append("uninitialized");
            } else {
                int i10 = AbstractC0301j.a[zzimVar.ordinal()];
                if (i10 == 1) {
                    sb.append("uninitialized");
                } else if (i10 == 2) {
                    sb.append("eu_consent_policy");
                } else if (i10 == 3) {
                    sb.append("denied");
                } else if (i10 == 4) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f8906c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f8907d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public zzav(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzin.zza.class);
        this.f8908e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i10;
        this.f8905b = e();
        this.f8906c = bool;
        this.f8907d = str;
    }
}
