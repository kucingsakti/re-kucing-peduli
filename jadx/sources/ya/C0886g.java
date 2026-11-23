package ya;

import retrofit2.HttpException;

/* JADX INFO: renamed from: ya.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0886g implements InterfaceC0885f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16208s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0887h f16209t;

    public /* synthetic */ C0886g(C0887h c0887h, int i10) {
        this.f16208s = i10;
        this.f16209t = c0887h;
    }

    @Override // ya.InterfaceC0885f
    public final void g(InterfaceC0882c interfaceC0882c, Throwable th) {
        switch (this.f16208s) {
            case 0:
                this.f16209t.completeExceptionally(th);
                break;
            default:
                this.f16209t.completeExceptionally(th);
                break;
        }
    }

    @Override // ya.InterfaceC0885f
    public final void m(InterfaceC0882c interfaceC0882c, L l4) {
        switch (this.f16208s) {
            case 0:
                boolean zC = l4.a.c();
                C0887h c0887h = this.f16209t;
                if (!zC) {
                    c0887h.completeExceptionally(new HttpException(l4));
                } else {
                    c0887h.complete(l4.f16192b);
                }
                break;
            default:
                this.f16209t.complete(l4);
                break;
        }
    }
}
