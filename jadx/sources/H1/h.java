package H1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0236e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f1870b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(p232y1.e.a);

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f1870b);
    }

    @Override // H1.AbstractC0236e
    public final Bitmap c(B1.b bVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Paint paint = y.a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapF = bVar.f(i10, i11, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapF.setHasAlpha(bitmap.hasAlpha());
        y.a(bitmap, bitmapF, matrix);
        return bitmapF;
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return -599754482;
    }
}
