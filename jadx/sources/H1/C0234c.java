package H1;

import A1.F;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: renamed from: H1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0234c implements p232y1.j {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B1.b f1864b;

    public C0234c() {
        this.a = 0;
        this.f1864b = new p230x9.d(1);
    }

    @Override // p232y1.j
    public final F a(Object obj, int i10, int i11, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                return c(C0.m.f(obj), i10, i11, hVar);
            default:
                return C0235d.d(this.f1864b, ((p223x1.d) obj).b());
        }
    }

    @Override // p232y1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                C0.m.w(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public C0235d c(ImageDecoder.Source source, int i10, int i11, p232y1.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new G1.b(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C0235d((p230x9.d) this.f1864b, bitmapDecodeBitmap);
    }

    public C0234c(B1.b bVar) {
        this.a = 1;
        this.f1864b = bVar;
    }
}
