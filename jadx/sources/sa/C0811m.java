package sa;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: renamed from: sa.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final enum C0811m extends B {
    public C0811m() {
        super("Initial", 0);
    }

    @Override // sa.B
    public final boolean h(K0.n nVar, C0789b c0789b) {
        if (B.f(nVar)) {
            return true;
        }
        if (nVar.h()) {
            c0789b.t((H) nVar);
            return true;
        }
        boolean zI = nVar.i();
        C0822s c0822s = B.f14792t;
        if (!zI) {
            c0789b.f14884l = c0822s;
            return c0789b.D(nVar);
        }
        I i10 = (I) nVar;
        D d3 = c0789b.f14881h;
        String string = i10.f14822b.toString();
        d3.getClass();
        String strTrim = string.trim();
        if (!d3.a) {
            strTrim = J7.j.t(strTrim);
        }
        String string2 = i10.f14824d.toString();
        String string3 = i10.f14825e.toString();
        org.jsoup.nodes.i iVar = new org.jsoup.nodes.i();
        qa.b.w(strTrim);
        qa.b.w(string2);
        qa.b.w(string3);
        iVar.B(MediationMetaData.KEY_NAME, strTrim);
        iVar.B("publicId", string2);
        iVar.B("systemId", string3);
        if (iVar.E("publicId")) {
            iVar.B("pubSysKey", "PUBLIC");
        } else if (iVar.E("systemId")) {
            iVar.B("pubSysKey", "SYSTEM");
        }
        String str = i10.f14823c;
        if (str != null) {
            iVar.B("pubSysKey", str);
        }
        c0789b.f14877d.B(iVar);
        if (i10.f14826f) {
            c0789b.f14877d.f13876D = 2;
        }
        c0789b.f14884l = c0822s;
        return true;
    }
}
