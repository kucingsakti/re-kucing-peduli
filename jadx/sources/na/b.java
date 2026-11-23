package na;

import ma.u;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c10) {
        if ('0' <= c10 && c10 <= '9') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 <= 'f') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 > 'F') {
            throw new IllegalArgumentException(i.k(Character.valueOf(c10), "Unexpected hex digit: "));
        }
        return c10 - '7';
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public static final int b(u uVar, int i10) {
        int i11;
        i.f(uVar, "<this>");
        int i12 = i10 + 1;
        int length = uVar.f13223w.length;
        int[] iArr = uVar.f13224x;
        i.f(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (i14 <= i13) {
            i11 = (i14 + i13) >>> 1;
            int i15 = iArr[i11];
            if (i15 < i12) {
                i14 = i11 + 1;
            } else {
                if (i15 <= i12) {
                    if (i11 >= 0) {
                        return i11;
                    }
                    return ~i11;
                }
                i13 = i11 - 1;
            }
        }
        i11 = (-i14) - 1;
        if (i11 >= 0) {
            return i11;
        }
        return ~i11;
    }
}
