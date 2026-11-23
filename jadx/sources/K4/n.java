package K4;

import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f2616b;

    public n(String str, Long l4) {
        p210v8.i.f(str, MediationMetaData.KEY_NAME);
        this.a = str;
        this.f2616b = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p210v8.i.a(this.a, nVar.a) && p210v8.i.a(this.f2616b, nVar.f2616b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l4 = this.f2616b;
        return iHashCode + (l4 == null ? 0 : l4.hashCode());
    }

    public final String toString() {
        return "FileInfo(name=" + this.a + ", size=" + this.f2616b + ')';
    }
}
