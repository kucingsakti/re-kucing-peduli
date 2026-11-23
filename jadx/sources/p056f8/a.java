package p056f8;

import A1.F;
import B1.b;
import H1.C0235d;
import U1.n;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import p188t1.Y;
import p232y1.e;
import p232y1.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {
    @Override // p232y1.l
    public final F a(Context context, F f10, int i10, int i11) throws Throwable {
        char c10;
        int i12;
        int i13;
        if (!n.j(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        b bVar = com.bumptech.glide.b.b(context).f7587s;
        Bitmap bitmap = (Bitmap) f10.get();
        if (i10 == Integer.MIN_VALUE) {
            bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            bitmap.getHeight();
        }
        Context applicationContext = context.getApplicationContext();
        Bitmap bitmapF = bVar.f(bitmap.getWidth() / 3, bitmap.getHeight() / 3, Bitmap.Config.ARGB_8888);
        bitmapF.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(bitmapF);
        float f11 = 1.0f / 3;
        canvas.scale(f11, f11);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            Y.d(applicationContext, bitmapF);
        } catch (RSRuntimeException unused) {
            int width = bitmapF.getWidth();
            int height = bitmapF.getHeight();
            int i14 = width * height;
            int[] iArr = new int[i14];
            bitmapF.getPixels(iArr, 0, width, 0, 0, width, height);
            int i15 = width - 1;
            int i16 = height - 1;
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            int[] iArr4 = new int[i14];
            int[] iArr5 = new int[Math.max(width, height)];
            int[] iArr6 = new int[173056];
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 173056; i18 < i19; i19 = 173056) {
                iArr6[i18] = i18 / 676;
                i18++;
            }
            char c11 = 1;
            int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 51, 3);
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                c10 = c11;
                if (i20 >= height) {
                    break;
                }
                int i23 = i17;
                int i24 = i23;
                int i25 = i24;
                int i26 = i25;
                int i27 = i26;
                int i28 = i27;
                int i29 = i28;
                int i30 = i29;
                int[] iArr8 = iArr4;
                int i31 = -25;
                int i32 = i30;
                for (int i33 = 25; i31 <= i33; i33 = 25) {
                    int i34 = i17;
                    int[][] iArr9 = iArr7;
                    int i35 = iArr[Math.min(i15, Math.max(i31, i34)) + i21];
                    int[] iArr10 = iArr9[i31 + 25];
                    iArr10[i34] = (i35 & 16711680) >> 16;
                    iArr10[c10] = (i35 & 65280) >> 8;
                    iArr10[2] = i35 & 255;
                    int iAbs = 26 - Math.abs(i31);
                    int i36 = iArr10[i34];
                    i32 = (i36 * iAbs) + i32;
                    int i37 = iArr10[c10];
                    i23 = (i37 * iAbs) + i23;
                    int i38 = iArr10[2];
                    i24 = (iAbs * i38) + i24;
                    if (i31 > 0) {
                        i28 += i36;
                        i29 += i37;
                        i30 += i38;
                    } else {
                        i25 += i36;
                        i26 += i37;
                        i27 += i38;
                    }
                    i31++;
                    iArr7 = iArr9;
                    i17 = 0;
                }
                int[][] iArr11 = iArr7;
                int i39 = 0;
                int i40 = 25;
                while (i39 < width) {
                    iArr2[i21] = iArr6[i32];
                    iArr3[i21] = iArr6[i23];
                    iArr8[i21] = iArr6[i24];
                    int i41 = i32 - i25;
                    int i42 = i23 - i26;
                    int i43 = i24 - i27;
                    int[] iArr12 = iArr11[(i40 + 26) % 51];
                    int i44 = i25 - iArr12[0];
                    int i45 = i26 - iArr12[c10];
                    int i46 = i27 - iArr12[2];
                    if (i20 == 0) {
                        i13 = i39;
                        iArr5[i13] = Math.min(i13 + 26, i15);
                    } else {
                        i13 = i39;
                    }
                    int i47 = iArr[i22 + iArr5[i13]];
                    int i48 = (i47 & 16711680) >> 16;
                    iArr12[0] = i48;
                    int i49 = (i47 & 65280) >> 8;
                    iArr12[c10] = i49;
                    int i50 = i47 & 255;
                    iArr12[2] = i50;
                    int i51 = i28 + i48;
                    int i52 = i29 + i49;
                    int i53 = i30 + i50;
                    i32 = i41 + i51;
                    i23 = i42 + i52;
                    i24 = i43 + i53;
                    i40 = (i40 + 1) % 51;
                    int[] iArr13 = iArr11[i40 % 51];
                    int i54 = iArr13[0];
                    i25 = i44 + i54;
                    int i55 = iArr13[c10];
                    i26 = i45 + i55;
                    int i56 = iArr13[2];
                    i27 = i46 + i56;
                    i28 = i51 - i54;
                    i29 = i52 - i55;
                    i30 = i53 - i56;
                    i21++;
                    i39 = i13 + 1;
                }
                i22 += width;
                i20++;
                c11 = c10;
                iArr4 = iArr8;
                iArr7 = iArr11;
                i17 = 0;
            }
            int[] iArr14 = iArr4;
            int[][] iArr15 = iArr7;
            for (int i57 = 0; i57 < width; i57++) {
                int i58 = (-25) * width;
                int i59 = 0;
                int i60 = 0;
                int i61 = 0;
                int i62 = 0;
                int i63 = 0;
                int i64 = 0;
                int i65 = 0;
                int i66 = 0;
                int i67 = 0;
                for (int i68 = -25; i68 <= 25; i68++) {
                    int iMax = Math.max(0, i58) + i57;
                    int[] iArr16 = iArr15[i68 + 25];
                    iArr16[0] = iArr2[iMax];
                    iArr16[c10] = iArr3[iMax];
                    iArr16[2] = iArr14[iMax];
                    int iAbs2 = 26 - Math.abs(i68);
                    i65 = (iArr2[iMax] * iAbs2) + i65;
                    i66 = (iArr3[iMax] * iAbs2) + i66;
                    i67 = (iArr14[iMax] * iAbs2) + i67;
                    if (i68 > 0) {
                        i62 += iArr16[0];
                        i63 += iArr16[c10];
                        i64 += iArr16[2];
                    } else {
                        i59 += iArr16[0];
                        i60 += iArr16[c10];
                        i61 += iArr16[2];
                    }
                    if (i68 < i16) {
                        i58 += width;
                    }
                }
                int i69 = i61;
                int i70 = i60;
                int i71 = i65;
                int i72 = i64;
                int i73 = i63;
                int i74 = i62;
                int i75 = i69;
                int i76 = i66;
                int i77 = i67;
                int i78 = 0;
                int i79 = 25;
                int i80 = i57;
                while (i78 < height) {
                    iArr[i80] = (iArr[i80] & (-16777216)) | (iArr6[i71] << 16) | (iArr6[i76] << 8) | iArr6[i77];
                    int i81 = i71 - i59;
                    int i82 = i76 - i70;
                    int i83 = i77 - i75;
                    int[] iArr17 = iArr15[(i79 + 26) % 51];
                    int i84 = i59 - iArr17[0];
                    int i85 = i70 - iArr17[c10];
                    int i86 = i75 - iArr17[2];
                    if (i57 == 0) {
                        i12 = i78;
                        iArr5[i12] = Math.min(i12 + 26, i16) * width;
                    } else {
                        i12 = i78;
                    }
                    int i87 = iArr5[i12] + i57;
                    int i88 = iArr2[i87];
                    iArr17[0] = i88;
                    int i89 = iArr3[i87];
                    iArr17[c10] = i89;
                    int i90 = iArr14[i87];
                    iArr17[2] = i90;
                    int i91 = i74 + i88;
                    int i92 = i73 + i89;
                    int i93 = i72 + i90;
                    i71 = i81 + i91;
                    i76 = i82 + i92;
                    i77 = i83 + i93;
                    i79 = (i79 + 1) % 51;
                    int[] iArr18 = iArr15[i79];
                    int i94 = iArr18[0];
                    i59 = i84 + i94;
                    int i95 = iArr18[c10];
                    i70 = i85 + i95;
                    int i96 = iArr18[2];
                    i75 = i86 + i96;
                    i74 = i91 - i94;
                    i73 = i92 - i95;
                    i72 = i93 - i96;
                    i80 += width;
                    i78 = i12 + 1;
                }
            }
            bitmapF.setPixels(iArr, 0, width, 0, 0, width, height);
        }
        return bitmap.equals(bitmapF) ? f10 : C0235d.d(bVar, bitmapF);
    }

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update("jp.wasabeef.glide.transformations.BlurTransformation.1253".getBytes(e.a));
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return true;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return 737538640;
    }

    public final String toString() {
        return "BlurTransformation(radius=25, sampling=3)";
    }
}
