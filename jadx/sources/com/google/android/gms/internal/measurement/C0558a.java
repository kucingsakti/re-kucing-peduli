package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0558a extends zzal {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8369u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0558a(String str, int i10) {
        super(str);
        this.f8369u = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List list) {
        switch (this.f8369u) {
            case 0:
                return new zzai(Double.valueOf(0.0d));
            case 1:
            default:
                return this;
        }
    }
}
