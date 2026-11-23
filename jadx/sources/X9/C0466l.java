package X9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0466l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0466l f5598c = new C0466l(p086i8.k.w0(new ArrayList()), null);
    public final Set a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3.b f5599b;

    public C0466l(Set set, C3.b bVar) {
        this.a = set;
        this.f5599b = bVar;
    }

    public final void a(String str, p200u8.a aVar) {
        p210v8.i.f(str, "hostname");
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw E0.a.e(it);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0466l)) {
            return false;
        }
        C0466l c0466l = (C0466l) obj;
        return p210v8.i.a(c0466l.a, this.a) && p210v8.i.a(c0466l.f5599b, this.f5599b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        C3.b bVar = this.f5599b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
