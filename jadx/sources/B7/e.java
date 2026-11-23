package B7;

import Q3.u0;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a implements p199u7.a {
    @Override // p199u7.a
    public final void a() {
        ((com.unity3d.scar.adapter.common.c) this.f761e).handleError(com.unity3d.scar.adapter.common.a.a((p199u7.c) this.f758b));
    }

    @Override // B7.a
    public final void d(AdRequest adRequest) {
        InterstitialAd.load(this.a, ((p199u7.c) this.f758b).f15350c, adRequest, ((h) ((u0) this.f760d)).f767k);
    }
}
