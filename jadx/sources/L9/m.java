package L9;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {
    public static Long A(String str) {
        boolean z6;
        D3.b.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (p210v8.i.h(cCharAt, 48) < 0) {
            z6 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j = Long.MIN_VALUE;
                i10 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z6 = false;
                i10 = 1;
            }
        } else {
            z6 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return null;
                }
                j11 = j / ((long) 10);
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * ((long) 10);
            long j13 = iDigit;
            if (j12 < j + j13) {
                return null;
            }
            j10 = j12 - j13;
            i10++;
        }
        return z6 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }

    public static Integer z(String str) {
        boolean z6;
        int i10;
        int i11;
        D3.b.d(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = -2147483647;
        if (p210v8.i.h(cCharAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i13 = Integer.MIN_VALUE;
                z6 = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z6 = false;
            }
        } else {
            z6 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int iDigit = Character.digit((int) str.charAt(i10), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + iDigit) {
                return null;
            }
            i12 = i11 - iDigit;
            i10++;
        }
        return z6 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }
}
