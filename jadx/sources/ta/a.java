package ta;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    public a(List list) {
        this.a.addAll(list);
        this.f15270b = this.a.size();
    }

    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        for (int i10 = this.f15270b - 1; i10 >= 0; i10--) {
            if (!((m) this.a.get(i10)).a(kVar, kVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ra.a.f("", this.a);
    }

    public a(m... mVarArr) {
        this(Arrays.asList(mVarArr));
    }
}
