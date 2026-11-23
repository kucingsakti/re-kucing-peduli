package p163q7;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14431b;

    public h(int i10, long j) {
        this.a = i10;
        this.f14431b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.f14431b == hVar.f14431b;
    }

    public final int hashCode() {
        int i10 = this.a * 31;
        long j = this.f14431b;
        return i10 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FileSliceInfo(slicingCount=" + this.a + ", bytesPerFileSlice=" + this.f14431b + ")";
    }
}
