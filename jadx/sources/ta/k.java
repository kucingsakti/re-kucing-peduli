package ta;

import sa.C;

/* JADX INFO: loaded from: classes.dex */
public class k extends m {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15277c;

    public k(int i10, int i11, int i12) {
        this.f15277c = i12;
        this.a = i10;
        this.f15276b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ta.m
    public final boolean a(org.jsoup.nodes.k kVar, org.jsoup.nodes.k kVar2) {
        int I2;
        int size;
        org.jsoup.nodes.k kVar3 = (org.jsoup.nodes.k) kVar2.f13896s;
        if (kVar3 == null || (kVar3 instanceof org.jsoup.nodes.h)) {
            return false;
        }
        switch (this.f15277c) {
            case 0:
                I2 = kVar2.I() + 1;
                break;
            case 1:
                org.jsoup.nodes.k kVar4 = (org.jsoup.nodes.k) kVar2.f13896s;
                if (kVar4 == null) {
                    size = 0;
                } else {
                    kVar4.getClass();
                    size = new C(kVar4.E()).size() - kVar2.I();
                }
                I2 = size;
                break;
            case 2:
                org.jsoup.nodes.k kVar5 = (org.jsoup.nodes.k) kVar2.f13896s;
                I2 = 0;
                if (kVar5 != null) {
                    kVar5.getClass();
                    C c10 = new C(kVar5.E());
                    for (int I9 = kVar2.I(); I9 < c10.size(); I9++) {
                        if (((org.jsoup.nodes.k) c10.get(I9)).f13880v.equals(kVar2.f13880v)) {
                            I2++;
                        }
                    }
                }
                break;
            default:
                org.jsoup.nodes.k kVar6 = (org.jsoup.nodes.k) kVar2.f13896s;
                I2 = 0;
                if (kVar6 != null) {
                    kVar6.getClass();
                    for (org.jsoup.nodes.k kVar7 : new C(kVar6.E())) {
                        if (kVar7.f13880v.equals(kVar2.f13880v)) {
                            I2++;
                        }
                        if (kVar7 == kVar2) {
                            break;
                        }
                    }
                }
                break;
        }
        int i10 = this.f15276b;
        int i11 = this.a;
        if (i11 == 0) {
            return I2 == i10;
        }
        int i12 = I2 - i10;
        return i12 * i11 >= 0 && i12 % i11 == 0;
    }

    public final String b() {
        switch (this.f15277c) {
            case 0:
                return "nth-child";
            case 1:
                return "nth-last-child";
            case 2:
                return "nth-last-of-type";
            default:
                return "nth-of-type";
        }
    }

    public String toString() {
        int i10 = this.f15276b;
        int i11 = this.a;
        if (i11 == 0) {
            return String.format(":%s(%d)", b(), Integer.valueOf(i10));
        }
        return i10 == 0 ? String.format(":%s(%dn)", b(), Integer.valueOf(i11)) : String.format(":%s(%dn%+d)", b(), Integer.valueOf(i11), Integer.valueOf(i10));
    }
}
