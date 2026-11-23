package com.google.android.gms.measurement.internal;

import M2.AbstractC0305n;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzfq extends AbstractC0305n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public List f9030A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f9031B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9032C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f9033D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f9034E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f9035F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f9036G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f9037H;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f9038u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f9039v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9040w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f9041x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f9042y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f9043z;

    @Override // M2.AbstractC0305n
    public final boolean c1() {
        return true;
    }

    public final String d1() {
        a1();
        Preconditions.i(this.f9038u);
        return this.f9038u;
    }

    public final String e1() {
        W0();
        a1();
        Preconditions.i(this.f9033D);
        return this.f9033D;
    }

    public final void f1() {
        String str;
        W0();
        if (U0().h1().i(zzin.zza.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            V0().l2().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            i().f9051E.b("Analytics Storage consent is not granted");
            str = null;
        }
        i().f9051E.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f9035F = str;
        ((zzhj) this.f577s).f9120F.getClass();
        this.f9036G = System.currentTimeMillis();
    }
}
