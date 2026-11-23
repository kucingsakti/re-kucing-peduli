package B4;

import java.io.IOException;
import java.io.OutputStream;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0675d;

/* JADX INFO: renamed from: B4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0154b {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cloneable f661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f662d;

    public static int a(int i10, int i11) {
        return c(i11) + h(i10);
    }

    public static int b(int i10, int i11) {
        return c(i11) + h(i10);
    }

    public static int c(int i10) {
        if (i10 >= 0) {
            return f(i10);
        }
        return 10;
    }

    public static int d(int i10, AbstractC0672a abstractC0672a) {
        return e(abstractC0672a) + h(i10);
    }

    public static int e(AbstractC0672a abstractC0672a) {
        int iB = abstractC0672a.b();
        return f(iB) + iB;
    }

    public static int f(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int h(int i10) {
        return f(i10 << 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.lang.Cloneable] */
    public static C0154b j(OutputStream outputStream, int i10) {
        ?? r10 = new byte[i10];
        C0154b c0154b = new C0154b();
        c0154b.f662d = outputStream;
        c0154b.f661c = r10;
        c0154b.f660b = 0;
        c0154b.a = r10.length;
        return c0154b;
    }

    public void i() throws IOException {
        if (((OutputStream) this.f662d) != null) {
            k();
        }
    }

    public void k() throws IOException {
        OutputStream outputStream = (OutputStream) this.f662d;
        if (outputStream == null) {
            throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            };
        }
        outputStream.write((byte[]) this.f661c, 0, this.f660b);
        this.f660b = 0;
    }

    public void l(int i10, int i11) throws IOException {
        x(i10, 0);
        n(i11);
    }

    public void m(int i10, int i11) throws IOException {
        x(i10, 0);
        n(i11);
    }

    public void n(int i10) throws IOException {
        if (i10 >= 0) {
            v(i10);
        } else {
            w(i10);
        }
    }

    public void o(int i10, AbstractC0672a abstractC0672a) throws IOException {
        x(i10, 2);
        p(abstractC0672a);
    }

    public void p(AbstractC0672a abstractC0672a) throws IOException {
        v(abstractC0672a.b());
        abstractC0672a.e(this);
    }

    public void q(int i10) throws IOException {
        byte b3 = (byte) i10;
        if (this.f660b == this.a) {
            k();
        }
        int i11 = this.f660b;
        this.f660b = i11 + 1;
        ((byte[]) this.f661c)[i11] = b3;
    }

    public void r(AbstractC0675d abstractC0675d) throws IOException {
        int size = abstractC0675d.size();
        int i10 = this.f660b;
        int i11 = this.a;
        int i12 = i11 - i10;
        byte[] bArr = (byte[]) this.f661c;
        if (i12 >= size) {
            abstractC0675d.f(0, i10, size, bArr);
            this.f660b += size;
            return;
        }
        abstractC0675d.f(0, i10, i12, bArr);
        int i13 = size - i12;
        this.f660b = i11;
        k();
        if (i13 <= i11) {
            abstractC0675d.f(i12, 0, i13, bArr);
            this.f660b = i13;
            return;
        }
        if (i12 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i12);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i13 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i13);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i14 = i12 + i13;
        if (i14 <= abstractC0675d.size()) {
            if (i13 > 0) {
                abstractC0675d.w((OutputStream) this.f662d, i12, i13);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i14);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public void s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i10 = this.f660b;
        int i11 = this.a;
        int i12 = i11 - i10;
        byte[] bArr2 = (byte[]) this.f661c;
        if (i12 >= length) {
            System.arraycopy(bArr, 0, bArr2, i10, length);
            this.f660b += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i10, i12);
        int i13 = length - i12;
        this.f660b = i11;
        k();
        if (i13 > i11) {
            ((OutputStream) this.f662d).write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f660b = i13;
        }
    }

    public void t(int i10) throws IOException {
        q(i10 & 255);
        q((i10 >> 8) & 255);
        q((i10 >> 16) & 255);
        q((i10 >> 24) & 255);
    }

    public void u(long j) throws IOException {
        q(((int) j) & 255);
        q(((int) (j >> 8)) & 255);
        q(((int) (j >> 16)) & 255);
        q(((int) (j >> 24)) & 255);
        q(((int) (j >> 32)) & 255);
        q(((int) (j >> 40)) & 255);
        q(((int) (j >> 48)) & 255);
        q(((int) (j >> 56)) & 255);
    }

    public void v(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            q((i10 & 127) | 128);
            i10 >>>= 7;
        }
        q(i10);
    }

    public void w(long j) throws IOException {
        while (((-128) & j) != 0) {
            q((((int) j) & 127) | 128);
            j >>>= 7;
        }
        q((int) j);
    }

    public void x(int i10, int i11) throws IOException {
        v((i10 << 3) | i11);
    }
}
