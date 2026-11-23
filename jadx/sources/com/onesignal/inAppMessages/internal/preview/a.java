package com.onesignal.inAppMessages.internal.preview;

import U5.e;
import X4.f;
import Y5.c;
import org.json.JSONException;
import org.json.JSONObject;
import p123m8.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p100k5.b, Y5.a {
    private final f _applicationService;
    private final p183s5.a _iamDisplayer;
    private final com.onesignal.notifications.internal.a _notificationActivityOpener;
    private final W5.b _notificationDisplayer;
    private final c _notificationLifeCycle;
    private final p244z5.a _state;
    private final p110l5.a _time;

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.preview.a$a, reason: collision with other inner class name */
    public static final class C0044a extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0044a(d<? super C0044a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public a(p183s5.a aVar, f fVar, W5.b bVar, com.onesignal.notifications.internal.a aVar2, c cVar, p244z5.a aVar3, p110l5.a aVar4) {
        i.f(aVar, "_iamDisplayer");
        i.f(fVar, "_applicationService");
        i.f(bVar, "_notificationDisplayer");
        i.f(aVar2, "_notificationActivityOpener");
        i.f(cVar, "_notificationLifeCycle");
        i.f(aVar3, "_state");
        i.f(aVar4, "_time");
        this._iamDisplayer = aVar;
        this._applicationService = fVar;
        this._notificationDisplayer = bVar;
        this._notificationActivityOpener = aVar2;
        this._notificationLifeCycle = cVar;
        this._state = aVar3;
        this._time = aVar4;
    }

    private final String inAppPreviewPushUUID(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject customJSONObject = e.INSTANCE.getCustomJSONObject(jSONObject);
            if (customJSONObject.has(R5.a.PUSH_ADDITIONAL_DATA_KEY) && (jSONObjectOptJSONObject = customJSONObject.optJSONObject(R5.a.PUSH_ADDITIONAL_DATA_KEY)) != null && jSONObjectOptJSONObject.has("os_in_app_message_preview_id")) {
                return jSONObjectOptJSONObject.optString("os_in_app_message_preview_id");
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r10 == r1) goto L26;
     */
    @Override // Y5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object canOpenNotification(android.app.Activity r8, org.json.JSONObject r9, p123m8.d<? super java.lang.Boolean> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.onesignal.inAppMessages.internal.preview.a.C0044a
            if (r0 == 0) goto L13
            r0 = r10
            com.onesignal.inAppMessages.internal.preview.a$a r0 = (com.onesignal.inAppMessages.internal.preview.a.C0044a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.inAppMessages.internal.preview.a$a r0 = new com.onesignal.inAppMessages.internal.preview.a$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r8 = r0.L$0
            com.onesignal.inAppMessages.internal.preview.a r8 = (com.onesignal.inAppMessages.internal.preview.a) r8
            J7.a.v(r10)
            goto L83
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            com.onesignal.inAppMessages.internal.preview.a r9 = (com.onesignal.inAppMessages.internal.preview.a) r9
            J7.a.v(r10)
            r10 = r8
            r8 = r9
            goto L6f
        L45:
            J7.a.v(r10)
            java.lang.String r10 = r7.inAppPreviewPushUUID(r9)
            if (r10 != 0) goto L51
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L51:
            com.onesignal.notifications.internal.a r2 = r7._notificationActivityOpener
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            org.json.JSONArray r9 = r6.put(r9)
            java.lang.String r6 = "JSONArray().put(jsonData)"
            p210v8.i.e(r9, r6)
            r0.L$0 = r7
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r8 = r2.openDestinationActivity(r8, r9, r0)
            if (r8 != r1) goto L6e
            goto L82
        L6e:
            r8 = r7
        L6f:
            z5.a r9 = r8._state
            r9.setInAppMessageIdShowing(r10)
            s5.a r9 = r8._iamDisplayer
            r0.L$0 = r8
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r10 = r9.displayPreviewMessage(r10, r0)
            if (r10 != r1) goto L83
        L82:
            return r1
        L83:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto L90
            z5.a r8 = r8._state
            r8.setInAppMessageIdShowing(r3)
        L90:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.preview.a.canOpenNotification(android.app.Activity, org.json.JSONObject, m8.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r6.displayNotification(r7, r0) == r1) goto L31;
     */
    @Override // Y5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object canReceiveNotification(org.json.JSONObject r6, p123m8.d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.onesignal.inAppMessages.internal.preview.a.b
            if (r0 == 0) goto L13
            r0 = r7
            com.onesignal.inAppMessages.internal.preview.a$b r0 = (com.onesignal.inAppMessages.internal.preview.a.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onesignal.inAppMessages.internal.preview.a$b r0 = new com.onesignal.inAppMessages.internal.preview.a$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            J7.a.v(r7)
            goto L82
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            com.onesignal.inAppMessages.internal.preview.a r6 = (com.onesignal.inAppMessages.internal.preview.a) r6
            J7.a.v(r7)
            goto L61
        L3a:
            J7.a.v(r7)
            java.lang.String r7 = r5.inAppPreviewPushUUID(r6)
            if (r7 != 0) goto L46
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L46:
            X4.f r2 = r5._applicationService
            boolean r2 = r2.isInForeground()
            if (r2 == 0) goto L70
            z5.a r6 = r5._state
            r6.setInAppMessageIdShowing(r7)
            s5.a r6 = r5._iamDisplayer
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r6.displayPreviewMessage(r7, r0)
            if (r7 != r1) goto L60
            goto L81
        L60:
            r6 = r5
        L61:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L82
            z5.a r6 = r6._state
            r7 = 0
            r6.setInAppMessageIdShowing(r7)
            goto L82
        L70:
            U5.d r7 = new U5.d
            l5.a r2 = r5._time
            r7.<init>(r6, r2)
            W5.b r6 = r5._notificationDisplayer
            r0.label = r3
            java.lang.Object r6 = r6.displayNotification(r7, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.preview.a.canReceiveNotification(org.json.JSONObject, m8.d):java.lang.Object");
    }

    @Override // p100k5.b
    public void start() {
        this._notificationLifeCycle.setInternalNotificationLifecycleCallback(this);
    }
}
