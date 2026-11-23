package H1;

import A1.F;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class A implements p232y1.j {
    public final /* synthetic */ int a;

    public /* synthetic */ A(int i10) {
        this.a = i10;
    }

    @Override // p232y1.j
    public final F a(Object obj, int i10, int i11, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                return new z((Bitmap) obj, 0);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new J1.c(drawable, 0);
                }
                return null;
            default:
                return new z((File) obj);
        }
    }

    @Override // p232y1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
