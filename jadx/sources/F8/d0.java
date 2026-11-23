package F8;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends k0 implements C8.t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Object f1571A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(D d3, String str, String str2) {
        super(d3, str, str2, p210v8.a.f15448s);
        p210v8.i.f(d3, "container");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
        p076h8.e eVar = p076h8.e.f11786s;
        this.f1571A = D3.b.r(eVar, new c0(this, 0));
        D3.b.r(eVar, new c0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // C8.u
    public final C8.n e() {
        return (b0) this.f1571A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) this.f1571A.getValue()).v(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // F8.k0
    public final g0 m() {
        return (b0) this.f1571A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // C8.u
    public final C8.s e() {
        return (b0) this.f1571A.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(D d3, O8.K k3) {
        super(d3, k3);
        p210v8.i.f(d3, "container");
        p210v8.i.f(k3, "descriptor");
        p076h8.e eVar = p076h8.e.f11786s;
        this.f1571A = D3.b.r(eVar, new c0(this, 0));
        D3.b.r(eVar, new c0(this, 1));
    }
}
