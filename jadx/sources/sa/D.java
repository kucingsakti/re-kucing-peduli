package sa;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D f14800c = new D(false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f14801d = new D(true, true);
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14802b;

    public D(boolean z6, boolean z10) {
        this.a = z6;
        this.f14802b = z10;
    }

    public final void a(org.jsoup.nodes.c cVar) {
        if (cVar == null || this.f14802b) {
            return;
        }
        for (int i10 = 0; i10 < cVar.f13863s; i10++) {
            String[] strArr = cVar.f13864t;
            strArr[i10] = J7.j.t(strArr[i10]);
        }
    }
}
