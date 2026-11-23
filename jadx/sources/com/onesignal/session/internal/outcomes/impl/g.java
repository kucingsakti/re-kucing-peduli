package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.common.exceptions.BackendException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g implements b {
    private final p035d5.c _http;

    public static final class a extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public a(p123m8.d<? super a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public g(p035d5.c cVar) {
        p210v8.i.f(cVar, "_http");
        this._http = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.onesignal.session.internal.outcomes.impl.b
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, e eVar, p123m8.d<? super p076h8.m> dVar) throws BackendException, JSONException {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.label = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objPost$default = aVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.label;
        if (i11 == 0) {
            J7.a.v(objPost$default);
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put("onesignal_id", str2).put("subscription", new JSONObject().put("id", str3).put(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY, str4));
            if (bool != null) {
                jSONObjectPut.put(p084i6.e.DIRECT_TAG, bool.booleanValue());
            }
            if (eVar.getNotificationIds() != null && eVar.getNotificationIds().length() > 0) {
                jSONObjectPut.put(p084i6.e.NOTIFICATIONS_IDS, eVar.getNotificationIds());
            }
            jSONObjectPut.put("id", eVar.getName());
            if (eVar.getWeight() > 0.0f) {
                jSONObjectPut.put("weight", new Float(eVar.getWeight()));
            }
            if (eVar.getTimestamp() > 0) {
                jSONObjectPut.put("timestamp", eVar.getTimestamp());
            }
            if (eVar.getSessionTime() > 0) {
                jSONObjectPut.put("session_time", eVar.getSessionTime());
            }
            p035d5.c cVar = this._http;
            aVar.label = 1;
            objPost$default = p035d5.b.post$default(cVar, "outcomes/measure", jSONObjectPut, null, aVar, 4, null);
            if (objPost$default == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objPost$default);
        }
        p035d5.a aVar3 = (p035d5.a) objPost$default;
        if (aVar3.isSuccess()) {
            return p076h8.m.a;
        }
        throw new BackendException(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
    }
}
