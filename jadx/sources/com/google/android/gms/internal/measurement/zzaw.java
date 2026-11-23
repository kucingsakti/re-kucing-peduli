package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw extends zzay {
    public zzaw() {
        this.a.add(zzbv.BITWISE_AND);
        this.a.add(zzbv.BITWISE_LEFT_SHIFT);
        this.a.add(zzbv.BITWISE_NOT);
        this.a.add(zzbv.BITWISE_OR);
        this.a.add(zzbv.BITWISE_RIGHT_SHIFT);
        this.a.add(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(zzbv.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq a(String str, zzh zzhVar, ArrayList arrayList) {
        switch (AbstractC0566e.a[zzg.b(str).ordinal()]) {
            case 1:
                zzg.e(zzbv.BITWISE_AND, 2, arrayList);
                return new zzai(Double.valueOf(zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue()) & zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue())));
            case 2:
                zzg.e(zzbv.BITWISE_LEFT_SHIFT, 2, arrayList);
                return new zzai(Double.valueOf(zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue()) << ((int) (((long) zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue())) & 31))));
            case 3:
                zzg.e(zzbv.BITWISE_NOT, 1, arrayList);
                return new zzai(Double.valueOf(~zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue())));
            case 4:
                zzg.e(zzbv.BITWISE_OR, 2, arrayList);
                return new zzai(Double.valueOf(zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue()) | zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue())));
            case 5:
                zzg.e(zzbv.BITWISE_RIGHT_SHIFT, 2, arrayList);
                return new zzai(Double.valueOf(zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue()) >> ((int) (((long) zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue())) & 31))));
            case 6:
                zzg.e(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList);
                return new zzai(Double.valueOf((((long) zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue())) & 4294967295L) >>> ((int) (((long) zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue())) & 31))));
            case 7:
                zzg.e(zzbv.BITWISE_XOR, 2, arrayList);
                return new zzai(Double.valueOf(zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue()) ^ zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue())));
            default:
                b(str);
                throw null;
        }
    }
}
