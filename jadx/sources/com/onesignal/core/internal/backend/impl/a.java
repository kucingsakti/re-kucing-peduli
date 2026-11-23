package com.onesignal.core.internal.backend.impl;

import com.onesignal.common.exceptions.BackendException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;
import p210v8.i;
import p210v8.k;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Y4.b {
    private final p035d5.c _http;

    /* JADX INFO: renamed from: com.onesignal.core.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0020a extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0020a(p123m8.d<? super C0020a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchParams(null, null, this);
        }
    }

    public static final class b extends k implements p200u8.b {
        final /* synthetic */ t $influenceParams;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, a aVar) {
            super(1);
            this.$influenceParams = tVar;
            this.this$0 = aVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return m.a;
        }

        public final void invoke(JSONObject jSONObject) {
            i.f(jSONObject, "it");
            this.$influenceParams.f15466s = this.this$0.processOutcomeJson(jSONObject);
        }
    }

    public static final class c extends k implements p200u8.b {
        final /* synthetic */ t $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar) {
            super(1);
            this.$fcmParams = tVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return m.a;
        }

        public final void invoke(JSONObject jSONObject) {
            i.f(jSONObject, "it");
            t tVar = this.$fcmParams;
            String strSafeString = com.onesignal.common.e.safeString(jSONObject, "api_key");
            tVar.f15466s = new Y4.a(com.onesignal.common.e.safeString(jSONObject, "project_id"), com.onesignal.common.e.safeString(jSONObject, "app_id"), strSafeString);
        }
    }

    public static final class d extends k implements p200u8.b {
        final /* synthetic */ t $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t tVar) {
            super(1);
            this.$isDirectEnabled = tVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return m.a;
        }

        public final void invoke(JSONObject jSONObject) {
            i.f(jSONObject, "it");
            this.$isDirectEnabled.f15466s = com.onesignal.common.e.safeBool(jSONObject, "enabled");
        }
    }

    public static final class e extends k implements p200u8.b {
        final /* synthetic */ t $iamLimit;
        final /* synthetic */ t $indirectIAMAttributionWindow;
        final /* synthetic */ t $indirectNotificationAttributionWindow;
        final /* synthetic */ t $isIndirectEnabled;
        final /* synthetic */ t $notificationLimit;

        /* JADX INFO: renamed from: com.onesignal.core.internal.backend.impl.a$e$a, reason: collision with other inner class name */
        public static final class C0021a extends k implements p200u8.b {
            final /* synthetic */ t $indirectNotificationAttributionWindow;
            final /* synthetic */ t $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0021a(t tVar, t tVar2) {
                super(1);
                this.$indirectNotificationAttributionWindow = tVar;
                this.$notificationLimit = tVar2;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return m.a;
            }

            public final void invoke(JSONObject jSONObject) {
                i.f(jSONObject, "it");
                this.$indirectNotificationAttributionWindow.f15466s = com.onesignal.common.e.safeInt(jSONObject, "minutes_since_displayed");
                this.$notificationLimit.f15466s = com.onesignal.common.e.safeInt(jSONObject, "limit");
            }
        }

        public static final class b extends k implements p200u8.b {
            final /* synthetic */ t $iamLimit;
            final /* synthetic */ t $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, t tVar2) {
                super(1);
                this.$indirectIAMAttributionWindow = tVar;
                this.$iamLimit = tVar2;
            }

            @Override // p200u8.b
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return m.a;
            }

            public final void invoke(JSONObject jSONObject) {
                i.f(jSONObject, "it");
                this.$indirectIAMAttributionWindow.f15466s = com.onesignal.common.e.safeInt(jSONObject, "minutes_since_displayed");
                this.$iamLimit.f15466s = com.onesignal.common.e.safeInt(jSONObject, "limit");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t tVar, t tVar2, t tVar3, t tVar4, t tVar5) {
            super(1);
            this.$isIndirectEnabled = tVar;
            this.$indirectNotificationAttributionWindow = tVar2;
            this.$notificationLimit = tVar3;
            this.$indirectIAMAttributionWindow = tVar4;
            this.$iamLimit = tVar5;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return m.a;
        }

        public final void invoke(JSONObject jSONObject) throws JSONException {
            i.f(jSONObject, "indirectJSON");
            this.$isIndirectEnabled.f15466s = com.onesignal.common.e.safeBool(jSONObject, "enabled");
            com.onesignal.common.e.expandJSONObject(jSONObject, "notification_attribution", new C0021a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            com.onesignal.common.e.expandJSONObject(jSONObject, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    public static final class f extends k implements p200u8.b {
        final /* synthetic */ t $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(t tVar) {
            super(1);
            this.$isUnattributedEnabled = tVar;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((JSONObject) obj);
            return m.a;
        }

        public final void invoke(JSONObject jSONObject) {
            i.f(jSONObject, "it");
            this.$isUnattributedEnabled.f15466s = com.onesignal.common.e.safeBool(jSONObject, "enabled");
        }
    }

    public a(p035d5.c cVar) {
        i.f(cVar, "_http");
        this._http = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.c processOutcomeJson(JSONObject jSONObject) throws JSONException {
        t tVar = new t();
        t tVar2 = new t();
        t tVar3 = new t();
        t tVar4 = new t();
        t tVar5 = new t();
        t tVar6 = new t();
        t tVar7 = new t();
        com.onesignal.common.e.expandJSONObject(jSONObject, p084i6.e.DIRECT_TAG, new d(tVar5));
        com.onesignal.common.e.expandJSONObject(jSONObject, "indirect", new e(tVar6, tVar, tVar2, tVar3, tVar4));
        com.onesignal.common.e.expandJSONObject(jSONObject, "unattributed", new f(tVar7));
        return new Y4.c((Integer) tVar.f15466s, (Integer) tVar2.f15466s, (Integer) tVar3.f15466s, (Integer) tVar4.f15466s, (Boolean) tVar5.f15466s, (Boolean) tVar6.f15466s, (Boolean) tVar7.f15466s);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // Y4.b
    public Object fetchParams(String str, String str2, p123m8.d<? super Y4.d> dVar) throws BackendException, JSONException {
        C0020a c0020a;
        a aVar;
        if (dVar instanceof C0020a) {
            c0020a = (C0020a) dVar;
            int i10 = c0020a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0020a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0020a = new C0020a(dVar);
            }
        } else {
            c0020a = new C0020a(dVar);
        }
        Object obj = c0020a.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = c0020a.label;
        if (i11 == 0) {
            J7.a.v(obj);
            com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
            StringBuilder sb = new StringBuilder("apps/");
            sb.append(str);
            sb.append("/android_params.js");
            String string = sb.toString();
            if (str2 != null && !com.onesignal.common.d.INSTANCE.isLocalId(str2)) {
                string = string + "?player_id=" + str2;
            }
            p035d5.c cVar = this._http;
            com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d("CACHE_KEY_REMOTE_PARAMS", null, null, null, null, 30, null);
            c0020a.L$0 = this;
            c0020a.label = 1;
            obj = cVar.get(string, dVar2, c0020a);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) c0020a.L$0;
            J7.a.v(obj);
        }
        p035d5.a aVar3 = (p035d5.a) obj;
        if (!aVar3.isSuccess()) {
            throw new BackendException(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
        }
        String payload = aVar3.getPayload();
        i.c(payload);
        JSONObject jSONObject = new JSONObject(payload);
        t tVar = new t();
        com.onesignal.common.e.expandJSONObject(jSONObject, "outcomes", new b(tVar, aVar));
        t tVar2 = new t();
        com.onesignal.common.e.expandJSONObject(jSONObject, "fcm", new c(tVar2));
        String strSafeString = com.onesignal.common.e.safeString(jSONObject, "android_sender_id");
        Boolean boolSafeBool = com.onesignal.common.e.safeBool(jSONObject, "enterp");
        Boolean boolSafeBool2 = com.onesignal.common.e.safeBool(jSONObject, "jwt_required");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("chnl_lst");
        Boolean boolSafeBool3 = com.onesignal.common.e.safeBool(jSONObject, "fba");
        Boolean boolSafeBool4 = com.onesignal.common.e.safeBool(jSONObject, "restore_ttl_filter");
        Boolean boolSafeBool5 = com.onesignal.common.e.safeBool(jSONObject, "clear_group_on_summary_click");
        Boolean boolSafeBool6 = com.onesignal.common.e.safeBool(jSONObject, "receive_receipts_enable");
        Boolean boolSafeBool7 = com.onesignal.common.e.safeBool(jSONObject, "disable_gms_missing_prompt");
        Boolean boolSafeBool8 = com.onesignal.common.e.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
        Boolean boolSafeBool9 = com.onesignal.common.e.safeBool(jSONObject, "location_shared");
        Boolean boolSafeBool10 = com.onesignal.common.e.safeBool(jSONObject, "requires_user_privacy_consent");
        Long lSafeLong = com.onesignal.common.e.safeLong(jSONObject, "oprepo_execution_interval");
        Y4.c cVar2 = (Y4.c) tVar.f15466s;
        Y4.c cVar3 = cVar2 == null ? new Y4.c(null, null, null, null, null, null, null, 127, null) : cVar2;
        Y4.a aVar4 = (Y4.a) tVar2.f15466s;
        return new Y4.d(strSafeString, boolSafeBool, boolSafeBool2, jSONArrayOptJSONArray, boolSafeBool3, boolSafeBool4, boolSafeBool5, boolSafeBool6, boolSafeBool7, boolSafeBool8, boolSafeBool9, boolSafeBool10, lSafeLong, cVar3, aVar4 == null ? new Y4.a(null, null, null, 7, null) : aVar4);
    }
}
