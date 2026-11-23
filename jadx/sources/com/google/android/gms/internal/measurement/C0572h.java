package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0572h implements Comparator {
    public final /* synthetic */ zzal a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzh f8388b;

    public C0572h(zzal zzalVar, zzh zzhVar) {
        this.a = zzalVar;
        this.f8388b = zzhVar;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzaq zzaqVar = (zzaq) obj;
        zzaq zzaqVar2 = (zzaq) obj2;
        if (zzaqVar instanceof zzax) {
            return !(zzaqVar2 instanceof zzax) ? 1 : 0;
        }
        if (zzaqVar2 instanceof zzax) {
            return -1;
        }
        zzal zzalVar = this.a;
        return zzalVar == null ? zzaqVar.f().compareTo(zzaqVar2.f()) : (int) zzg.a(zzalVar.a(this.f8388b, Arrays.asList(zzaqVar, zzaqVar2)).e().doubleValue());
    }
}
