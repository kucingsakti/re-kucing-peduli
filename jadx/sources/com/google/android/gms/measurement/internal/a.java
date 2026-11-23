package com.google.android.gms.measurement.internal;

import M2.EnumC0297f;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final EnumMap a;

    public a() {
        this.a = new EnumMap(zzin.zza.class);
    }

    public static a a(String str) {
        EnumC0297f enumC0297f;
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        if (str.length() < zzin.zza.values().length || str.charAt(0) != '1') {
            return new a();
        }
        zzin.zza[] zzaVarArrValues = zzin.zza.values();
        int length = zzaVarArrValues.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            zzin.zza zzaVar = zzaVarArrValues[i11];
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            EnumC0297f[] enumC0297fArrValues = EnumC0297f.values();
            int length2 = enumC0297fArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    enumC0297f = EnumC0297f.UNSET;
                    break;
                }
                enumC0297f = enumC0297fArrValues[i13];
                if (enumC0297f.f3003s == cCharAt) {
                    break;
                }
                i13++;
            }
            enumMap.put(zzaVar, enumC0297f);
            i11++;
            i10 = i12;
        }
        return new a(enumMap);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void b(zzin.zza zzaVar, int i10) {
        EnumC0297f enumC0297f = EnumC0297f.UNSET;
        if (i10 == -30) {
            enumC0297f = EnumC0297f.TCF;
        } else if (i10 == -20) {
            enumC0297f = EnumC0297f.API;
        } else if (i10 == -10) {
            enumC0297f = EnumC0297f.MANIFEST;
        } else if (i10 == 0) {
            enumC0297f = EnumC0297f.API;
        } else if (i10 == 30) {
            enumC0297f = EnumC0297f.INITIALIZATION;
        }
        this.a.put(zzaVar, enumC0297f);
    }

    public final void c(zzin.zza zzaVar, EnumC0297f enumC0297f) {
        this.a.put(zzaVar, enumC0297f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzin.zza zzaVar : zzin.zza.values()) {
            EnumC0297f enumC0297f = (EnumC0297f) this.a.get(zzaVar);
            if (enumC0297f == null) {
                enumC0297f = EnumC0297f.UNSET;
            }
            sb.append(enumC0297f.f3003s);
        }
        return sb.toString();
    }

    public a(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzin.zza.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
