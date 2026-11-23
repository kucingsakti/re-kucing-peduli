package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.e;
import com.onesignal.common.exceptions.BackendException;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p132n6.f;
import p132n6.h;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements p132n6.d {
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
            return d.this.createUser(null, null, null, null, null, this);
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
            return d.this.getUser(null, null, null, null, this);
        }
    }

    public static final class c extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public c(p123m8.d<? super c> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.updateUser(null, null, null, null, false, null, null, this);
        }
    }

    public d(p035d5.c cVar) {
        i.f(cVar, "_httpClient");
        this._httpClient = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p132n6.d
    public Object createUser(String str, Map<String, String> map, List<h> list, Map<String, String> map2, String str2, p123m8.d<? super p132n6.a> dVar) throws BackendException, JSONException {
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
            JSONObject jSONObject = new JSONObject();
            if (!map.isEmpty()) {
                jSONObject.put("identity", e.putMap(new JSONObject(), map));
            }
            if (!list.isEmpty()) {
                jSONObject.put("subscriptions", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(list));
            }
            if (!map2.isEmpty()) {
                jSONObject.put("properties", e.putMap(new JSONObject(), map2));
            }
            jSONObject.put("refresh_device_metadata", true);
            p035d5.c cVar = this._httpClient;
            String strI = E0.a.i("apps/", str, "/users");
            com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str2, 15, null);
            aVar.label = 1;
            objPost = cVar.post(strI, jSONObject, dVar2, aVar);
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
        com.onesignal.user.internal.backend.impl.b bVar = com.onesignal.user.internal.backend.impl.b.INSTANCE;
        String payload = aVar3.getPayload();
        i.c(payload);
        return bVar.convertToCreateUserResponse(new JSONObject(payload));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p132n6.d
    public Object getUser(String str, String str2, String str3, String str4, p123m8.d<? super p132n6.a> dVar) throws BackendException {
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
        Object obj = bVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = bVar.label;
        if (i11 == 0) {
            J7.a.v(obj);
            com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str4, 15, null);
            bVar.label = 1;
            obj = this._httpClient.get("apps/" + str + "/users/by/" + str2 + '/' + str3, dVar2, bVar);
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
        if (aVar2.isSuccess()) {
            return com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToCreateUserResponse(new JSONObject(aVar2.getPayload()));
        }
        throw new BackendException(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p132n6.d
    public Object updateUser(String str, String str2, String str3, f fVar, boolean z6, p132n6.e eVar, String str4, p123m8.d<? super Q4.b> dVar) throws BackendException, JSONException {
        c cVar;
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
        Object objPatch = cVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = cVar.label;
        if (i11 == 0) {
            J7.a.v(objPatch);
            JSONObject jSONObjectPut = new JSONObject().put("refresh_device_metadata", z6);
            if (fVar.getHasAtLeastOnePropertySet()) {
                jSONObjectPut.put("properties", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(fVar));
            }
            if (eVar.getHasAtLeastOnePropertySet()) {
                jSONObjectPut.put("deltas", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(eVar));
            }
            i.e(jSONObjectPut, "jsonObject");
            com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str4, 15, null);
            cVar.label = 1;
            objPatch = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3, jSONObjectPut, dVar2, cVar);
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
        if (!aVar2.isSuccess()) {
            throw new BackendException(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
        }
        String payload = aVar2.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        String strSafeString = jSONObject != null ? e.safeString(jSONObject, "ryw_token") : null;
        Long lSafeLong = jSONObject != null ? e.safeLong(jSONObject, "ryw_delay") : null;
        if (strSafeString != null) {
            return new Q4.b(strSafeString, lSafeLong);
        }
        return null;
    }
}
