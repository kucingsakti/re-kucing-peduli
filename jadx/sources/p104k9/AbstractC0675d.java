package p104k9;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;
import p081i3.b;

/* JADX INFO: renamed from: k9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0675d implements Iterable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f12795s = new s(new byte[0]);

    public static AbstractC0675d d(Iterator it, int i10) {
        if (i10 == 1) {
            return (AbstractC0675d) it.next();
        }
        int i11 = i10 >>> 1;
        return d(it, i11).e(d(it, i10 - i11));
    }

    public static C0674c o() {
        return new C0674c();
    }

    public final AbstractC0675d e(AbstractC0675d abstractC0675d) {
        int size = size();
        int size2 = abstractC0675d.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = x.f12828z;
        x xVar = this instanceof x ? (x) this : null;
        if (abstractC0675d.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC0675d;
        }
        int size3 = abstractC0675d.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC0675d.size();
            byte[] bArr = new byte[size4 + size5];
            f(0, 0, size4, bArr);
            abstractC0675d.f(0, size4, size5, bArr);
            return new s(bArr);
        }
        if (xVar != null) {
            AbstractC0675d abstractC0675d2 = xVar.f12831v;
            if (abstractC0675d.size() + abstractC0675d2.size() < 128) {
                int size6 = abstractC0675d2.size();
                int size7 = abstractC0675d.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC0675d2.f(0, 0, size6, bArr2);
                abstractC0675d.f(0, size6, size7, bArr2);
                return new x(xVar.f12830u, new s(bArr2));
            }
        }
        if (xVar != null) {
            AbstractC0675d abstractC0675d3 = xVar.f12830u;
            int iK = abstractC0675d3.k();
            AbstractC0675d abstractC0675d4 = xVar.f12831v;
            if (iK > abstractC0675d4.k()) {
                if (xVar.f12833x > abstractC0675d.k()) {
                    return new x(abstractC0675d3, new x(abstractC0675d4, abstractC0675d));
                }
            }
        }
        if (size3 >= x.f12828z[Math.max(k(), abstractC0675d.k()) + 1]) {
            return new x(this, abstractC0675d);
        }
        b bVar = new b(4);
        bVar.w(this);
        bVar.w(abstractC0675d);
        Stack stack = (Stack) bVar.f12212t;
        AbstractC0675d xVar2 = (AbstractC0675d) stack.pop();
        while (!stack.isEmpty()) {
            xVar2 = new x((AbstractC0675d) stack.pop(), xVar2);
        }
        return xVar2;
    }

    public final void f(int i10, int i11, int i12, byte[] bArr) {
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                g(i10, i11, i12, bArr);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i14);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void g(int i10, int i11, int i12, byte[] bArr);

    public abstract int k();

    public abstract boolean m();

    public abstract boolean n();

    public abstract int q(int i10, int i11, int i12);

    public abstract int r(int i10, int i11, int i12);

    public abstract int s();

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String u();

    public final String v() {
        try {
            return u();
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public abstract void w(OutputStream outputStream, int i10, int i11);
}
