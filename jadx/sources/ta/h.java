package ta;

/* JADX INFO: loaded from: classes.dex */
public final class h extends m {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15275b;

    public h(int i10, int i11) {
        this.f15275b = i11;
        this.a = i10;
    }

    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        switch (this.f15275b) {
            case 0:
                return kVar2.I() == this.a;
            case 1:
                return kVar2.I() > this.a;
            default:
                return kVar != kVar2 && kVar2.I() < this.a;
        }
    }

    public final String toString() {
        int i10 = this.a;
        switch (this.f15275b) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(i10));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(i10));
            default:
                return String.format(":lt(%d)", Integer.valueOf(i10));
        }
    }
}
