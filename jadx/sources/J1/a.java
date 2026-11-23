package J1;

import A1.F;
import B1.g;
import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p188t1.Y;
import p232y1.h;
import p232y1.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.c f2356b;

    public /* synthetic */ a(o1.c cVar, int i10) {
        this.a = i10;
        this.f2356b = cVar;
    }

    @Override // p232y1.j
    public final F a(Object obj, int i10, int i11, h hVar) {
        switch (this.a) {
            case 0:
                return o1.c.p(ImageDecoder.createSource((ByteBuffer) obj), i10, i11, hVar);
            default:
                return o1.c.p(ImageDecoder.createSource(U1.b.b((InputStream) obj)), i10, i11, hVar);
        }
    }

    @Override // p232y1.j
    public final boolean b(Object obj, h hVar) {
        switch (this.a) {
            case 0:
                return Y.o((ArrayList) this.f2356b.f13623t, (ByteBuffer) obj) == ImageHeaderParser$ImageType.ANIMATED_WEBP;
            default:
                o1.c cVar = this.f2356b;
                return Y.n((ArrayList) cVar.f13623t, (InputStream) obj, (g) cVar.f13624u) == ImageHeaderParser$ImageType.ANIMATED_WEBP;
        }
    }
}
