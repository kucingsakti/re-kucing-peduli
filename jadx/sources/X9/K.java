package X9;

/* JADX INFO: loaded from: classes.dex */
public final class K {
    public G a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f5514b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f5517e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public O f5519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public L f5520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public L f5521i;
    public L j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p140o4.r f5524m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5515c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public M1.c f5518f = new M1.c(3);

    public static void b(L l4, String str) {
        if (l4 == null) {
            return;
        }
        if (l4.f5537y != null) {
            throw new IllegalArgumentException(p210v8.i.k(".body != null", str).toString());
        }
        if (l4.f5538z != null) {
            throw new IllegalArgumentException(p210v8.i.k(".networkResponse != null", str).toString());
        }
        if (l4.f5525A != null) {
            throw new IllegalArgumentException(p210v8.i.k(".cacheResponse != null", str).toString());
        }
        if (l4.f5526B != null) {
            throw new IllegalArgumentException(p210v8.i.k(".priorResponse != null", str).toString());
        }
    }

    public final L a() {
        int i10 = this.f5515c;
        if (i10 < 0) {
            throw new IllegalStateException(p210v8.i.k(Integer.valueOf(i10), "code < 0: ").toString());
        }
        G g8 = this.a;
        if (g8 == null) {
            throw new IllegalStateException("request == null");
        }
        F f10 = this.f5514b;
        if (f10 == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f5516d;
        if (str != null) {
            return new L(g8, f10, str, i10, this.f5517e, this.f5518f.d(), this.f5519g, this.f5520h, this.f5521i, this.j, this.f5522k, this.f5523l, this.f5524m);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(w wVar) {
        p210v8.i.f(wVar, "headers");
        this.f5518f = wVar.g();
    }
}
