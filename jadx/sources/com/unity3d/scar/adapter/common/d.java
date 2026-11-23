package com.unity3d.scar.adapter.common;

import android.content.Context;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    void a(Context context, p199u7.c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler);

    void b(Context context, p199u7.c cVar, ScarRewardedAdHandler scarRewardedAdHandler);

    void c(Context context, BannerView bannerView, p199u7.c cVar, int i10, int i11, ScarBannerAdHandler scarBannerAdHandler);
}
