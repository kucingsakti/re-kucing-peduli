package p238y9;

import p086i8.C;
import p200u8.a;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f16084t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f16085u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, m mVar, int i10) {
        super(0);
        this.f16083s = i10;
        this.f16084t = lVar;
        this.f16085u = mVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f16083s) {
            case 0:
                return C.u(this.f16084t.a.keySet(), this.f16085u.o());
            default:
                return C.u(this.f16084t.f16088b.keySet(), this.f16085u.p());
        }
    }
}
