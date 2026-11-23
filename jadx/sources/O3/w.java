package O3;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3588b;

    public w(String str, String str2) {
        this.a = str;
        this.f3588b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p210v8.i.a(this.a, wVar.a) && p210v8.i.a(this.f3588b, wVar.f3588b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3588b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.a);
        sb.append(", authToken=");
        return AbstractC0487g.j(sb, this.f3588b, ')');
    }
}
