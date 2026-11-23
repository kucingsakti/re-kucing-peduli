package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbg extends zzay {
    public zzbg() {
        this.a.add(zzbv.AND);
        this.a.add(zzbv.NOT);
        this.a.add(zzbv.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq a(String str, zzh zzhVar, ArrayList arrayList) {
        int i10 = AbstractC0574i.a[zzg.b(str).ordinal()];
        if (i10 == 1) {
            zzg.e(zzbv.AND, 2, arrayList);
            zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
            if (!zzaqVarA.d().booleanValue()) {
                return zzaqVarA;
            }
            return zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
        }
        if (i10 == 2) {
            zzg.e(zzbv.NOT, 1, arrayList);
            return new zzag(Boolean.valueOf(!zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).d().booleanValue()));
        }
        if (i10 != 3) {
            b(str);
            throw null;
        }
        zzg.e(zzbv.OR, 2, arrayList);
        zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
        if (zzaqVarA2.d().booleanValue()) {
            return zzaqVarA2;
        }
        return zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
    }
}
