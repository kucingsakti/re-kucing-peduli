package com.onesignal.inAppMessages.internal.backend.impl;

import N9.AbstractC0342z;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.onesignal.common.exceptions.BackendException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p161q5.b {
    private final p025c5.c _deviceService;
    private final p035d5.c _httpClient;
    private final p192t5.a _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0035a extends p144o8.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C0035a(p123m8.d<? super C0035a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.attemptFetchWithRetries(null, null, null, null, this);
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchInAppMessagesWithoutRywToken(null, null, this);
        }
    }

    public static final class c extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMData(null, null, null, this);
        }
    }

    public static final class d extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.getIAMPreviewData(null, null, this);
        }
    }

    public static final class e extends p144o8.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(null, null, null, null, null, null, this);
        }
    }

    public static final class f extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(p123m8.d<? super f> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    public static final class g extends JSONObject {
        public g(String str, a aVar, String str2, String str3, String str4, boolean z6) throws JSONException {
            put("app_id", str);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z6) {
                put("first_click", true);
            }
        }
    }

    public static final class h extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(p123m8.d<? super h> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMImpression(null, null, null, null, this);
        }
    }

    public static final class i extends JSONObject {
        public i(String str, String str2, String str3, a aVar) throws JSONException {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("first_impression", true);
        }
    }

    public static final class j extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(p123m8.d<? super j> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendIAMPageImpression(null, null, null, null, null, this);
        }
    }

    public static final class k extends JSONObject {
        public k(String str, String str2, String str3, a aVar, String str4) throws JSONException {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", aVar._deviceService.getDeviceType().getValue());
            put("page_id", str4);
        }
    }

    public a(p035d5.c cVar, p025c5.c cVar2, p192t5.a aVar) {
        p210v8.i.f(cVar, "_httpClient");
        p210v8.i.f(cVar2, "_deviceService");
        p210v8.i.f(aVar, "_hydrator");
        this._httpClient = cVar;
        this._deviceService = cVar2;
        this._hydrator = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x017d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x011d -> B:53:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x013d -> B:52:0x0140). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object attemptFetchWithRetries(java.lang.String r25, Q4.b r26, p200u8.a r27, com.onesignal.core.internal.http.impl.d r28, p123m8.d<? super java.util.List<com.onesignal.inAppMessages.internal.a>> r29) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.inAppMessages.internal.backend.impl.a.attemptFetchWithRetries(java.lang.String, Q4.b, u8.a, com.onesignal.core.internal.http.impl.d, m8.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchInAppMessagesWithoutRywToken(String str, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super List<com.onesignal.inAppMessages.internal.a>> dVar2) {
        b bVar;
        a aVar;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar2);
            }
        } else {
            bVar = new b(dVar2);
        }
        Object obj = bVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = bVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            p035d5.c cVar = this._httpClient;
            bVar.L$0 = this;
            bVar.label = 1;
            obj = cVar.get(str, dVar, bVar);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) bVar.L$0;
            J7.a.v(obj);
        }
        p035d5.a aVar3 = (p035d5.a) obj;
        if (aVar3.isSuccess()) {
            String payload = aVar3.getPayload();
            JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
            if (jSONObject != null) {
                return aVar.hydrateInAppMessages(jSONObject);
            }
        }
        return null;
    }

    private final String htmlPathForMessage(String str, String str2, String str3) {
        if (str2 == null) {
            com.onesignal.debug.internal.logging.b.error$default("Unable to find a variant for in-app message " + str, null, 2, null);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    private final List<com.onesignal.inAppMessages.internal.a> hydrateInAppMessages(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("in_app_messages")) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("in_app_messages");
        p192t5.a aVar = this._hydrator;
        p210v8.i.e(jSONArray, "iamMessagesAsJSON");
        return aVar.hydrateIAMMessages(jSONArray);
    }

    private final void printHttpErrorForInAppMessageRequest(String str, int i10, String str2) {
        com.onesignal.debug.internal.logging.b.error$default("Encountered a " + i10 + " error while attempting in-app message " + str + " request: " + str2, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String str, String str2) {
        com.onesignal.debug.internal.logging.b.debug$default("Successful post for in-app message " + str + " request: " + str2, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p161q5.b
    public Object getIAMData(String str, String str2, String str3, p123m8.d<? super p161q5.a> dVar) {
        c cVar;
        a aVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = cVar2.label;
        if (i11 == 0) {
            J7.a.v(obj);
            String strHtmlPathForMessage = htmlPathForMessage(str2, str3, str);
            if (strHtmlPathForMessage == null) {
                return new p161q5.a(null, false);
            }
            p035d5.c cVar3 = this._httpClient;
            cVar2.L$0 = this;
            cVar2.label = 1;
            obj = p035d5.b.get$default(cVar3, strHtmlPathForMessage, null, cVar2, 2, null);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) cVar2.L$0;
            J7.a.v(obj);
        }
        p035d5.a aVar3 = (p035d5.a) obj;
        if (aVar3.isSuccess()) {
            aVar.htmlNetworkRequestAttemptCount = 0;
            String payload = aVar3.getPayload();
            p210v8.i.c(payload);
            return new p161q5.a(aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
        }
        aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar3.getStatusCode(), aVar3.getPayload());
        com.onesignal.common.g gVar = com.onesignal.common.g.INSTANCE;
        if (gVar.getResponseStatusType(aVar3.getStatusCode()) != com.onesignal.common.g.a.RETRYABLE || aVar.htmlNetworkRequestAttemptCount >= gVar.getMaxNetworkRequestAttemptCount()) {
            aVar.htmlNetworkRequestAttemptCount = 0;
            return new p161q5.a(null, false);
        }
        aVar.htmlNetworkRequestAttemptCount++;
        return new p161q5.a(null, true);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p161q5.b
    public Object getIAMPreviewData(String str, String str2, p123m8.d<? super com.onesignal.inAppMessages.internal.d> dVar) {
        d dVar2;
        a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        d dVar3 = dVar2;
        Object obj = dVar3.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = dVar3.label;
        if (i11 == 0) {
            J7.a.v(obj);
            p035d5.c cVar = this._httpClient;
            dVar3.L$0 = this;
            dVar3.label = 1;
            obj = p035d5.b.get$default(cVar, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, dVar3, 2, null);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar3.L$0;
            J7.a.v(obj);
        }
        p035d5.a aVar3 = (p035d5.a) obj;
        if (!aVar3.isSuccess()) {
            aVar.printHttpErrorForInAppMessageRequest(com.onesignal.inAppMessages.internal.d.HTML, aVar3.getStatusCode(), aVar3.getPayload());
            return null;
        }
        String payload = aVar3.getPayload();
        p210v8.i.c(payload);
        return aVar._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p161q5.b
    public Object listInAppMessages(String str, String str2, Q4.b bVar, p200u8.a aVar, String str3, p076h8.f fVar, p123m8.d<? super List<com.onesignal.inAppMessages.internal.a>> dVar) {
        e eVar;
        p076h8.f fVar2;
        Q4.b bVar2;
        p200u8.a aVar2;
        String str4;
        String str5;
        String str6;
        a aVar3;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.result;
        p134n8.a aVar4 = p134n8.a.f13404s;
        int i11 = eVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            Long rywDelay = bVar.getRywDelay();
            long jLongValue = rywDelay != null ? rywDelay.longValue() : 500L;
            eVar.L$0 = this;
            eVar.L$1 = str;
            eVar.L$2 = str2;
            eVar.L$3 = bVar;
            eVar.L$4 = aVar;
            eVar.L$5 = str3;
            fVar2 = fVar;
            eVar.L$6 = fVar2;
            eVar.label = 1;
            if (AbstractC0342z.e(jLongValue, eVar) != aVar4) {
                bVar2 = bVar;
                aVar2 = aVar;
                str4 = str3;
                str5 = str;
                str6 = str2;
                aVar3 = this;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
            return obj;
        }
        p076h8.f fVar3 = (p076h8.f) eVar.L$6;
        String str7 = (String) eVar.L$5;
        aVar2 = (p200u8.a) eVar.L$4;
        bVar2 = (Q4.b) eVar.L$3;
        str6 = (String) eVar.L$2;
        str5 = (String) eVar.L$1;
        a aVar5 = (a) eVar.L$0;
        J7.a.v(obj);
        fVar2 = fVar3;
        str4 = str7;
        aVar3 = aVar5;
        StringBuilder sbM = AbstractC0487g.m("apps/", str5, "/users/by/");
        sbM.append((String) fVar2.f11789s);
        sbM.append('/');
        sbM.append((String) fVar2.f11790t);
        sbM.append("/subscriptions/");
        sbM.append(str6);
        sbM.append("/iams");
        String string = sbM.toString();
        com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str4, 15, null);
        eVar.L$0 = null;
        eVar.L$1 = null;
        eVar.L$2 = null;
        eVar.L$3 = null;
        eVar.L$4 = null;
        eVar.L$5 = null;
        eVar.L$6 = null;
        eVar.label = 2;
        Object objAttemptFetchWithRetries = aVar3.attemptFetchWithRetries(string, bVar2, aVar2, dVar2, eVar);
        return objAttemptFetchWithRetries == aVar4 ? aVar4 : objAttemptFetchWithRetries;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p161q5.b
    public Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z6, p123m8.d<? super m> dVar) throws BackendException {
        f fVar;
        a aVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.label = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        f fVar2 = fVar;
        Object objPost$default = fVar2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = fVar2.label;
        if (i11 == 0) {
            J7.a.v(objPost$default);
            g gVar = new g(str, this, str2, str5, str3, z6);
            p035d5.c cVar = this._httpClient;
            String strI = E0.a.i("in_app_messages/", str4, "/click");
            fVar2.L$0 = this;
            fVar2.label = 1;
            objPost$default = p035d5.b.post$default(cVar, strI, gVar, null, fVar2, 4, null);
            if (objPost$default == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) fVar2.L$0;
            J7.a.v(objPost$default);
        }
        p035d5.a aVar3 = (p035d5.a) objPost$default;
        if (!aVar3.isSuccess()) {
            aVar.printHttpErrorForInAppMessageRequest("engagement", aVar3.getStatusCode(), aVar3.getPayload());
            throw new BackendException(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
        }
        String payload = aVar3.getPayload();
        p210v8.i.c(payload);
        aVar.printHttpSuccessForInAppMessageRequest("engagement", payload);
        return m.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p161q5.b
    public Object sendIAMImpression(String str, String str2, String str3, String str4, p123m8.d<? super m> dVar) throws BackendException {
        h hVar;
        a aVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.label = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        h hVar2 = hVar;
        Object objPost$default = hVar2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = hVar2.label;
        if (i11 == 0) {
            J7.a.v(objPost$default);
            i iVar = new i(str, str2, str3, this);
            p035d5.c cVar = this._httpClient;
            String strI = E0.a.i("in_app_messages/", str4, "/impression");
            hVar2.L$0 = this;
            hVar2.label = 1;
            objPost$default = p035d5.b.post$default(cVar, strI, iVar, null, hVar2, 4, null);
            if (objPost$default == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) hVar2.L$0;
            J7.a.v(objPost$default);
        }
        p035d5.a aVar3 = (p035d5.a) objPost$default;
        if (!aVar3.isSuccess()) {
            aVar.printHttpErrorForInAppMessageRequest("impression", aVar3.getStatusCode(), aVar3.getPayload());
            throw new BackendException(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
        }
        String payload = aVar3.getPayload();
        p210v8.i.c(payload);
        aVar.printHttpSuccessForInAppMessageRequest("impression", payload);
        return m.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p161q5.b
    public Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, p123m8.d<? super m> dVar) throws BackendException {
        j jVar;
        Object objPost$default;
        a aVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i10 = jVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.label = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        j jVar2 = jVar;
        Object obj = jVar2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = jVar2.label;
        if (i11 == 0) {
            J7.a.v(obj);
            k kVar = new k(str, str2, str3, this, str5);
            p035d5.c cVar = this._httpClient;
            String strI = E0.a.i("in_app_messages/", str4, "/pageImpression");
            jVar2.L$0 = this;
            jVar2.label = 1;
            objPost$default = p035d5.b.post$default(cVar, strI, kVar, null, jVar2, 4, null);
            if (objPost$default == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar3 = (a) jVar2.L$0;
            J7.a.v(obj);
            aVar = aVar3;
            objPost$default = obj;
        }
        p035d5.a aVar4 = (p035d5.a) objPost$default;
        if (!aVar4.isSuccess()) {
            aVar.printHttpErrorForInAppMessageRequest("page impression", aVar4.getStatusCode(), aVar4.getPayload());
            throw new BackendException(aVar4.getStatusCode(), aVar4.getPayload(), aVar4.getRetryAfterSeconds());
        }
        String payload = aVar4.getPayload();
        p210v8.i.c(payload);
        aVar.printHttpSuccessForInAppMessageRequest("page impression", payload);
        return m.a;
    }
}
