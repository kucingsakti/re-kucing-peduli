package H1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.rollbar.notifier.sender.SyncSender;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p232y1.d {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName(SyncSender.UTF_8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1873b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(k kVar, B1.g gVar) {
        int iQ;
        try {
            int iQ2 = kVar.q();
            if (!((iQ2 & 65496) == 65496 || iQ2 == 19789 || iQ2 == 18761)) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (kVar.k() != 255) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    short sK = kVar.k();
                    if (sK != 218) {
                        if (sK != 217) {
                            iQ = kVar.q() - 2;
                            if (sK == 225) {
                                break;
                            }
                            long j = iQ;
                            if (kVar.f(j) != j) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        } else {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        }
                    }
                }
                iQ = -1;
                break;
            }
            if (iQ == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) gVar.d(iQ, byte[].class);
            try {
                return g(kVar, bArr, iQ);
            } finally {
                gVar.h(bArr);
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(k kVar) {
        try {
            int iQ = kVar.q();
            if (iQ == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iK = (iQ << 8) | kVar.k();
            if (iK == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iK2 = (iK << 8) | kVar.k();
            if (iK2 == -1991225785) {
                kVar.f(21L);
                try {
                    return kVar.k() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iK2 != 1380533830) {
                if (((kVar.q() << 16) | kVar.q()) == 1718909296) {
                    int iQ2 = (kVar.q() << 16) | kVar.q();
                    if (iQ2 != 1635150182 && iQ2 != 1635150195) {
                        kVar.f(4L);
                        int i10 = iK2 - 16;
                        if (i10 % 4 == 0) {
                            int i11 = 0;
                            while (i11 < 5 && i10 > 0) {
                                int iQ3 = (kVar.q() << 16) | kVar.q();
                                if (iQ3 != 1635150182 && iQ3 != 1635150195) {
                                    i11++;
                                    i10 -= 4;
                                }
                            }
                        }
                    }
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            kVar.f(4L);
            if (((kVar.q() << 16) | kVar.q()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iQ4 = (kVar.q() << 16) | kVar.q();
            if ((iQ4 & (-256)) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i12 = iQ4 & 255;
            if (i12 != 88) {
                if (i12 != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                kVar.f(4L);
                return (kVar.k() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            kVar.f(4L);
            short sK = kVar.k();
            if ((sK & 2) != 0) {
                return ImageHeaderParser$ImageType.ANIMATED_WEBP;
            }
            return (sK & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(k kVar, byte[] bArr, int i10) {
        ByteOrder byteOrder;
        if (kVar.t(i10, bArr) != i10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = a;
        boolean z6 = bArr != null && i10 > bArr2.length;
        if (z6) {
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                if (bArr[i11] != bArr2[i11]) {
                    z6 = false;
                    break;
                }
            }
        }
        if (!z6) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        short s9 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
        if (s9 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (s9 != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        byteBuffer.order(byteOrder);
        int i12 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        int i13 = i12 + 6;
        short s10 = byteBuffer.remaining() - i13 >= 2 ? byteBuffer.getShort(i13) : (short) -1;
        for (int i14 = 0; i14 < s10; i14++) {
            int i15 = (i14 * 12) + i12 + 8;
            if ((byteBuffer.remaining() - i15 >= 2 ? byteBuffer.getShort(i15) : (short) -1) == 274) {
                int i16 = i15 + 2;
                short s11 = byteBuffer.remaining() - i16 >= 2 ? byteBuffer.getShort(i16) : (short) -1;
                if (s11 < 1 || s11 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int i17 = i15 + 4;
                    int i18 = byteBuffer.remaining() - i17 >= 4 ? byteBuffer.getInt(i17) : -1;
                    if (i18 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i19 = i18 + f1873b[s11];
                        if (i19 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i20 = i15 + 8;
                            if (i20 < 0 || i20 > byteBuffer.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i19 >= 0 && i19 + i20 <= byteBuffer.remaining()) {
                                    if (byteBuffer.remaining() - i20 >= 2) {
                                        return byteBuffer.getShort(i20);
                                    }
                                    return -1;
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // p232y1.d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        U1.f.c(byteBuffer, "Argument must not be null");
        return f(new j(byteBuffer, 0));
    }

    @Override // p232y1.d
    public final int b(ByteBuffer byteBuffer, B1.g gVar) {
        j jVar = new j(byteBuffer, 0);
        U1.f.c(gVar, "Argument must not be null");
        return e(jVar, gVar);
    }

    @Override // p232y1.d
    public final int c(InputStream inputStream, B1.g gVar) {
        A1.r rVar = new A1.r(inputStream, 12);
        U1.f.c(gVar, "Argument must not be null");
        return e(rVar, gVar);
    }

    @Override // p232y1.d
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return f(new A1.r(inputStream, 12));
    }
}
