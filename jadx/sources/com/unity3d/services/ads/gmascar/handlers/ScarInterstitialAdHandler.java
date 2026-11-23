package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import p199u7.c;

/* JADX INFO: loaded from: classes.dex */
public class ScarInterstitialAdHandler extends ScarAdHandlerBase {
    public ScarInterstitialAdHandler(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        super(cVar, eventSubject, gMAEventSender);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase
    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i10, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        b bVar = b.f10406N;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(bVar, cVar.a, cVar.f15349b, str, Integer.valueOf(i10));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(b.f10396D, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(b.f10413V, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(b.f10412U, new Object[0]);
    }
}
