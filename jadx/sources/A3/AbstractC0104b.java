package A3;

import java.util.Map;

/* JADX INFO: renamed from: A3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0104b implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C0114l c0114l = (C0114l) this;
            if (C3.b.n(c0114l.getKey(), entry.getKey()) && C3.b.n(c0114l.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C0114l c0114l = (C0114l) this;
        Object key = c0114l.getKey();
        Object value = c0114l.getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0114l c0114l = (C0114l) this;
        sb.append(c0114l.getKey());
        sb.append("=");
        sb.append(c0114l.getValue());
        return sb.toString();
    }
}
