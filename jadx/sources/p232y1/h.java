package p232y1;

import U1.c;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class h implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f16018b = new c(0);

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            c cVar = this.f16018b;
            if (i10 >= cVar.f15506u) {
                return;
            }
            g gVar = (g) cVar.g(i10);
            Object objK = this.f16018b.k(i10);
            f fVar = gVar.f16015b;
            if (gVar.f16017d == null) {
                gVar.f16017d = gVar.f16016c.getBytes(e.a);
            }
            fVar.g(gVar.f16017d, objK, messageDigest);
            i10++;
        }
    }

    public final Object c(g gVar) {
        c cVar = this.f16018b;
        return cVar.containsKey(gVar) ? cVar.get(gVar) : gVar.a;
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f16018b.equals(((h) obj).f16018b);
        }
        return false;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return this.f16018b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f16018b + '}';
    }
}
