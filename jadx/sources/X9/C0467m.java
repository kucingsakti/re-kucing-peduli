package X9;

import java.util.Comparator;

/* JADX INFO: renamed from: X9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0467m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        p210v8.i.f(str, R5.a.PUSH_ADDITIONAL_DATA_KEY);
        p210v8.i.f(str2, "b");
        int iMin = Math.min(str.length(), str2.length());
        for (int i10 = 4; i10 < iMin; i10++) {
            char cCharAt = str.charAt(i10);
            char cCharAt2 = str2.charAt(i10);
            if (cCharAt != cCharAt2) {
                return p210v8.i.h(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
