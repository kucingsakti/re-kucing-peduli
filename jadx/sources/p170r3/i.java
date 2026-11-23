package p170r3;

import C8.E;

/* JADX INFO: loaded from: classes.dex */
public final class i extends E {
    @Override // C8.E
    public final void o(t tVar, float f10, float f11) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        p pVar = new p(0.0f, 0.0f, f12, f12);
        pVar.f14541f = 180.0f;
        pVar.f14542g = 90.0f;
        tVar.f14550f.add(pVar);
        n nVar = new n(pVar);
        tVar.a(180.0f);
        tVar.f14551g.add(nVar);
        tVar.f14548d = 270.0f;
        float f13 = (0.0f + f12) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d3 = 270.0f;
        tVar.f14546b = (((float) Math.cos(Math.toRadians(d3))) * f14) + f13;
        tVar.f14547c = (f14 * ((float) Math.sin(Math.toRadians(d3)))) + f13;
    }
}
