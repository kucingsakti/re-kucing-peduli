package H1;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p232y1.d {
    @Override // p232y1.d
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p232y1.d
    public final int b(ByteBuffer byteBuffer, B1.g gVar) {
        AtomicReference atomicReference = U1.b.a;
        return c(new U1.a(byteBuffer), gVar);
    }

    @Override // p232y1.d
    public final int c(InputStream inputStream, B1.g gVar) throws Throwable {
        int iE;
        p137o0.g gVar2 = new p137o0.g(inputStream);
        p137o0.c cVarC = gVar2.c("Orientation");
        if (cVarC == null) {
            iE = 1;
        } else {
            try {
                iE = cVarC.e(gVar2.f13615f);
            } catch (NumberFormatException unused) {
                iE = 1;
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // p232y1.d
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
