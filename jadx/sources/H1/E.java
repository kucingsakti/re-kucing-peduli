package H1;

import A1.F;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E implements p232y1.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p232y1.g f1853d = new p232y1.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new j());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p232y1.g f1854e = new p232y1.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new A1.r(13));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p170r3.e f1855f = new p170r3.e(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f1856g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final C a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B1.b f1857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p170r3.e f1858c = f1855f;

    public E(B1.b bVar, C c10) {
        this.f1857b = bVar;
        this.a = c10;
    }

    public static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j, int i10, int i11, int i12, m mVar) {
        int i13;
        Bitmap bitmapCreateBitmap = null;
        if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && mVar != m.f1877e) {
            try {
                int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (i16 == 90 || i16 == 270) {
                    i15 = i14;
                    i14 = i15;
                }
                float fB = mVar.b(i14, i15, i11, i12);
                bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i10, Math.round(i14 * fB), Math.round(fB * i15));
            } catch (Throwable unused) {
                Log.isLoggable("VideoDecoder", 3);
            }
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j, i10);
        }
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            Iterator it = f1856g.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith((String) it.next()));
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
            i13 = Integer.parseInt(strExtractMetadata);
            int i17 = Integer.parseInt(strExtractMetadata2);
            if (i13 != 7) {
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
            } else {
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
            }
        } else {
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 30 && i18 < 33) {
                try {
                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                    i13 = Integer.parseInt(strExtractMetadata3);
                    int i19 = Integer.parseInt(strExtractMetadata4);
                    if ((i13 != 7 || i13 == 6) && i19 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        Log.isLoggable("VideoDecoder", 3);
                        Matrix matrix3 = new Matrix();
                        matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                    }
                } catch (NumberFormatException unused2) {
                    Log.isLoggable("VideoDecoder", 3);
                }
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new D("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }

    @Override // p232y1.j
    public final F a(Object obj, int i10, int i11, p232y1.h hVar) throws IOException {
        long jLongValue = ((Long) hVar.c(f1853d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) hVar.c(f1854e);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) hVar.c(m.f1879g);
        if (mVar == null) {
            mVar = m.f1878f;
        }
        m mVar2 = mVar;
        this.f1858c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.c(mediaMetadataRetriever, obj);
            return C0235d.d(this.f1857b, c(mediaMetadataRetriever, jLongValue, num.intValue(), i10, i11, mVar2));
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            }
            mediaMetadataRetriever.release();
        }
    }

    @Override // p232y1.j
    public final boolean b(Object obj, p232y1.h hVar) {
        return true;
    }
}
