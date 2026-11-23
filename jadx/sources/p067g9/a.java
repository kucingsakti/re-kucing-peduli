package p067g9;

import java.util.ArrayList;
import java.util.List;
import p086i8.C0664c;
import p086i8.j;
import p086i8.k;
import p086i8.s;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final int[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f11546e;

    public a(int... iArr) {
        List listS0;
        i.f(iArr, "numbers");
        this.a = iArr;
        Integer numX = p086i8.i.x(iArr, 0);
        this.f11543b = numX != null ? numX.intValue() : -1;
        Integer numX2 = p086i8.i.x(iArr, 1);
        this.f11544c = numX2 != null ? numX2.intValue() : -1;
        Integer numX3 = p086i8.i.x(iArr, 2);
        this.f11545d = numX3 != null ? numX3.intValue() : -1;
        if (iArr.length <= 3) {
            listS0 = s.f12328s;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listS0 = k.s0(new C0664c(new j(iArr), 3, iArr.length));
        }
        this.f11546e = listS0;
    }

    public final boolean a(int i10, int i11, int i12) {
        int i13 = this.f11543b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f11544c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f11545d >= i12;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11543b == aVar.f11543b && this.f11544c == aVar.f11544c && this.f11545d == aVar.f11545d && i.a(this.f11546e, aVar.f11546e);
    }

    public final int hashCode() {
        int i10 = this.f11543b;
        int i11 = (i10 * 31) + this.f11544c + i10;
        int i12 = (i11 * 31) + this.f11545d + i11;
        return this.f11546e.hashCode() + (i12 * 31) + i12;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.a) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : k.Z(arrayList, ".", null, null, null, 62);
    }
}
