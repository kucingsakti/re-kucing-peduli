package p129n3;

import B6.b;
import V0.C0447b;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o extends b {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f13378C = {533, 567, 850, 750};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f13379D = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0447b f13380E = new C0447b(Float.class, "animationFraction", 9);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f13381A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public c f13382B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ObjectAnimator f13383u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ObjectAnimator f13384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Interpolator[] f13385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f13386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13387y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13388z;

    public o(Context context, p pVar) {
        super(2);
        this.f13387y = 0;
        this.f13382B = null;
        this.f13386x = pVar;
        this.f13385w = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // B6.b
    public final void c() {
        ObjectAnimator objectAnimator = this.f13383u;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // B6.b
    public final void m() {
        v();
    }

    @Override // B6.b
    public final void o(c cVar) {
        this.f13382B = cVar;
    }

    @Override // B6.b
    public final void r() {
        ObjectAnimator objectAnimator = this.f13384v;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        c();
        if (((k) this.f725s).isVisible()) {
            this.f13384v.setFloatValues(this.f13381A, 1.0f);
            this.f13384v.setDuration((long) ((1.0f - this.f13381A) * 1800.0f));
            this.f13384v.start();
        }
    }

    @Override // B6.b
    public final void t() {
        ObjectAnimator objectAnimator = this.f13383u;
        C0447b c0447b = f13380E;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c0447b, 0.0f, 1.0f);
            this.f13383u = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f13383u.setInterpolator(null);
            this.f13383u.setRepeatCount(-1);
            this.f13383u.addListener(new n(this, 0));
        }
        if (this.f13384v == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c0447b, 1.0f);
            this.f13384v = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f13384v.setInterpolator(null);
            this.f13384v.addListener(new n(this, 1));
        }
        v();
        this.f13383u.start();
    }

    @Override // B6.b
    public final void u() {
        this.f13382B = null;
    }

    public final void v() {
        this.f13387y = 0;
        Iterator it = ((ArrayList) this.f726t).iterator();
        while (it.hasNext()) {
            ((i) it.next()).f13361c = this.f13386x.f13390c[0];
        }
    }
}
