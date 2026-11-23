package p170r3;

import C8.E;

/* JADX INFO: loaded from: classes.dex */
public final class d extends E {
    @Override // C8.E
    public final void o(t tVar, float f10, float f11) {
        tVar.d(f11 * f10, 180.0f, 90.0f);
        double d3 = f11;
        double d8 = f10;
        tVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d3 * d8), (float) (Math.sin(Math.toRadians(0.0f)) * d3 * d8));
    }
}
