package M0;

import java.util.List;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f2867e;

    public b(String str, String str2, String str3, List list, List list2) {
        i.f(list, "columnNames");
        i.f(list2, "referenceColumnNames");
        this.a = str;
        this.f2864b = str2;
        this.f2865c = str3;
        this.f2866d = list;
        this.f2867e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (i.a(this.a, bVar.a) && i.a(this.f2864b, bVar.f2864b) && i.a(this.f2865c, bVar.f2865c) && i.a(this.f2866d, bVar.f2866d)) {
            return i.a(this.f2867e, bVar.f2867e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2867e.hashCode() + ((this.f2866d.hashCode() + p231y.a.a(p231y.a.a(this.a.hashCode() * 31, this.f2864b, 31), this.f2865c, 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.f2864b + " +', onUpdate='" + this.f2865c + "', columnNames=" + this.f2866d + ", referenceColumnNames=" + this.f2867e + '}';
    }
}
