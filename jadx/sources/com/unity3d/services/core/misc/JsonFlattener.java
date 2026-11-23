package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JsonFlattener {
    private final JSONObject _jsonData;

    public JsonFlattener(JSONObject jSONObject) {
        this._jsonData = jSONObject;
    }

    private boolean shouldIncludeKey(String str, List<String> list, List<String> list2) {
        if (!list2.contains(str) && list.size() > 0) {
            return list.contains(str);
        }
        return false;
    }

    public JSONObject flattenJson(String str, JsonFlattenerRules jsonFlattenerRules) {
        return jsonFlattenerRules == null ? new JSONObject() : flattenJson(str, jsonFlattenerRules.getTopLevelToInclude(), jsonFlattenerRules.getReduceKeys(), jsonFlattenerRules.getSkipKeys());
    }

    public JSONObject flattenJson(String str, List<String> list, List<String> list2, List<String> list3) {
        List<String> list4;
        List<String> list5;
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> itKeys = this._jsonData.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (shouldIncludeKey(next, list, list3)) {
                    Object objOpt = this._jsonData.opt(next);
                    if (objOpt instanceof JSONObject) {
                        String str2 = str;
                        list4 = list2;
                        list5 = list3;
                        new JsonFlattener((JSONObject) objOpt).flattenJson(str2, next, jSONObject, list4, list5);
                        str = str2;
                    } else {
                        list4 = list2;
                        list5 = list3;
                        jSONObject.put(next, objOpt);
                    }
                    list2 = list4;
                    list3 = list5;
                }
            }
        } catch (JSONException e10) {
            DeviceLog.error("Could not flatten JSON: %s", e10.getMessage());
        }
        return jSONObject;
    }

    public void flattenJson(String str, String str2, JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        String str3;
        String str4;
        JSONObject jSONObject2;
        List<String> list3;
        List<String> list4;
        Iterator<String> itKeys = this._jsonData.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!list2.contains(next)) {
                Object obj = this._jsonData.get(next);
                if (list.contains(next)) {
                    str3 = str2;
                } else {
                    str3 = str2 + str + next;
                }
                if (obj instanceof JSONObject) {
                    str4 = str;
                    jSONObject2 = jSONObject;
                    list3 = list;
                    list4 = list2;
                    new JsonFlattener((JSONObject) obj).flattenJson(str4, str3, jSONObject2, list3, list4);
                } else {
                    str4 = str;
                    jSONObject2 = jSONObject;
                    list3 = list;
                    list4 = list2;
                    jSONObject2.put(str3, obj);
                }
                str = str4;
                jSONObject = jSONObject2;
                list = list3;
                list2 = list4;
            }
        }
    }
}
