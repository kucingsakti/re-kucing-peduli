package p182s4;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import p210v8.i;
import p231y.a;

/* JADX INFO: loaded from: classes.dex */
public final class N {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0773j f14642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f14644g;

    public N(String str, String str2, int i10, long j, C0773j c0773j, String str3, String str4) {
        i.f(str, JsonStorageKeyNames.SESSION_ID_KEY);
        i.f(str2, "firstSessionId");
        i.f(str4, "firebaseAuthenticationToken");
        this.a = str;
        this.f14639b = str2;
        this.f14640c = i10;
        this.f14641d = j;
        this.f14642e = c0773j;
        this.f14643f = str3;
        this.f14644g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return i.a(this.a, n10.a) && i.a(this.f14639b, n10.f14639b) && this.f14640c == n10.f14640c && this.f14641d == n10.f14641d && i.a(this.f14642e, n10.f14642e) && i.a(this.f14643f, n10.f14643f) && i.a(this.f14644g, n10.f14644g);
    }

    public final int hashCode() {
        int iA = (a.a(this.a.hashCode() * 31, this.f14639b, 31) + this.f14640c) * 31;
        long j = this.f14641d;
        return this.f14644g.hashCode() + a.a((this.f14642e.hashCode() + ((iA + ((int) (j ^ (j >>> 32)))) * 31)) * 31, this.f14643f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.f14639b);
        sb.append(", sessionIndex=");
        sb.append(this.f14640c);
        sb.append(", eventTimestampUs=");
        sb.append(this.f14641d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f14642e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f14643f);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC0487g.j(sb, this.f14644g, ')');
    }
}
