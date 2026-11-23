package p081i3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f12225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, int i10) {
        super(kVar);
        this.f12224e = i10;
        this.f12225f = kVar;
    }

    @Override // p081i3.h
    public final float a() {
        switch (this.f12224e) {
            case 0:
                k kVar = this.f12225f;
                return kVar.f12246h + kVar.f12247i;
            case 1:
                k kVar2 = this.f12225f;
                return kVar2.f12246h + kVar2.j;
            default:
                return this.f12225f.f12246h;
        }
    }
}
