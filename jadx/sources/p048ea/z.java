package p048ea;

import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11376b = new int[10];

    public final int a() {
        if ((this.a & 128) != 0) {
            return this.f11376b[7];
        }
        return 65535;
    }

    public final void b(z zVar) {
        i.f(zVar, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (((1 << i10) & zVar.a) != 0) {
                c(i10, zVar.f11376b[i10]);
            }
            i10 = i11;
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f11376b;
            if (i10 >= iArr.length) {
                return;
            }
            this.a = (1 << i10) | this.a;
            iArr[i10] = i11;
        }
    }
}
