package c2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7449b;

    public i(String str, List list) {
        this.a = str;
        this.f7449b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p210v8.i.a(this.a, iVar.a) && p210v8.i.a(this.f7449b, iVar.f7449b);
    }

    public final int hashCode() {
        return this.f7449b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaCodecInfo(name=" + this.a + ", capabilities=" + this.f7449b + ')';
    }
}
