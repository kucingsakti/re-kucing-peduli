package K4;

import android.content.SharedPreferences;
import com.kcstream.cing.library.AdController;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements IUnityAdsShowListener {
    public final /* synthetic */ AdController a;

    public a(AdController adController) {
        this.a = adController;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowClick(String str) {
        p210v8.i.f(str, "placementId");
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        p210v8.i.f(str, "placementId");
        p210v8.i.f(unityAdsShowCompletionState, AdOperationMetric.INIT_STATE);
        AdController adController = this.a;
        adController.getSharedPreferences("AdController", 0);
        System.currentTimeMillis();
        B8.c cVar = new B8.c(30000, 250000, 1);
        p246z8.a aVar = p246z8.d.f16317s;
        try {
            int iP = J7.a.p(cVar);
            SharedPreferences.Editor editorEdit = adController.B().edit();
            editorEdit.putLong("last_ad_time", adController.f10269a0 + ((long) iP));
            editorEdit.apply();
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        p210v8.i.f(str, "placementId");
        p210v8.i.f(unityAdsShowError, "error");
        p210v8.i.f(str2, "message");
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public final void onUnityAdsShowStart(String str) {
        p210v8.i.f(str, "placementId");
    }
}
