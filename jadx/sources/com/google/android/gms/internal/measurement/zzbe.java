package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe {
    public static zzaf a(zzaf zzafVar, zzh zzhVar, zzar zzarVar, Boolean bool, Boolean bool2) {
        zzaf zzafVar2 = new zzaf();
        Iterator itY = zzafVar.y();
        while (itY.hasNext()) {
            int iIntValue = ((Integer) itY.next()).intValue();
            if (zzafVar.x(iIntValue)) {
                zzaq zzaqVarA = zzarVar.a(zzhVar, Arrays.asList(zzafVar.q(iIntValue), new zzai(Double.valueOf(iIntValue)), zzafVar));
                if (zzaqVarA.d().equals(bool)) {
                    break;
                }
                if (bool2 == null || zzaqVarA.d().equals(bool2)) {
                    zzafVar2.w(iIntValue, zzaqVarA);
                }
            }
        }
        return zzafVar2;
    }

    public static zzaq b(zzaf zzafVar, zzh zzhVar, ArrayList arrayList, boolean z6) {
        zzaq zzaqVarA;
        zzg.k("reduce", 1, arrayList);
        zzg.m(2, "reduce", arrayList);
        zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
        if (!(zzaqVarA2 instanceof zzal)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
            if (zzaqVarA instanceof zzaj) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (zzafVar.s() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            zzaqVarA = null;
        }
        zzal zzalVar = (zzal) zzaqVarA2;
        int iS = zzafVar.s();
        int i10 = z6 ? 0 : iS - 1;
        int i11 = z6 ? iS - 1 : 0;
        int i12 = z6 ? 1 : -1;
        if (zzaqVarA == null) {
            zzaqVarA = zzafVar.q(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (zzafVar.x(i10)) {
                zzaqVarA = zzalVar.a(zzhVar, Arrays.asList(zzaqVarA, zzafVar.q(i10), new zzai(Double.valueOf(i10)), zzafVar));
                if (zzaqVarA instanceof zzaj) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return zzaqVarA;
    }
}
