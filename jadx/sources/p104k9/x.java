package p104k9;

import com.rollbar.notifier.sender.SyncSender;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC0675d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f12828z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC0675d f12830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AbstractC0675d f12831v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12834y = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f12828z = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f12828z;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    public x(AbstractC0675d abstractC0675d, AbstractC0675d abstractC0675d2) {
        this.f12830u = abstractC0675d;
        this.f12831v = abstractC0675d2;
        int size = abstractC0675d.size();
        this.f12832w = size;
        this.f12829t = abstractC0675d2.size() + size;
        this.f12833x = Math.max(abstractC0675d.k(), abstractC0675d2.k()) + 1;
    }

    public final boolean equals(Object obj) {
        int iS;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0675d) {
            AbstractC0675d abstractC0675d = (AbstractC0675d) obj;
            int size = abstractC0675d.size();
            int i10 = this.f12829t;
            if (i10 == size) {
                if (i10 == 0) {
                    return true;
                }
                if (this.f12834y == 0 || (iS = abstractC0675d.s()) == 0 || this.f12834y == iS) {
                    v vVar = new v(this);
                    s sVarA = vVar.next();
                    v vVar2 = new v(abstractC0675d);
                    s sVarA2 = vVar2.next();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int length = sVarA.f12821t.length - i11;
                        int length2 = sVarA2.f12821t.length - i12;
                        int iMin = Math.min(length, length2);
                        if (!(i11 == 0 ? sVarA.x(sVarA2, i12, iMin) : sVarA2.x(sVarA, i11, iMin))) {
                            break;
                        }
                        i13 += iMin;
                        if (i13 >= i10) {
                            if (i13 == i10) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            sVarA = vVar.next();
                            i11 = 0;
                        } else {
                            i11 += iMin;
                        }
                        if (iMin == length2) {
                            sVarA2 = vVar2.next();
                            i12 = 0;
                        } else {
                            i12 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p104k9.AbstractC0675d
    public final void g(int i10, int i11, int i12, byte[] bArr) {
        int i13 = i10 + i12;
        AbstractC0675d abstractC0675d = this.f12830u;
        int i14 = this.f12832w;
        if (i13 <= i14) {
            abstractC0675d.g(i10, i11, i12, bArr);
            return;
        }
        AbstractC0675d abstractC0675d2 = this.f12831v;
        if (i10 >= i14) {
            abstractC0675d2.g(i10 - i14, i11, i12, bArr);
            return;
        }
        int i15 = i14 - i10;
        abstractC0675d.g(i10, i11, i15, bArr);
        abstractC0675d2.g(0, i11 + i15, i12 - i15, bArr);
    }

    public final int hashCode() {
        int iQ = this.f12834y;
        if (iQ == 0) {
            int i10 = this.f12829t;
            iQ = q(i10, 0, i10);
            if (iQ == 0) {
                iQ = 1;
            }
            this.f12834y = iQ;
        }
        return iQ;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w(this);
    }

    @Override // p104k9.AbstractC0675d
    public final int k() {
        return this.f12833x;
    }

    @Override // p104k9.AbstractC0675d
    public final boolean m() {
        return this.f12829t >= f12828z[this.f12833x];
    }

    @Override // p104k9.AbstractC0675d
    public final boolean n() {
        int iR = this.f12830u.r(0, 0, this.f12832w);
        AbstractC0675d abstractC0675d = this.f12831v;
        return abstractC0675d.r(iR, 0, abstractC0675d.size()) == 0;
    }

    @Override // p104k9.AbstractC0675d
    public final int q(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        AbstractC0675d abstractC0675d = this.f12830u;
        int i14 = this.f12832w;
        if (i13 <= i14) {
            return abstractC0675d.q(i10, i11, i12);
        }
        AbstractC0675d abstractC0675d2 = this.f12831v;
        if (i11 >= i14) {
            return abstractC0675d2.q(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return abstractC0675d2.q(abstractC0675d.q(i10, i11, i15), 0, i12 - i15);
    }

    @Override // p104k9.AbstractC0675d
    public final int r(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        AbstractC0675d abstractC0675d = this.f12830u;
        int i14 = this.f12832w;
        if (i13 <= i14) {
            return abstractC0675d.r(i10, i11, i12);
        }
        AbstractC0675d abstractC0675d2 = this.f12831v;
        if (i11 >= i14) {
            return abstractC0675d2.r(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return abstractC0675d2.r(abstractC0675d.r(i10, i11, i15), 0, i12 - i15);
    }

    @Override // p104k9.AbstractC0675d
    public final int s() {
        return this.f12834y;
    }

    @Override // p104k9.AbstractC0675d
    public final int size() {
        return this.f12829t;
    }

    @Override // p104k9.AbstractC0675d
    public final String u() {
        byte[] bArr;
        int i10 = this.f12829t;
        if (i10 == 0) {
            bArr = p.a;
        } else {
            byte[] bArr2 = new byte[i10];
            g(0, 0, i10, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, SyncSender.UTF_8);
    }

    @Override // p104k9.AbstractC0675d
    public final void w(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        AbstractC0675d abstractC0675d = this.f12830u;
        int i13 = this.f12832w;
        if (i12 <= i13) {
            abstractC0675d.w(outputStream, i10, i11);
            return;
        }
        AbstractC0675d abstractC0675d2 = this.f12831v;
        if (i10 >= i13) {
            abstractC0675d2.w(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        abstractC0675d.w(outputStream, i10, i14);
        abstractC0675d2.w(outputStream, 0, i11 - i14);
    }
}
