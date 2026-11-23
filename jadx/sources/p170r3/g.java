package p170r3;

import I4.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import p086i8.C;
import p102k7.e;
import p159q3.a;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements u {
    public static final Paint P;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RectF f14486A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RectF f14487B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Region f14488C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Region f14489D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public j f14490E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Paint f14491F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Paint f14492G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final a f14493H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final e f14494I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final l f14495J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public PorterDuffColorFilter f14496K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public PorterDuffColorFilter f14497L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f14498M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final RectF f14499N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f14500O;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f14501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s[] f14502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s[] f14503u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final BitSet f14504v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Matrix f14506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Path f14507y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Path f14508z;

    static {
        Paint paint = new Paint(1);
        P = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public final void b(RectF rectF, Path path) {
        f fVar = this.f14501s;
        this.f14495J.a(fVar.a, fVar.f14478i, rectF, this.f14494I, path);
        if (this.f14501s.f14477h != 1.0f) {
            Matrix matrix = this.f14506x;
            matrix.reset();
            float f10 = this.f14501s.f14477h;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f14499N, true);
    }

    public final int c(int i10) {
        int i11;
        f fVar = this.f14501s;
        float f10 = fVar.f14481m + 0.0f + fVar.f14480l;
        p062g3.a aVar = fVar.f14471b;
        if (aVar == null || !aVar.a || L.a.d(i10, 255) != aVar.f11541d) {
            return i10;
        }
        float f11 = aVar.f11542e;
        float fMin = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iN = J7.a.n(L.a.d(i10, 255), fMin, aVar.f11539b);
        if (fMin > 0.0f && (i11 = aVar.f11540c) != 0) {
            iN = L.a.b(L.a.d(i11, p062g3.a.f11538f), iN);
        }
        return L.a.d(iN, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f14504v.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f14501s.f14483o;
        Path path = this.f14507y;
        a aVar = this.f14493H;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            s sVar = this.f14502t[i11];
            int i12 = this.f14501s.f14482n;
            Matrix matrix = s.f14545b;
            sVar.a(matrix, aVar, i12, canvas);
            this.f14503u[i11].a(matrix, aVar, this.f14501s.f14482n, canvas);
        }
        if (this.f14500O) {
            f fVar = this.f14501s;
            int iSin = (int) (Math.sin(Math.toRadians(fVar.f14484p)) * ((double) fVar.f14483o));
            f fVar2 = this.f14501s;
            int iCos = (int) (Math.cos(Math.toRadians(fVar2.f14484p)) * ((double) fVar2.f14483o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, P);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f14491F;
        paint.setColorFilter(this.f14496K);
        int alpha = paint.getAlpha();
        int i10 = this.f14501s.f14479k;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f14492G;
        paint2.setColorFilter(this.f14497L);
        paint2.setStrokeWidth(this.f14501s.j);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f14501s.f14479k;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z6 = this.f14505w;
        Path path = this.f14507y;
        if (z6) {
            float f10 = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            j jVar = this.f14501s.a;
            b bVarF = jVar.f();
            c bVar = jVar.f14513e;
            if (!(bVar instanceof h)) {
                bVar = new b(f10, bVar);
            }
            bVarF.f2072e = bVar;
            c bVar2 = jVar.f14514f;
            if (!(bVar2 instanceof h)) {
                bVar2 = new b(f10, bVar2);
            }
            bVarF.f2073f = bVar2;
            c bVar3 = jVar.f14516h;
            if (!(bVar3 instanceof h)) {
                bVar3 = new b(f10, bVar3);
            }
            bVarF.f2075h = bVar3;
            c bVar4 = jVar.f14515g;
            if (!(bVar4 instanceof h)) {
                bVar4 = new b(f10, bVar4);
            }
            bVarF.f2074g = bVar4;
            j jVarA = bVarF.a();
            this.f14490E = jVarA;
            float f11 = this.f14501s.f14478i;
            RectF rectF = this.f14487B;
            rectF.set(g());
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f14495J.a(jVarA, f11, rectF, null, this.f14508z);
            b(g(), path);
            this.f14505w = false;
        }
        f fVar = this.f14501s;
        fVar.getClass();
        if (fVar.f14482n > 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (!this.f14501s.a.e(g()) && !path.isConvex() && i12 < 29) {
                canvas.save();
                f fVar2 = this.f14501s;
                int iSin = (int) (Math.sin(Math.toRadians(fVar2.f14484p)) * ((double) fVar2.f14483o));
                f fVar3 = this.f14501s;
                canvas.translate(iSin, (int) (Math.cos(Math.toRadians(fVar3.f14484p)) * ((double) fVar3.f14483o)));
                if (this.f14500O) {
                    RectF rectF2 = this.f14499N;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f14501s.f14482n * 2) + ((int) rectF2.width()) + iWidth, (this.f14501s.f14482n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f12 = (getBounds().left - this.f14501s.f14482n) - iWidth;
                    float f13 = (getBounds().top - this.f14501s.f14482n) - iHeight;
                    canvas2.translate(-f12, -f13);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f12, f13, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar4 = this.f14501s;
        Paint.Style style = fVar4.f14485q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, fVar4.a, g());
        }
        if (i()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (!jVar.e(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = jVar.f14514f.a(rectF) * this.f14501s.f14478i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f14492G;
        Path path = this.f14508z;
        j jVar = this.f14490E;
        RectF rectF = this.f14487B;
        rectF.set(g());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, jVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f14486A;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f14501s.f14479k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f14501s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f14501s.getClass();
        if (this.f14501s.a.e(g())) {
            outline.setRoundRect(getBounds(), h() * this.f14501s.f14478i);
        } else {
            RectF rectFG = g();
            Path path = this.f14507y;
            b(rectFG, path);
            C.y(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f14501s.f14476g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f14488C;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f14507y;
        b(rectFG, path);
        Region region2 = this.f14489D;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.f14501s.a.f14513e.a(g());
    }

    public final boolean i() {
        Paint.Style style = this.f14501s.f14485q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f14492G.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f14505w = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f14501s.f14474e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f14501s.getClass();
        ColorStateList colorStateList2 = this.f14501s.f14473d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f14501s.f14472c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(Context context) {
        this.f14501s.f14471b = new p062g3.a(context);
        q();
    }

    public final void k(float f10) {
        f fVar = this.f14501s;
        if (fVar.f14481m != f10) {
            fVar.f14481m = f10;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        f fVar = this.f14501s;
        if (fVar.f14472c != colorStateList) {
            fVar.f14472c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m(float f10) {
        f fVar = this.f14501s;
        if (fVar.f14478i != f10) {
            fVar.f14478i = f10;
            this.f14505w = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f14501s = new f(this.f14501s);
        return this;
    }

    public final void n() {
        this.f14493H.a(-12303292);
        this.f14501s.getClass();
        super.invalidateSelf();
    }

    public final boolean o(int[] iArr) {
        boolean z6;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f14501s.f14472c == null || color2 == (colorForState2 = this.f14501s.f14472c.getColorForState(iArr, (color2 = (paint2 = this.f14491F).getColor())))) {
            z6 = false;
        } else {
            paint2.setColor(colorForState2);
            z6 = true;
        }
        if (this.f14501s.f14473d == null || color == (colorForState = this.f14501s.f14473d.getColorForState(iArr, (color = (paint = this.f14492G).getColor())))) {
            return z6;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f14505w = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p091j3.y
    public boolean onStateChange(int[] iArr) {
        boolean z6 = o(iArr) || p();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f14496K;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f14497L;
        f fVar = this.f14501s;
        ColorStateList colorStateList = fVar.f14474e;
        PorterDuff.Mode mode = fVar.f14475f;
        Paint paint = this.f14491F;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iC = c(color);
            this.f14498M = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.f14498M = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.f14496K = porterDuffColorFilter;
        this.f14501s.getClass();
        this.f14497L = null;
        this.f14501s.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f14496K) && Objects.equals(porterDuffColorFilter3, this.f14497L)) ? false : true;
    }

    public final void q() {
        f fVar = this.f14501s;
        float f10 = fVar.f14481m + 0.0f;
        fVar.f14482n = (int) Math.ceil(0.75f * f10);
        this.f14501s.f14483o = (int) Math.ceil(f10 * 0.25f);
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        f fVar = this.f14501s;
        if (fVar.f14479k != i10) {
            fVar.f14479k = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14501s.getClass();
        super.invalidateSelf();
    }

    @Override // p170r3.u
    public final void setShapeAppearanceModel(j jVar) {
        this.f14501s.a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f14501s.f14474e = colorStateList;
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f14501s;
        if (fVar.f14475f != mode) {
            fVar.f14475f = mode;
            p();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(j.c(context, attributeSet, i10, i11).a());
    }

    public g(j jVar) {
        this(new f(jVar));
    }

    public g(f fVar) {
        l lVar;
        this.f14502t = new s[4];
        this.f14503u = new s[4];
        this.f14504v = new BitSet(8);
        this.f14506x = new Matrix();
        this.f14507y = new Path();
        this.f14508z = new Path();
        this.f14486A = new RectF();
        this.f14487B = new RectF();
        this.f14488C = new Region();
        this.f14489D = new Region();
        Paint paint = new Paint(1);
        this.f14491F = paint;
        Paint paint2 = new Paint(1);
        this.f14492G = paint2;
        this.f14493H = new a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = k.a;
        } else {
            lVar = new l();
        }
        this.f14495J = lVar;
        this.f14499N = new RectF();
        this.f14500O = true;
        this.f14501s = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        p();
        o(getState());
        this.f14494I = new e(this);
    }
}
