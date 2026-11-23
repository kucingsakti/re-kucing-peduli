package X9;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final L f5525A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final L f5526B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final long f5527C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f5528D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p140o4.r f5529E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0462h f5530F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final G f5531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final F f5532t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f5533u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5534v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v f5535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f5536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final O f5537y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final L f5538z;

    public L(G g8, F f10, String str, int i10, v vVar, w wVar, O o10, L l4, L l10, L l11, long j, long j10, p140o4.r rVar) {
        p210v8.i.f(g8, "request");
        p210v8.i.f(f10, "protocol");
        p210v8.i.f(str, "message");
        this.f5531s = g8;
        this.f5532t = f10;
        this.f5533u = str;
        this.f5534v = i10;
        this.f5535w = vVar;
        this.f5536x = wVar;
        this.f5537y = o10;
        this.f5538z = l4;
        this.f5525A = l10;
        this.f5526B = l11;
        this.f5527C = j;
        this.f5528D = j10;
        this.f5529E = rVar;
    }

    public static String b(L l4, String str) {
        l4.getClass();
        String strE = l4.f5536x.e(str);
        if (strE == null) {
            return null;
        }
        return strE;
    }

    public final C0462h a() {
        C0462h c0462h = this.f5530F;
        if (c0462h != null) {
            return c0462h;
        }
        int i10 = C0462h.f5586n;
        C0462h c0462hJ = com.bumptech.glide.c.j(this.f5536x);
        this.f5530F = c0462hJ;
        return c0462hJ;
    }

    public final boolean c() {
        int i10 = this.f5534v;
        return 200 <= i10 && i10 < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        O o10 = this.f5537y;
        if (o10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        o10.close();
    }

    public final K g() {
        K k3 = new K();
        k3.a = this.f5531s;
        k3.f5514b = this.f5532t;
        k3.f5515c = this.f5534v;
        k3.f5516d = this.f5533u;
        k3.f5517e = this.f5535w;
        k3.f5518f = this.f5536x.g();
        k3.f5519g = this.f5537y;
        k3.f5520h = this.f5538z;
        k3.f5521i = this.f5525A;
        k3.j = this.f5526B;
        k3.f5522k = this.f5527C;
        k3.f5523l = this.f5528D;
        k3.f5524m = this.f5529E;
        return k3;
    }

    public final String toString() {
        return "Response{protocol=" + this.f5532t + ", code=" + this.f5534v + ", message=" + this.f5533u + ", url=" + this.f5531s.a + '}';
    }
}
