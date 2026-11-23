package p212w;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p221x.a;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f15504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f15505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15506u;

    public i(int i10) {
        this.f15504s = i10 == 0 ? a.a : new int[i10];
        this.f15505t = i10 == 0 ? a.f15702b : new Object[i10 << 1];
    }

    public final int a(Object obj) {
        int i10 = this.f15506u * 2;
        Object[] objArr = this.f15505t;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i10) {
        int i11 = this.f15506u;
        int[] iArr = this.f15504s;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            p210v8.i.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f15504s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15505t, i10 * 2);
            p210v8.i.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15505t = objArrCopyOf;
        }
        if (this.f15506u != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i10, Object obj) {
        int i11 = this.f15506u;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(i11, i10, this.f15504s);
        if (iA < 0 || p210v8.i.a(obj, this.f15505t[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f15504s[i12] == i10) {
            if (p210v8.i.a(obj, this.f15505t[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f15504s[i13] == i10; i13--) {
            if (p210v8.i.a(obj, this.f15505t[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public void clear() {
        if (this.f15506u > 0) {
            this.f15504s = a.a;
            this.f15505t = a.f15702b;
            this.f15506u = 0;
        }
        if (this.f15506u > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int e(Object obj) {
        return obj == null ? f() : c(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i) {
                int i10 = this.f15506u;
                if (i10 != ((i) obj).f15506u) {
                    return false;
                }
                i iVar = (i) obj;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objG = g(i11);
                    Object objK = k(i11);
                    Object obj2 = iVar.get(objG);
                    if (objK == null) {
                        if (obj2 != null || !iVar.containsKey(objG)) {
                            return false;
                        }
                    } else if (!objK.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f15506u != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f15506u;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objG2 = g(i13);
                Object objK2 = k(i13);
                Object obj3 = ((Map) obj).get(objG2);
                if (objK2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!objK2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i10 = this.f15506u;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(i10, 0, this.f15504s);
        if (iA < 0 || this.f15505t[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f15504s[i11] == 0) {
            if (this.f15505t[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f15504s[i12] == 0; i12--) {
            if (this.f15505t[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object g(int i10) {
        if (i10 < 0 || i10 >= this.f15506u) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f15505t[i10 << 1];
    }

    public Object get(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return this.f15505t[(iE << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f15505t[(iE << 1) + 1] : obj2;
    }

    public void h(e eVar) {
        int i10 = eVar.f15506u;
        b(this.f15506u + i10);
        if (this.f15506u != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(eVar.g(i11), eVar.k(i11));
            }
        } else if (i10 > 0) {
            p086i8.i.p(0, 0, i10, eVar.f15504s, this.f15504s);
            p086i8.i.q(eVar.f15505t, this.f15505t, 0, 0, i10 << 1);
            this.f15506u = i10;
        }
    }

    public int hashCode() {
        int[] iArr = this.f15504s;
        Object[] objArr = this.f15505t;
        int i10 = this.f15506u;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f15506u)) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f15505t;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f15504s;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                p086i8.i.p(i10, i14, i11, iArr, iArr);
                Object[] objArr2 = this.f15505t;
                p086i8.i.q(objArr2, objArr2, i12, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f15505t;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            p210v8.i.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f15504s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15505t, i16 << 1);
            p210v8.i.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15505t = objArrCopyOf;
            if (i11 != this.f15506u) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                p086i8.i.p(0, 0, i10, iArr, this.f15504s);
                p086i8.i.q(objArr, this.f15505t, 0, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                p086i8.i.p(i10, i17, i11, iArr, this.f15504s);
                p086i8.i.q(objArr, this.f15505t, i12, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f15506u) {
            throw new ConcurrentModificationException();
        }
        this.f15506u = i13;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f15506u <= 0;
    }

    public Object j(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f15506u) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f15505t;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final Object k(int i10) {
        if (i10 < 0 || i10 >= this.f15506u) {
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f15505t[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f15506u;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : f();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f15505t;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f15504s;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            p210v8.i.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f15504s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f15505t, i13 << 1);
            p210v8.i.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f15505t = objArrCopyOf;
            if (i10 != this.f15506u) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f15504s;
            int i14 = i12 + 1;
            p086i8.i.p(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f15505t;
            p086i8.i.q(objArr2, objArr2, i14 << 1, i12 << 1, this.f15506u << 1);
        }
        int i15 = this.f15506u;
        if (i10 == i15) {
            int[] iArr3 = this.f15504s;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f15505t;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f15506u = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE >= 0) {
            return j(iE, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f15506u;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15506u * 28);
        sb.append('{');
        int i10 = this.f15506u;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object objG = g(i11);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objK = k(i11);
            if (objK != sb) {
                sb.append(objK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0 || !p210v8.i.a(obj2, k(iE))) {
            return false;
        }
        i(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0 || !p210v8.i.a(obj2, k(iE))) {
            return false;
        }
        j(iE, obj3);
        return true;
    }
}
