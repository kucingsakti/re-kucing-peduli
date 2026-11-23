package p104k9;

import E0.a;
import androidx.datastore.preferences.protobuf.C0485e;
import com.rollbar.notifier.sender.SyncSender;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class s extends AbstractC0675d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f12821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12822u = 0;

    public s(byte[] bArr) {
        this.f12821t = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0675d) || size() != ((AbstractC0675d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof s) {
            return x((s) obj, 0, size());
        }
        if (obj instanceof x) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(a.l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    @Override // p104k9.AbstractC0675d
    public void g(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f12821t, i10, bArr, i11, i12);
    }

    public final int hashCode() {
        int iQ = this.f12822u;
        if (iQ == 0) {
            int size = size();
            iQ = q(size, 0, size);
            if (iQ == 0) {
                iQ = 1;
            }
            this.f12822u = iQ;
        }
        return iQ;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0485e(this);
    }

    @Override // p104k9.AbstractC0675d
    public final int k() {
        return 0;
    }

    @Override // p104k9.AbstractC0675d
    public final boolean m() {
        return true;
    }

    @Override // p104k9.AbstractC0675d
    public final boolean n() {
        byte[] bArr = this.f12821t;
        return B.c(bArr, 0, bArr.length) == 0;
    }

    @Override // p104k9.AbstractC0675d
    public final int q(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f12821t[i13];
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // p104k9.AbstractC0675d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f12821t
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -1
            r3 = -65
            r4 = -32
            if (r1 >= r4) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r3) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = p104k9.B.a(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r3) goto L94
            r5 = -96
            if (r1 != r4) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r4 = -19
            if (r1 != r4) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r3) goto L1c
            goto L94
        L4c:
            int r4 = r8 >> 8
            int r4 = ~r4
            byte r4 = (byte) r4
            if (r4 != 0) goto L5f
            int r8 = r9 + 1
            r4 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = p104k9.B.a(r1, r4)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r4 > r3) goto L7d
            if (r8 <= r3) goto L76
            goto L7d
        L76:
            int r9 = r4 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r2
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r4 > r3) goto L94
            int r1 = r1 << 28
            int r4 = r4 + 112
            int r4 = r4 + r1
            int r1 = r4 >> 30
            if (r1 != 0) goto L94
            if (r9 > r3) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r3) goto L95
        L94:
            return r2
        L95:
            int r8 = p104k9.B.c(r0, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p104k9.s.r(int, int, int):int");
    }

    @Override // p104k9.AbstractC0675d
    public final int s() {
        return this.f12822u;
    }

    @Override // p104k9.AbstractC0675d
    public int size() {
        return this.f12821t.length;
    }

    @Override // p104k9.AbstractC0675d
    public final String u() {
        byte[] bArr = this.f12821t;
        return new String(bArr, 0, bArr.length, SyncSender.UTF_8);
    }

    @Override // p104k9.AbstractC0675d
    public final void w(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f12821t, i10, i11);
    }

    public final boolean x(s sVar, int i10, int i11) {
        byte[] bArr = sVar.f12821t;
        int length = bArr.length;
        byte[] bArr2 = this.f12821t;
        if (i11 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i11);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i12 = i10 + i11;
        int length3 = bArr.length;
        byte[] bArr3 = sVar.f12821t;
        if (i12 <= length3) {
            int i13 = 0;
            while (i13 < i11) {
                if (bArr2[i13] != bArr3[i10]) {
                    return false;
                }
                i13++;
                i10++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(length4);
        throw new IllegalArgumentException(sb2.toString());
    }
}
