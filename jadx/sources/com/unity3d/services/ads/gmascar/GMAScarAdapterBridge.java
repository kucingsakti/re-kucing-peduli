package com.unity3d.services.ads.gmascar;

import A1.RunnableC0094c;
import A1.l;
import C4.a;
import P2.g;
import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
import p199u7.c;

/* JADX INFO: loaded from: classes.dex */
public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridgeBase _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private d _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory;
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge(MobileAdsBridgeBase mobileAdsBridgeBase, InitializeListenerBridge initializeListenerBridge, InitializationStatusBridge initializationStatusBridge, AdapterStatusBridge adapterStatusBridge, WebViewErrorHandler webViewErrorHandler, ScarAdapterFactory scarAdapterFactory, GMAEventSender gMAEventSender) {
        this._initializationStatusBridge = initializationStatusBridge;
        this._initializationListenerBridge = initializeListenerBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._webViewErrorHandler = webViewErrorHandler;
        this._scarAdapterFactory = scarAdapterFactory;
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._gmaEventSender = gMAEventSender;
        PresenceDetector presenceDetector = new PresenceDetector(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        GMAInitializer gMAInitializer = new GMAInitializer(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge, gMAEventSender);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridgeBase, presenceDetector, gMAInitializer, gMAEventSender);
    }

    private d getScarAdapterObject() {
        MobileAdsBridgeBase mobileAdsBridgeBase;
        if (this._scarAdapter == null && (mobileAdsBridgeBase = this._mobileAdsBridge) != null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(mobileAdsBridgeBase.getAdapterVersion(this._scarVersionFinder.getVersionCode()), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(new ArrayDeque(Arrays.asList(b.f10407O, b.P, b.f10408Q, b.f10409R)), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(c cVar) {
        this._scarAdapter.a(ClientProperties.getApplicationContext(), cVar, new ScarInterstitialAdHandler(cVar, getScarEventSubject(cVar.f15352e), this._gmaEventSender));
    }

    private void loadRewardedAd(c cVar) {
        this._scarAdapter.b(ClientProperties.getApplicationContext(), cVar, new ScarRewardedAdHandler(cVar, getScarEventSubject(cVar.f15352e), this._gmaEventSender));
    }

    public void getSCARBiddingSignals(boolean z6, BiddingSignalsHandler biddingSignalsHandler) throws Throwable {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase == null || !mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
            return;
        }
        d scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        a aVar = ((f) scarAdapterObject).a;
        aVar.getClass();
        l lVar = new l(6);
        o1.c cVar = new o1.c(19);
        lVar.d();
        aVar.y(applicationContext, p199u7.d.f15353s, lVar, cVar);
        lVar.d();
        aVar.y(applicationContext, p199u7.d.f15354t, lVar, cVar);
        if (z6) {
            lVar.d();
            aVar.y(applicationContext, p199u7.d.f15355u, lVar, cVar);
        }
        g gVar = new g(biddingSignalsHandler, 24, cVar);
        lVar.f123t = gVar;
        if (lVar.f122s <= 0) {
            gVar.run();
        }
    }

    public void getSCARSignal(String str, p199u7.d dVar) {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler(this._gmaEventSender);
        d dVar2 = this._scarAdapter;
        if (dVar2 == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.g) new com.unity3d.scar.adapter.common.a(b.f10394B, "Could not create SCAR adapter object", "Could not create SCAR adapter object"));
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        a aVar = ((f) dVar2).a;
        aVar.getClass();
        HashMap map = new HashMap();
        int i10 = 0 + 1;
        aVar.x(applicationContext, str, dVar);
        if (i10 <= 0) {
            if (map.size() > 0) {
                signalsHandler.onSignalsCollected(new JSONObject(map).toString());
            } else {
                signalsHandler.onSignalsCollected("");
            }
        }
    }

    public void getVersion() {
        this._scarVersionFinder.getVersion();
    }

    public boolean hasSCARBiddingSupport() {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            d scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                return true;
            }
        }
        return false;
    }

    public void initializeScar() {
        if (!this._presenceDetector.areGMAClassesPresent()) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.g) new com.unity3d.scar.adapter.common.a(b.f10418t, null, new Object[0]));
        } else {
            this._gmaEventSender.send(b.f10417s, new Object[0]);
            this._gmaInitializer.initializeGMA();
        }
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z6, String str, String str2, String str3, String str4, int i10) {
        c cVar = new c(Integer.valueOf(i10), str, str2, str4, str3);
        d scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.g) new com.unity3d.scar.adapter.common.a(b.f10398F, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
        } else if (z6) {
            loadInterstitialAd(cVar);
        } else {
            loadRewardedAd(cVar);
        }
    }

    public void loadBanner(Context context, BannerView bannerView, String str, c cVar, UnityBannerSize unityBannerSize) {
        this._scarAdapter = getScarAdapterObject();
        ScarBannerAdHandler scarBannerAdHandler = new ScarBannerAdHandler(str);
        d dVar = this._scarAdapter;
        if (dVar != null) {
            dVar.c(context, bannerView, cVar, unityBannerSize.getWidth(), unityBannerSize.getHeight(), scarBannerAdHandler);
        } else {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, str);
        }
    }

    public void show(String str, String str2, boolean z6) {
        d scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.g) new com.unity3d.scar.adapter.common.a(b.f10403K, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
            return;
        }
        Activity activity = ClientProperties.getActivity();
        f fVar = (f) scarAdapterObject;
        p199u7.a aVar = (p199u7.a) fVar.f10425b.get(str);
        if (aVar == null) {
            String strI = E0.a.i("Could not find ad for placement '", str, "'.");
            fVar.f10427d.handleError(new com.unity3d.scar.adapter.common.a(b.f10401I, strI, str, str2, strI));
        } else {
            fVar.f10426c = aVar;
            a.E(new RunnableC0094c(fVar, 21, activity));
        }
    }
}
