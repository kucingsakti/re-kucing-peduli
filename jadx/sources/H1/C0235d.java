package H1;

import A1.F;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: H1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0235d implements F, A1.B {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1865s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f1866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f1867u;

    public C0235d(B1.b bVar, Bitmap bitmap) {
        U1.f.c(bitmap, "Bitmap must not be null");
        this.f1866t = bitmap;
        U1.f.c(bVar, "BitmapPool must not be null");
        this.f1867u = bVar;
    }

    public static C0235d d(B1.b bVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C0235d(bVar, bitmap);
    }

    @Override // A1.F
    public final int a() {
        switch (this.f1865s) {
            case 0:
                return U1.n.c((Bitmap) this.f1866t);
            default:
                return ((F) this.f1867u).a();
        }
    }

    @Override // A1.F
    public final Class b() {
        switch (this.f1865s) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // A1.F
    public final void c() {
        switch (this.f1865s) {
            case 0:
                ((B1.b) this.f1867u).h((Bitmap) this.f1866t);
                break;
            default:
                ((F) this.f1867u).c();
                break;
        }
    }

    @Override // A1.F
    public final Object get() {
        switch (this.f1865s) {
            case 0:
                return (Bitmap) this.f1866t;
            default:
                return new BitmapDrawable((Resources) this.f1866t, (Bitmap) ((F) this.f1867u).get());
        }
    }

    @Override // A1.B
    public final void initialize() {
        switch (this.f1865s) {
            case 0:
                ((Bitmap) this.f1866t).prepareToDraw();
                break;
            default:
                F f10 = (F) this.f1867u;
                if (f10 instanceof A1.B) {
                    ((A1.B) f10).initialize();
                }
                break;
        }
    }

    public C0235d(Resources resources, F f10) {
        U1.f.c(resources, "Argument must not be null");
        this.f1866t = resources;
        U1.f.c(f10, "Argument must not be null");
        this.f1867u = f10;
    }
}
