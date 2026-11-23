package R9;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p123m8.i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Throwable f4482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p123m8.i f4483t;

    public d(p123m8.i iVar, Throwable th) {
        this.f4482s = th;
        this.f4483t = iVar;
    }

    @Override // p123m8.i
    public final Object fold(Object obj, p200u8.c cVar) {
        return this.f4483t.fold(obj, cVar);
    }

    @Override // p123m8.i
    public final p123m8.g get(p123m8.h hVar) {
        return this.f4483t.get(hVar);
    }

    @Override // p123m8.i
    public final p123m8.i minusKey(p123m8.h hVar) {
        return this.f4483t.minusKey(hVar);
    }

    @Override // p123m8.i
    public final p123m8.i plus(p123m8.i iVar) {
        return this.f4483t.plus(iVar);
    }
}
