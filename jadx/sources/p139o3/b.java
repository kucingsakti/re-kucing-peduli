package p139o3;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class b extends K.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D3.b f13709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f13710i;

    public b(d dVar, D3.b bVar) {
        this.f13710i = dVar;
        this.f13709h = bVar;
    }

    @Override // K.b
    public final void i(int i10) {
        this.f13710i.f13724m = true;
        this.f13709h.y(i10);
    }

    @Override // K.b
    public final void j(Typeface typeface) {
        d dVar = this.f13710i;
        dVar.f13725n = Typeface.create(typeface, dVar.f13715c);
        dVar.f13724m = true;
        this.f13709h.z(dVar.f13725n, false);
    }
}
