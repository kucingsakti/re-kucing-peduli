package com.onesignal.notifications.internal;

import J5.j;
import J5.n;
import J5.o;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // J5.n
    /* JADX INFO: renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo33getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo34getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // J5.n
    public Object requestPermission(boolean z6, p123m8.d<?> dVar) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo29addClickListener(J5.h hVar) throws Exception {
        i.f(hVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo30addForegroundLifecycleListener(j jVar) throws Exception {
        i.f(jVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo31addPermissionObserver(o oVar) throws Exception {
        i.f(oVar, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo32clearAllNotifications() throws Exception {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() throws Exception {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo35removeClickListener(J5.h hVar) throws Exception {
        i.f(hVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo36removeForegroundLifecycleListener(j jVar) throws Exception {
        i.f(jVar, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo37removeGroupedNotifications(String str) throws Exception {
        i.f(str, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo38removeNotification(int i10) throws Exception {
        throw Companion.getEXCEPTION();
    }

    @Override // J5.n
    /* JADX INFO: renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo39removePermissionObserver(o oVar) throws Exception {
        i.f(oVar, "observer");
        throw Companion.getEXCEPTION();
    }
}
