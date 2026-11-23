package p191t4;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final String a;

    public e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && i.a(this.a, ((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("SessionDetails(sessionId="), this.a, ')');
    }
}
