package c2;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7435c;

    public b(String str, String str2, String str3) {
        p210v8.i.f(str, "cameraName");
        p210v8.i.f(str3, "cameraOrientation");
        this.a = str;
        this.f7434b = str2;
        this.f7435c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p210v8.i.a(this.a, bVar.a) && p210v8.i.a(this.f7434b, bVar.f7434b) && p210v8.i.a(this.f7435c, bVar.f7435c);
    }

    public final int hashCode() {
        return this.f7435c.hashCode() + p231y.a.a(this.a.hashCode() * 31, this.f7434b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInfo(cameraName=");
        sb.append(this.a);
        sb.append(", cameraType=");
        sb.append(this.f7434b);
        sb.append(", cameraOrientation=");
        return AbstractC0487g.j(sb, this.f7435c, ')');
    }
}
