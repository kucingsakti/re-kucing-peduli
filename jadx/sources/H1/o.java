package H1;

import A1.C0099h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import p188t1.Y;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p232y1.g f1881f = p232y1.g.a(p232y1.a.f16012u, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p232y1.g f1882g = new p232y1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, p232y1.g.f16014e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p232y1.g f1883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p232y1.g f1884i;
    public static final Set j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final za.c f1885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayDeque f1886l;
    public final B1.b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f1887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B1.g f1888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f1890e = u.a();

    static {
        m mVar = m.f1874b;
        Boolean bool = Boolean.FALSE;
        f1883h = p232y1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f1884i = p232y1.g.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f1885k = new za.c(4);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = U1.n.a;
        f1886l = new ArrayDeque(0);
    }

    public o(ArrayList arrayList, DisplayMetrics displayMetrics, B1.b bVar, B1.g gVar) {
        this.f1889d = arrayList;
        U1.f.c(displayMetrics, "Argument must not be null");
        this.f1887b = displayMetrics;
        U1.f.c(bVar, "Argument must not be null");
        this.a = bVar;
        U1.f.c(gVar, "Argument must not be null");
        this.f1888c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(A1.C0099h r4, android.graphics.BitmapFactory.Options r5, H1.n r6, B1.b r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L20
            r6.i()
            int r0 = r4.f102s
            switch(r0) {
                case 5: goto L20;
                case 6: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L20
        Ld:
            java.lang.Object r0 = r4.f103t
            com.bumptech.glide.load.data.h r0 = (com.bumptech.glide.load.data.h) r0
            java.lang.Object r0 = r0.f7652t
            H1.w r0 = (H1.w) r0
            monitor-enter(r0)
            byte[] r1 = r0.f1903s     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.length     // Catch: java.lang.Throwable -> L1d
            r0.f1905u = r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            goto L20
        L1d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
        L20:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = H1.y.f1909b
            r3.lock()
            android.graphics.Bitmap r4 = r4.d(r5)     // Catch: java.lang.IllegalArgumentException -> L33 java.lang.Throwable -> L54
            r3.unlock()
            return r4
        L33:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L54
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L53
            r7.h(r1)     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L54
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L54
            android.graphics.Bitmap r4 = c(r4, r5, r6, r7)     // Catch: java.io.IOException -> L52 java.lang.Throwable -> L54
            java.util.concurrent.locks.Lock r5 = H1.y.f1909b
            r5.unlock()
            return r4
        L52:
            throw r0     // Catch: java.lang.Throwable -> L54
        L53:
            throw r0     // Catch: java.lang.Throwable -> L54
        L54:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = H1.y.f1909b
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.o.c(A1.h, android.graphics.BitmapFactory$Options, H1.n, B1.b):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        g(options);
        ArrayDeque arrayDeque = f1886l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void g(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C0235d a(C0099h c0099h, int i10, int i11, p232y1.h hVar, n nVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f1888c.d(65536, byte[].class);
        synchronized (o.class) {
            ArrayDeque arrayDeque = f1886l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                g(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        p232y1.a aVar = (p232y1.a) hVar.c(f1881f);
        p232y1.i iVar = (p232y1.i) hVar.c(f1882g);
        m mVar = (m) hVar.c(m.f1879g);
        boolean zBooleanValue = ((Boolean) hVar.c(f1883h)).booleanValue();
        p232y1.g gVar = f1884i;
        try {
            return C0235d.d(this.a, b(c0099h, options2, mVar, aVar, iVar, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), i10, i11, zBooleanValue, nVar));
        } finally {
            f(options2);
            this.f1888c.h(bArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:152:0x0304  */
    /* JADX WARN: Code duplicated, block: B:154:0x0307  */
    /* JADX WARN: Code duplicated, block: B:155:0x0309  */
    /* JADX WARN: Code duplicated, block: B:164:0x0325  */
    /* JADX WARN: Code duplicated, block: B:165:0x0328  */
    /* JADX WARN: Code duplicated, block: B:168:0x0330  */
    /* JADX WARN: Code duplicated, block: B:169:0x0334  */
    /* JADX WARN: Code duplicated, block: B:172:0x033d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0342  */
    /* JADX WARN: Code duplicated, block: B:177:0x0346  */
    /* JADX WARN: Code duplicated, block: B:181:0x034e  */
    /* JADX WARN: Code duplicated, block: B:183:0x0351  */
    /* JADX WARN: Code duplicated, block: B:184:0x0357  */
    /* JADX WARN: Code duplicated, block: B:188:0x0380 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x0384  */
    /* JADX WARN: Code duplicated, block: B:193:0x038d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0392  */
    /* JADX WARN: Code duplicated, block: B:196:0x0395  */
    /* JADX WARN: Code duplicated, block: B:199:0x039f  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:203:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:208:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:210:0x03be  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:213:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:217:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:219:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:221:0x0407  */
    /* JADX WARN: Code duplicated, block: B:222:0x040a  */
    /* JADX WARN: Code duplicated, block: B:225:0x041b  */
    /* JADX WARN: Code duplicated, block: B:226:0x041f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0428  */
    /* JADX WARN: Code duplicated, block: B:228:0x042c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0435  */
    /* JADX WARN: Code duplicated, block: B:230:0x043e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0442  */
    /* JADX WARN: Code duplicated, block: B:234:0x0471  */
    /* JADX WARN: Code duplicated, block: B:235:0x0476  */
    /* JADX WARN: Code duplicated, block: B:239:0x0496  */
    /* JADX WARN: Code duplicated, block: B:240:0x049a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:248:0x030f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0134  */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x0392, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap b(C0099h c0099h, BitmapFactory.Options options, m mVar, p232y1.a aVar, p232y1.i iVar, boolean z6, int i10, int i11, boolean z10, n nVar) throws Throwable {
        int i12;
        int iM;
        char c10;
        int i13;
        int iRound;
        int iRound2;
        ImageHeaderParser$ImageType imageHeaderParser$ImageTypeF;
        int i14;
        int i15;
        boolean zB;
        boolean z11;
        boolean zHasAlpha;
        Bitmap.Config config;
        boolean z12;
        int i16;
        int i17;
        boolean z13;
        float f10;
        int i18;
        Bitmap bitmapC;
        Matrix matrix;
        Bitmap.Config config2;
        Bitmap bitmap;
        boolean z14;
        ColorSpace.Named named;
        Bitmap.Config config3;
        int i19;
        int i20;
        int iMax;
        int iFloor;
        double dFloor;
        int iRound3;
        w wVar;
        int i21 = 0;
        int i22 = U1.h.a;
        SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        B1.b bVar = this.a;
        c(c0099h, options, nVar, bVar);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i23 = iArr[0];
        int i24 = iArr[1];
        boolean z15 = (i23 == -1 || i24 == -1) ? false : z6;
        switch (c0099h.f102s) {
            case 5:
                i12 = 1;
                ByteBuffer byteBufferC = U1.b.c((ByteBuffer) c0099h.f103t);
                B1.g gVar = (B1.g) c0099h.f105v;
                if (byteBufferC == null) {
                    iM = -1;
                } else {
                    ArrayList arrayList = (ArrayList) c0099h.f104u;
                    int size = arrayList.size();
                    int i25 = 0;
                    while (true) {
                        if (i25 < size) {
                            try {
                                int iB = ((p232y1.d) arrayList.get(i25)).b(byteBufferC, gVar);
                                B1.g gVar2 = gVar;
                                if (iB != -1) {
                                    iM = iB;
                                } else {
                                    i25++;
                                    gVar = gVar2;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } else {
                            iM = -1;
                        }
                    }
                }
                switch (iM) {
                    case 3:
                    case 4:
                        c10 = 180;
                        break;
                    case 5:
                    case 6:
                        c10 = 'Z';
                        break;
                    case 7:
                    case 8:
                        c10 = 270;
                        break;
                    default:
                        c10 = 0;
                        break;
                }
                switch (iM) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        i13 = i12;
                        break;
                    default:
                        i13 = 0;
                        break;
                }
                iRound = i10;
                if (iRound == Integer.MIN_VALUE) {
                    if (c10 != 'Z' || c10 == 270) {
                        iRound = i24;
                    } else {
                        iRound = i23;
                    }
                }
                iRound2 = i11;
                if (iRound2 == Integer.MIN_VALUE) {
                    if (c10 != 'Z' || c10 == 270) {
                        iRound2 = i23;
                    } else {
                        iRound2 = i24;
                    }
                }
                imageHeaderParser$ImageTypeF = c0099h.f();
                if (i23 > 0 || i24 <= 0) {
                    i14 = i24;
                    i15 = i23;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(imageHeaderParser$ImageTypeF);
                    }
                } else {
                    if (c10 == 'Z' || c10 == 270) {
                        i19 = i24;
                        i20 = i23;
                    } else {
                        i20 = i24;
                        i19 = i23;
                    }
                    float fB = mVar.b(i19, i20, iRound, iRound2);
                    if (fB <= 0.0f) {
                        throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + mVar + ", source: [" + i23 + "x" + i24 + "], target: [" + iRound + "x" + iRound2 + "]");
                    }
                    int iA = mVar.a(i19, i20, iRound, iRound2);
                    if (iA == 0) {
                        throw new IllegalArgumentException("Cannot round with null rounding");
                    }
                    float f11 = i19;
                    float f12 = i20;
                    int i26 = i19 / ((int) (((double) (fB * f11)) + 0.5d));
                    int i27 = i20 / ((int) (((double) (fB * f12)) + 0.5d));
                    int iMax2 = iA == i12 ? Math.max(i26, i27) : Math.min(i26, i27);
                    int i28 = Build.VERSION.SDK_INT;
                    if (i28 > 23 || !j.contains(options.outMimeType)) {
                        iMax = Math.max(1, Integer.highestOneBit(iMax2));
                        if (iA == 1 && iMax < 1.0f / fB) {
                            iMax <<= 1;
                        }
                    } else {
                        iMax = 1;
                    }
                    options.inSampleSize = iMax;
                    if (imageHeaderParser$ImageTypeF == ImageHeaderParser$ImageType.JPEG) {
                        float fMin = Math.min(iMax, 8);
                        iFloor = (int) Math.ceil(f11 / fMin);
                        iRound3 = (int) Math.ceil(f12 / fMin);
                        int i29 = iMax / 8;
                        if (i29 > 0) {
                            iFloor /= i29;
                            iRound3 /= i29;
                        }
                    } else {
                        if (imageHeaderParser$ImageTypeF == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeF == ImageHeaderParser$ImageType.PNG_A) {
                            float f13 = iMax;
                            iFloor = (int) Math.floor(f11 / f13);
                            dFloor = Math.floor(f12 / f13);
                        } else if (imageHeaderParser$ImageTypeF.isWebp()) {
                            if (i28 >= 24) {
                                float f14 = iMax;
                                iFloor = Math.round(f11 / f14);
                                iRound3 = Math.round(f12 / f14);
                            } else {
                                float f15 = iMax;
                                iFloor = (int) Math.floor(f11 / f15);
                                dFloor = Math.floor(f12 / f15);
                            }
                        } else if (i19 % iMax == 0 && i20 % iMax == 0) {
                            iFloor = i19 / iMax;
                            iRound3 = i20 / iMax;
                        } else {
                            options.inJustDecodeBounds = true;
                            c(c0099h, options, nVar, bVar);
                            options.inJustDecodeBounds = false;
                            int[] iArr2 = {options.outWidth, options.outHeight};
                            iFloor = iArr2[0];
                            iRound3 = iArr2[1];
                        }
                        iRound3 = (int) dFloor;
                    }
                    double dB = mVar.b(iFloor, iRound3, iRound, iRound2);
                    int iRound4 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
                    int i30 = (int) ((((double) iRound4) * dB) + 0.5d);
                    options.inTargetDensity = (int) (((dB / ((double) (i30 / iRound4))) * ((double) i30)) + 0.5d);
                    if (dB > 1.0d) {
                        dB = 1.0d / dB;
                    }
                    int iRound5 = (int) Math.round(dB * 2.147483647E9d);
                    options.inDensity = iRound5;
                    int i31 = options.inTargetDensity;
                    if (i31 <= 0 || iRound5 <= 0 || i31 == iRound5) {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    } else {
                        options.inScaled = true;
                    }
                    Log.isLoggable("Downsampler", 2);
                    i15 = i23;
                    i14 = i24;
                }
                zB = this.f1890e.b(iRound, iRound2, z15, i13);
                if (zB) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z11 = false;
                    options.inMutable = false;
                } else {
                    z11 = false;
                }
                if (!zB) {
                    if (aVar != p232y1.a.f16010s) {
                        try {
                            zHasAlpha = c0099h.f().hasAlpha();
                        } catch (IOException unused) {
                            if (Log.isLoggable("Downsampler", 3)) {
                                Objects.toString(aVar);
                            }
                            zHasAlpha = z11;
                        }
                        if (zHasAlpha) {
                            config = Bitmap.Config.ARGB_8888;
                        } else {
                            config = Bitmap.Config.RGB_565;
                        }
                        options.inPreferredConfig = config;
                        if (config == Bitmap.Config.RGB_565) {
                            z12 = true;
                            options.inDither = true;
                        } else {
                            z12 = true;
                        }
                    } else {
                        z12 = true;
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    break;
                } else {
                    z12 = true;
                }
                i16 = Build.VERSION.SDK_INT;
                if (i15 >= 0 || i14 < 0 || !z10) {
                    i17 = options.inTargetDensity;
                    if (i17 > 0 || (i18 = options.inDensity) <= 0 || i17 == i18) {
                        z13 = z11;
                    } else {
                        z13 = z12;
                    }
                    if (z13) {
                        f10 = i17 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    float f16 = options.inSampleSize;
                    int iCeil = (int) Math.ceil(i15 / f16);
                    int iCeil2 = (int) Math.ceil(i14 / f16);
                    iRound = Math.round(iCeil * f10);
                    iRound2 = Math.round(iCeil2 * f10);
                    Log.isLoggable("Downsampler", 2);
                }
                if (iRound > 0 && iRound2 > 0) {
                    if (i16 >= 26) {
                        config3 = options.inPreferredConfig != Bitmap.Config.HARDWARE ? options.outConfig : null;
                    }
                    if (config3 == null) {
                        config3 = options.inPreferredConfig;
                    }
                    options.inBitmap = bVar.c(iRound, iRound2, config3);
                }
                if (iVar != null) {
                    if (i16 >= 28) {
                        if (iVar == p232y1.i.f16019s || options.outColorSpace == null || !options.outColorSpace.isWideGamut()) {
                            z14 = z11;
                        } else {
                            z14 = z12;
                        }
                        if (z14) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i16 >= 26) {
                        ColorSpace.Named unused2 = ColorSpace.Named.SRGB;
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(c0099h, options, nVar, bVar);
                nVar.e(bVar, bitmapC);
                if (Log.isLoggable("Downsampler", 2)) {
                    d(bitmapC);
                    d(options.inBitmap);
                    Thread.currentThread().getName();
                    SystemClock.elapsedRealtimeNanos();
                }
                if (bitmapC == null) {
                    return null;
                }
                bitmapC.setDensity(this.f1887b.densityDpi);
                switch (iM) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (iM) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                        matrix.mapRect(rectF);
                        int iRound6 = Math.round(rectF.width());
                        int iRound7 = Math.round(rectF.height());
                        if (bitmapC.getConfig() != null) {
                            config2 = bitmapC.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        Bitmap bitmapF = bVar.f(iRound6, iRound7, config2);
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        bitmapF.setHasAlpha(bitmapC.hasAlpha());
                        y.a(bitmapC, bitmapF, matrix);
                        bitmap = bitmapF;
                        break;
                    default:
                        bitmap = bitmapC;
                        break;
                }
                if (bitmapC.equals(bitmap)) {
                    return bitmap;
                }
                bVar.h(bitmapC);
                return bitmap;
            case 6:
                i12 = 1;
                w wVar2 = (w) ((com.bumptech.glide.load.data.h) c0099h.f103t).f7652t;
                wVar2.reset();
                iM = Y.m((ArrayList) c0099h.f105v, wVar2, (B1.g) c0099h.f104u);
                switch (iM) {
                    case 3:
                    case 4:
                        c10 = 180;
                        break;
                    case 5:
                    case 6:
                        c10 = 'Z';
                        break;
                    case 7:
                    case 8:
                        c10 = 270;
                        break;
                    default:
                        c10 = 0;
                        break;
                }
                switch (iM) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        i13 = i12;
                        break;
                    default:
                        i13 = 0;
                        break;
                }
                iRound = i10;
                if (iRound == Integer.MIN_VALUE) {
                    if (c10 != 'Z') {
                        iRound = i24;
                    } else {
                        iRound = i24;
                    }
                }
                iRound2 = i11;
                if (iRound2 == Integer.MIN_VALUE) {
                    if (c10 != 'Z') {
                        iRound2 = i23;
                    } else {
                        iRound2 = i23;
                    }
                }
                imageHeaderParser$ImageTypeF = c0099h.f();
                if (i23 > 0) {
                    i14 = i24;
                    i15 = i23;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(imageHeaderParser$ImageTypeF);
                    }
                } else {
                    i14 = i24;
                    i15 = i23;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(imageHeaderParser$ImageTypeF);
                    }
                }
                zB = this.f1890e.b(iRound, iRound2, z15, i13);
                if (zB) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z11 = false;
                    options.inMutable = false;
                } else {
                    z11 = false;
                }
                if (!zB) {
                    z12 = true;
                } else if (aVar != p232y1.a.f16010s) {
                    zHasAlpha = c0099h.f().hasAlpha();
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z12 = true;
                        options.inDither = true;
                    } else {
                        z12 = true;
                    }
                } else {
                    z12 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i16 = Build.VERSION.SDK_INT;
                if (i15 >= 0) {
                    i17 = options.inTargetDensity;
                    if (i17 > 0) {
                        z13 = z11;
                    } else {
                        z13 = z11;
                    }
                    if (z13) {
                        f10 = i17 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    float f17 = options.inSampleSize;
                    int iCeil3 = (int) Math.ceil(i15 / f17);
                    int iCeil4 = (int) Math.ceil(i14 / f17);
                    iRound = Math.round(iCeil3 * f10);
                    iRound2 = Math.round(iCeil4 * f10);
                    Log.isLoggable("Downsampler", 2);
                } else {
                    i17 = options.inTargetDensity;
                    if (i17 > 0) {
                        z13 = z11;
                    } else {
                        z13 = z11;
                    }
                    if (z13) {
                        f10 = i17 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    float f18 = options.inSampleSize;
                    int iCeil5 = (int) Math.ceil(i15 / f18);
                    int iCeil6 = (int) Math.ceil(i14 / f18);
                    iRound = Math.round(iCeil5 * f10);
                    iRound2 = Math.round(iCeil6 * f10);
                    Log.isLoggable("Downsampler", 2);
                }
                if (iRound > 0) {
                    if (i16 >= 26) {
                        if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                        }
                    }
                    if (config3 == null) {
                        config3 = options.inPreferredConfig;
                    }
                    options.inBitmap = bVar.c(iRound, iRound2, config3);
                }
                if (iVar != null) {
                    if (i16 >= 28) {
                        if (iVar == p232y1.i.f16019s) {
                            z14 = z11;
                        } else {
                            z14 = z11;
                        }
                        if (z14) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i16 >= 26) {
                        ColorSpace.Named unused3 = ColorSpace.Named.SRGB;
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(c0099h, options, nVar, bVar);
                nVar.e(bVar, bitmapC);
                if (Log.isLoggable("Downsampler", 2)) {
                    d(bitmapC);
                    d(options.inBitmap);
                    Thread.currentThread().getName();
                    SystemClock.elapsedRealtimeNanos();
                }
                if (bitmapC == null) {
                    return null;
                }
                bitmapC.setDensity(this.f1887b.densityDpi);
                switch (iM) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (iM) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF2 = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                        matrix.mapRect(rectF2);
                        int iRound8 = Math.round(rectF2.width());
                        int iRound9 = Math.round(rectF2.height());
                        if (bitmapC.getConfig() != null) {
                            config2 = bitmapC.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        Bitmap bitmapF2 = bVar.f(iRound8, iRound9, config2);
                        matrix.postTranslate(-rectF2.left, -rectF2.top);
                        bitmapF2.setHasAlpha(bitmapC.hasAlpha());
                        y.a(bitmapC, bitmapF2, matrix);
                        bitmap = bitmapF2;
                        break;
                    default:
                        bitmap = bitmapC;
                        break;
                }
                if (bitmapC.equals(bitmap)) {
                    return bitmap;
                }
                bVar.h(bitmapC);
                return bitmap;
            default:
                com.bumptech.glide.load.data.h hVar = (com.bumptech.glide.load.data.h) c0099h.f105v;
                B1.g gVar3 = (B1.g) c0099h.f103t;
                ArrayList arrayList2 = (ArrayList) c0099h.f104u;
                i12 = 1;
                int size2 = arrayList2.size();
                while (true) {
                    if (i21 < size2) {
                        p232y1.d dVar = (p232y1.d) arrayList2.get(i21);
                        ArrayList arrayList3 = arrayList2;
                        try {
                            int i32 = i21;
                            int i33 = size2;
                            wVar = new w(new FileInputStream(hVar.e().getFileDescriptor()), gVar3);
                            try {
                                iM = dVar.c(wVar, gVar3);
                                wVar.b();
                                hVar.e();
                                if (iM == -1) {
                                    i21 = i32 + 1;
                                    arrayList2 = arrayList3;
                                    size2 = i33;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (wVar != null) {
                                    wVar.b();
                                }
                                hVar.e();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            wVar = null;
                        }
                    } else {
                        iM = -1;
                    }
                }
                switch (iM) {
                    case 3:
                    case 4:
                        c10 = 180;
                        break;
                    case 5:
                    case 6:
                        c10 = 'Z';
                        break;
                    case 7:
                    case 8:
                        c10 = 270;
                        break;
                    default:
                        c10 = 0;
                        break;
                }
                switch (iM) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        i13 = i12;
                        break;
                    default:
                        i13 = 0;
                        break;
                }
                iRound = i10;
                if (iRound == Integer.MIN_VALUE) {
                    if (c10 != 'Z') {
                        iRound = i24;
                    } else {
                        iRound = i24;
                    }
                }
                iRound2 = i11;
                if (iRound2 == Integer.MIN_VALUE) {
                    if (c10 != 'Z') {
                        iRound2 = i23;
                    } else {
                        iRound2 = i23;
                    }
                }
                imageHeaderParser$ImageTypeF = c0099h.f();
                if (i23 > 0) {
                    i14 = i24;
                    i15 = i23;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(imageHeaderParser$ImageTypeF);
                    }
                } else {
                    i14 = i24;
                    i15 = i23;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Objects.toString(imageHeaderParser$ImageTypeF);
                    }
                }
                zB = this.f1890e.b(iRound, iRound2, z15, i13);
                if (zB) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z11 = false;
                    options.inMutable = false;
                } else {
                    z11 = false;
                }
                if (!zB) {
                    z12 = true;
                } else if (aVar != p232y1.a.f16010s) {
                    zHasAlpha = c0099h.f().hasAlpha();
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z12 = true;
                        options.inDither = true;
                    } else {
                        z12 = true;
                    }
                } else {
                    z12 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i16 = Build.VERSION.SDK_INT;
                if (i15 >= 0) {
                    i17 = options.inTargetDensity;
                    if (i17 > 0) {
                        z13 = z11;
                    } else {
                        z13 = z11;
                    }
                    if (z13) {
                        f10 = i17 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    float f19 = options.inSampleSize;
                    int iCeil7 = (int) Math.ceil(i15 / f19);
                    int iCeil8 = (int) Math.ceil(i14 / f19);
                    iRound = Math.round(iCeil7 * f10);
                    iRound2 = Math.round(iCeil8 * f10);
                    Log.isLoggable("Downsampler", 2);
                } else {
                    i17 = options.inTargetDensity;
                    if (i17 > 0) {
                        z13 = z11;
                    } else {
                        z13 = z11;
                    }
                    if (z13) {
                        f10 = i17 / options.inDensity;
                    } else {
                        f10 = 1.0f;
                    }
                    float f110 = options.inSampleSize;
                    int iCeil9 = (int) Math.ceil(i15 / f110);
                    int iCeil10 = (int) Math.ceil(i14 / f110);
                    iRound = Math.round(iCeil9 * f10);
                    iRound2 = Math.round(iCeil10 * f10);
                    Log.isLoggable("Downsampler", 2);
                }
                if (iRound > 0) {
                    if (i16 >= 26) {
                        if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
                        }
                    }
                    if (config3 == null) {
                        config3 = options.inPreferredConfig;
                    }
                    options.inBitmap = bVar.c(iRound, iRound2, config3);
                }
                if (iVar != null) {
                    if (i16 >= 28) {
                        if (iVar == p232y1.i.f16019s) {
                            z14 = z11;
                        } else {
                            z14 = z11;
                        }
                        if (z14) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i16 >= 26) {
                        ColorSpace.Named unused4 = ColorSpace.Named.SRGB;
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(c0099h, options, nVar, bVar);
                nVar.e(bVar, bitmapC);
                if (Log.isLoggable("Downsampler", 2)) {
                    d(bitmapC);
                    d(options.inBitmap);
                    Thread.currentThread().getName();
                    SystemClock.elapsedRealtimeNanos();
                }
                if (bitmapC == null) {
                    return null;
                }
                bitmapC.setDensity(this.f1887b.densityDpi);
                switch (iM) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        matrix = new Matrix();
                        switch (iM) {
                            case 2:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case 3:
                                matrix.setRotate(180.0f);
                                break;
                            case 4:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 5:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF3 = new RectF(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight());
                        matrix.mapRect(rectF3);
                        int iRound10 = Math.round(rectF3.width());
                        int iRound11 = Math.round(rectF3.height());
                        if (bitmapC.getConfig() != null) {
                            config2 = bitmapC.getConfig();
                        } else {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        Bitmap bitmapF3 = bVar.f(iRound10, iRound11, config2);
                        matrix.postTranslate(-rectF3.left, -rectF3.top);
                        bitmapF3.setHasAlpha(bitmapC.hasAlpha());
                        y.a(bitmapC, bitmapF3, matrix);
                        bitmap = bitmapF3;
                        break;
                    default:
                        bitmap = bitmapC;
                        break;
                }
                if (bitmapC.equals(bitmap)) {
                    return bitmap;
                }
                bVar.h(bitmapC);
                return bitmap;
        }
    }
}
