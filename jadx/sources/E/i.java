package E;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public int[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f1174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f1176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f1177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1178i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f1179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1180l;

    public final void a(int i10, float f10) {
        int i11 = this.f1175f;
        int[] iArr = this.f1173d;
        if (i11 >= iArr.length) {
            this.f1173d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1174e;
            this.f1174e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1173d;
        int i12 = this.f1175f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f1174e;
        this.f1175f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f1172c;
        int[] iArr = this.a;
        if (i12 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f1171b;
            this.f1171b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i13 = this.f1172c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f1171b;
        this.f1172c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f1178i;
        int[] iArr = this.f1176g;
        if (i11 >= iArr.length) {
            this.f1176g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1177h;
            this.f1177h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f1176g;
        int i12 = this.f1178i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f1177h;
        this.f1178i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z6) {
        int i11 = this.f1180l;
        int[] iArr = this.j;
        if (i11 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f1179k;
            this.f1179k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i12 = this.f1180l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f1179k;
        this.f1180l = i12 + 1;
        zArr2[i12] = z6;
    }
}
