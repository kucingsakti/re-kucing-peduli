package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
public final class a extends zzag {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f8315w = new a(0, new Object[0]);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient Object[] f8316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f8317v;

    public a(int i10, Object[] objArr) {
        this.f8316u = objArr;
        this.f8317v = i10;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    public final void d(Object[] objArr) {
        System.arraycopy(this.f8316u, 0, objArr, 0, this.f8317v);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return this.f8317v;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzs.a(i10, this.f8317v);
        Object obj = this.f8316u[i10];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean m() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] n() {
        return this.f8316u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8317v;
    }
}
