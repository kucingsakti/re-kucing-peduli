package ta;

import E4.C0187a;
import java.util.regex.Pattern;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f15278b;

    public /* synthetic */ l(Pattern pattern, int i10) {
        this.a = i10;
        this.f15278b = pattern;
    }

    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        switch (this.a) {
            case 0:
                return this.f15278b.matcher(kVar2.P()).find();
            case 1:
                return this.f15278b.matcher(kVar2.J()).find();
            case 2:
                return this.f15278b.matcher(kVar2.Q()).find();
            default:
                kVar2.getClass();
                StringBuilder sbB = ra.a.b();
                Y.z(new C0187a(sbB, 25), kVar2);
                return this.f15278b.matcher(ra.a.g(sbB)).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ":matches(" + this.f15278b + ")";
            case 1:
                return ":matchesOwn(" + this.f15278b + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.f15278b + ")";
            default:
                return ":matchesWholeText(" + this.f15278b + ")";
        }
    }
}
