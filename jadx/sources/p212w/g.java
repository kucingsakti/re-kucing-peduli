package p212w;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Arrays;
import p210v8.i;
import p221x.a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Cloneable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ boolean f15499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ long[] f15500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object[] f15501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ int f15502v;

    public g() {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 80;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (80 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.f15500t = new long[i13];
        this.f15501u = new Object[i13];
    }

    public final void a(long j, Long l4) {
        int i10 = this.f15502v;
        if (i10 != 0 && j <= this.f15500t[i10 - 1]) {
            j(j, l4);
            return;
        }
        if (this.f15499s) {
            long[] jArr = this.f15500t;
            if (i10 >= jArr.length) {
                Object[] objArr = this.f15501u;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != h.a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f15499s = false;
                this.f15502v = i11;
            }
        }
        int i13 = this.f15502v;
        if (i13 >= this.f15500t.length) {
            int i14 = (i13 + 1) * 8;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f15500t, i17);
            i.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f15500t = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15501u, i17);
            i.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15501u = objArrCopyOf;
        }
        this.f15500t[i13] = j;
        this.f15501u[i13] = l4;
        this.f15502v = i13 + 1;
    }

    public final void c() {
        int i10 = this.f15502v;
        Object[] objArr = this.f15501u;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f15502v = 0;
        this.f15499s = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final g clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        i.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) objClone;
        gVar.f15500t = (long[]) this.f15500t.clone();
        gVar.f15501u = (Object[]) this.f15501u.clone();
        return gVar;
    }

    public final Object e(long j) {
        Object obj;
        int iB = a.b(this.f15500t, this.f15502v, j);
        if (iB < 0 || (obj = this.f15501u[iB]) == h.a) {
            return null;
        }
        return obj;
    }

    public final Object f(long j) {
        Object obj;
        int iB = a.b(this.f15500t, this.f15502v, j);
        if (iB < 0 || (obj = this.f15501u[iB]) == h.a) {
            return -1L;
        }
        return obj;
    }

    public final int h(long j) {
        if (this.f15499s) {
            int i10 = this.f15502v;
            long[] jArr = this.f15500t;
            Object[] objArr = this.f15501u;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f15499s = false;
            this.f15502v = i11;
        }
        return a.b(this.f15500t, this.f15502v, j);
    }

    public final long i(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f15502v)) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f15499s) {
            long[] jArr = this.f15500t;
            Object[] objArr = this.f15501u;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != h.a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f15499s = false;
            this.f15502v = i12;
        }
        return this.f15500t[i10];
    }

    public final void j(long j, Object obj) {
        int iB = a.b(this.f15500t, this.f15502v, j);
        if (iB >= 0) {
            this.f15501u[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f15502v;
        Object obj2 = h.a;
        if (i10 < i11) {
            Object[] objArr = this.f15501u;
            if (objArr[i10] == obj2) {
                this.f15500t[i10] = j;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f15499s) {
            long[] jArr = this.f15500t;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f15501u;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f15499s = false;
                this.f15502v = i12;
                i10 = ~a.b(this.f15500t, i12, j);
            }
        }
        int i14 = this.f15502v;
        if (i14 >= this.f15500t.length) {
            int i15 = (i14 + 1) * 8;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f15500t, i18);
            i.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f15500t = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15501u, i18);
            i.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15501u = objArrCopyOf;
        }
        int i19 = this.f15502v - i10;
        if (i19 != 0) {
            long[] jArr2 = this.f15500t;
            int i20 = i10 + 1;
            i.f(jArr2, "<this>");
            System.arraycopy(jArr2, i10, jArr2, i20, i19);
            Object[] objArr3 = this.f15501u;
            p086i8.i.q(objArr3, objArr3, i20, i10, this.f15502v);
        }
        this.f15500t[i10] = j;
        this.f15501u[i10] = obj;
        this.f15502v++;
    }

    public final void k(long j) {
        int iB = a.b(this.f15500t, this.f15502v, j);
        if (iB >= 0) {
            Object[] objArr = this.f15501u;
            Object obj = objArr[iB];
            Object obj2 = h.a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f15499s = true;
            }
        }
    }

    public final int l() {
        if (this.f15499s) {
            int i10 = this.f15502v;
            long[] jArr = this.f15500t;
            Object[] objArr = this.f15501u;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f15499s = false;
            this.f15502v = i11;
        }
        return this.f15502v;
    }

    public final Object m(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f15502v)) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f15499s) {
            long[] jArr = this.f15500t;
            Object[] objArr = this.f15501u;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != h.a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f15499s = false;
            this.f15502v = i12;
        }
        return this.f15501u[i10];
    }

    public final String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15502v * 28);
        sb.append('{');
        int i10 = this.f15502v;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(i(i11));
            sb.append('=');
            Object objM = m(i11);
            if (objM != sb) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        i.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
