package B7;

import Q3.u0;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BannerView f762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AdView f765i;

    public b(Context context, BannerView bannerView, A7.a aVar, p199u7.c cVar, int i10, int i11, com.unity3d.scar.adapter.common.c cVar2) {
        super(context, cVar, aVar, cVar2);
        this.f762f = bannerView;
        this.f763g = i10;
        this.f764h = i11;
        this.f765i = new AdView(context);
        this.f760d = new d();
    }

    @Override // B7.a
    public final void d(AdRequest adRequest) {
        AdView adView;
        BannerView bannerView = this.f762f;
        if (bannerView == null || (adView = this.f765i) == null) {
            return;
        }
        bannerView.addView(adView);
        this.f765i.setAdSize(new AdSize(this.f763g, this.f764h));
        this.f765i.setAdUnitId(((p199u7.c) this.f758b).f15350c);
        this.f765i.setAdListener(((d) ((u0) this.f760d)).f766k);
        this.f765i.loadAd(adRequest);
    }
}
