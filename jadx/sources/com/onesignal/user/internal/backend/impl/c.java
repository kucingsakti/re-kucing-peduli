package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.exceptions.BackendException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.f;
import p076h8.m;
import p086i8.t;
import p086i8.z;
import p132n6.h;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p132n6.c {
    private final p035d5.c _httpClient;

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
            return c.this.createSubscription(null, null, null, null, null, this);
        }
    }

    public static final class b extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.deleteSubscription(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.user.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0082c extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public C0082c(p123m8.d<? super C0082c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.getIdentityFromSubscription(null, null, this);
        }
    }

    public static final class d extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.transferSubscription(null, null, null, null, null, this);
        }
    }

    public static final class e extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public e(p123m8.d<? super e> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.updateSubscription(null, null, null, this);
        }
    }

    public c(p035d5.c cVar) {
        i.f(cVar, "_httpClient");
        this._httpClient = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p132n6.c
    public Object createSubscription(String str, String str2, String str3, h hVar, String str4, p123m8.d<? super f> dVar) throws BackendException, JSONException {
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
        Object objPost = aVar.result;
        p134n8.a aVar2 = p134n8.a.f13404s;
        int i11 = aVar.label;
        if (i11 == 0) {
            J7.a.v(objPost);
            JSONObject jSONObjectConvertToJSON = com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar);
            jSONObjectConvertToJSON.remove("id");
            JSONObject jSONObjectPut = new JSONObject().put("subscription", jSONObjectConvertToJSON);
            i.e(jSONObjectPut, "requestJSON");
            com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str4, 15, null);
            aVar.label = 1;
            objPost = this._httpClient.post("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", jSONObjectPut, dVar2, aVar);
            if (objPost == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objPost);
        }
        p035d5.a aVar3 = (p035d5.a) objPost;
        if (!aVar3.isSuccess()) {
            throw new BackendException(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
        }
        String payload = aVar3.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        JSONObject jSONObjectSafeJSONObject = jSONObject != null ? com.onesignal.common.e.safeJSONObject(jSONObject, "subscription") : null;
        if (jSONObjectSafeJSONObject == null || !jSONObjectSafeJSONObject.has("id")) {
            return null;
        }
        String strSafeString = com.onesignal.common.e.safeString(jSONObject, "ryw_token");
        return new f(jSONObjectSafeJSONObject.getString("id"), strSafeString != null ? new Q4.b(strSafeString, com.onesignal.common.e.safeLong(jSONObject, "ryw_delay")) : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p132n6.c
    public Object deleteSubscription(String str, String str2, String str3, p123m8.d<? super m> dVar) throws BackendException {
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
        Object objDelete = bVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = bVar.label;
        if (i11 == 0) {
            J7.a.v(objDelete);
            com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str3, 15, null);
            bVar.label = 1;
            objDelete = this._httpClient.delete("apps/" + str + "/subscriptions/" + str2, dVar2, bVar);
            if (objDelete == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objDelete);
        }
        p035d5.a aVar2 = (p035d5.a) objDelete;
        if (aVar2.isSuccess()) {
            return m.a;
        }
        throw new BackendException(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p132n6.c
    public Object getIdentityFromSubscription(String str, String str2, p123m8.d<? super Map<String, String>> dVar) throws BackendException {
        C0082c c0082c;
        Map<String, Object> map;
        if (dVar instanceof C0082c) {
            c0082c = (C0082c) dVar;
            int i10 = c0082c.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0082c.label = i10 - Integer.MIN_VALUE;
            } else {
                c0082c = new C0082c(dVar);
            }
        } else {
            c0082c = new C0082c(dVar);
        }
        C0082c c0082c2 = c0082c;
        Object obj = c0082c2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = c0082c2.label;
        if (i11 == 0) {
            J7.a.v(obj);
            c0082c2.label = 1;
            obj = p035d5.b.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, c0082c2, 2, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        p035d5.a aVar2 = (p035d5.a) obj;
        if (!aVar2.isSuccess()) {
            throw new BackendException(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
        }
        String payload = aVar2.getPayload();
        i.c(payload);
        JSONObject jSONObjectSafeJSONObject = com.onesignal.common.e.safeJSONObject(new JSONObject(payload), "identity");
        if (jSONObjectSafeJSONObject == null || (map = com.onesignal.common.e.toMap(jSONObjectSafeJSONObject)) == null) {
            return t.f12329s;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.s(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p132n6.c
    public Object transferSubscription(String str, String str2, String str3, String str4, String str5, p123m8.d<? super m> dVar) throws BackendException, JSONException {
        d dVar2;
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
        Object objPatch = dVar2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = dVar2.label;
        if (i11 == 0) {
            J7.a.v(objPatch);
            JSONObject jSONObjectPut = new JSONObject().put("identity", new JSONObject().put(str3, str4));
            i.e(jSONObjectPut, "requestJSON");
            com.onesignal.core.internal.http.impl.d dVar3 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str5, 15, null);
            dVar2.label = 1;
            objPatch = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2 + "/owner", jSONObjectPut, dVar3, dVar2);
            if (objPatch == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objPatch);
        }
        p035d5.a aVar2 = (p035d5.a) objPatch;
        if (aVar2.isSuccess()) {
            return m.a;
        }
        throw new BackendException(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p132n6.c
    public Object updateSubscription(String str, String str2, h hVar, p123m8.d<? super Q4.b> dVar) throws BackendException, JSONException {
        e eVar;
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
        e eVar2 = eVar;
        Object objPatch$default = eVar2.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = eVar2.label;
        if (i11 == 0) {
            J7.a.v(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
            i.e(jSONObjectPut, "requestJSON");
            eVar2.label = 1;
            objPatch$default = p035d5.b.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, jSONObjectPut, null, eVar2, 4, null);
            if (objPatch$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(objPatch$default);
        }
        p035d5.a aVar2 = (p035d5.a) objPatch$default;
        if (!aVar2.isSuccess()) {
            throw new BackendException(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
        }
        String payload = aVar2.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        String strSafeString = jSONObject != null ? com.onesignal.common.e.safeString(jSONObject, "ryw_token") : null;
        Long lSafeLong = jSONObject != null ? com.onesignal.common.e.safeLong(jSONObject, "ryw_delay") : null;
        if (strSafeString != null) {
            return new Q4.b(strSafeString, lSafeLong);
        }
        return null;
    }
}
