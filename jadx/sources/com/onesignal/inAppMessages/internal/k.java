package com.onesignal.inAppMessages.internal;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements p151p5.j {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:InAppMessages in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: addTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo19addTriggers(Map map) throws Exception {
        addTriggers((Map<String, String>) map);
    }

    @Override // p151p5.j
    public boolean getPaused() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: removeTriggers, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo24removeTriggers(Collection collection) throws Exception {
        removeTriggers((Collection<String>) collection);
    }

    @Override // p151p5.j
    public void setPaused(boolean z6) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo16addClickListener(p151p5.c cVar) throws Exception {
        p210v8.i.f(cVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: addLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo17addLifecycleListener(p151p5.g gVar) throws Exception {
        p210v8.i.f(gVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: addTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo18addTrigger(String str, String str2) throws Exception {
        p210v8.i.f(str, "key");
        p210v8.i.f(str2, "value");
        throw Companion.getEXCEPTION();
    }

    public Void addTriggers(Map<String, String> map) throws Exception {
        p210v8.i.f(map, "triggers");
        throw Companion.getEXCEPTION();
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: clearTriggers, reason: merged with bridge method [inline-methods] */
    public Void mo20clearTriggers() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo21removeClickListener(p151p5.c cVar) throws Exception {
        p210v8.i.f(cVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: removeLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo22removeLifecycleListener(p151p5.g gVar) throws Exception {
        p210v8.i.f(gVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // p151p5.j
    /* JADX INFO: renamed from: removeTrigger, reason: merged with bridge method [inline-methods] */
    public Void mo23removeTrigger(String str) throws Exception {
        p210v8.i.f(str, "key");
        throw Companion.getEXCEPTION();
    }

    public Void removeTriggers(Collection<String> collection) throws Exception {
        p210v8.i.f(collection, "keys");
        throw Companion.getEXCEPTION();
    }
}
