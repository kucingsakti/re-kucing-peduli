package H1;

import A1.F;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class z implements F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1910s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f1911t;

    public /* synthetic */ z(Object obj, int i10) {
        this.f1910s = i10;
        this.f1911t = obj;
    }

    @Override // A1.F
    public final int a() {
        switch (this.f1910s) {
            case 0:
                return U1.n.c((Bitmap) this.f1911t);
            case 1:
                return ((byte[]) this.f1911t).length;
            case 2:
                return U1.n.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f1911t).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f1911t).getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    @Override // A1.F
    public final Class b() {
        switch (this.f1910s) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f1911t).getClass();
        }
    }

    @Override // A1.F
    public final void c() {
        switch (this.f1910s) {
            case 2:
                ((AnimatedImageDrawable) this.f1911t).stop();
                ((AnimatedImageDrawable) this.f1911t).clearAnimationCallbacks();
                break;
        }
    }

    @Override // A1.F
    public final Object get() {
        switch (this.f1910s) {
            case 0:
                return (Bitmap) this.f1911t;
            case 1:
                return (byte[]) this.f1911t;
            case 2:
                return (AnimatedImageDrawable) this.f1911t;
            default:
                return (File) this.f1911t;
        }
    }

    public z(byte[] bArr) {
        this.f1910s = 1;
        U1.f.c(bArr, "Argument must not be null");
        this.f1911t = bArr;
    }

    public z(File file) {
        this.f1910s = 3;
        U1.f.c(file, "Argument must not be null");
        this.f1911t = file;
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
