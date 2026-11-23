package c2;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7448b;

    public h(String str, String str2) {
        p210v8.i.f(str2, "vendor");
        this.a = str;
        this.f7448b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p210v8.i.a(this.a, hVar.a) && p210v8.i.a(this.f7448b, hVar.f7448b);
    }

    public final int hashCode() {
        return this.f7448b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputDeviceData(name=");
        sb.append(this.a);
        sb.append(", vendor=");
        return AbstractC0487g.j(sb, this.f7448b, ')');
    }
}
