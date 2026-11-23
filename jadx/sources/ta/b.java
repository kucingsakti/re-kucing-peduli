package ta;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        for (int i10 = 0; i10 < this.f15270b; i10++) {
            if (((m) this.a.get(i10)).a(kVar, kVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return ra.a.f(", ", this.a);
    }
}
