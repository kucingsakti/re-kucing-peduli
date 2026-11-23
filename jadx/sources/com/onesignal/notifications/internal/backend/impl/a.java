package com.onesignal.notifications.internal.backend.impl;

import com.onesignal.common.exceptions.BackendException;
import org.json.JSONException;
import org.json.JSONObject;
import p035d5.c;
import p076h8.m;
import p123m8.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements M5.a {
    private final c _httpClient;

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0061a extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public C0061a(d<? super C0061a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsOpened(null, null, null, null, this);
        }
    }

    public static final class b extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public a(c cVar) {
        i.f(cVar, "_httpClient");
        this._httpClient = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // M5.a
    public Object updateNotificationAsOpened(String str, String str2, String str3, p025c5.a aVar, d<? super m> dVar) throws BackendException, JSONException {
        C0061a c0061a;
        if (dVar instanceof C0061a) {
            c0061a = (C0061a) dVar;
            int i10 = c0061a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0061a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0061a = new C0061a(dVar);
            }
        } else {
            c0061a = new C0061a(dVar);
        }
        C0061a c0061a2 = c0061a;
        Object objPut$default = c0061a2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = c0061a2.label;
        if (i11 == 0) {
            J7.a.v(objPut$default);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", str);
            jSONObject.put("player_id", str3);
            jSONObject.put("opened", true);
            jSONObject.put("device_type", aVar.getValue());
            c cVar = this._httpClient;
            String strH = E0.a.h("notifications/", str2);
            c0061a2.label = 1;
            objPut$default = p035d5.b.put$default(cVar, strH, jSONObject, null, c0061a2, 4, null);
            if (objPut$default == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objPut$default);
        }
        p035d5.a aVar3 = (p035d5.a) objPut$default;
        if (aVar3.isSuccess()) {
            return m.a;
        }
        throw new BackendException(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // M5.a
    public Object updateNotificationAsReceived(String str, String str2, String str3, p025c5.a aVar, d<? super m> dVar) throws BackendException, JSONException {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object objPut$default = bVar2.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = bVar2.label;
        if (i11 == 0) {
            J7.a.v(objPut$default);
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", aVar.getValue());
            i.e(jSONObjectPut, "JSONObject()\n           …_type\", deviceType.value)");
            c cVar = this._httpClient;
            String strI = E0.a.i("notifications/", str2, "/report_received");
            bVar2.label = 1;
            objPut$default = p035d5.b.put$default(cVar, strI, jSONObjectPut, null, bVar2, 4, null);
            if (objPut$default == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objPut$default);
        }
        p035d5.a aVar3 = (p035d5.a) objPut$default;
        if (aVar3.isSuccess()) {
            return m.a;
        }
        throw new BackendException(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
    }
}
