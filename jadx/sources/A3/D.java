package A3;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class D extends E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f225f;

    public static int E(int i10) {
        int iNumberOfLeadingZeros;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i10 <= 0) {
            throw new IllegalArgumentException(E0.a.g("x (", i10, ") must be > 0"));
        }
        switch (B3.a.a[roundingMode.ordinal()]) {
            case 1:
                if (!((i10 > 0) & (((i10 + (-1)) & i10) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
            case 2:
            case 3:
                iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i10);
                return iNumberOfLeadingZeros * 13;
            case 4:
            case 5:
                iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i10 - 1);
                return iNumberOfLeadingZeros * 13;
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(i10);
                iNumberOfLeadingZeros = ((~(~(((-1257966797) >>> iNumberOfLeadingZeros2) - i10))) >>> 31) + (31 - iNumberOfLeadingZeros2);
                return iNumberOfLeadingZeros * 13;
            default:
                throw new AssertionError();
        }
    }

    public static Object[] F(int i10, int i11, Object[] objArr) {
        int i12;
        Object[] objArr2 = new Object[i10];
        int i13 = i10 - 1;
        for (int i14 = 0; i14 < i11; i14++) {
            Object obj = objArr[i14];
            Objects.requireNonNull(obj);
            int iF = C4.a.F(obj.hashCode());
            while (true) {
                i12 = iF & i13;
                if (objArr2[i12] == null) {
                    break;
                }
                iF++;
            }
            objArr2[i12] = obj;
        }
        return objArr2;
    }

    @Override // A3.E
    public final E A() {
        if (this.f222c != null) {
            int iO = F.o(this.a);
            if (iO * 2 < this.f222c.length) {
                this.f222c = F(iO, this.a, (Object[]) this.f226b);
                this.f223d = E(iO);
                this.f224e = (int) (((double) iO) * 0.7d);
            }
            Object[] objArr = this.f222c;
            int iE = E(objArr.length);
            int length = objArr.length - 1;
            int i10 = 0;
            int i11 = 0;
            while (i10 < objArr.length) {
                if (i10 != i11 || objArr[i10] != null) {
                    int i12 = i10 + iE;
                    for (int i13 = i12 - 1; i13 >= i11; i13--) {
                        if (objArr[i13 & length] == null) {
                            i11 = i12;
                            i10 = i13 + 1;
                        }
                    }
                    return new C(this);
                }
                i11 = i10 + iE;
                if (objArr[(i11 - 1) & length] != null) {
                    i11 = i10 + 1;
                }
                i10 = i11;
            }
        }
        return this;
    }

    public final void C(int i10) {
        int length;
        Object[] objArr = this.f222c;
        if (objArr == null) {
            length = F.o(i10);
            this.f222c = new Object[length];
        } else {
            if (i10 <= this.f224e || objArr.length >= 1073741824) {
                return;
            }
            length = objArr.length * 2;
            this.f222c = F(length, this.a, (Object[]) this.f226b);
        }
        this.f223d = E(length);
        this.f224e = (int) (((double) length) * 0.7d);
    }

    public final E D(Object obj) {
        Objects.requireNonNull(this.f222c);
        int iHashCode = obj.hashCode();
        int iF = C4.a.F(iHashCode);
        int length = this.f222c.length - 1;
        for (int i10 = iF; i10 - iF < this.f223d; i10++) {
            int i11 = i10 & length;
            Object obj2 = this.f222c[i11];
            if (obj2 == null) {
                b(obj);
                this.f222c[i11] = obj;
                this.f225f += iHashCode;
                C(this.a);
                return this;
            }
            if (obj2.equals(obj)) {
                return this;
            }
        }
        C c10 = new C(this);
        c10.a(obj);
        return c10;
    }

    @Override // A3.E
    public final E a(Object obj) {
        if (this.f222c != null) {
            return D(obj);
        }
        if (this.a == 0) {
            b(obj);
            return this;
        }
        C(((Object[]) this.f226b).length);
        Object obj2 = ((Object[]) this.f226b)[0];
        this.a--;
        return D(obj2).a(obj);
    }

    @Override // A3.E
    public final F c() {
        int i10 = this.a;
        if (i10 == 0) {
            return V.f246A;
        }
        if (i10 == 1) {
            Object obj = ((Object[]) this.f226b)[0];
            Objects.requireNonNull(obj);
            return new Y(obj);
        }
        Object[] objArrCopyOf = (Object[]) this.f226b;
        if (i10 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
        }
        int i11 = this.f225f;
        Object[] objArr = this.f222c;
        Objects.requireNonNull(objArr);
        return new V(objArrCopyOf, i11, objArr, this.f222c.length - 1);
    }
}
