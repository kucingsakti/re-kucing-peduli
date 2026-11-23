package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import p199u7.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class ScarAdHandlerBase {
    protected final EventSubject<b> _eventSubject;
    protected final GMAEventSender _gmaEventSender;
    protected final c _scarAdMetadata;

    public ScarAdHandlerBase(c cVar, EventSubject<b> eventSubject, GMAEventSender gMAEventSender) {
        this._scarAdMetadata = cVar;
        this._eventSubject = eventSubject;
        this._gmaEventSender = gMAEventSender;
    }

    public void onAdClicked() {
        this._gmaEventSender.send(b.f10411T, new Object[0]);
    }

    public void onAdClosed() {
        this._gmaEventSender.send(b.f10414W, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    public void onAdFailedToLoad(int i10, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        b bVar = b.f10400H;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(bVar, cVar.a, cVar.f15349b, str, Integer.valueOf(i10));
    }

    public void onAdLoaded() {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        b bVar = b.f10395C;
        c cVar = this._scarAdMetadata;
        gMAEventSender.send(bVar, cVar.a, cVar.f15349b);
    }

    public void onAdOpened() {
        this._gmaEventSender.send(b.f10402J, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<b>() { // from class: com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1
            @Override // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(b bVar) {
                ScarAdHandlerBase.this._gmaEventSender.send(bVar, new Object[0]);
            }
        });
    }
}
