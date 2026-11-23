package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import p209v7.a;

/* JADX INFO: loaded from: classes.dex */
public class SignalsHandler implements a {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // p209v7.a
    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(b.f10424z, str);
    }

    @Override // p209v7.a
    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(b.f10393A, str);
    }
}
