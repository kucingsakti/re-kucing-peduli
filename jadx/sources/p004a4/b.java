package p004a4;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f6005b;

    public b(String str, Map map) {
        this.a = str;
        this.f6005b = map;
    }

    public static b a(String str) {
        return new b(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.f6005b.equals(bVar.f6005b);
    }

    public final int hashCode() {
        return this.f6005b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.f6005b.values() + "}";
    }
}
