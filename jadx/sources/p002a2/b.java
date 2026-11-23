package p002a2;

import A0.r;
import E1.D;
import E1.E;
import p053f4.e;
import p188t1.G;
import p200u8.a;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G f5998t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(G g8, int i10) {
        super(0);
        this.f5997s = i10;
        this.f5998t = g8;
    }

    @Override // p200u8.a
    public final Object invoke() {
        Object objInvoke;
        Object objInvoke2;
        Object objInvoke3;
        switch (this.f5997s) {
            case 0:
                try {
                    objInvoke = new r((D) this.f5998t.f14979t, 26).invoke();
                    break;
                } catch (Exception unused) {
                    objInvoke = "";
                }
                return new a((String) objInvoke);
            case 1:
                try {
                    objInvoke2 = new r((E) this.f5998t.f14978s, 27).invoke();
                    break;
                } catch (Exception unused2) {
                    objInvoke2 = "";
                }
                String str = (String) objInvoke2;
                return new c(str != null ? str : "");
            default:
                try {
                    objInvoke3 = new Z1.a((e) this.f5998t.f14980u, 0).invoke();
                    break;
                } catch (Exception unused3) {
                    objInvoke3 = null;
                }
                String str2 = (String) objInvoke3;
                if (str2 == null) {
                    str2 = "";
                }
                return new d(str2);
        }
    }
}
