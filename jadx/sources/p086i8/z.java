package p086i8;

import com.bumptech.glide.e;
import java.util.Collections;
import java.util.Map;
import p076h8.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends e {
    public static int s(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map t(f fVar) {
        i.f(fVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(fVar.f11789s, fVar.f11790t);
        i.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map u(Map map) {
        i.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        i.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
