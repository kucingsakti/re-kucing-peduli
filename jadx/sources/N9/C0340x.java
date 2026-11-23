package N9;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: renamed from: N9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0340x extends p123m8.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b0 f3492t = new b0();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f3493s;

    public C0340x() {
        super(f3492t);
        this.f3493s = "LaunchLoadWeb";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0340x) && p210v8.i.a(this.f3493s, ((C0340x) obj).f3493s);
    }

    public final int hashCode() {
        return this.f3493s.hashCode();
    }

    public final String toString() {
        return AbstractC0487g.j(new StringBuilder("CoroutineName("), this.f3493s, ')');
    }
}
