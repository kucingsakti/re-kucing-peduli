package p048ea;

import p010aa.a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f11299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i10, a aVar) {
        super(str, true);
        this.f11299e = oVar;
        this.f11300f = i10;
    }

    @Override // p010aa.a
    public final long a() {
        this.f11299e.f11307C.getClass();
        synchronized (this.f11299e) {
            this.f11299e.f11320Q.remove(Integer.valueOf(this.f11300f));
        }
        return -1L;
    }
}
