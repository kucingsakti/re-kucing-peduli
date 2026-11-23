package G1;

import H1.m;
import H1.o;
import H1.u;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import p232y1.g;
import p232y1.h;
import p232y1.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {
    public final u a = u.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p232y1.a f1685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f1686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f1688g;

    public b(int i10, int i11, h hVar) {
        this.f1683b = i10;
        this.f1684c = i11;
        this.f1685d = (p232y1.a) hVar.c(o.f1881f);
        this.f1686e = (m) hVar.c(m.f1879g);
        g gVar = o.f1884i;
        this.f1687f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f1688g = (i) hVar.c(o.f1882g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.a.b(this.f1683b, this.f1684c, this.f1687f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f1685d == p232y1.a.f16011t) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f1683b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f1684c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f1686e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f1688g;
        if (iVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.f16019s && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
