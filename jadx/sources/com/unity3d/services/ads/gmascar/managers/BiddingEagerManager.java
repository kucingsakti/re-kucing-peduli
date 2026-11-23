package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;

/* JADX INFO: loaded from: classes.dex */
public class BiddingEagerManager extends BiddingBaseManager {
    public BiddingEagerManager(boolean z6, IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(z6, iUnityAdsTokenListener);
    }

    @Override // com.unity3d.services.ads.gmascar.managers.BiddingBaseManager
    public void start() {
        permitSignalsUpload();
        fetchSignals();
    }
}
