package com.rollbar.api.truncation;

import com.rollbar.api.annotations.Unstable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Unstable
public class TruncationHelper {
    public static String truncateString(String str, int i10) {
        return (str == null || str.length() <= i10) ? str : str.substring(0, i10);
    }

    public static List<String> truncateStringsInList(List<String> list, int i10) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(truncateString(it.next(), i10));
        }
        return arrayList;
    }

    public static Map<String, Object> truncateStringsInMap(Map<String, Object> map, int i10) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                value = truncateString((String) value, i10);
            }
            map2.put(entry.getKey(), value);
        }
        return map2;
    }

    public static Map<String, Map<String, Object>> truncateStringsInNestedMap(Map<String, Map<String, Object>> map, int i10) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Map<String, Object>> entry : map.entrySet()) {
            map2.put(entry.getKey(), truncateStringsInMap(entry.getValue(), i10));
        }
        return map2;
    }

    public static <T extends StringTruncatable<T>> T truncateStringsInObject(T t7, int i10) {
        if (t7 == null) {
            return null;
        }
        return (T) t7.truncateStrings(i10);
    }

    public static List<Object> truncateStringsInObjectList(List<Object> list, int i10) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(truncateString((String) obj, i10));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Map<String, List<String>> truncateStringsInStringListMap(Map<String, List<String>> map, int i10) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            map2.put(entry.getKey(), truncateStringsInList(entry.getValue(), i10));
        }
        return map2;
    }

    public static Map<String, String> truncateStringsInStringMap(Map<String, String> map, int i10) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map2.put(entry.getKey(), truncateString(entry.getValue(), i10));
        }
        return map2;
    }
}
