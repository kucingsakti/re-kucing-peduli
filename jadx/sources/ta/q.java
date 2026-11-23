package ta;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15286b;

    public /* synthetic */ q(int i10) {
        this.f15286b = i10;
    }

    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        org.jsoup.nodes.k kVar3;
        org.jsoup.nodes.k kVarM;
        switch (this.f15286b) {
            case 0:
                return (kVar == kVar2 || (kVar3 = (org.jsoup.nodes.k) kVar2.f13896s) == null || !this.a.a(kVar, kVar3)) ? false : true;
            case 1:
                return (kVar == kVar2 || (kVarM = kVar2.M()) == null || !this.a.a(kVar, kVarM)) ? false : true;
            case 2:
                return !this.a.a(kVar, kVar2);
            case 3:
                if (kVar == kVar2) {
                    return false;
                }
                for (org.jsoup.nodes.k kVar4 = (org.jsoup.nodes.k) kVar2.f13896s; kVar4 != null; kVar4 = (org.jsoup.nodes.k) kVar4.f13896s) {
                    if (this.a.a(kVar, kVar4)) {
                        return true;
                    }
                    if (kVar4 == kVar) {
                        return false;
                    }
                }
                return false;
            default:
                if (kVar == kVar2) {
                    return false;
                }
                for (org.jsoup.nodes.k kVarM2 = kVar2.M(); kVarM2 != null; kVarM2 = kVarM2.M()) {
                    if (this.a.a(kVar, kVarM2)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final String toString() {
        switch (this.f15286b) {
            case 0:
                return String.format("%s > ", this.a);
            case 1:
                return String.format("%s + ", this.a);
            case 2:
                return String.format(":not(%s)", this.a);
            case 3:
                return String.format("%s ", this.a);
            default:
                return String.format("%s ~ ", this.a);
        }
    }
}
