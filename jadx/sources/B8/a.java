package B8;

import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable, p219w8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f770t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f771u;

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f769s = i10;
        this.f770t = l.i(i10, i11, i12);
        this.f771u = i12;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final b iterator() {
        return new b(this.f769s, this.f770t, this.f771u);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f769s == aVar.f769s && this.f770t == aVar.f770t && this.f771u == aVar.f771u;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f769s * 31) + this.f770t) * 31) + this.f771u;
    }

    public boolean isEmpty() {
        int i10 = this.f771u;
        int i11 = this.f770t;
        int i12 = this.f769s;
        if (i10 > 0) {
            return i12 > i11;
        }
        return i12 < i11;
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f770t;
        int i11 = this.f769s;
        int i12 = this.f771u;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
