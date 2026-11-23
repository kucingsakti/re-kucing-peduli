package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.e;
import com.unity3d.services.core.di.ServiceProvider;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p086i8.t;
import p086i8.z;
import p132n6.f;
import p132n6.g;
import p132n6.h;
import p132n6.j;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    public static final class a extends k implements p200u8.b {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // p200u8.b
        public final h invoke(JSONObject jSONObject) throws JSONException {
            i.f(jSONObject, "it");
            j.a aVar = j.Companion;
            String string = jSONObject.getString(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
            i.e(string, "it.getString(\"type\")");
            j jVarFromString = aVar.fromString(string);
            if (jVarFromString != null) {
                return new h(jSONObject.getString("id"), jVarFromString, e.safeString(jSONObject, "token"), e.safeBool(jSONObject, "enabled"), e.safeInt(jSONObject, "notification_types"), e.safeString(jSONObject, ServiceProvider.NAMED_SDK), e.safeString(jSONObject, "device_model"), e.safeString(jSONObject, "device_os"), e.safeBool(jSONObject, "rooted"), e.safeInt(jSONObject, "net_type"), e.safeString(jSONObject, "carrier"), e.safeString(jSONObject, "app_version"));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.onesignal.user.internal.backend.impl.b$b, reason: collision with other inner class name */
    public static final class C0081b extends k implements p200u8.b {
        public static final C0081b INSTANCE = new C0081b();

        public C0081b() {
            super(1);
        }

        @Override // p200u8.b
        public final JSONObject invoke(g gVar) {
            i.f(gVar, "it");
            return new JSONObject().put("sku", gVar.getSku()).put("iso", gVar.getIso()).put("amount", gVar.getAmount().toString());
        }
    }

    private b() {
    }

    public final p132n6.a convertToCreateUserResponse(JSONObject jSONObject) {
        Map linkedHashMap;
        LinkedHashMap linkedHashMap2;
        JSONObject jSONObjectSafeJSONObject;
        Map<String, Object> map;
        Map<String, Object> map2;
        i.f(jSONObject, "jsonObject");
        JSONObject jSONObjectSafeJSONObject2 = e.safeJSONObject(jSONObject, "identity");
        if (jSONObjectSafeJSONObject2 == null || (map2 = e.toMap(jSONObjectSafeJSONObject2)) == null) {
            linkedHashMap = t.f12329s;
        } else {
            linkedHashMap = new LinkedHashMap(z.s(map2.size()));
            Iterator<T> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        JSONObject jSONObjectSafeJSONObject3 = e.safeJSONObject(jSONObject, "properties");
        if (jSONObjectSafeJSONObject3 == null || (jSONObjectSafeJSONObject = e.safeJSONObject(jSONObjectSafeJSONObject3, "tags")) == null || (map = e.toMap(jSONObjectSafeJSONObject)) == null) {
            linkedHashMap2 = null;
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(z.s(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                linkedHashMap3.put(entry2.getKey(), String.valueOf(entry2.getValue()));
            }
            linkedHashMap2 = linkedHashMap3;
        }
        return new p132n6.a(linkedHashMap, new f(linkedHashMap2, jSONObjectSafeJSONObject3 != null ? e.safeString(jSONObjectSafeJSONObject3, "language") : null, jSONObjectSafeJSONObject3 != null ? e.safeString(jSONObjectSafeJSONObject3, "timezone_id") : null, jSONObjectSafeJSONObject3 != null ? e.safeString(jSONObjectSafeJSONObject3, "country") : null, jSONObjectSafeJSONObject3 != null ? e.safeDouble(jSONObjectSafeJSONObject3, "lat") : null, jSONObjectSafeJSONObject3 != null ? e.safeDouble(jSONObjectSafeJSONObject3, "long") : null), e.expandJSONArray(jSONObject, "subscriptions", a.INSTANCE));
    }

    public final JSONObject convertToJSON(f fVar) {
        i.f(fVar, "properties");
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putMap(new JSONObject(), "tags", fVar.getTags()), "language", fVar.getLanguage()), "timezone_id", fVar.getTimezoneId()), "lat", fVar.getLatitude()), "long", fVar.getLongitude()), "country", fVar.getCountry());
    }

    public final JSONObject convertToJSON(p132n6.e eVar) throws JSONException {
        i.f(eVar, "propertiesDeltas");
        JSONObject jSONObjectPutSafe = e.putSafe(e.putSafe(new JSONObject(), "session_time", eVar.getSessionTime()), "session_count", eVar.getSessionCount());
        BigDecimal amountSpent = eVar.getAmountSpent();
        return e.putJSONArray(e.putSafe(jSONObjectPutSafe, "amount_spent", amountSpent != null ? amountSpent.toString() : null), "purchases", eVar.getPurchases(), C0081b.INSTANCE);
    }

    public final JSONArray convertToJSON(List<h> list) {
        i.f(list, "subscriptions");
        JSONArray jSONArray = new JSONArray();
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(convertToJSON(it.next()));
        }
        return jSONArray;
    }

    public final JSONObject convertToJSON(h hVar) throws JSONException {
        i.f(hVar, "subscription");
        JSONObject jSONObjectPutSafe = e.putSafe(new JSONObject(), "id", hVar.getId());
        j type = hVar.getType();
        return e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(e.putSafe(jSONObjectPutSafe, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY, type != null ? type.getValue() : null), "token", hVar.getToken()), "enabled", hVar.getEnabled()), "notification_types", hVar.getNotificationTypes()), ServiceProvider.NAMED_SDK, hVar.getSdk()), "device_model", hVar.getDeviceModel()), "device_os", hVar.getDeviceOS()), "rooted", hVar.getRooted()), "net_type", hVar.getNetType()), "carrier", hVar.getCarrier()), "app_version", hVar.getAppVersion());
    }
}
