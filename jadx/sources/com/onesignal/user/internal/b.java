package com.onesignal.user.internal;

import p210v8.i;
import p228x6.g;

/* JADX INFO: loaded from: classes.dex */
public class b extends d implements p228x6.b {
    private final com.onesignal.common.events.b changeHandlersNotifier;
    private g savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p208v6.d dVar) {
        super(dVar);
        i.f(dVar, "model");
        this.changeHandlersNotifier = new com.onesignal.common.events.b();
        this.savedState = fetchState();
    }

    private final g fetchState() {
        return new g(getId(), getToken(), getOptedIn());
    }

    @Override // p228x6.b
    public void addObserver(p228x6.c cVar) {
        i.f(cVar, "observer");
        this.changeHandlersNotifier.subscribe(cVar);
    }

    public final com.onesignal.common.events.b getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // p228x6.b
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != p208v6.f.NO_PERMISSION;
    }

    public final g getSavedState() {
        return this.savedState;
    }

    @Override // p228x6.b
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // p228x6.b
    public void optIn() {
        com.onesignal.common.modeling.i.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // p228x6.b
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final g refreshState() {
        g gVarFetchState = fetchState();
        this.savedState = gVarFetchState;
        return gVarFetchState;
    }

    @Override // p228x6.b
    public void removeObserver(p228x6.c cVar) {
        i.f(cVar, "observer");
        this.changeHandlersNotifier.unsubscribe(cVar);
    }
}
