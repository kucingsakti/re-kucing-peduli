package p170r3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f14536h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f14541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14542g;

    public p(float f10, float f11, float f12, float f13) {
        this.f14537b = f10;
        this.f14538c = f11;
        this.f14539d = f12;
        this.f14540e = f13;
    }

    @Override // p170r3.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f14536h;
        rectF.set(this.f14537b, this.f14538c, this.f14539d, this.f14540e);
        path.arcTo(rectF, this.f14541f, this.f14542g, false);
        path.transform(matrix);
    }
}
