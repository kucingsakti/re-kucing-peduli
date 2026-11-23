package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0567e0 extends zzio {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8384d;

    public C0567e0(int i10, byte[] bArr) {
        super(0);
        this.f8384d = Integer.MAX_VALUE;
        this.a = i10;
        this.f8383c = 0;
    }

    public final int c(int i10) throws zzjs {
        if (i10 < 0) {
            throw zzjs.c();
        }
        int i11 = this.f8383c + i10;
        if (i11 < 0) {
            throw zzjs.d();
        }
        int i12 = this.f8384d;
        if (i11 > i12) {
            throw zzjs.e();
        }
        this.f8384d = i11;
        int i13 = this.a + this.f8382b;
        this.a = i13;
        int i14 = this.f8384d;
        if (i13 > i14) {
            int i15 = i13 - i14;
            this.f8382b = i15;
            this.a = i13 - i15;
        } else {
            this.f8382b = 0;
        }
        return i12;
    }
}
