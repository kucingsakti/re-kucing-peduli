package H1;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0236e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f1893b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(p232y1.e.a);

    @Override // p232y1.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f1893b);
    }

    @Override // H1.AbstractC0236e
    public final Bitmap c(B1.b bVar, Bitmap bitmap, int i10, int i11) {
        return y.b(bVar, bitmap, i10, i11);
    }

    @Override // p232y1.e
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // p232y1.e
    public final int hashCode() {
        return 1572326941;
    }
}
