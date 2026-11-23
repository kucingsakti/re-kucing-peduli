package L;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public char a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2715b;

    public f(char c10, float[] fArr) {
        this.a = c10;
        this.f2715b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z6, boolean z10) {
        double d3;
        double d8;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = f10;
        double d11 = f11;
        double d12 = f14;
        double d13 = ((d11 * dSin) + (d10 * dCos)) / d12;
        double d14 = f15;
        double d15 = ((d11 * dCos) + (((double) (-f10)) * dSin)) / d14;
        double d16 = f13;
        double d17 = ((d16 * dSin) + (((double) f12) * dCos)) / d12;
        double d18 = ((d16 * dCos) + (((double) (-f12)) * dSin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float fSqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z6, z10);
            return;
        }
        double dSqrt = Math.sqrt(d24);
        double d25 = dSqrt * d19;
        double d26 = dSqrt * d20;
        if (z6 == z10) {
            d3 = d21 - d26;
            d8 = d22 + d25;
        } else {
            d3 = d21 + d26;
            d8 = d22 - d25;
        }
        double dAtan2 = Math.atan2(d15 - d8, d13 - d3);
        double dAtan3 = Math.atan2(d18 - d8, d17 - d3) - dAtan2;
        if (z10 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d27 = d3 * d12;
        double d28 = d8 * d14;
        double d29 = (d27 * dCos) - (d28 * dSin);
        double d30 = (d28 * dCos) + (d27 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d12;
        double d32 = d31 * dCos2;
        double d33 = d14 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d14 * dCos2;
        double d37 = dAtan3 / ((double) iCeil);
        double d38 = (dCos3 * d36) + (dSin3 * d35);
        double d39 = d10;
        double d40 = d11;
        int i10 = 0;
        double d41 = dAtan2;
        while (i10 < iCeil) {
            double d42 = d41 + d37;
            double dSin4 = Math.sin(d42);
            double dCos4 = Math.cos(d42);
            int i11 = iCeil;
            double d43 = (((d12 * dCos2) * dCos4) + d29) - (d33 * dSin4);
            double d44 = (d36 * dSin4) + (d12 * dSin2 * dCos4) + d30;
            double d45 = (d32 * dSin4) - (d33 * dCos4);
            double d46 = (dCos4 * d36) + (dSin4 * d35);
            double d47 = d42 - d41;
            double dTan = Math.tan(d47 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * dSqrt2) + d39), (float) ((d38 * dSqrt2) + d40), (float) (d43 - (dSqrt2 * d45)), (float) (d44 - (dSqrt2 * d46)), (float) d43, (float) d44);
            i10++;
            d40 = d44;
            dCos2 = dCos2;
            d35 = d35;
            d41 = d42;
            d38 = d46;
            d39 = d43;
            iCeil = i11;
            d34 = d45;
            d37 = d37;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(f[] fVarArr, Path path) {
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float[] fArr = new float[6];
        int length = fVarArr.length;
        char c10 = 'm';
        int i12 = 0;
        char c11 = 'm';
        int i13 = 0;
        while (i13 < length) {
            f fVar = fVarArr[i13];
            char c12 = fVar.a;
            float f22 = fArr[i12];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                default:
                    i10 = 2;
                    break;
            }
            float f28 = f23;
            float f29 = f26;
            float f30 = f27;
            float f31 = f22;
            int i14 = i12;
            while (true) {
                float[] fArr2 = fVar.f2715b;
                if (i14 < fArr2.length) {
                    int i15 = i12;
                    if (c12 == 'A') {
                        i11 = i14;
                        fVar = fVar;
                        float f32 = f31;
                        float f33 = f28;
                        i13 = i13;
                        c12 = c12;
                        int i16 = i11 + 5;
                        int i17 = i11 + 6;
                        a(path, f32, f33, fArr2[i16], fArr2[i17], fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f ? 1 : i15, fArr2[i11 + 4] != 0.0f ? 1 : i15);
                        f24 = fArr2[i16];
                        f10 = fArr2[i17];
                        f25 = f10;
                        f11 = f24;
                    } else if (c12 == 'C') {
                        i11 = i14;
                        i13 = i13;
                        fVar = fVar;
                        c12 = c12;
                        int i18 = i11 + 2;
                        int i19 = i11 + 3;
                        int i20 = i11 + 4;
                        int i21 = i11 + 5;
                        path.cubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                        float f34 = fArr2[i20];
                        float f35 = fArr2[i21];
                        f24 = fArr2[i18];
                        f25 = fArr2[i19];
                        f10 = f35;
                        f11 = f34;
                    } else if (c12 != 'H') {
                        if (c12 == 'Q') {
                            i11 = i14;
                            int i22 = i11 + 1;
                            int i23 = i11 + 2;
                            int i24 = i11 + 3;
                            path.quadTo(fArr2[i11], fArr2[i22], fArr2[i23], fArr2[i24]);
                            f12 = fArr2[i11];
                            float f36 = fArr2[i22];
                            f13 = fArr2[i23];
                            f25 = f36;
                            f10 = fArr2[i24];
                        } else if (c12 == 'V') {
                            i11 = i14;
                            i13 = i13;
                            fVar = fVar;
                            f11 = f31;
                            c12 = c12;
                            path.lineTo(f11, fArr2[i11]);
                            f10 = fArr2[i11];
                        } else if (c12 != 'a') {
                            if (c12 == 'c') {
                                i11 = i14;
                                int i25 = i11 + 2;
                                int i26 = i11 + 3;
                                int i27 = i11 + 4;
                                int i28 = i11 + 5;
                                path.rCubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                float f37 = fArr2[i25] + f31;
                                float f38 = f28 + fArr2[i26];
                                f31 += fArr2[i27];
                                f28 += fArr2[i28];
                                f24 = f37;
                                f25 = f38;
                            } else if (c12 != 'h') {
                                if (c12 != 'q') {
                                    if (c12 != 'v') {
                                        if (c12 != 'L') {
                                            if (c12 == 'M') {
                                                i11 = i14;
                                                f11 = fArr2[i11];
                                                f10 = fArr2[i11 + 1];
                                                if (i11 > 0) {
                                                    path.lineTo(f11, f10);
                                                } else {
                                                    path.moveTo(f11, f10);
                                                    f29 = f11;
                                                    f30 = f10;
                                                }
                                            } else if (c12 == 'S') {
                                                i11 = i14;
                                                if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                    f31 = (f31 * 2.0f) - f24;
                                                    f28 = (f28 * 2.0f) - f25;
                                                }
                                                float f39 = f31;
                                                float f40 = f28;
                                                int i29 = i11 + 1;
                                                int i30 = i11 + 2;
                                                int i31 = i11 + 3;
                                                path.cubicTo(f39, f40, fArr2[i11], fArr2[i29], fArr2[i30], fArr2[i31]);
                                                f12 = fArr2[i11];
                                                float f41 = fArr2[i29];
                                                f13 = fArr2[i30];
                                                f25 = f41;
                                                f10 = fArr2[i31];
                                            } else if (c12 == 'T') {
                                                i11 = i14;
                                                if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                    f31 = (f31 * 2.0f) - f24;
                                                    f28 = (f28 * 2.0f) - f25;
                                                }
                                                float f42 = f28;
                                                float f43 = fArr2[i11];
                                                int i32 = i11 + 1;
                                                path.quadTo(f31, f42, f43, fArr2[i32]);
                                                f25 = f42;
                                                f11 = fArr2[i11];
                                                f10 = fArr2[i32];
                                                fVar = fVar;
                                                f24 = f31;
                                            } else if (c12 == 'l') {
                                                i11 = i14;
                                                int i33 = i11 + 1;
                                                path.rLineTo(fArr2[i11], fArr2[i33]);
                                                f31 += fArr2[i11];
                                                f17 = fArr2[i33];
                                            } else if (c12 != c10) {
                                                if (c12 == 's') {
                                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                        f18 = f28 - f25;
                                                        f19 = f31 - f24;
                                                    } else {
                                                        f19 = 0.0f;
                                                        f18 = 0.0f;
                                                    }
                                                    int i34 = i14 + 1;
                                                    int i35 = i14 + 2;
                                                    int i36 = i14 + 3;
                                                    i11 = i14;
                                                    path.rCubicTo(f19, f18, fArr2[i14], fArr2[i34], fArr2[i35], fArr2[i36]);
                                                    f14 = fArr2[i11] + f31;
                                                    f15 = f28 + fArr2[i34];
                                                    f31 += fArr2[i35];
                                                    f16 = fArr2[i36];
                                                } else if (c12 != 't') {
                                                    i11 = i14;
                                                } else {
                                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                        f20 = f31 - f24;
                                                        f21 = f28 - f25;
                                                    } else {
                                                        f21 = 0.0f;
                                                        f20 = 0.0f;
                                                    }
                                                    int i37 = i14 + 1;
                                                    path.rQuadTo(f20, f21, fArr2[i14], fArr2[i37]);
                                                    float f44 = f20 + f31;
                                                    float f45 = f28 + f21;
                                                    float f46 = f31 + fArr2[i14];
                                                    f28 += fArr2[i37];
                                                    f25 = f45;
                                                    i11 = i14;
                                                    f11 = f46;
                                                    f24 = f44;
                                                }
                                                f10 = f28;
                                            } else {
                                                i11 = i14;
                                                float f47 = fArr2[i11];
                                                f31 += f47;
                                                float f48 = fArr2[i11 + 1];
                                                f28 += f48;
                                                if (i11 > 0) {
                                                    path.rLineTo(f47, f48);
                                                } else {
                                                    path.rMoveTo(f47, f48);
                                                    fVar = fVar;
                                                    f11 = f31;
                                                    f29 = f11;
                                                    f10 = f28;
                                                    f30 = f10;
                                                }
                                            }
                                            c12 = c12;
                                        } else {
                                            i11 = i14;
                                            int i38 = i11 + 1;
                                            path.lineTo(fArr2[i11], fArr2[i38]);
                                            f11 = fArr2[i11];
                                            f10 = fArr2[i38];
                                        }
                                        fVar = fVar;
                                        c12 = c12;
                                    } else {
                                        i11 = i14;
                                        path.rLineTo(0.0f, fArr2[i11]);
                                        f17 = fArr2[i11];
                                    }
                                    f28 += f17;
                                } else {
                                    i11 = i14;
                                    int i39 = i11 + 1;
                                    int i40 = i11 + 2;
                                    int i41 = i11 + 3;
                                    path.rQuadTo(fArr2[i11], fArr2[i39], fArr2[i40], fArr2[i41]);
                                    f14 = fArr2[i11] + f31;
                                    f15 = f28 + fArr2[i39];
                                    f31 += fArr2[i40];
                                    f16 = fArr2[i41];
                                }
                                f28 += f16;
                                f24 = f14;
                                f25 = f15;
                            } else {
                                i11 = i14;
                                path.rLineTo(fArr2[i11], 0.0f);
                                f31 += fArr2[i11];
                            }
                            f11 = f31;
                            f10 = f28;
                            c12 = c12;
                        } else {
                            i11 = i14;
                            int i42 = i11 + 5;
                            float f49 = fArr2[i42] + f31;
                            int i43 = i11 + 6;
                            float f50 = fArr2[i43] + f28;
                            fVar = fVar;
                            float f51 = f31;
                            c12 = c12;
                            float f52 = f28;
                            i13 = i13;
                            a(path, f51, f52, f49, f50, fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f ? 1 : i15, fArr2[i11 + 4] != 0.0f ? 1 : i15);
                            f11 = f51 + fArr2[i42];
                            f10 = f52 + fArr2[i43];
                            f24 = f11;
                            f25 = f10;
                        }
                        f24 = f12;
                        f11 = f13;
                    } else {
                        i11 = i14;
                        fVar = fVar;
                        c12 = c12;
                        f10 = f28;
                        i13 = i13;
                        path.lineTo(fArr2[i11], f10);
                        f11 = fArr2[i11];
                    }
                    c12 = c12;
                    fVar = fVar;
                    i13 = i13;
                    i12 = i15;
                    c10 = 'm';
                    f31 = f11;
                    f28 = f10;
                    c11 = c12;
                    i14 = i11 + i10;
                    path = path;
                }
            }
            int i44 = i12;
            fArr[i44] = f31;
            fArr[1] = f28;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f29;
            fArr[5] = f30;
            c11 = fVar.a;
            i13++;
            i12 = i44;
            c10 = 'm';
        }
    }

    public f(f fVar) {
        this.a = fVar.a;
        float[] fArr = fVar.f2715b;
        this.f2715b = C3.b.f(fArr, fArr.length);
    }
}
