package p239z;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

    public static /* synthetic */ int a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            throw null;
        }
        return i10 - i11;
    }

    public static /* synthetic */ boolean b(int i10, int i11) {
        if (i10 != 0) {
            return i10 == i11;
        }
        throw null;
    }

    public static StringBuilder c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ int d(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] e(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(a, 0, iArr, 0, i10);
        return iArr;
    }
}
