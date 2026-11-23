package M2;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: M2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0302k {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f3040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f3041i;
    public final Long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f3042k;

    public C0302k(String str, String str2, long j) {
        this(str, str2, 0L, 0L, 0L, j, 0L, null, null, null, null);
    }

    public final C0302k a(long j) {
        return new C0302k(this.a, this.f3034b, this.f3035c, this.f3036d, this.f3037e, j, this.f3039g, this.f3040h, this.f3041i, this.j, this.f3042k);
    }

    public final C0302k b(Long l4, Long l10, Boolean bool) {
        return new C0302k(this.a, this.f3034b, this.f3035c, this.f3036d, this.f3037e, this.f3038f, this.f3039g, this.f3040h, l4, l10, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public C0302k(String str, String str2, long j, long j10, long j11, long j12, long j13, Long l4, Long l10, Long l11, Boolean bool) {
        Preconditions.e(str);
        Preconditions.e(str2);
        Preconditions.b(j >= 0);
        Preconditions.b(j10 >= 0);
        Preconditions.b(j11 >= 0);
        Preconditions.b(j13 >= 0);
        this.a = str;
        this.f3034b = str2;
        this.f3035c = j;
        this.f3036d = j10;
        this.f3037e = j11;
        this.f3038f = j12;
        this.f3039g = j13;
        this.f3040h = l4;
        this.f3041i = l10;
        this.j = l11;
        this.f3042k = bool;
    }
}
