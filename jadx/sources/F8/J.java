package F8;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public final class J extends a0 implements C8.i {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f1524B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(D d3, String str, String str2, Object obj) {
        super(d3, str, str2, obj);
        p210v8.i.f(d3, "container");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
        this.f1524B = D3.b.r(p076h8.e.f11786s, new A0.r(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // C8.j
    public final C8.g h() {
        return (I) this.f1524B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h8.d, java.lang.Object] */
    @Override // C8.i, C8.j
    public final C8.h h() {
        return (I) this.f1524B.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(D d3, O8.K k3) {
        super(d3, k3);
        p210v8.i.f(d3, "container");
        p210v8.i.f(k3, "descriptor");
        this.f1524B = D3.b.r(p076h8.e.f11786s, new A0.r(this, 9));
    }
}
