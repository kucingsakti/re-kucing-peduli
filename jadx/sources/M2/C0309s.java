package M2;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhj;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: M2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Long f3069A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Long f3070B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f3071C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f3072D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f3073E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f3074F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f3075G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f3076H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public byte[] f3077I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f3078J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f3079K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f3080L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f3081M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f3082N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f3083O;
    public String P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f3084Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f3085R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f3086S;
    public final zzhj a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3094i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3096l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f3101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f3102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f3103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f3104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f3105u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f3107w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f3108x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3109y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3110z;

    public C0309s(zzhj zzhjVar, String str) {
        Preconditions.i(zzhjVar);
        Preconditions.e(str);
        this.a = zzhjVar;
        this.f3087b = str;
        zzhc zzhcVar = zzhjVar.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
    }

    public final void A(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3081M != j;
        this.f3081M = j;
    }

    public final void B(String str) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= !Objects.equals(this.f3091f, str);
        this.f3091f = str;
    }

    public final void C(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3082N != j;
        this.f3082N = j;
    }

    public final void D(String str) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f3084Q |= !Objects.equals(this.f3089d, str);
        this.f3089d = str;
    }

    public final void E(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3080L != j;
        this.f3080L = j;
    }

    public final void F(String str) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final void G(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3079K != j;
        this.f3079K = j;
    }

    public final void H(String str) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= !Objects.equals(this.f3090e, str);
        this.f3090e = str;
    }

    public final void I(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3083O != j;
        this.f3083O = j;
    }

    public final void J(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3078J != j;
        this.f3078J = j;
    }

    public final void K(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3098n != j;
        this.f3098n = j;
    }

    public final void L(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3103s != j;
        this.f3103s = j;
    }

    public final void M(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3086S != j;
        this.f3086S = j;
    }

    public final void N(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3097m != j;
        this.f3097m = j;
    }

    public final long O() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3103s;
    }

    public final void P(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3075G != j;
        this.f3075G = j;
    }

    public final void Q(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3094i != j;
        this.f3094i = j;
    }

    public final void R(long j) {
        Preconditions.b(j >= 0);
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3092g != j;
        this.f3092g = j;
    }

    public final void S(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3093h != j;
        this.f3093h = j;
    }

    public final void T(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3108x != j;
        this.f3108x = j;
    }

    public final void U(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3107w != j;
        this.f3107w = j;
    }

    public final Boolean V() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3102r;
    }

    public final void a(long j) {
        zzhj zzhjVar = this.a;
        zzhc zzhcVar = zzhjVar.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        long j10 = this.f3092g + j;
        zzfw zzfwVar = zzhjVar.f9115A;
        String str = this.f3087b;
        if (j10 > 2147483647L) {
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(zzfw.a1(str), "Bundle index overflow. appId");
            j10 = j - 1;
        }
        long j11 = this.f3075G + 1;
        if (j11 > 2147483647L) {
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(zzfw.a1(str), "Delivery index overflow. appId");
            j11 = 0;
        }
        this.f3084Q = true;
        this.f3092g = j10;
        this.f3075G = j11;
    }

    public final void b(String str) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f3084Q |= !Objects.equals(this.f3101q, str);
        this.f3101q = str;
    }

    public final void c(List list) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        if (Objects.equals(this.f3104t, list)) {
            return;
        }
        this.f3084Q = true;
        this.f3104t = list != null ? new ArrayList(list) : null;
    }

    public final String d() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3101q;
    }

    public final String e() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        String str = this.P;
        F(null);
        return str;
    }

    public final String f() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3087b;
    }

    public final String g() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3088c;
    }

    public final String h() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.j;
    }

    public final String i() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3091f;
    }

    public final String j() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3089d;
    }

    public final String k() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3076H;
    }

    public final String l() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3072D;
    }

    public final void m() {
        zzhj zzhjVar = this.a;
        zzhc zzhcVar = zzhjVar.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        long j = this.f3092g + 1;
        if (j > 2147483647L) {
            zzfw zzfwVar = zzhjVar.f9115A;
            zzhj.g(zzfwVar);
            zzfwVar.f9047A.a(zzfw.a1(this.f3087b), "Bundle index overflow. appId");
            j = 0;
        }
        this.f3084Q = true;
        this.f3092g = j;
    }

    public final boolean n() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3100p;
    }

    public final boolean o() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3084Q;
    }

    public final boolean p() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3106v;
    }

    public final void q(int i10) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3074F != i10;
        this.f3074F = i10;
    }

    public final void r(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3095k != j;
        this.f3095k = j;
    }

    public final void s(String str) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= !Objects.equals(this.f3088c, str);
        this.f3088c = str;
    }

    public final void t(boolean z6) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3099o != z6;
        this.f3099o = z6;
    }

    public final void u(int i10) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3073E != i10;
        this.f3073E = i10;
    }

    public final void v(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3071C != j;
        this.f3071C = j;
    }

    public final void w(String str) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= !Objects.equals(this.f3096l, str);
        this.f3096l = str;
    }

    public final void x(long j) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= this.f3085R != j;
        this.f3085R = j;
    }

    public final void y(String str) {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        this.f3084Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long z() {
        zzhc zzhcVar = this.a.f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.W0();
        return this.f3095k;
    }
}
