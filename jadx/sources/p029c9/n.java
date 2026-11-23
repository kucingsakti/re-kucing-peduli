package p029c9;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final String a;

    public n(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && i.a(this.a, ((n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
