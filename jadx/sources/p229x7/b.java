package p229x7;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.services.banners.BannerView;
import p199u7.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BannerView f15780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AdView f15783i;

    public b(Context context, QueryInfo queryInfo, BannerView bannerView, c cVar, int i10, int i11, com.unity3d.scar.adapter.common.c cVar2) {
        super(context, cVar, queryInfo, cVar2);
        this.f15780f = bannerView;
        this.f15781g = i10;
        this.f15782h = i11;
        this.f15783i = new AdView(context);
        this.f15778d = new d();
    }

    @Override // p229x7.a
    public final void c(AdRequest adRequest) {
        AdView adView;
        BannerView bannerView = this.f15780f;
        if (bannerView == null || (adView = this.f15783i) == null) {
            return;
        }
        bannerView.addView(adView);
        this.f15783i.setAdSize(new AdSize(this.f15781g, this.f15782h));
        this.f15783i.setAdUnitId(this.f15776b.f15350c);
        this.f15783i.setAdListener(((d) this.f15778d).f15784k);
        this.f15783i.loadAd(adRequest);
    }
}
