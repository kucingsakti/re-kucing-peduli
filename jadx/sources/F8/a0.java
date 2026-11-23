package F8;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends k0 implements C8.r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f1555A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(D d3, String str, String str2, Object obj) {
        super(d3, str, str2, obj);
        p210v8.i.f(d3, "container");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
        p076h8.e eVar = p076h8.e.f11786s;
        this.f1555A = D3.b.r(eVar, new Z(this, 0));
        D3.b.r(eVar, new Z(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // C8.u
    public final C8.n e() {
        return (Y) this.f1555A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // p200u8.b
    public final Object invoke(Object obj) {
        return ((Y) this.f1555A.getValue()).v(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // F8.k0
    public final g0 m() {
        return (Y) this.f1555A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // C8.u
    public final C8.q e() {
        return (Y) this.f1555A.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(D d3, O8.K k3) {
        super(d3, k3);
        p210v8.i.f(d3, "container");
        p210v8.i.f(k3, "descriptor");
        p076h8.e eVar = p076h8.e.f11786s;
        this.f1555A = D3.b.r(eVar, new Z(this, 0));
        D3.b.r(eVar, new Z(this, 1));
    }
}
