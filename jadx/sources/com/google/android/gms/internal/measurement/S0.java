package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends zzal {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f8362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zzr f8363w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(zzr zzrVar, boolean z6, boolean z10) {
        super("log");
        this.f8363w = zzrVar;
        this.f8361u = z6;
        this.f8362v = z10;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        zzg.k("log", 1, list);
        int size = list.size();
        zzs zzsVar = zzs.f8868u;
        zzax zzaxVar = zzaq.f8465i;
        zzr zzrVar = this.f8363w;
        if (size == 1) {
            zzrVar.f8865u.K(zzsVar, zzhVar.f8658b.a(zzhVar, (zzaq) list.get(0)).f(), Collections.EMPTY_LIST, this.f8361u, this.f8362v);
            return zzaxVar;
        }
        int i10 = zzg.i(zzhVar.f8658b.a(zzhVar, (zzaq) list.get(0)).e().doubleValue());
        if (i10 == 2) {
            zzsVar = zzs.f8869v;
        } else if (i10 == 3) {
            zzsVar = zzs.f8866s;
        } else if (i10 == 5) {
            zzsVar = zzs.f8870w;
        } else if (i10 == 6) {
            zzsVar = zzs.f8867t;
        }
        zzs zzsVar2 = zzsVar;
        String strF = zzhVar.f8658b.a(zzhVar, (zzaq) list.get(1)).f();
        if (list.size() == 2) {
            zzrVar.f8865u.K(zzsVar2, strF, Collections.EMPTY_LIST, this.f8361u, this.f8362v);
            return zzaxVar;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
            arrayList.add(zzhVar.f8658b.a(zzhVar, (zzaq) list.get(i11)).f());
        }
        zzrVar.f8865u.K(zzsVar2, strF, arrayList, this.f8361u, this.f8362v);
        return zzaxVar;
    }
}
