package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends zzay {
    public zzbo() {
        this.a.add(zzbv.ADD);
        this.a.add(zzbv.DIVIDE);
        this.a.add(zzbv.MODULUS);
        this.a.add(zzbv.MULTIPLY);
        this.a.add(zzbv.NEGATE);
        this.a.add(zzbv.POST_DECREMENT);
        this.a.add(zzbv.POST_INCREMENT);
        this.a.add(zzbv.PRE_DECREMENT);
        this.a.add(zzbv.PRE_INCREMENT);
        this.a.add(zzbv.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq a(String str, zzh zzhVar, ArrayList arrayList) {
        switch (AbstractC0580l.a[zzg.b(str).ordinal()]) {
            case 1:
                zzg.e(zzbv.ADD, 2, arrayList);
                zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                if ((zzaqVarA instanceof zzak) || (zzaqVarA instanceof zzas) || (zzaqVarA2 instanceof zzak) || (zzaqVarA2 instanceof zzas)) {
                    return new zzas(p231y.a.c(zzaqVarA.f(), zzaqVarA2.f()));
                }
                return new zzai(Double.valueOf(zzaqVarA2.e().doubleValue() + zzaqVarA.e().doubleValue()));
            case 2:
                zzg.e(zzbv.DIVIDE, 2, arrayList);
                return new zzai(Double.valueOf(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue() / zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue()));
            case 3:
                zzg.e(zzbv.MODULUS, 2, arrayList);
                return new zzai(Double.valueOf(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue() % zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue()));
            case 4:
                zzg.e(zzbv.MULTIPLY, 2, arrayList);
                return new zzai(Double.valueOf(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue() * zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue()));
            case 5:
                zzg.e(zzbv.NEGATE, 1, arrayList);
                return new zzai(Double.valueOf(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).e().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                zzg.g(str, 2, arrayList);
                zzaq zzaqVarA3 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                zzhVar.b((zzaq) arrayList.get(1));
                return zzaqVarA3;
            case 8:
            case 9:
                zzg.g(str, 1, arrayList);
                return zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
            case 10:
                zzg.e(zzbv.SUBTRACT, 2, arrayList);
                zzaq zzaqVarA4 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                zzai zzaiVar = new zzai(Double.valueOf(zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).e().doubleValue() * (-1.0d)));
                return new zzai(Double.valueOf(zzaiVar.f8459s.doubleValue() + zzaqVarA4.e().doubleValue()));
            default:
                b(str);
                throw null;
        }
    }
}
