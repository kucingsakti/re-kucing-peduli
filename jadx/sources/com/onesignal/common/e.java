package com.onesignal.common;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public static final class a extends p210v8.k implements p200u8.b {
        final /* synthetic */ Map<String, Object> $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(1);
            this.$map = map;
        }

        @Override // p200u8.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((JSONObject) obj);
            return m.a;
        }

        public final void invoke(JSONObject jSONObject) throws JSONException {
            p210v8.i.f(jSONObject, "it");
            e.putMap(jSONObject, this.$map);
        }
    }

    public static final <T> List<T> expandJSONArray(JSONObject jSONObject, String str, p200u8.b bVar) throws JSONException {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "into");
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                p210v8.i.e(jSONObject2, "itemJSONObject");
                Object objInvoke = bVar.invoke(jSONObject2);
                if (objInvoke != null) {
                    arrayList.add(objInvoke);
                }
            }
        }
        return arrayList;
    }

    public static final void expandJSONObject(JSONObject jSONObject, String str, p200u8.b bVar) throws JSONException {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "into");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            p210v8.i.e(jSONObject2, "this.getJSONObject(name)");
            bVar.invoke(jSONObject2);
        }
    }

    public static final <T> JSONObject putJSONArray(JSONObject jSONObject, String str, List<? extends T> list, p200u8.b bVar) throws JSONException {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "create");
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) bVar.invoke(it.next());
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(str, jSONArray);
        }
        return jSONObject;
    }

    public static final JSONObject putJSONObject(JSONObject jSONObject, String str, p200u8.b bVar) throws JSONException {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        p210v8.i.f(bVar, "expand");
        JSONObject jSONObject2 = new JSONObject();
        bVar.invoke(jSONObject2);
        jSONObject.put(str, jSONObject2);
        return jSONObject;
    }

    public static final JSONObject putMap(JSONObject jSONObject, Map<String, ? extends Object> map) throws JSONException {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(map, "map");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static final JSONObject putSafe(JSONObject jSONObject, String str, Object obj) throws JSONException {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (obj != null) {
            jSONObject.put(str, obj);
        }
        return jSONObject;
    }

    public static final Boolean safeBool(JSONObject jSONObject, String str) {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    public static final Double safeDouble(JSONObject jSONObject, String str) {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (jSONObject.has(str)) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        return null;
    }

    public static final Integer safeInt(JSONObject jSONObject, String str) {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (jSONObject.has(str)) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final JSONObject safeJSONObject(JSONObject jSONObject, String str) {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final Long safeLong(JSONObject jSONObject, String str) {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (jSONObject.has(str)) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        return null;
    }

    public static final String safeString(JSONObject jSONObject, String str) {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        p210v8.i.f(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object objOpt = jSONArray.opt(i10);
            if (JSONObject.NULL.equals(objOpt)) {
                arrayList.add(null);
            } else if (objOpt instanceof JSONArray) {
                arrayList.add(toList((JSONArray) objOpt));
            } else if (objOpt instanceof JSONObject) {
                arrayList.add(toMap((JSONObject) objOpt));
            } else {
                arrayList.add(objOpt);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        p210v8.i.f(jSONObject, "<this>");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        p210v8.i.e(itKeys, "this.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object list = jSONObject.get(next);
            p210v8.i.e(next, "key");
            if (JSONObject.NULL.equals(list)) {
                list = null;
            } else if (list instanceof JSONObject) {
                list = toMap((JSONObject) list);
            } else if (list instanceof JSONArray) {
                list = toList((JSONArray) list);
            }
            map.put(next, list);
        }
        return map;
    }

    public static final JSONObject putMap(JSONObject jSONObject, String str, Map<String, ? extends Object> map) throws JSONException {
        p210v8.i.f(jSONObject, "<this>");
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        if (map != null) {
            putJSONObject(jSONObject, str, new a(map));
        }
        return jSONObject;
    }
}
