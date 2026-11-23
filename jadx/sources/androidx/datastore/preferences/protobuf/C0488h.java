package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0488h implements Iterable, Serializable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0488h f6466u = new C0488h(AbstractC0505z.f6524b);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0486f f6467v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6468s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f6469t;

    static {
        f6467v = AbstractC0482c.a() ? new C0486f(1) : new C0486f(0);
    }

    public C0488h(byte[] bArr) {
        bArr.getClass();
        this.f6469t = bArr;
    }

    public static C0488h d(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        int i12 = i10 + i11;
        int length = bArr.length;
        if (((i12 - i10) | i10 | i12 | (length - i12)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException(E0.a.g("Beginning index: ", i10, " < 0"));
            }
            if (i12 < i10) {
                throw new IndexOutOfBoundsException(AbstractC0487g.h("Beginning index larger than ending index: ", i10, ", ", i12));
            }
            throw new IndexOutOfBoundsException(AbstractC0487g.h("End index: ", i12, " >= ", length));
        }
        switch (f6467v.a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new C0488h(bArrCopyOfRange);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0488h) || size() != ((C0488h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0488h)) {
            return obj.equals(this);
        }
        C0488h c0488h = (C0488h) obj;
        int i10 = this.f6468s;
        int i11 = c0488h.f6468s;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > c0488h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0488h.size()) {
            StringBuilder sbL = AbstractC0487g.l("Ran off end of other: 0, ", size, ", ");
            sbL.append(c0488h.size());
            throw new IllegalArgumentException(sbL.toString());
        }
        int iE = e() + size;
        int iE2 = e();
        int iE3 = c0488h.e();
        while (iE2 < iE) {
            if (this.f6469t[iE2] != c0488h.f6469t[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f6468s;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int iE = e();
        int i11 = size;
        for (int i12 = iE; i12 < iE + size; i12++) {
            i11 = (i11 * 31) + this.f6469t[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f6468s = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0485e(this);
    }

    public int size() {
        return this.f6469t.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
