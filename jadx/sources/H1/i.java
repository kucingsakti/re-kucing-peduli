package H1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0236e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f1871b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(p232y1.e.a);

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f1871b);
    }

    @Override // H1.AbstractC0236e
    public final Bitmap c(B1.b bVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = y.a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            Log.isLoggable("TransformationUtils", 2);
            return y.b(bVar, bitmap, i10, i11);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return -670243078;
    }
}
