package p239z;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa.a f16252c;
    public int a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16253d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16254e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f16255f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f16256g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16257h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16258i = -1;
    public boolean j = false;

    public a(b bVar, wa.a aVar) {
        this.f16251b = bVar;
        this.f16252c = aVar;
    }

    public final void a(f fVar, float f10, boolean z6) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f16257h;
            b bVar = this.f16251b;
            if (i10 == -1) {
                this.f16257h = 0;
                this.f16256g[0] = f10;
                this.f16254e[0] = fVar.f16287t;
                this.f16255f[0] = -1;
                fVar.f16284C++;
                fVar.f(bVar);
                this.a++;
                if (this.j) {
                    return;
                }
                int i11 = this.f16258i + 1;
                this.f16258i = i11;
                int[] iArr = this.f16254e;
                if (i11 >= iArr.length) {
                    this.j = true;
                    this.f16258i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.a; i13++) {
                int i14 = this.f16254e[i10];
                int i15 = fVar.f16287t;
                if (i14 == i15) {
                    float[] fArr = this.f16256g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f16257h) {
                            this.f16257h = this.f16255f[i10];
                        } else {
                            int[] iArr2 = this.f16255f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z6) {
                            fVar.g(bVar);
                        }
                        if (this.j) {
                            this.f16258i = i10;
                        }
                        fVar.f16284C--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f16255f[i10];
            }
            int length = this.f16258i;
            int i16 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f16254e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f16254e;
            if (length >= iArr4.length && this.a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f16254e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f16254e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f16253d * 2;
                this.f16253d = i18;
                this.j = false;
                this.f16258i = length - 1;
                this.f16256g = Arrays.copyOf(this.f16256g, i18);
                this.f16254e = Arrays.copyOf(this.f16254e, this.f16253d);
                this.f16255f = Arrays.copyOf(this.f16255f, this.f16253d);
            }
            this.f16254e[length] = fVar.f16287t;
            this.f16256g[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f16255f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f16255f[length] = this.f16257h;
                this.f16257h = length;
            }
            fVar.f16284C++;
            fVar.f(bVar);
            this.a++;
            if (!this.j) {
                this.f16258i++;
            }
            int i19 = this.f16258i;
            int[] iArr8 = this.f16254e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f16258i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i10 = this.f16257h;
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            f fVar = ((f[]) this.f16252c.f15700v)[this.f16254e[i10]];
            if (fVar != null) {
                fVar.g(this.f16251b);
            }
            i10 = this.f16255f[i10];
        }
        this.f16257h = -1;
        this.f16258i = -1;
        this.j = false;
        this.a = 0;
    }

    public final float c(f fVar) {
        int i10 = this.f16257h;
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            if (this.f16254e[i10] == fVar.f16287t) {
                return this.f16256g[i10];
            }
            i10 = this.f16255f[i10];
        }
        return 0.0f;
    }

    public final int d() {
        return this.a;
    }

    public final f e(int i10) {
        int i11 = this.f16257h;
        for (int i12 = 0; i11 != -1 && i12 < this.a; i12++) {
            if (i12 == i10) {
                return ((f[]) this.f16252c.f15700v)[this.f16254e[i11]];
            }
            i11 = this.f16255f[i11];
        }
        return null;
    }

    public final float f(int i10) {
        int i11 = this.f16257h;
        for (int i12 = 0; i11 != -1 && i12 < this.a; i12++) {
            if (i12 == i10) {
                return this.f16256g[i11];
            }
            i11 = this.f16255f[i11];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f10) {
        if (f10 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i10 = this.f16257h;
        b bVar = this.f16251b;
        if (i10 == -1) {
            this.f16257h = 0;
            this.f16256g[0] = f10;
            this.f16254e[0] = fVar.f16287t;
            this.f16255f[0] = -1;
            fVar.f16284C++;
            fVar.f(bVar);
            this.a++;
            if (this.j) {
                return;
            }
            int i11 = this.f16258i + 1;
            this.f16258i = i11;
            int[] iArr = this.f16254e;
            if (i11 >= iArr.length) {
                this.j = true;
                this.f16258i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.a; i13++) {
            int i14 = this.f16254e[i10];
            int i15 = fVar.f16287t;
            if (i14 == i15) {
                this.f16256g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f16255f[i10];
        }
        int length = this.f16258i;
        int i16 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f16254e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f16254e;
        if (length >= iArr3.length && this.a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f16254e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f16254e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f16253d * 2;
            this.f16253d = i18;
            this.j = false;
            this.f16258i = length - 1;
            this.f16256g = Arrays.copyOf(this.f16256g, i18);
            this.f16254e = Arrays.copyOf(this.f16254e, this.f16253d);
            this.f16255f = Arrays.copyOf(this.f16255f, this.f16253d);
        }
        this.f16254e[length] = fVar.f16287t;
        this.f16256g[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f16255f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f16255f[length] = this.f16257h;
            this.f16257h = length;
        }
        fVar.f16284C++;
        fVar.f(bVar);
        int i19 = this.a + 1;
        this.a = i19;
        if (!this.j) {
            this.f16258i++;
        }
        int[] iArr7 = this.f16254e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f16258i >= iArr7.length) {
            this.j = true;
            this.f16258i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z6) {
        int i10 = this.f16257h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.a) {
            if (this.f16254e[i10] == fVar.f16287t) {
                if (i10 == this.f16257h) {
                    this.f16257h = this.f16255f[i10];
                } else {
                    int[] iArr = this.f16255f;
                    iArr[i12] = iArr[i10];
                }
                if (z6) {
                    fVar.g(this.f16251b);
                }
                fVar.f16284C--;
                this.a--;
                this.f16254e[i10] = -1;
                if (this.j) {
                    this.f16258i = i10;
                }
                return this.f16256g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f16255f[i10];
        }
        return 0.0f;
    }

    public final String toString() {
        int i10 = this.f16257h;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.a; i11++) {
            StringBuilder sbC = e.c(p231y.a.c(string, " -> "));
            sbC.append(this.f16256g[i10]);
            sbC.append(" : ");
            StringBuilder sbC2 = e.c(sbC.toString());
            sbC2.append(((f[]) this.f16252c.f15700v)[this.f16254e[i10]]);
            string = sbC2.toString();
            i10 = this.f16255f[i10];
        }
        return string;
    }
}
