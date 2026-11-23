package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends zzal {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p040e1.j f8865u;

    public zzr(p040e1.j jVar) {
        super("internal.logger");
        this.f8865u = jVar;
        this.f8463t.put("log", new S0(this, false, true));
        this.f8463t.put("silent", new C0558a("silent", 1));
        ((zzal) this.f8463t.get("silent")).n("log", new S0(this, true, true));
        this.f8463t.put("unmonitored", new C0558a("unmonitored", 2));
        ((zzal) this.f8463t.get("unmonitored")).n("log", new S0(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        return zzaq.f8465i;
    }
}
