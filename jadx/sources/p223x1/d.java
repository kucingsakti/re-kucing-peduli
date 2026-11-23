package p223x1;

import B1.b;
import B1.g;
import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import o1.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public int[] a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f15733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f15734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f15735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f15736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f15737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f15738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f15739i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f15741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f15742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f15748s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f15732b = new int[256];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f15749t = Bitmap.Config.ARGB_8888;

    public d(r rVar, b bVar, ByteBuffer byteBuffer, int i10) {
        this.f15733c = rVar;
        this.f15741l = new b();
        synchronized (this) {
            try {
                if (i10 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
                }
                int iHighestOneBit = Integer.highestOneBit(i10);
                this.f15744o = 0;
                this.f15741l = bVar;
                this.f15740k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f15734d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f15734d.order(ByteOrder.LITTLE_ENDIAN);
                this.f15743n = false;
                Iterator it = bVar.f15723e.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).f15716g == 3) {
                        this.f15743n = true;
                        break;
                    }
                }
                this.f15745p = iHighestOneBit;
                int i11 = bVar.f15724f;
                this.f15747r = i11 / iHighestOneBit;
                int i12 = bVar.f15725g;
                this.f15746q = i12 / iHighestOneBit;
                int i13 = i11 * i12;
                g gVar = (g) this.f15733c.f13676u;
                this.f15739i = gVar == null ? new byte[i13] : (byte[]) gVar.d(i13, byte[].class);
                r rVar2 = this.f15733c;
                int i14 = this.f15747r * this.f15746q;
                g gVar2 = (g) rVar2.f13676u;
                this.j = gVar2 == null ? new int[i14] : (int[]) gVar2.d(i14, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f15748s;
        Bitmap bitmapC = ((b) this.f15733c.f13675t).c(this.f15747r, this.f15746q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f15749t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.f15741l.f15721c <= 0 || this.f15740k < 0) {
                if (Log.isLoggable("d", 3)) {
                    int i10 = this.f15741l.f15721c;
                }
                this.f15744o = 1;
            }
            int i11 = this.f15744o;
            if (i11 != 1 && i11 != 2) {
                this.f15744o = 0;
                if (this.f15735e == null) {
                    g gVar = (g) this.f15733c.f13676u;
                    this.f15735e = gVar == null ? new byte[255] : (byte[]) gVar.d(255, byte[].class);
                }
                a aVar = (a) this.f15741l.f15723e.get(this.f15740k);
                int i12 = this.f15740k - 1;
                a aVar2 = i12 >= 0 ? (a) this.f15741l.f15723e.get(i12) : null;
                int[] iArr = aVar.f15719k;
                if (iArr == null) {
                    iArr = this.f15741l.a;
                }
                this.a = iArr;
                if (iArr == null) {
                    Log.isLoggable("d", 3);
                    this.f15744o = 1;
                    return null;
                }
                if (aVar.f15715f) {
                    System.arraycopy(iArr, 0, this.f15732b, 0, iArr.length);
                    int[] iArr2 = this.f15732b;
                    this.a = iArr2;
                    iArr2[aVar.f15717h] = 0;
                    if (aVar.f15716g == 2 && this.f15740k == 0) {
                        this.f15748s = Boolean.TRUE;
                    }
                }
                return d(aVar, aVar2);
            }
            Log.isLoggable("d", 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f15749t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [short] */
    /* JADX WARN: Type inference failed for: r6v21 */
    public final Bitmap d(a aVar, a aVar2) {
        byte b3;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        short s9;
        int i16;
        Bitmap bitmap;
        int i17;
        int[] iArr2 = this.j;
        r rVar = this.f15733c;
        byte b7 = 0;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.f15742m;
            if (bitmap2 != null) {
                ((b) rVar.f13675t).h(bitmap2);
            }
            this.f15742m = null;
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && aVar2.f15716g == 3 && this.f15742m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && (i16 = aVar2.f15716g) > 0) {
            if (i16 == 2) {
                if (aVar.f15715f) {
                    i17 = 0;
                } else {
                    b bVar = this.f15741l;
                    i17 = bVar.f15728k;
                    if (aVar.f15719k != null && bVar.j == aVar.f15717h) {
                        i17 = 0;
                    }
                }
                int i18 = aVar2.f15713d;
                int i19 = this.f15745p;
                int i20 = i18 / i19;
                int i21 = aVar2.f15711b / i19;
                int i22 = aVar2.f15712c / i19;
                int i23 = aVar2.a / i19;
                int i24 = this.f15747r;
                int i25 = (i21 * i24) + i23;
                int i26 = (i20 * i24) + i25;
                while (i25 < i26) {
                    int i27 = i25 + i22;
                    for (int i28 = i25; i28 < i27; i28++) {
                        iArr2[i28] = i17;
                    }
                    i25 += this.f15747r;
                }
            } else if (i16 == 3 && (bitmap = this.f15742m) != null) {
                int i29 = this.f15747r;
                bitmap.getPixels(iArr2, 0, i29, 0, 0, i29, this.f15746q);
            }
        }
        int[] iArr3 = iArr2;
        this.f15734d.position(aVar.j);
        int i30 = aVar.f15712c * aVar.f15713d;
        byte[] bArr = this.f15739i;
        if (bArr == null || bArr.length < i30) {
            g gVar = (g) rVar.f13676u;
            this.f15739i = gVar == null ? new byte[i30] : (byte[]) gVar.d(i30, byte[].class);
        }
        byte[] bArr2 = this.f15739i;
        if (this.f15736f == null) {
            this.f15736f = new short[4096];
        }
        short[] sArr = this.f15736f;
        if (this.f15737g == null) {
            this.f15737g = new byte[4096];
        }
        byte[] bArr3 = this.f15737g;
        if (this.f15738h == null) {
            this.f15738h = new byte[4097];
        }
        byte[] bArr4 = this.f15738h;
        int i31 = this.f15734d.get() & 255;
        int i32 = 1;
        int i33 = 1 << i31;
        int i34 = i33 + 1;
        int i35 = i33 + 2;
        int i36 = i31 + 1;
        int i37 = (1 << i36) - 1;
        int i38 = 0;
        while (i38 < i33) {
            sArr[i38] = 0;
            bArr3[i38] = (byte) i38;
            i38++;
            i32 = i32;
        }
        int i39 = i32;
        byte[] bArr5 = this.f15735e;
        int i40 = i36;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = i35;
        int i50 = i37;
        int i51 = -1;
        while (true) {
            if (i41 >= i30) {
                iArr3 = iArr3;
                b3 = b7;
                break;
            }
            if (i42 == 0) {
                i15 = -1;
                int i52 = this.f15734d.get() & 255;
                if (i52 > 0) {
                    ByteBuffer byteBuffer = this.f15734d;
                    byteBuffer.get(this.f15735e, 0, Math.min(i52, byteBuffer.remaining()));
                }
                if (i52 <= 0) {
                    this.f15744o = 3;
                    b3 = 0;
                    break;
                }
                i42 = i52;
                i43 = 0;
            } else {
                iArr3 = iArr3;
                sArr = sArr;
                i15 = -1;
            }
            i45 += (bArr5[i43] & 255) << i44;
            i43++;
            i42--;
            i44 += 8;
            i49 = i49;
            i40 = i40;
            i51 = i51;
            i47 = i47;
            while (true) {
                i44 = i44;
                if (i44 < i40) {
                    b7 = 0;
                    break;
                }
                int i53 = i45 & i50;
                i45 >>= i40;
                i44 -= i40;
                if (i53 == i33) {
                    i40 = i36;
                    i49 = i35;
                    i50 = i37;
                    i44 = i44;
                    i51 = i15;
                } else {
                    if (i53 == i34) {
                        b7 = 0;
                        break;
                    }
                    int i54 = i41;
                    if (i51 == i15) {
                        bArr2[i46] = bArr3[i53];
                        i46++;
                        i41 = i54 + 1;
                        i51 = i53;
                        i47 = i51;
                    } else {
                        if (i53 >= i49) {
                            bArr4[i48] = (byte) i47;
                            i48++;
                            s9 = i51;
                        } else {
                            s9 = i53;
                        }
                        while (s9 >= i33) {
                            bArr4[i48] = bArr3[s9];
                            i48++;
                            s9 = sArr[s9];
                        }
                        i47 = bArr3[s9] & 255;
                        byte b10 = (byte) i47;
                        bArr2[i46] = b10;
                        while (true) {
                            i46++;
                            i54++;
                            if (i48 <= 0) {
                                break;
                            }
                            i48--;
                            bArr2[i46] = bArr4[i48];
                        }
                        if (i49 < 4096) {
                            sArr[i49] = (short) i51;
                            bArr3[i49] = b10;
                            i49++;
                            if ((i49 & i50) == 0 && i49 < 4096) {
                                i40++;
                                i50 += i49;
                            }
                        }
                        i41 = i54;
                        i51 = i53;
                    }
                    i15 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i46, i30, b3);
        if (aVar.f15714e || this.f15745p != i39) {
            int[] iArr4 = this.j;
            int i55 = aVar.f15713d;
            int i56 = this.f15745p;
            int i57 = i55 / i56;
            int i58 = aVar.f15711b / i56;
            int i59 = aVar.f15712c / i56;
            int i60 = aVar.a / i56;
            boolean z6 = this.f15740k == 0;
            int i61 = this.f15747r;
            int i62 = this.f15746q;
            byte[] bArr6 = this.f15739i;
            int[] iArr5 = this.a;
            Boolean bool = this.f15748s;
            int i63 = 8;
            int i64 = 0;
            int i65 = 1;
            int i66 = 0;
            while (i66 < i57) {
                int[] iArr6 = iArr4;
                if (aVar.f15714e) {
                    if (i64 >= i57) {
                        i65++;
                        if (i65 == 2) {
                            i64 = 4;
                        } else if (i65 == 3) {
                            i63 = 4;
                            i64 = 2;
                        } else if (i65 == 4) {
                            i64 = 1;
                            i63 = 2;
                        }
                    }
                    i10 = i64 + i63;
                } else {
                    i10 = i64;
                    i64 = i66;
                }
                int i67 = i64 + i58;
                int i68 = i10;
                boolean z10 = i56 == 1;
                if (i67 < i62) {
                    int i69 = i67 * i61;
                    int i70 = i69 + i60;
                    boolean z11 = z10;
                    int i71 = i70 + i59;
                    int i72 = i69 + i61;
                    if (i72 < i71) {
                        i71 = i72;
                    }
                    i11 = i57;
                    int i73 = i66 * i56 * aVar.f15712c;
                    if (z11) {
                        int i74 = i70;
                        while (i74 < i71) {
                            int i75 = i74;
                            int i76 = iArr5[bArr6[i73] & 255];
                            if (i76 != 0) {
                                iArr6[i75] = i76;
                            } else if (z6 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i73 += i56;
                            i74 = i75 + 1;
                        }
                    } else {
                        int i77 = ((i71 - i70) * i56) + i73;
                        i12 = i56;
                        int i78 = i70;
                        while (i78 < i71) {
                            int i79 = i71;
                            int i80 = aVar.f15712c;
                            int i81 = i78;
                            int i82 = i73;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            int i87 = 0;
                            while (true) {
                                if (i82 >= this.f15745p + i73) {
                                    i13 = i58;
                                    break;
                                }
                                byte[] bArr7 = this.f15739i;
                                i13 = i58;
                                if (i82 >= bArr7.length || i82 >= i77) {
                                    break;
                                }
                                int i88 = this.a[bArr7[i82] & 255];
                                if (i88 != 0) {
                                    i83 += (i88 >> 24) & 255;
                                    i84 += (i88 >> 16) & 255;
                                    i85 += (i88 >> 8) & 255;
                                    i86 += i88 & 255;
                                    i87++;
                                }
                                i82++;
                                i58 = i13;
                            }
                            int i89 = i73 + i80;
                            int i90 = i89;
                            while (i90 < this.f15745p + i89) {
                                byte[] bArr8 = this.f15739i;
                                int i91 = i89;
                                if (i90 >= bArr8.length || i90 >= i77) {
                                    break;
                                }
                                int i92 = this.a[bArr8[i90] & 255];
                                if (i92 != 0) {
                                    i83 += (i92 >> 24) & 255;
                                    i84 += (i92 >> 16) & 255;
                                    i85 += (i92 >> 8) & 255;
                                    i86 += i92 & 255;
                                    i87++;
                                }
                                i90++;
                                i89 = i91;
                            }
                            int i93 = i87 == 0 ? 0 : ((i83 / i87) << 24) | ((i84 / i87) << 16) | ((i85 / i87) << 8) | (i86 / i87);
                            if (i93 != 0) {
                                iArr6[i81] = i93;
                            } else if (z6 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i73 += i12;
                            i78 = i81 + 1;
                            i71 = i79;
                            i58 = i13;
                        }
                    }
                    i66++;
                    iArr4 = iArr6;
                    i64 = i68;
                    i56 = i12;
                    i57 = i11;
                    i58 = i58;
                } else {
                    i11 = i57;
                }
                i12 = i56;
                i66++;
                iArr4 = iArr6;
                i64 = i68;
                i56 = i12;
                i57 = i11;
                i58 = i58;
            }
            if (this.f15748s == null) {
                this.f15748s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr7 = this.j;
            int i94 = aVar.f15713d;
            int i95 = aVar.f15711b;
            int i96 = aVar.f15712c;
            int i97 = aVar.a;
            byte b11 = this.f15740k == 0 ? (byte) 1 : b3;
            int i98 = this.f15747r;
            byte[] bArr9 = this.f15739i;
            int[] iArr8 = this.a;
            byte b12 = -1;
            for (int i99 = b3; i99 < i94; i99++) {
                int i100 = (i99 + i95) * i98;
                int i101 = i100 + i97;
                int i102 = i101 + i96;
                int i103 = i100 + i98;
                if (i103 < i102) {
                    i102 = i103;
                }
                int i104 = aVar.f15712c * i99;
                while (i101 < i102) {
                    int[] iArr9 = iArr7;
                    byte b13 = bArr9[i104];
                    int i105 = i94;
                    int i106 = b13 & 255;
                    if (i106 != b12) {
                        int i107 = iArr8[i106];
                        if (i107 != 0) {
                            iArr9[i101] = i107;
                        } else {
                            b12 = b13;
                        }
                    }
                    i104++;
                    i101++;
                    iArr7 = iArr9;
                    i94 = i105;
                }
            }
            Boolean bool2 = this.f15748s;
            this.f15748s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f15748s != null || b11 == 0 || b12 == -1));
        }
        if (this.f15743n && ((i14 = aVar.f15716g) == 0 || i14 == 1)) {
            if (this.f15742m == null) {
                this.f15742m = a();
            }
            Bitmap bitmap3 = this.f15742m;
            int i108 = this.f15747r;
            iArr = iArr3;
            bitmap3.setPixels(iArr, 0, i108, 0, 0, i108, this.f15746q);
        } else {
            iArr = iArr3;
        }
        Bitmap bitmapA = a();
        int i109 = this.f15747r;
        bitmapA.setPixels(iArr, 0, i109, 0, 0, i109, this.f15746q);
        return bitmapA;
    }
}
