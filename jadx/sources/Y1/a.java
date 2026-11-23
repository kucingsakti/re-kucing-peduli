package Y1;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5666d;

    public a(String str, String str2, String str3, String str4) {
        i.f(str, "deviceId");
        i.f(str3, "androidId");
        this.a = str;
        this.f5664b = str2;
        this.f5665c = str3;
        this.f5666d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.f5664b, aVar.f5664b) && i.a(this.f5665c, aVar.f5665c) && i.a(this.f5666d, aVar.f5666d);
    }

    public final int hashCode() {
        return this.f5666d.hashCode() + p231y.a.a(p231y.a.a(this.a.hashCode() * 31, this.f5664b, 31), this.f5665c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceIdResult(deviceId=");
        sb.append(this.a);
        sb.append(", gsfId=");
        sb.append(this.f5664b);
        sb.append(", androidId=");
        sb.append(this.f5665c);
        sb.append(", mediaDrmId=");
        return AbstractC0487g.j(sb, this.f5666d, ')');
    }
}
