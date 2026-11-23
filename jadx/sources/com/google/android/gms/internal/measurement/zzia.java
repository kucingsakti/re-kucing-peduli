package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzia implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0565d0 f8668t = new C0565d0(zzjm.f8682b);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0587o0 f8669u = new C0587o0(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8670s = 0;

    public static int e(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(E0.a.g("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(AbstractC0487g.h("Beginning index larger than ending index: ", i10, ", ", i11));
        }
        throw new IndexOutOfBoundsException(AbstractC0487g.h("End index: ", i11, " >= ", i12));
    }

    public static C0565d0 g(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        f8669u.getClass();
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C0565d0(bArr2);
    }

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public abstract C0565d0 f();

    public final int hashCode() {
        int iO = this.f8670s;
        if (iO == 0) {
            int iN = n();
            iO = o(iN, iN);
            if (iO == 0) {
                iO = 1;
            }
            this.f8670s = iO;
        }
        return iO;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new C0559a0(this);
    }

    public abstract void k(C0569f0 c0569f0);

    public abstract byte m(int i10);

    public abstract int n();

    public abstract int o(int i10, int i11);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iN = n();
        String strB = n() <= 50 ? E0.b(this) : p231y.a.c(E0.b(f()), "...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iN);
        sb.append(" contents=\"");
        return E0.a.l(sb, strB, "\">");
    }
}
