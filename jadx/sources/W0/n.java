package W0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f5283p = new Matrix();
    public final Path a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f5284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f5285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f5286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f5287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f5288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f5289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5291i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f5292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f5294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f5295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p212w.e f5296o;

    public n() {
        this.f5285c = new Matrix();
        this.f5290h = 0.0f;
        this.f5291i = 0.0f;
        this.j = 0.0f;
        this.f5292k = 0.0f;
        this.f5293l = 255;
        this.f5294m = null;
        this.f5295n = null;
        this.f5296o = new p212w.e(0);
        this.f5289g = new k();
        this.a = new Path();
        this.f5284b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        char c10;
        float f10;
        int i12;
        k kVar2 = kVar;
        char c11 = 1;
        kVar2.a.set(matrix);
        Matrix matrix2 = kVar2.j;
        Matrix matrix3 = kVar2.a;
        matrix3.preConcat(matrix2);
        canvas.save();
        char c12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = kVar2.f5272b;
            if (i13 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            l lVar = (l) arrayList.get(i13);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i10, i11);
            } else {
                if (lVar instanceof m) {
                    m mVar = (m) lVar;
                    float f11 = i10 / this.j;
                    float f12 = i11 / this.f5292k;
                    float fMin = Math.min(f11, f12);
                    Matrix matrix4 = this.f5285c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f11, f12);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c12], fArr[c11]);
                    boolean z6 = c11;
                    boolean z10 = c12;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f13 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[z6 ? 1 : 0] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f13) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        mVar.getClass();
                        Path path = this.a;
                        path.reset();
                        L.f[] fVarArr = mVar.a;
                        if (fVarArr != null) {
                            L.f.b(fVarArr, path);
                        }
                        Path path2 = this.f5284b;
                        path2.reset();
                        if (mVar instanceof i) {
                            path2.setFillType(mVar.f5282c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            j jVar = (j) mVar;
                            float f14 = jVar.f5267i;
                            if (f14 != 0.0f || jVar.j != 1.0f) {
                                float f15 = jVar.f5268k;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (jVar.j + f15) % 1.0f;
                                if (this.f5288f == null) {
                                    this.f5288f = new PathMeasure();
                                }
                                this.f5288f.setPath(path, z10);
                                float length = this.f5288f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path.reset();
                                if (f18 > f19) {
                                    this.f5288f.getSegment(f18, length, path, z6);
                                    f10 = 0.0f;
                                    this.f5288f.getSegment(0.0f, f19, path, z6);
                                } else {
                                    f10 = 0.0f;
                                    this.f5288f.getSegment(f18, f19, path, z6);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix4);
                            A1.q qVar = jVar.f5264f;
                            float f20 = 255.0f;
                            if ((((Shader) qVar.f164c) == null && qVar.f163b == 0) ? false : true) {
                                if (this.f5287e == null) {
                                    i12 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f5287e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i12 = 16777215;
                                }
                                Paint paint2 = this.f5287e;
                                Shader shader = (Shader) qVar.f164c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(jVar.f5266h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = qVar.f163b;
                                    float f21 = jVar.f5266h;
                                    PorterDuff.Mode mode = q.f5307B;
                                    paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(jVar.f5282c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f20 = 255.0f;
                                i12 = 16777215;
                            }
                            A1.q qVar2 = jVar.f5262d;
                            if (((Shader) qVar2.f164c) != null || qVar2.f163b != 0) {
                                if (this.f5286d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f5286d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f5286d;
                                Paint.Join join = jVar.f5270m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = jVar.f5269l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(jVar.f5271n);
                                Shader shader2 = (Shader) qVar2.f164c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(jVar.f5265g * f20));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = qVar2.f163b;
                                    float f22 = jVar.f5265g;
                                    PorterDuff.Mode mode2 = q.f5307B;
                                    paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(jVar.f5263e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    c10 = 1;
                }
                i13++;
                kVar2 = kVar;
                c11 = c10;
                c12 = 0;
            }
            c10 = c11;
            i13++;
            kVar2 = kVar;
            c11 = c10;
            c12 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f5293l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f5293l = i10;
    }

    public n(n nVar) {
        this.f5285c = new Matrix();
        this.f5290h = 0.0f;
        this.f5291i = 0.0f;
        this.j = 0.0f;
        this.f5292k = 0.0f;
        this.f5293l = 255;
        this.f5294m = null;
        this.f5295n = null;
        p212w.e eVar = new p212w.e(0);
        this.f5296o = eVar;
        this.f5289g = new k(nVar.f5289g, eVar);
        this.a = new Path(nVar.a);
        this.f5284b = new Path(nVar.f5284b);
        this.f5290h = nVar.f5290h;
        this.f5291i = nVar.f5291i;
        this.j = nVar.j;
        this.f5292k = nVar.f5292k;
        this.f5293l = nVar.f5293l;
        this.f5294m = nVar.f5294m;
        String str = nVar.f5294m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f5295n = nVar.f5295n;
    }
}
