package O3;

import java.io.File;

/* JADX INFO: renamed from: O3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0344b {
    public final Q3.B a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f3518c;

    public C0344b(Q3.B b3, String str, File file) {
        this.a = b3;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f3517b = str;
        this.f3518c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0344b)) {
            return false;
        }
        C0344b c0344b = (C0344b) obj;
        return this.a.equals(c0344b.a) && this.f3517b.equals(c0344b.f3517b) && this.f3518c.equals(c0344b.f3518c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f3517b.hashCode()) * 1000003) ^ this.f3518c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.f3517b + ", reportFile=" + this.f3518c + "}";
    }
}
