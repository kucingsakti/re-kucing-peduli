package B6;

import p076h8.m;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f736t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Boolean f737u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Boolean bool, int i10) {
        super(0);
        this.f735s = i10;
        this.f736t = hVar;
        this.f737u = bool;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f735s) {
            case 0:
                Boolean bool = this.f737u;
                p210v8.i.e(bool, "granted");
                boolean zBooleanValue = bool.booleanValue();
                h hVar = this.f736t;
                if (hVar.g0()) {
                    hVar.i0(new e(zBooleanValue, hVar, 0));
                }
                break;
            default:
                Boolean bool2 = this.f737u;
                p210v8.i.e(bool2, "granted");
                boolean zBooleanValue2 = bool2.booleanValue();
                h hVar2 = this.f736t;
                if (hVar2.g0()) {
                    hVar2.i0(new e(zBooleanValue2, hVar2, 1));
                }
                break;
        }
        return m.a;
    }
}
