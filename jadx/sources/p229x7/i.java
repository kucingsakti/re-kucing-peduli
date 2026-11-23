package p229x7;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import p199u7.a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a implements a {
    @Override // p199u7.a
    public final void a() {
        this.f15779e.handleError(com.unity3d.scar.adapter.common.a.a(this.f15776b));
    }

    @Override // p229x7.a
    public final void c(AdRequest adRequest) {
        RewardedAd.load(this.a, this.f15776b.f15350c, adRequest, ((m) this.f15778d).f15786k);
    }
}
