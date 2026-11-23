package p129n3;

import R2.a;
import V0.C0447b;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends Drawable implements Animatable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0447b f13349C = new C0447b(Float.class, "growFraction", 7);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f13351B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f13352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f13353t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObjectAnimator f13355v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ObjectAnimator f13356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f13357x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13358y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f13359z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Paint f13350A = new Paint();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f13354u = new a();

    public h(Context context, p pVar) {
        this.f13352s = context;
        this.f13353t = pVar;
        setAlpha(255);
    }

    public final float b() {
        p pVar = this.f13353t;
        if (pVar.f13392e == 0 && pVar.f13393f == 0) {
            return 1.0f;
        }
        return this.f13359z;
    }

    public final boolean c(boolean z6, boolean z10, boolean z11) {
        a aVar = this.f13354u;
        ContentResolver contentResolver = this.f13352s.getContentResolver();
        aVar.getClass();
        return d(z6, z10, z11 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z6, boolean z10, boolean z11) {
        int i10 = 1;
        int i11 = 0;
        ObjectAnimator objectAnimator = this.f13355v;
        C0447b c0447b = f13349C;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c0447b, 0.0f, 1.0f);
            this.f13355v = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f13355v.setInterpolator(a.f4441b);
            ObjectAnimator objectAnimator2 = this.f13355v;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f13355v = objectAnimator2;
            objectAnimator2.addListener(new g(this, i11));
        }
        if (this.f13356w == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c0447b, 1.0f, 0.0f);
            this.f13356w = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f13356w.setInterpolator(a.f4441b);
            ObjectAnimator objectAnimator3 = this.f13356w;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f13356w = objectAnimator3;
            objectAnimator3.addListener(new g(this, i10));
        }
        if (isVisible() || z6) {
            ObjectAnimator objectAnimator4 = z6 ? this.f13355v : this.f13356w;
            ObjectAnimator objectAnimator5 = z6 ? this.f13356w : this.f13355v;
            if (!z11) {
                if (objectAnimator5.isRunning()) {
                    boolean z12 = this.f13358y;
                    this.f13358y = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f13358y = z12;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z13 = this.f13358y;
                    this.f13358y = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f13358y = z13;
                }
                return super.setVisible(z6, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z14 = !z6 || super.setVisible(z6, false);
                p pVar = this.f13353t;
                if (!z6 ? pVar.f13393f != 0 : pVar.f13392e != 0) {
                    boolean z15 = this.f13358y;
                    this.f13358y = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f13358y = z15;
                    return z14;
                }
                if (z10 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z14;
                }
                objectAnimator4.resume();
                return z14;
            }
        }
        return false;
    }

    public final void e(c cVar) {
        ArrayList arrayList = this.f13357x;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return;
        }
        this.f13357x.remove(cVar);
        if (this.f13357x.isEmpty()) {
            this.f13357x = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f13351B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f13355v;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f13356w;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f13351B = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13350A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        return c(z6, z10, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
