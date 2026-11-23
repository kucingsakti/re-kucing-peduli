package R1;

import U1.f;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.kcstream.cing.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f4434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f4435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Animatable f4436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4437v;

    public a(ImageView imageView, int i10) {
        this.f4437v = i10;
        f.c(imageView, "Argument must not be null");
        this.f4434s = imageView;
        this.f4435t = new d(imageView);
    }

    @Override // R1.c
    public final void a(Q1.f fVar) {
        this.f4435t.f4439b.remove(fVar);
    }

    @Override // R1.c
    public final void b(Drawable drawable) {
        l(null);
        this.f4436u = null;
        this.f4434s.setImageDrawable(drawable);
    }

    @Override // N1.i
    public final void c() {
        Animatable animatable = this.f4436u;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // R1.c
    public final void d(Q1.f fVar) {
        d dVar = this.f4435t;
        ImageView imageView = dVar.a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = dVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = dVar.a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iA2 = dVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            fVar.j(iA, iA2);
            return;
        }
        ArrayList arrayList = dVar.f4439b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (dVar.f4440c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            G.f fVar2 = new G.f(dVar);
            dVar.f4440c = fVar2;
            viewTreeObserver.addOnPreDrawListener(fVar2);
        }
    }

    @Override // N1.i
    public final void e() {
        Animatable animatable = this.f4436u;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // R1.c
    public final void f(Q1.c cVar) {
        this.f4434s.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // R1.c
    public final void g(Object obj, S1.c cVar) {
        if (cVar != null && cVar.a(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.f4436u = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.f4436u = animatable;
            animatable.start();
            return;
        }
        l(obj);
        if (!(obj instanceof Animatable)) {
            this.f4436u = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.f4436u = animatable2;
        animatable2.start();
    }

    @Override // R1.c
    public final void h(Drawable drawable) {
        l(null);
        this.f4436u = null;
        this.f4434s.setImageDrawable(drawable);
    }

    @Override // R1.c
    public final Q1.c i() {
        Object tag = this.f4434s.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Q1.c) {
            return (Q1.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // R1.c
    public final void j(Drawable drawable) {
        d dVar = this.f4435t;
        ViewTreeObserver viewTreeObserver = dVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(dVar.f4440c);
        }
        dVar.f4440c = null;
        dVar.f4439b.clear();
        Animatable animatable = this.f4436u;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.f4436u = null;
        this.f4434s.setImageDrawable(drawable);
    }

    public final void l(Object obj) {
        switch (this.f4437v) {
            case 0:
                this.f4434s.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f4434s.setImageDrawable((Drawable) obj);
                break;
        }
    }

    public final String toString() {
        return "Target for: " + this.f4434s;
    }

    @Override // N1.i
    public final void k() {
    }
}
