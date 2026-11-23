package p182s4;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p210v8.i;

/* JADX INFO: renamed from: s4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0777n {
    public final String a;

    public C0777n(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0777n) && i.a(this.a, ((C0777n) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("FirebaseSessionsData(sessionId="), this.a, ')');
    }
}
