package H1;

import A1.F;
import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: H1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0236e implements p232y1.l {
    @Override // p232y1.l
    public final F a(Context context, F f10, int i10, int i11) {
        if (!U1.n.j(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        B1.b bVar = com.bumptech.glide.b.b(context).f7587s;
        Bitmap bitmap = (Bitmap) f10.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(bVar, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? f10 : C0235d.d(bVar, bitmapC);
    }

    public abstract Bitmap c(B1.b bVar, Bitmap bitmap, int i10, int i11);
}
