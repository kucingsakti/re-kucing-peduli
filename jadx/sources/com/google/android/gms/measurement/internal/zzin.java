package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzin {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzin f9164c = new zzin(null, null, 100);
    public final EnumMap a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9165b;

    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final String f9171s;

        zza(String str) {
            this.f9171s = str;
        }
    }

    public zzin(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(zza.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f9165b = i10;
    }

    public static char a(zzim zzimVar) {
        if (zzimVar == null) {
            return '-';
        }
        int iOrdinal = zzimVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static zzim b(char c10) {
        if (c10 == '+') {
            return zzim.POLICY;
        }
        if (c10 != '0') {
            return c10 != '1' ? zzim.UNINITIALIZED : zzim.GRANTED;
        }
        return zzim.DENIED;
    }

    public static zzim c(String str) {
        zzim zzimVar = zzim.UNINITIALIZED;
        if (str == null) {
            return zzimVar;
        }
        if (str.equals("granted")) {
            return zzim.GRANTED;
        }
        return str.equals("denied") ? zzim.DENIED : zzimVar;
    }

    public static zzin d(int i10, Bundle bundle) {
        if (bundle == null) {
            return new zzin(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzio.STORAGE.f9175s) {
            enumMap.put(zzaVar, c(bundle.getString(zzaVar.f9171s)));
        }
        return new zzin(enumMap, i10);
    }

    public static zzin e(int i10, String str) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zzio zzioVar = zzio.STORAGE;
        int i11 = 0;
        while (true) {
            zza[] zzaVarArr = zzioVar.f9175s;
            if (i11 >= zzaVarArr.length) {
                return new zzin(enumMap, i10);
            }
            zza zzaVar = zzaVarArr[i11];
            int i12 = i11 + 2;
            if (i12 < str.length()) {
                enumMap.put(zzaVar, b(str.charAt(i12)));
            } else {
                enumMap.put(zzaVar, zzim.UNINITIALIZED);
            }
            i11++;
        }
    }

    public static String g(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static boolean h(int i10, int i11) {
        if (i10 == -20 && i11 == -30) {
            return true;
        }
        return (i10 == -30 && i11 == -20) || i10 == i11 || i10 < i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzin)) {
            return false;
        }
        zzin zzinVar = (zzin) obj;
        for (zza zzaVar : zzio.STORAGE.f9175s) {
            if (this.a.get(zzaVar) != zzinVar.a.get(zzaVar)) {
                return false;
            }
        }
        return this.f9165b == zzinVar.f9165b;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public final zzin f(zzin zzinVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzio.STORAGE.f9175s) {
            zzim zzimVar = (zzim) this.a.get(zzaVar);
            zzim zzimVar2 = (zzim) zzinVar.a.get(zzaVar);
            if (zzimVar == null) {
                zzimVar = zzimVar2;
            } else if (zzimVar2 != null) {
                zzim zzimVar3 = zzim.UNINITIALIZED;
                if (zzimVar == zzimVar3) {
                    zzimVar = zzimVar2;
                } else if (zzimVar2 != zzimVar3) {
                    zzim zzimVar4 = zzim.POLICY;
                    if (zzimVar == zzimVar4) {
                        zzimVar = zzimVar2;
                    } else if (zzimVar2 != zzimVar4) {
                        zzim zzimVar5 = zzim.DENIED;
                        zzimVar = (zzimVar == zzimVar5 || zzimVar2 == zzimVar5) ? zzimVar5 : zzim.GRANTED;
                    }
                }
            }
            if (zzimVar != null) {
                enumMap.put(zzaVar, zzimVar);
            }
        }
        return new zzin(enumMap, 100);
    }

    public final int hashCode() {
        int iHashCode = this.f9165b * 17;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((zzim) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(zza zzaVar) {
        return ((zzim) this.a.get(zzaVar)) != zzim.DENIED;
    }

    public final zzin j(zzin zzinVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzio.STORAGE.f9175s) {
            zzim zzimVar = (zzim) this.a.get(zzaVar);
            if (zzimVar == zzim.UNINITIALIZED) {
                zzimVar = (zzim) zzinVar.a.get(zzaVar);
            }
            if (zzimVar != null) {
                enumMap.put(zzaVar, zzimVar);
            }
        }
        return new zzin(enumMap, this.f9165b);
    }

    public final boolean k(zzin zzinVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzim zzimVar = (zzim) this.a.get(zzaVar);
            zzim zzimVar2 = (zzim) zzinVar.a.get(zzaVar);
            zzim zzimVar3 = zzim.DENIED;
            if (zzimVar == zzimVar3 && zzimVar2 != zzimVar3) {
                return true;
            }
        }
        return false;
    }

    public final Boolean l() {
        zzim zzimVar = (zzim) this.a.get(zza.AD_STORAGE);
        if (zzimVar == null) {
            return null;
        }
        int iOrdinal = zzimVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean m() {
        zzim zzimVar = (zzim) this.a.get(zza.ANALYTICS_STORAGE);
        if (zzimVar == null) {
            return null;
        }
        int iOrdinal = zzimVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String n() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzio.STORAGE.f9175s) {
            zzim zzimVar = (zzim) this.a.get(zzaVar);
            char c10 = '-';
            if (zzimVar != null && (iOrdinal = zzimVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c10 = '1';
                } else if (iOrdinal == 2) {
                    c10 = '0';
                } else if (iOrdinal == 3) {
                    c10 = '1';
                }
            }
            sb.append(c10);
        }
        return sb.toString();
    }

    public final String o() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzio.STORAGE.f9175s) {
            sb.append(a((zzim) this.a.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean p() {
        return i(zza.ANALYTICS_STORAGE);
    }

    public final boolean q() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            if (((zzim) it.next()) != zzim.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(g(this.f9165b));
        for (zza zzaVar : zzio.STORAGE.f9175s) {
            sb.append(",");
            sb.append(zzaVar.f9171s);
            sb.append("=");
            zzim zzimVar = (zzim) this.a.get(zzaVar);
            if (zzimVar == null) {
                zzimVar = zzim.UNINITIALIZED;
            }
            sb.append(zzimVar);
        }
        return sb.toString();
    }

    public zzin(Boolean bool, Boolean bool2, int i10) {
        zzim zzimVar;
        EnumMap enumMap = new EnumMap(zza.class);
        this.a = enumMap;
        zza zzaVar = zza.AD_STORAGE;
        zzim zzimVar2 = zzim.DENIED;
        zzim zzimVar3 = zzim.GRANTED;
        zzim zzimVar4 = zzim.UNINITIALIZED;
        if (bool == null) {
            zzimVar = zzimVar4;
        } else {
            zzimVar = bool.booleanValue() ? zzimVar3 : zzimVar2;
        }
        enumMap.put(zzaVar, zzimVar);
        zza zzaVar2 = zza.ANALYTICS_STORAGE;
        if (bool2 == null) {
            zzimVar2 = zzimVar4;
        } else if (bool2.booleanValue()) {
            zzimVar2 = zzimVar3;
        }
        enumMap.put(zzaVar2, zzimVar2);
        this.f9165b = i10;
    }
}
