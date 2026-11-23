package p104k9;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: k9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0674c extends OutputStream {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f12789x = new byte[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12792u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12794w;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12790s = 128;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f12791t = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f12793v = new byte[128];

    public final void a(int i10) {
        this.f12791t.add(new s(this.f12793v));
        int length = this.f12792u + this.f12793v.length;
        this.f12792u = length;
        this.f12793v = new byte[Math.max(this.f12790s, Math.max(i10, length >>> 1))];
        this.f12794w = 0;
    }

    public final void b() {
        int i10 = this.f12794w;
        byte[] bArr = this.f12793v;
        int length = bArr.length;
        ArrayList arrayList = this.f12791t;
        if (i10 >= length) {
            arrayList.add(new s(this.f12793v));
            this.f12793v = f12789x;
        } else if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            arrayList.add(new s(bArr2));
        }
        this.f12792u += this.f12794w;
        this.f12794w = 0;
    }

    public final synchronized AbstractC0675d c() {
        ArrayList arrayList;
        b();
        arrayList = this.f12791t;
        if (!(arrayList instanceof Collection)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC0675d) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC0675d.f12795s : AbstractC0675d.d(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i10;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i10 = this.f12792u + this.f12794w;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i10));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.f12794w == this.f12793v.length) {
                a(1);
            }
            byte[] bArr = this.f12793v;
            int i11 = this.f12794w;
            this.f12794w = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        try {
            byte[] bArr2 = this.f12793v;
            int length = bArr2.length;
            int i12 = this.f12794w;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f12794w += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                a(i13);
                System.arraycopy(bArr, i10 + length2, this.f12793v, 0, i13);
                this.f12794w = i13;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
