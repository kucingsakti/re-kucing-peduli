package p129n3;

import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Y {
    @Override // p188t1.Y
    public final float p(f fVar) {
        return fVar.f13346G.f13360b * 10000.0f;
    }

    @Override // p188t1.Y
    public final void y(f fVar, float f10) {
        fVar.f13346G.f13360b = f10 / 10000.0f;
        fVar.invalidateSelf();
    }
}
