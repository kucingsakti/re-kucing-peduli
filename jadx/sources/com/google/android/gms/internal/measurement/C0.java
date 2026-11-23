package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {
    public final zzkt a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f8336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8337d;

    public C0(zzkt zzktVar, String str, Object[] objArr) {
        this.a = zzktVar;
        this.f8335b = str;
        this.f8336c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f8337d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f8337d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final zzle a() {
        int i10 = this.f8337d;
        if ((i10 & 1) != 0) {
            return zzle.f8698s;
        }
        return (i10 & 4) == 4 ? zzle.f8700u : zzle.f8699t;
    }
}
