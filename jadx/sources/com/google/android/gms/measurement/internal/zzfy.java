package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzfy {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzfw f9061d;

    public zzfy(zzfw zzfwVar, int i10, boolean z6, boolean z10) {
        this.f9061d = zzfwVar;
        this.a = i10;
        this.f9059b = z6;
        this.f9060c = z10;
    }

    public final void a(Object obj, String str) {
        this.f9061d.d1(this.a, this.f9059b, this.f9060c, str, obj, null, null);
    }

    public final void b(String str) {
        this.f9061d.d1(this.a, this.f9059b, this.f9060c, str, null, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f9061d.d1(this.a, this.f9059b, this.f9060c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f9061d.d1(this.a, this.f9059b, this.f9060c, str, obj, obj2, obj3);
    }
}
