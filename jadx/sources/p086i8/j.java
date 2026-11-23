package p086i8;

import java.util.RandomAccess;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0665d implements RandomAccess {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int[] f12326s;

    public j(int[] iArr) {
        this.f12326s = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[RETURN] */
    @Override // p086i8.AbstractC0665d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            int[] iArr = this.f12326s;
            i.f(iArr, "<this>");
            int length = iArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (iIntValue != iArr[i10]) {
                    i10++;
                } else if (i10 >= 0) {
                    return true;
                }
            }
            i10 = -1;
            if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p086i8.AbstractC0665d
    public final int e() {
        return this.f12326s.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(this.f12326s[i10]);
    }

    @Override // p086i8.AbstractC0665d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f12326s;
        i.f(iArr, "<this>");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iIntValue == iArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    @Override // p086i8.AbstractC0665d, java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12326s.length == 0;
    }

    @Override // p086i8.AbstractC0665d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f12326s;
        i.f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }
}
