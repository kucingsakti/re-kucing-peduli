package H1;

import A1.F;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p232y1.j {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0234c f1869b;

    public g(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.f1869b = new C0234c();
                break;
            default:
                this.f1869b = new C0234c();
                break;
        }
    }

    @Override // p232y1.j
    public final F a(Object obj, int i10, int i11, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                return this.f1869b.c(ImageDecoder.createSource((ByteBuffer) obj), i10, i11, hVar);
            default:
                return this.f1869b.c(ImageDecoder.createSource(U1.b.b((InputStream) obj)), i10, i11, hVar);
        }
    }

    @Override // p232y1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
