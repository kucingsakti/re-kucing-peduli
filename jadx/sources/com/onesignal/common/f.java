package com.onesignal.common;

import L9.n;
import android.os.Bundle;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final f INSTANCE = new f();

    private f() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        p210v8.i.f(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e10) {
                com.onesignal.debug.internal.logging.b.error("bundleAsJSONObject error for key: " + str, e10);
            }
        }
        return jSONObject;
    }

    public final boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    Object obj = jSONArray.get(i10);
                    p210v8.i.e(obj, "jsonArray1[i]");
                    Object objNormalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i11);
                    p210v8.i.e(obj2, "jsonArray2[j]");
                    if (p210v8.i.a(objNormalizeType, normalizeType(obj2))) {
                    }
                }
                return false;
            }
            return true;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final Bundle jsonStringToBundle(String str) {
        p210v8.i.f(str, JsonStorageKeyNames.DATA_KEY);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            p210v8.i.e(itKeys, "jsonObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                p210v8.i.d(next, "null cannot be cast to non-null type kotlin.String");
                String str2 = next;
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jSONObject) {
        p210v8.i.f(jSONObject, "jsonObject");
        Iterator<String> itKeys = jSONObject.keys();
        p210v8.i.e(itKeys, "jsonObject.keys()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object objOpt = jSONObject.opt(next);
                if ((objOpt instanceof JSONArray) || (objOpt instanceof JSONObject)) {
                    com.onesignal.debug.internal.logging.b.error$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null, 2, null);
                } else if (jSONObject.isNull(next) || "".equals(objOpt)) {
                    linkedHashMap.put(next, "");
                } else {
                    linkedHashMap.put(next, objOpt.toString());
                }
            } catch (Throwable unused) {
            }
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jSONArray) throws JSONException {
        p210v8.i.f(jSONArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String string = jSONArray.getString(i10);
            p210v8.i.e(string, "jsonArray.getString(i)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object obj) {
        p210v8.i.f(obj, "object");
        Class<?> cls = obj.getClass();
        if (cls.equals(Integer.TYPE)) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        return cls.equals(Float.TYPE) ? Double.valueOf(((Float) obj).floatValue()) : obj;
    }

    public final String toUnescapedEUIDString(JSONObject jSONObject) {
        String strGroup;
        p210v8.i.f(jSONObject, "json");
        String string = jSONObject.toString();
        p210v8.i.e(string, "json.toString()");
        if (jSONObject.has(EXTERNAL_USER_ID)) {
            Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(string);
            if (matcher.find() && (strGroup = matcher.group(0)) != null) {
                String strReplaceAll = matcher.replaceAll(Matcher.quoteReplacement(n.G(strGroup, "\\/", "/")));
                p210v8.i.e(strReplaceAll, "eidMatcher.replaceAll(unescapedEID)");
                return strReplaceAll;
            }
        }
        return string;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray jSONArrayPut = new JSONArray().put(jSONObject);
        p210v8.i.e(jSONArrayPut, "JSONArray().put(jsonObject)");
        return jSONArrayPut;
    }
}
