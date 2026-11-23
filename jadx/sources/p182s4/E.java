package p182s4;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import p210v8.i;
import p231y.a;

/* JADX INFO: loaded from: classes.dex */
public final class E {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14612d;

    public E(String str, String str2, int i10, long j) {
        i.f(str, JsonStorageKeyNames.SESSION_ID_KEY);
        i.f(str2, "firstSessionId");
        this.a = str;
        this.f14610b = str2;
        this.f14611c = i10;
        this.f14612d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return i.a(this.a, e10.a) && i.a(this.f14610b, e10.f14610b) && this.f14611c == e10.f14611c && this.f14612d == e10.f14612d;
    }

    public final int hashCode() {
        int iA = (a.a(this.a.hashCode() * 31, this.f14610b, 31) + this.f14611c) * 31;
        long j = this.f14612d;
        return iA + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.f14610b + ", sessionIndex=" + this.f14611c + ", sessionStartTimestampUs=" + this.f14612d + ')';
    }
}
