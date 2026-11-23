package A1;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class y implements p232y1.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p232y1.e f210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final U1.c f211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p232y1.h f212i;
    public int j;

    public y(Object obj, p232y1.e eVar, int i10, int i11, U1.c cVar, Class cls, Class cls2, p232y1.h hVar) {
        U1.f.c(obj, "Argument must not be null");
        this.f205b = obj;
        this.f210g = eVar;
        this.f206c = i10;
        this.f207d = i11;
        U1.f.c(cVar, "Argument must not be null");
        this.f211h = cVar;
        U1.f.c(cls, "Resource class must not be null");
        this.f208e = cls;
        U1.f.c(cls2, "Transcode class must not be null");
        this.f209f = cls2;
        U1.f.c(hVar, "Argument must not be null");
        this.f212i = hVar;
    }

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f205b.equals(yVar.f205b) && this.f210g.equals(yVar.f210g) && this.f207d == yVar.f207d && this.f206c == yVar.f206c && this.f211h.equals(yVar.f211h) && this.f208e.equals(yVar.f208e) && this.f209f.equals(yVar.f209f) && this.f212i.equals(yVar.f212i);
    }

    @Override // p232y1.e
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.f205b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.f210g.hashCode() + (iHashCode * 31)) * 31) + this.f206c) * 31) + this.f207d;
            this.j = iHashCode2;
            int iHashCode3 = this.f211h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.f208e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f209f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.f212i.f16018b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f205b + ", width=" + this.f206c + ", height=" + this.f207d + ", resourceClass=" + this.f208e + ", transcodeClass=" + this.f209f + ", signature=" + this.f210g + ", hashCode=" + this.j + ", transformations=" + this.f211h + ", options=" + this.f212i + '}';
    }
}
