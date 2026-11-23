package K4;

import com.kcstream.cing.library.AdController;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;

/* JADX INFO: loaded from: classes.dex */
public final class b implements IUnityAdsLoadListener {
    public final /* synthetic */ AdController a;

    public b(AdController adController) {
        this.a = adController;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        p210v8.i.f(str, "placementId");
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        AdController adController = this.a;
        UnityAds.show(adController, str, unityAdsShowOptions, new a(adController));
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        p210v8.i.f(str, "placementId");
        p210v8.i.f(unityAdsLoadError, "error");
        p210v8.i.f(str2, "message");
    }
}
