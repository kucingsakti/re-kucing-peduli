package com.onesignal.notifications.internal.listeners;

import U5.e;
import X4.f;
import android.app.Activity;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025c5.c;
import p076h8.m;
import p100k5.b;
import p123m8.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, Y5.b {
    private final com.onesignal.notifications.internal.a _activityOpener;
    private final K5.a _analyticsTracker;
    private final f _applicationService;
    private final M5.a _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final c _deviceService;
    private final p075h6.a _influenceManager;
    private final Y5.c _notificationLifecycleService;
    private final p026c6.b _receiveReceiptWorkManager;
    private final p208v6.b _subscriptionManager;
    private final p110l5.a _time;
    private final Set<String> postedOpenedNotifIds;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.listeners.a$a, reason: collision with other inner class name */
    public static final class C0069a extends p144o8.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C0069a(d<? super C0069a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.onNotificationOpened(null, null, this);
        }
    }

    public a(f fVar, Y5.c cVar, com.onesignal.core.internal.config.b bVar, p075h6.a aVar, p208v6.b bVar2, c cVar2, M5.a aVar2, p026c6.b bVar3, com.onesignal.notifications.internal.a aVar3, K5.a aVar4, p110l5.a aVar5) {
        i.f(fVar, "_applicationService");
        i.f(cVar, "_notificationLifecycleService");
        i.f(bVar, "_configModelStore");
        i.f(aVar, "_influenceManager");
        i.f(bVar2, "_subscriptionManager");
        i.f(cVar2, "_deviceService");
        i.f(aVar2, "_backend");
        i.f(bVar3, "_receiveReceiptWorkManager");
        i.f(aVar3, "_activityOpener");
        i.f(aVar4, "_analyticsTracker");
        i.f(aVar5, "_time");
        this._applicationService = fVar;
        this._notificationLifecycleService = cVar;
        this._configModelStore = bVar;
        this._influenceManager = aVar;
        this._subscriptionManager = bVar2;
        this._deviceService = cVar2;
        this._backend = aVar2;
        this._receiveReceiptWorkManager = bVar3;
        this._activityOpener = aVar3;
        this._analyticsTracker = aVar4;
        this._time = aVar5;
        this.postedOpenedNotifIds = new LinkedHashSet();
    }

    private final String getLatestNotificationId(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            i.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return U5.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return U5.f.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:49:0x015b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d9 -> B:38:0x00e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Y5.b
    public java.lang.Object onNotificationOpened(android.app.Activity r17, org.json.JSONArray r18, p123m8.d<? super p076h8.m> r19) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.notifications.internal.listeners.a.onNotificationOpened(android.app.Activity, org.json.JSONArray, m8.d):java.lang.Object");
    }

    @Override // Y5.b
    public Object onNotificationReceived(U5.d dVar, d<? super m> dVar2) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            e eVar = e.INSTANCE;
            com.onesignal.notifications.internal.d dVarGenerateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(com.onesignal.common.f.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            K5.a aVar = this._analyticsTracker;
            String notificationId = dVarGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            i.c(notificationId);
            aVar.trackReceivedEvent(notificationId, eVar.getCampaignNameFromNotification(dVarGenerateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return m.a;
    }

    @Override // p100k5.b
    public void start() {
        this._notificationLifecycleService.addInternalNotificationLifecycleEventHandler(this);
    }
}
