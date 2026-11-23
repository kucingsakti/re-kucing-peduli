package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class MapUtils {
    public static void a(StringBuilder sb, HashMap map) {
        sb.append("{");
        boolean z6 = true;
        for (String str : map.keySet()) {
            if (!z6) {
                sb.append(",");
            }
            String str2 = (String) map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z6 = false;
        }
        sb.append("}");
    }
}
