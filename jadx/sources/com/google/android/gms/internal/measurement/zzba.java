package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzba extends zzay {
    public zzba() {
        this.a.add(zzbv.EQUALS);
        this.a.add(zzbv.GREATER_THAN);
        this.a.add(zzbv.GREATER_THAN_EQUALS);
        this.a.add(zzbv.IDENTITY_EQUALS);
        this.a.add(zzbv.IDENTITY_NOT_EQUALS);
        this.a.add(zzbv.LESS_THAN);
        this.a.add(zzbv.LESS_THAN_EQUALS);
        this.a.add(zzbv.NOT_EQUALS);
    }

    public static boolean c(zzaq zzaqVar, zzaq zzaqVar2) {
        zzaq zzaiVar;
        zzaq zzaiVar2;
        while (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            if (((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) && ((zzaqVar2 instanceof zzax) || (zzaqVar2 instanceof zzao))) {
                return true;
            }
            boolean z6 = zzaqVar instanceof zzai;
            if (z6 && (zzaqVar2 instanceof zzas)) {
                zzaiVar2 = new zzai(zzaqVar2.e());
            } else {
                boolean z10 = zzaqVar instanceof zzas;
                if (z10 && (zzaqVar2 instanceof zzai)) {
                    zzaiVar = new zzai(zzaqVar.e());
                } else if (zzaqVar instanceof zzag) {
                    zzaiVar = new zzai(zzaqVar.e());
                } else if (zzaqVar2 instanceof zzag) {
                    zzaiVar2 = new zzai(zzaqVar2.e());
                } else if ((z10 || z6) && (zzaqVar2 instanceof zzak)) {
                    zzaiVar2 = new zzas(zzaqVar2.f());
                } else {
                    if (!(zzaqVar instanceof zzak) || (!(zzaqVar2 instanceof zzas) && !(zzaqVar2 instanceof zzai))) {
                        return false;
                    }
                    zzaiVar = new zzas(zzaqVar.f());
                }
                zzaqVar = zzaiVar;
            }
            zzaqVar2 = zzaiVar2;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        if (zzaqVar instanceof zzai) {
            return (Double.isNaN(zzaqVar.e().doubleValue()) || Double.isNaN(zzaqVar2.e().doubleValue()) || zzaqVar.e().doubleValue() != zzaqVar2.e().doubleValue()) ? false : true;
        }
        if (zzaqVar instanceof zzas) {
            return zzaqVar.f().equals(zzaqVar2.f());
        }
        if (zzaqVar instanceof zzag) {
            return zzaqVar.d().equals(zzaqVar2.d());
        }
        return zzaqVar == zzaqVar2;
    }

    public static boolean d(zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof zzak) {
            zzaqVar = new zzas(zzaqVar.f());
        }
        if (zzaqVar2 instanceof zzak) {
            zzaqVar2 = new zzas(zzaqVar2.f());
        }
        if ((zzaqVar instanceof zzas) && (zzaqVar2 instanceof zzas)) {
            return ((zzas) zzaqVar).f8475s.compareTo(((zzas) zzaqVar2).f8475s) < 0;
        }
        double dDoubleValue = zzaqVar.e().doubleValue();
        double dDoubleValue2 = zzaqVar2.e().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean e(zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof zzak) {
            zzaqVar = new zzas(zzaqVar.f());
        }
        if (zzaqVar2 instanceof zzak) {
            zzaqVar2 = new zzas(zzaqVar2.f());
        }
        return (((zzaqVar instanceof zzas) && (zzaqVar2 instanceof zzas)) || !(Double.isNaN(zzaqVar.e().doubleValue()) || Double.isNaN(zzaqVar2.e().doubleValue()))) && !d(zzaqVar2, zzaqVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq a(String str, zzh zzhVar, ArrayList arrayList) {
        boolean zC;
        boolean zH;
        zzg.g(zzg.b(str).name(), 2, arrayList);
        zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
        zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
        switch (AbstractC0568f.a[zzg.b(str).ordinal()]) {
            case 1:
                zC = c(zzaqVarA, zzaqVarA2);
                return zC ? zzaq.f8469n : zzaq.f8470o;
            case 2:
                zC = d(zzaqVarA2, zzaqVarA);
                if (zC) {
                }
            case 3:
                zC = e(zzaqVarA2, zzaqVarA);
                if (zC) {
                }
            case 4:
                zC = zzg.h(zzaqVarA, zzaqVarA2);
                if (zC) {
                }
            case 5:
                zH = zzg.h(zzaqVarA, zzaqVarA2);
                zC = !zH;
                if (zC) {
                }
            case 6:
                zC = d(zzaqVarA, zzaqVarA2);
                if (zC) {
                }
            case 7:
                zC = e(zzaqVarA, zzaqVarA2);
                if (zC) {
                }
            case 8:
                zH = c(zzaqVarA, zzaqVarA2);
                zC = !zH;
                if (zC) {
                }
            default:
                b(str);
                throw null;
        }
    }
}
