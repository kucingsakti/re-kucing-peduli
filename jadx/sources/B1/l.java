package B1;

import U1.n;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class l implements j {
    public final f a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.Config f596c;

    public l(f fVar) {
        this.a = fVar;
    }

    @Override // B1.j
    public final void a() {
        this.a.R0(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f595b == lVar.f595b && n.b(this.f596c, lVar.f596c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f595b * 31;
        Bitmap.Config config = this.f596c;
        return i10 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return m.c(this.f595b, this.f596c);
    }
}
