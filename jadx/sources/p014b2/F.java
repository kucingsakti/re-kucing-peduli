package p014b2;

import java.util.Map;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0556u {
    public final Map a;

    public F(Map map) {
        i.f(map, "value");
        this.a = map;
    }

    @Override // p014b2.AbstractC0556u
    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.a.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        String string = sb.toString();
        i.e(string, "sb.toString()");
        return string;
    }
}
