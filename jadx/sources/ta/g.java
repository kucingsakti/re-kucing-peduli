package ta;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class g extends m {
    public String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pattern f15274b;

    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        String str = this.a;
        return kVar2.m(str) && this.f15274b.matcher(kVar2.d(str)).find();
    }

    public final String toString() {
        return "[" + this.a + "~=" + this.f15274b.toString() + "]";
    }
}
