package L1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Paint f2740A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Rect f2741B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f2742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2745v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2747x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2749z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2746w = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f2748y = -1;

    public c(b bVar) {
        this.f2742s = bVar;
    }

    public final void a() {
        U1.f.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f2745v);
        g gVar = (g) this.f2742s.f2739b;
        if (gVar.a.f15741l.f15721c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f2743t) {
            return;
        }
        this.f2743t = true;
        if (gVar.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = gVar.f2759c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !gVar.f2762f) {
            gVar.f2762f = true;
            gVar.j = false;
            gVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f2745v) {
            return;
        }
        if (this.f2749z) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f2741B == null) {
                this.f2741B = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f2741B);
            this.f2749z = false;
        }
        g gVar = (g) this.f2742s.f2739b;
        e eVar = gVar.f2765i;
        Bitmap bitmap = eVar != null ? eVar.f2757y : gVar.f2767l;
        if (this.f2741B == null) {
            this.f2741B = new Rect();
        }
        Rect rect = this.f2741B;
        if (this.f2740A == null) {
            this.f2740A = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f2740A);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2742s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((g) this.f2742s.f2739b).f2771p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((g) this.f2742s.f2739b).f2770o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f2743t;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2749z = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f2740A == null) {
            this.f2740A = new Paint(2);
        }
        this.f2740A.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f2740A == null) {
            this.f2740A = new Paint(2);
        }
        this.f2740A.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        U1.f.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f2745v);
        this.f2746w = z6;
        if (!z6) {
            this.f2743t = false;
            g gVar = (g) this.f2742s.f2739b;
            ArrayList arrayList = gVar.f2759c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f2762f = false;
            }
        } else if (this.f2744u) {
            a();
        }
        return super.setVisible(z6, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f2744u = true;
        this.f2747x = 0;
        if (this.f2746w) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f2744u = false;
        this.f2743t = false;
        g gVar = (g) this.f2742s.f2739b;
        ArrayList arrayList = gVar.f2759c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f2762f = false;
        }
    }
}
