package H1;

import A1.F;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: H1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0233b implements p232y1.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p232y1.g f1861t = p232y1.g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p232y1.g f1862u = new p232y1.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, p232y1.g.f16014e);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B1.g f1863s;

    public C0233b(B1.g gVar) {
        this.f1863s = gVar;
    }

    @Override // p232y1.b
    public final boolean a(Object obj, File file, p232y1.h hVar) throws Throwable {
        boolean z6;
        Bitmap bitmap = (Bitmap) ((F) obj).get();
        p232y1.g gVar = f1862u;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(gVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i10 = U1.h.a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) hVar.c(f1861t)).intValue();
        OutputStream cVar = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    B1.g gVar2 = this.f1863s;
                    if (gVar2 != null) {
                        try {
                            cVar = new com.bumptech.glide.load.data.c(fileOutputStream, gVar2);
                        } catch (IOException unused) {
                            cVar = fileOutputStream;
                            Log.isLoggable("BitmapEncoder", 3);
                            if (cVar != null) {
                                try {
                                    cVar.close();
                                } catch (IOException unused2) {
                                }
                            }
                            z6 = false;
                        } catch (Throwable th) {
                            th = th;
                            cVar = fileOutputStream;
                            if (cVar != null) {
                                try {
                                    cVar.close();
                                } catch (IOException unused3) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        cVar = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, cVar);
                    cVar.close();
                    try {
                        cVar.close();
                    } catch (IOException unused4) {
                    }
                    z6 = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IOException unused5) {
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormat);
                U1.n.c(bitmap);
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(hVar.c(gVar));
                bitmap.hasAlpha();
            }
            return z6;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p232y1.k
    public final int r(p232y1.h hVar) {
        return 2;
    }
}
