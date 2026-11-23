package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.e;
import com.onesignal.common.exceptions.BackendException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;
import p086i8.z;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p132n6.b {
    private final p035d5.c _httpClient;

    /* JADX INFO: renamed from: com.onesignal.user.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0080a extends p144o8.c {
        int label;
        /* synthetic */ Object result;

        public C0080a(p123m8.d<? super C0080a> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.deleteAlias(null, null, null, null, null, this);
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
            return a.this.setAlias(null, null, null, null, null, this);
        }
    }

    public a(p035d5.c cVar) {
        i.f(cVar, "_httpClient");
        this._httpClient = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // p132n6.b
    public Object deleteAlias(String str, String str2, String str3, String str4, String str5, p123m8.d<? super m> dVar) throws BackendException {
        C0080a c0080a;
        if (dVar instanceof C0080a) {
            c0080a = (C0080a) dVar;
            int i10 = c0080a.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0080a.label = i10 - Integer.MIN_VALUE;
            } else {
                c0080a = new C0080a(dVar);
            }
        } else {
            c0080a = new C0080a(dVar);
        }
        Object objDelete = c0080a.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = c0080a.label;
        if (i11 == 0) {
            J7.a.v(objDelete);
            com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str5, 15, null);
            c0080a.label = 1;
            objDelete = this._httpClient.delete("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity/" + str4, dVar2, c0080a);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p132n6.b
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, p123m8.d<? super Map<String, String>> dVar) throws BackendException, JSONException {
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
        Object objPatch = bVar.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i11 = bVar.label;
        if (i11 == 0) {
            J7.a.v(objPatch);
            JSONObject jSONObjectPut = new JSONObject().put("identity", e.putMap(new JSONObject(), map));
            i.e(jSONObjectPut, "requestJSONObject");
            com.onesignal.core.internal.http.impl.d dVar2 = new com.onesignal.core.internal.http.impl.d(null, null, null, null, str4, 15, null);
            bVar.label = 1;
            objPatch = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", jSONObjectPut, dVar2, bVar);
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
        i.c(payload);
        JSONObject jSONObject = new JSONObject(payload).getJSONObject("identity");
        i.e(jSONObject, "responseJSON.getJSONObject(\"identity\")");
        Map<String, Object> map2 = e.toMap(jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.s(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }
}
