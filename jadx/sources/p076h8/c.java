package p076h8;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f11781w = new c(9, 22);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11782s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11783t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11784u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11785v;

    public c(int i10, int i11) {
        this.f11783t = i10;
        this.f11784u = i11;
        if (new B8.c(0, 255, 1).f(1) && new B8.c(0, 255, 1).f(i10) && new B8.c(0, 255, 1).f(i11)) {
            this.f11785v = 65536 + (i10 << 8) + i11;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: 1." + i10 + '.' + i11).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        i.f(cVar, "other");
        return this.f11785v - cVar.f11785v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && this.f11785v == cVar.f11785v;
    }

    public final int hashCode() {
        return this.f11785v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11782s);
        sb.append('.');
        sb.append(this.f11783t);
        sb.append('.');
        sb.append(this.f11784u);
        return sb.toString();
    }
}
