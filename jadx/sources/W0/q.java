package W0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final PorterDuff.Mode f5307B = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Rect f5308A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o f5309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f5310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorFilter f5311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f5314y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Matrix f5315z;

    public q() {
        this.f5313x = true;
        this.f5314y = new float[9];
        this.f5315z = new Matrix();
        this.f5308A = new Rect();
        o oVar = new o();
        oVar.f5298c = null;
        oVar.f5299d = f5307B;
        oVar.f5297b = new n();
        this.f5309t = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f5261s;
        if (drawable == null) {
            return false;
        }
        M.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f5308A;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f5311v;
        if (colorFilter == null) {
            colorFilter = this.f5310u;
        }
        Matrix matrix = this.f5315z;
        canvas.getMatrix(matrix);
        float[] fArr = this.f5314y;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && M.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f5309t;
        Bitmap bitmap = oVar.f5301f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f5301f.getHeight()) {
            oVar.f5301f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f5305k = true;
        }
        if (this.f5313x) {
            o oVar2 = this.f5309t;
            if (oVar2.f5305k || oVar2.f5302g != oVar2.f5298c || oVar2.f5303h != oVar2.f5299d || oVar2.j != oVar2.f5300e || oVar2.f5304i != oVar2.f5297b.getRootAlpha()) {
                o oVar3 = this.f5309t;
                oVar3.f5301f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f5301f);
                n nVar = oVar3.f5297b;
                nVar.a(nVar.f5289g, n.f5283p, canvas2, iMin, iMin2);
                o oVar4 = this.f5309t;
                oVar4.f5302g = oVar4.f5298c;
                oVar4.f5303h = oVar4.f5299d;
                oVar4.f5304i = oVar4.f5297b.getRootAlpha();
                oVar4.j = oVar4.f5300e;
                oVar4.f5305k = false;
            }
        } else {
            o oVar5 = this.f5309t;
            oVar5.f5301f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f5301f);
            n nVar2 = oVar5.f5297b;
            nVar2.a(nVar2.f5289g, n.f5283p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f5309t;
        if (oVar6.f5297b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f5306l == null) {
                Paint paint2 = new Paint();
                oVar6.f5306l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f5306l.setAlpha(oVar6.f5297b.getRootAlpha());
            oVar6.f5306l.setColorFilter(colorFilter);
            paint = oVar6.f5306l;
        }
        canvas.drawBitmap(oVar6.f5301f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.getAlpha() : this.f5309t.f5297b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5309t.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5261s;
        return drawable != null ? M.a.c(drawable) : this.f5311v;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5261s != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f5261s.getConstantState());
        }
        this.f5309t.a = getChangingConfigurations();
        return this.f5309t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5309t.f5297b.f5291i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5309t.f5297b.f5290h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.isAutoMirrored() : this.f5309t.f5300e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.f5309t;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.f5297b;
        if (nVar.f5295n == null) {
            nVar.f5295n = Boolean.valueOf(nVar.f5289g.a());
        }
        if (nVar.f5295n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f5309t.f5298c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5312w && super.mutate() == this) {
            o oVar = this.f5309t;
            o oVar2 = new o();
            oVar2.f5298c = null;
            oVar2.f5299d = f5307B;
            if (oVar != null) {
                oVar2.a = oVar.a;
                n nVar = new n(oVar.f5297b);
                oVar2.f5297b = nVar;
                if (oVar.f5297b.f5287e != null) {
                    nVar.f5287e = new Paint(oVar.f5297b.f5287e);
                }
                if (oVar.f5297b.f5286d != null) {
                    oVar2.f5297b.f5286d = new Paint(oVar.f5297b.f5286d);
                }
                oVar2.f5298c = oVar.f5298c;
                oVar2.f5299d = oVar.f5299d;
                oVar2.f5300e = oVar.f5300e;
            }
            this.f5309t = oVar2;
            this.f5312w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f5309t;
        ColorStateList colorStateList = oVar.f5298c;
        if (colorStateList == null || (mode = oVar.f5299d) == null) {
            z6 = false;
        } else {
            this.f5310u = a(colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        n nVar = oVar.f5297b;
        if (nVar.f5295n == null) {
            nVar.f5295n = Boolean.valueOf(nVar.f5289g.a());
        }
        if (nVar.f5295n.booleanValue()) {
            boolean zB = oVar.f5297b.f5289g.b(iArr);
            oVar.f5305k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f5309t.f5297b.getRootAlpha() != i10) {
            this.f5309t.f5297b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f5309t.f5300e = z6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5311v = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            J7.j.Q(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            M.a.h(drawable, colorStateList);
            return;
        }
        o oVar = this.f5309t;
        if (oVar.f5298c != colorStateList) {
            oVar.f5298c = colorStateList;
            this.f5310u = a(colorStateList, oVar.f5299d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            M.a.i(drawable, mode);
            return;
        }
        o oVar = this.f5309t;
        if (oVar.f5299d != mode) {
            oVar.f5299d = mode;
            this.f5310u = a(oVar.f5298c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.setVisible(z6, z10) : super.setVisible(z6, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        n nVar;
        boolean z6;
        int i10;
        boolean z10;
        char c10;
        int i11;
        int i12;
        boolean z11;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            M.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f5309t;
        oVar.f5297b = new n();
        TypedArray typedArrayH = K.b.h(resources, theme, attributeSet, a.a);
        o oVar2 = this.f5309t;
        n nVar2 = oVar2.f5297b;
        int i13 = !K.b.e(xmlPullParser, "tintMode") ? -1 : typedArrayH.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i13 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i13 != 5) {
            if (i13 != 9) {
                switch (i13) {
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f5299d = mode;
        boolean z12 = false;
        int i14 = 1;
        ColorStateList colorStateListA = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayH.getValue(1, typedValue);
            int i15 = typedValue.type;
            if (i15 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i15 >= 28 && i15 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayH.getResources();
                int resourceId = typedArrayH.getResourceId(1, 0);
                ThreadLocal threadLocal = K.c.a;
                try {
                    colorStateListA = K.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            oVar2.f5298c = colorStateList;
        }
        boolean z13 = oVar2.f5300e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z13 = typedArrayH.getBoolean(5, z13);
        }
        oVar2.f5300e = z13;
        float f10 = nVar2.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayH.getFloat(7, f10);
        }
        nVar2.j = f10;
        float f11 = nVar2.f5292k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayH.getFloat(8, f11);
        }
        nVar2.f5292k = f11;
        boolean z14 = false;
        if (nVar2.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            nVar2.f5290h = typedArrayH.getDimension(3, nVar2.f5290h);
            float dimension = typedArrayH.getDimension(2, nVar2.f5291i);
            nVar2.f5291i = dimension;
            if (nVar2.f5290h <= 0.0f) {
                throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayH.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = typedArrayH.getString(0);
                if (string != null) {
                    nVar2.f5294m = string;
                    nVar2.f5296o.put(string, nVar2);
                }
                typedArrayH.recycle();
                oVar.a = getChangingConfigurations();
                oVar.f5305k = true;
                o oVar3 = this.f5309t;
                n nVar3 = oVar3.f5297b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f5289g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z15 = true;
                while (eventType != i14 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        p212w.e eVar = nVar3.f5296o;
                        nVar = nVar3;
                        if (zEquals) {
                            j jVar = new j();
                            jVar.f5263e = 0.0f;
                            jVar.f5265g = 1.0f;
                            jVar.f5266h = 1.0f;
                            i10 = depth;
                            jVar.f5267i = 0.0f;
                            jVar.j = 1.0f;
                            jVar.f5268k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.f5269l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            jVar.f5270m = join2;
                            jVar.f5271n = 4.0f;
                            TypedArray typedArrayH2 = K.b.h(resources, theme, attributeSet, a.f5241c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayH2.getString(0);
                                if (string2 != null) {
                                    jVar.f5281b = string2;
                                }
                                String string3 = typedArrayH2.getString(2);
                                if (string3 != null) {
                                    jVar.a = C3.b.k(string3);
                                }
                                jVar.f5264f = K.b.c(typedArrayH2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = jVar.f5266h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayH2.getFloat(12, f12);
                                }
                                jVar.f5266h = f12;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayH2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = jVar.f5269l;
                                if (i16 == 0) {
                                    cap = cap2;
                                } else if (i16 != 1) {
                                    cap = i16 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                jVar.f5269l = cap;
                                int i17 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayH2.getInt(9, -1) : -1;
                                Paint.Join join3 = jVar.f5270m;
                                if (i17 == 0) {
                                    join = join2;
                                } else if (i17 != 1) {
                                    join = i17 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                jVar.f5270m = join;
                                float f13 = jVar.f5271n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayH2.getFloat(10, f13);
                                }
                                jVar.f5271n = f13;
                                jVar.f5262d = K.b.c(typedArrayH2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = jVar.f5265g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayH2.getFloat(11, f14);
                                }
                                jVar.f5265g = f14;
                                float f15 = jVar.f5263e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayH2.getFloat(4, f15);
                                }
                                jVar.f5263e = f15;
                                float f16 = jVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayH2.getFloat(6, f16);
                                }
                                jVar.j = f16;
                                float f17 = jVar.f5268k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayH2.getFloat(7, f17);
                                }
                                jVar.f5268k = f17;
                                float f18 = jVar.f5267i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayH2.getFloat(5, f18);
                                }
                                jVar.f5267i = f18;
                                int i18 = jVar.f5282c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i18 = typedArrayH2.getInt(13, i18);
                                }
                                jVar.f5282c = i18;
                            }
                            typedArrayH2.recycle();
                            kVar.f5272b.add(jVar);
                            if (jVar.getPathName() != null) {
                                eVar.put(jVar.getPathName(), jVar);
                            }
                            oVar3.a = oVar3.a;
                            z11 = false;
                            i12 = 1;
                            z15 = false;
                            c10 = '\b';
                            z10 = false;
                        } else {
                            i10 = depth;
                            c10 = '\b';
                            z10 = false;
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayH3 = K.b.h(resources, theme, attributeSet, a.f5242d);
                                    String string4 = typedArrayH3.getString(0);
                                    if (string4 != null) {
                                        iVar.f5281b = string4;
                                    }
                                    String string5 = typedArrayH3.getString(1);
                                    if (string5 != null) {
                                        iVar.a = C3.b.k(string5);
                                    }
                                    iVar.f5282c = !K.b.e(xmlPullParser, "fillType") ? 0 : typedArrayH3.getInt(2, 0);
                                    typedArrayH3.recycle();
                                }
                                kVar.f5272b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    eVar.put(iVar.getPathName(), iVar);
                                }
                                oVar3.a = oVar3.a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray typedArrayH4 = K.b.h(resources, theme, attributeSet, a.f5240b);
                                float f19 = kVar2.f5273c;
                                if (K.b.e(xmlPullParser, "rotation")) {
                                    f19 = typedArrayH4.getFloat(5, f19);
                                }
                                kVar2.f5273c = f19;
                                i12 = 1;
                                kVar2.f5274d = typedArrayH4.getFloat(1, kVar2.f5274d);
                                kVar2.f5275e = typedArrayH4.getFloat(2, kVar2.f5275e);
                                float f20 = kVar2.f5276f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f20 = typedArrayH4.getFloat(3, f20);
                                }
                                kVar2.f5276f = f20;
                                float f21 = kVar2.f5277g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f21 = typedArrayH4.getFloat(4, f21);
                                }
                                kVar2.f5277g = f21;
                                float f22 = kVar2.f5278h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f22 = typedArrayH4.getFloat(6, f22);
                                }
                                kVar2.f5278h = f22;
                                float f23 = kVar2.f5279i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f23 = typedArrayH4.getFloat(7, f23);
                                }
                                kVar2.f5279i = f23;
                                z11 = false;
                                String string6 = typedArrayH4.getString(0);
                                if (string6 != null) {
                                    kVar2.f5280k = string6;
                                }
                                kVar2.c();
                                typedArrayH4.recycle();
                                kVar.f5272b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    eVar.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.a = oVar3.a;
                            }
                            z11 = false;
                            i12 = 1;
                        }
                        z6 = z11;
                        i11 = i12;
                    } else {
                        nVar = nVar3;
                        z6 = z12;
                        i10 = depth;
                        z10 = z14;
                        c10 = '\b';
                        i11 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i14 = i11;
                    z12 = z6;
                    z14 = z10;
                    nVar3 = nVar;
                    depth = i10;
                }
                if (!z15) {
                    this.f5310u = a(oVar.f5298c, oVar.f5299d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f5313x = true;
        this.f5314y = new float[9];
        this.f5315z = new Matrix();
        this.f5308A = new Rect();
        this.f5309t = oVar;
        this.f5310u = a(oVar.f5298c, oVar.f5299d);
    }
}
