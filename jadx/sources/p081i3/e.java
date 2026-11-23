package p081i3;

import R2.a;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f12216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f12217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f12218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f12219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f12220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f12221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Matrix f12222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f12223i;

    public e(i iVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
        this.f12223i = iVar;
        this.a = f10;
        this.f12216b = f11;
        this.f12217c = f12;
        this.f12218d = f13;
        this.f12219e = f14;
        this.f12220f = f15;
        this.f12221g = f16;
        this.f12222h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        i iVar = this.f12223i;
        iVar.f12256s.setAlpha(a.b(this.a, this.f12216b, 0.0f, 0.2f, fFloatValue));
        FloatingActionButton floatingActionButton = iVar.f12256s;
        float f10 = this.f12217c;
        float f11 = this.f12218d;
        floatingActionButton.setScaleX(a.a(f10, f11, fFloatValue));
        iVar.f12256s.setScaleY(a.a(this.f12219e, f11, fFloatValue));
        float f12 = this.f12220f;
        float f13 = this.f12221g;
        iVar.f12253p = a.a(f12, f13, fFloatValue);
        float fA = a.a(f12, f13, fFloatValue);
        Matrix matrix = this.f12222h;
        iVar.a(fA, matrix);
        iVar.f12256s.setImageMatrix(matrix);
    }
}
