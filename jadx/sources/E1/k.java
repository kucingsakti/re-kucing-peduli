package E1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0186h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map f1316c;

    public k(Map map) {
        this.f1315b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f1315b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = ((j) list.get(i10)).a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i10 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final Map b() {
        if (this.f1316c == null) {
            synchronized (this) {
                try {
                    if (this.f1316c == null) {
                        this.f1316c = Collections.unmodifiableMap(a());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1316c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f1315b.equals(((k) obj).f1315b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1315b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f1315b + '}';
    }
}
