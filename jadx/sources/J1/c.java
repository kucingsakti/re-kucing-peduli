package J1;

import A1.B;
import A1.F;
import L1.e;
import L1.g;
import U1.f;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.l;
import o1.r;

/* JADX INFO: loaded from: classes.dex */
public final class c implements F, B {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Drawable f2357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2358t;

    public c(Drawable drawable, int i10) {
        this.f2358t = i10;
        f.c(drawable, "Argument must not be null");
        this.f2357s = drawable;
    }

    @Override // A1.F
    public final int a() {
        switch (this.f2358t) {
            case 0:
                Drawable drawable = this.f2357s;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                g gVar = (g) ((L1.c) this.f2357s).f2742s.f2739b;
                p223x1.d dVar = gVar.a;
                return (dVar.j.length * 4) + dVar.f15734d.limit() + dVar.f15739i.length + gVar.f2769n;
        }
    }

    @Override // A1.F
    public final Class b() {
        switch (this.f2358t) {
            case 0:
                return this.f2357s.getClass();
            default:
                return L1.c.class;
        }
    }

    @Override // A1.F
    public final void c() {
        B1.g gVar;
        B1.g gVar2;
        B1.g gVar3;
        switch (this.f2358t) {
            case 0:
                break;
            default:
                L1.c cVar = (L1.c) this.f2357s;
                cVar.stop();
                cVar.f2745v = true;
                g gVar4 = (g) cVar.f2742s.f2739b;
                gVar4.f2759c.clear();
                Bitmap bitmap = gVar4.f2767l;
                if (bitmap != null) {
                    gVar4.f2761e.h(bitmap);
                    gVar4.f2767l = null;
                }
                gVar4.f2762f = false;
                e eVar = gVar4.f2765i;
                l lVar = gVar4.f2760d;
                if (eVar != null) {
                    lVar.l(eVar);
                    gVar4.f2765i = null;
                }
                e eVar2 = gVar4.f2766k;
                if (eVar2 != null) {
                    lVar.l(eVar2);
                    gVar4.f2766k = null;
                }
                e eVar3 = gVar4.f2768m;
                if (eVar3 != null) {
                    lVar.l(eVar3);
                    gVar4.f2768m = null;
                }
                p223x1.d dVar = gVar4.a;
                dVar.f15741l = null;
                byte[] bArr = dVar.f15739i;
                r rVar = dVar.f15733c;
                if (bArr != null && (gVar3 = (B1.g) rVar.f13676u) != null) {
                    gVar3.h(bArr);
                }
                int[] iArr = dVar.j;
                if (iArr != null && (gVar2 = (B1.g) rVar.f13676u) != null) {
                    gVar2.h(iArr);
                }
                Bitmap bitmap2 = dVar.f15742m;
                if (bitmap2 != null) {
                    ((B1.b) rVar.f13675t).h(bitmap2);
                }
                dVar.f15742m = null;
                dVar.f15734d = null;
                dVar.f15748s = null;
                byte[] bArr2 = dVar.f15735e;
                if (bArr2 != null && (gVar = (B1.g) rVar.f13676u) != null) {
                    gVar.h(bArr2);
                }
                gVar4.j = true;
                break;
        }
    }

    @Override // A1.F
    public final Object get() {
        Drawable drawable = this.f2357s;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // A1.B
    public void initialize() {
        switch (this.f2358t) {
            case 1:
                ((g) ((L1.c) this.f2357s).f2742s.f2739b).f2767l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f2357s;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof L1.c) {
                    ((g) ((L1.c) drawable).f2742s.f2739b).f2767l.prepareToDraw();
                }
                break;
        }
    }

    private final void d() {
    }
}
