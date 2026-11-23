package p095j8;

import B8.b;
import B8.c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o1.f;
import p210v8.i;
import p219w8.d;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Map, Serializable, d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final e f12521F;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12522A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f f12523B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public g f12524C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public f f12525D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f12526E;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f12527s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f12528t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f12529u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int[] f12530v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12533y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12534z;

    static {
        e eVar = new e(0);
        eVar.f12526E = true;
        f12521F = eVar;
    }

    public e() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i10 = this.f12531w * 2;
            int length = this.f12530v.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f12530v;
                int i12 = iArr[iJ];
                if (i12 <= 0) {
                    int i13 = this.f12532x;
                    Object[] objArr = this.f12527s;
                    if (i13 >= objArr.length) {
                        g(1);
                        break;
                    }
                    int i14 = i13 + 1;
                    this.f12532x = i14;
                    objArr[i13] = obj;
                    this.f12529u[i13] = iJ;
                    iArr[iJ] = i14;
                    this.f12522A++;
                    this.f12534z++;
                    if (i11 > this.f12531w) {
                        this.f12531w = i11;
                    }
                    return i13;
                }
                if (i.a(this.f12527s[i12 - 1], obj)) {
                    return -i12;
                }
                i11++;
                if (i11 > i10) {
                    k(this.f12530v.length * 2);
                    break;
                }
                iJ = iJ == 0 ? this.f12530v.length - 1 : iJ - 1;
            }
        }
    }

    public final e b() {
        c();
        this.f12526E = true;
        if (this.f12522A > 0) {
            return this;
        }
        e eVar = f12521F;
        i.d(eVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar;
    }

    public final void c() {
        if (this.f12526E) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        b it = new c(0, this.f12532x - 1, 1).iterator();
        while (it.f774u) {
            int iA = it.a();
            int[] iArr = this.f12529u;
            int i10 = iArr[iA];
            if (i10 >= 0) {
                this.f12530v[i10] = 0;
                iArr[iA] = -1;
            }
        }
        f.n(0, this.f12532x, this.f12527s);
        Object[] objArr = this.f12528t;
        if (objArr != null) {
            f.n(0, this.f12532x, objArr);
        }
        this.f12522A = 0;
        this.f12532x = 0;
        this.f12534z++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final boolean e(Collection collection) {
        i.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.f12525D;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.f12525D = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f12522A == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        i.f(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f12528t;
        i.c(objArr);
        return i.a(objArr[iH], entry.getValue());
    }

    public final void g(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f12527s;
        int length = objArr.length;
        int i11 = this.f12532x;
        int i12 = length - i11;
        int i13 = i11 - this.f12522A;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            k(this.f12530v.length);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            int length2 = objArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            i.e(objArrCopyOf2, "copyOf(...)");
            this.f12527s = objArrCopyOf2;
            Object[] objArr2 = this.f12528t;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i15);
                i.e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f12528t = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f12529u, i15);
            i.e(iArrCopyOf, "copyOf(...)");
            this.f12529u = iArrCopyOf;
            if (i15 < 1) {
                i15 = 1;
            }
            int iHighestOneBit = Integer.highestOneBit(i15 * 3);
            if (iHighestOneBit > this.f12530v.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f12528t;
        i.c(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i10 = this.f12531w;
        while (true) {
            int i11 = this.f12530v[iJ];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (i.a(this.f12527s[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f12530v.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i10 = 0;
        while (cVar.hasNext()) {
            int i11 = cVar.f4775s;
            e eVar = (e) cVar.f4778v;
            if (i11 >= eVar.f12532x) {
                throw new NoSuchElementException();
            }
            cVar.f4775s = i11 + 1;
            cVar.f4776t = i11;
            Object obj = eVar.f12527s[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.f12528t;
            i.c(objArr);
            Object obj2 = objArr[cVar.f4776t];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.f();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    public final int i(Object obj) {
        int i10 = this.f12532x;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f12529u[i10] >= 0) {
                Object[] objArr = this.f12528t;
                i.c(objArr);
                if (i.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12522A == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f12533y;
    }

    public final void k(int i10) {
        int[] iArr;
        int i11;
        this.f12534z++;
        int i12 = 0;
        if (this.f12532x > this.f12522A) {
            Object[] objArr = this.f12528t;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i11 = this.f12532x;
                if (i13 >= i11) {
                    break;
                }
                if (this.f12529u[i13] >= 0) {
                    Object[] objArr2 = this.f12527s;
                    objArr2[i14] = objArr2[i13];
                    if (objArr != null) {
                        objArr[i14] = objArr[i13];
                    }
                    i14++;
                }
                i13++;
            }
            f.n(i14, i11, this.f12527s);
            if (objArr != null) {
                f.n(i14, this.f12532x, objArr);
            }
            this.f12532x = i14;
        }
        int[] iArr2 = this.f12530v;
        if (i10 != iArr2.length) {
            this.f12530v = new int[i10];
            this.f12533y = Integer.numberOfLeadingZeros(i10) + 1;
        } else {
            Arrays.fill(iArr2, 0, iArr2.length, 0);
        }
        while (i12 < this.f12532x) {
            int i15 = i12 + 1;
            int iJ = j(this.f12527s[i12]);
            int i16 = this.f12531w;
            while (true) {
                iArr = this.f12530v;
                if (iArr[iJ] == 0) {
                    break;
                }
                i16--;
                if (i16 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iJ = iJ == 0 ? iArr.length - 1 : iJ - 1;
            }
            iArr[iJ] = i15;
            this.f12529u[i12] = iJ;
            i12 = i15;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.f12523B;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.f12523B = fVar2;
        return fVar2;
    }

    public final void l(int i10) {
        Object[] objArr = this.f12527s;
        i.f(objArr, "<this>");
        objArr[i10] = null;
        int length = this.f12529u[i10];
        int i11 = this.f12531w * 2;
        int length2 = this.f12530v.length / 2;
        if (i11 > length2) {
            i11 = length2;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = length;
        do {
            length = length == 0 ? this.f12530v.length - 1 : length - 1;
            i13++;
            if (i13 > this.f12531w) {
                this.f12530v[i14] = 0;
            } else {
                int[] iArr = this.f12530v;
                int i15 = iArr[length];
                if (i15 == 0) {
                    iArr[i14] = 0;
                } else {
                    if (i15 < 0) {
                        iArr[i14] = -1;
                    } else {
                        int i16 = i15 - 1;
                        int iJ = j(this.f12527s[i16]) - length;
                        int[] iArr2 = this.f12530v;
                        if ((iJ & (iArr2.length - 1)) >= i13) {
                            iArr2[i14] = i15;
                            this.f12529u[i16] = i14;
                        }
                        i12--;
                    }
                    i14 = length;
                    i13 = 0;
                    i12--;
                }
            }
            this.f12529u[i10] = -1;
            this.f12522A--;
            this.f12534z++;
        } while (i12 >= 0);
        this.f12530v[i14] = -1;
        this.f12529u[i10] = -1;
        this.f12522A--;
        this.f12534z++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f12528t;
        if (objArr == null) {
            int length = this.f12527s.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f12528t = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i10 = (-iA) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        i.f(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f12528t;
            if (objArr == null) {
                int length = this.f12527s.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f12528t = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i10 = (-iA) - 1;
                if (!i.a(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            iH = -1;
        } else {
            l(iH);
        }
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f12528t;
        i.c(objArr);
        Object obj2 = objArr[iH];
        objArr[iH] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12522A;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f12522A * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i10 = 0;
        while (cVar.hasNext()) {
            if (i10 > 0) {
                sb.append(", ");
            }
            int i11 = cVar.f4775s;
            e eVar = (e) cVar.f4778v;
            if (i11 >= eVar.f12532x) {
                throw new NoSuchElementException();
            }
            cVar.f4775s = i11 + 1;
            cVar.f4776t = i11;
            Object obj = eVar.f12527s[i11];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.f12528t;
            i.c(objArr);
            Object obj2 = objArr[cVar.f4776t];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.f();
            i10++;
        }
        sb.append("}");
        String string = sb.toString();
        i.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        g gVar = this.f12524C;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f12524C = gVar2;
        return gVar2;
    }

    public e(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f12527s = objArr;
        this.f12528t = null;
        this.f12529u = iArr;
        this.f12530v = new int[iHighestOneBit];
        this.f12531w = 2;
        this.f12532x = 0;
        this.f12533y = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
