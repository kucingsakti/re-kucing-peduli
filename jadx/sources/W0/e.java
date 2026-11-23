package W0;

import B4.L;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f5254y = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Context f5256u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public L f5257v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f5258w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f5259x = new c(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f5255t = new d();

    public e(Context context) {
        this.f5256u = context;
    }

    @Override // W0.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            M.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            return M.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f5255t;
        dVar.a.draw(canvas);
        if (dVar.f5251b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.getAlpha() : this.f5255t.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f5255t.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f5261s;
        return drawable != null ? M.a.c(drawable) : this.f5255t.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5261s == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new L1.b(this.f5261s.getConstantState(), 1);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f5255t.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f5255t.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.getOpacity() : this.f5255t.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        d dVar;
        Animator animatorA;
        q qVar;
        int next;
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            M.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f5255t;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayH = K.b.h(resources, theme, attributeSet, a.f5243e);
                    int resourceId = typedArrayH.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = q.f5307B;
                        if (Build.VERSION.SDK_INT >= 24) {
                            qVar = new q();
                            ThreadLocal threadLocal = K.o.a;
                            qVar.f5261s = K.i.a(resources, resourceId, theme);
                            new p(qVar.f5261s.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                qVar = new q();
                                qVar.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException | XmlPullParserException unused) {
                                qVar = null;
                            }
                        }
                        qVar.f5313x = false;
                        qVar.setCallback(this.f5259x);
                        q qVar2 = dVar.a;
                        if (qVar2 != null) {
                            qVar2.setCallback(null);
                        }
                        dVar.a = qVar;
                    }
                    typedArrayH.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f5244f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5256u;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorA = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorA = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e10) {
                                        e = e10;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e11) {
                                        e = e11;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != null) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (IOException e12) {
                                e = e12;
                            } catch (XmlPullParserException e13) {
                                e = e13;
                            }
                        }
                        animatorA.setTarget(dVar.a.f5309t.f5297b.f5296o.get(string));
                        if (dVar.f5252c == null) {
                            dVar.f5252c = new ArrayList();
                            dVar.f5253d = new p212w.e(0);
                        }
                        dVar.f5252c.add(animatorA);
                        dVar.f5253d.put(animatorA, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f5251b == null) {
            dVar.f5251b = new AnimatorSet();
        }
        dVar.f5251b.playTogether(dVar.f5252c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.isAutoMirrored() : this.f5255t.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f5261s;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f5255t.f5251b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.isStateful() : this.f5255t.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5255t.a.setBounds(rect);
        }
    }

    @Override // W0.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.setLevel(i10) : this.f5255t.a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5261s;
        return drawable != null ? drawable.setState(iArr) : this.f5255t.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f5255t.a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f5255t.a.setAutoMirrored(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5255t.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            J7.j.Q(drawable, i10);
        } else {
            this.f5255t.a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            M.a.h(drawable, colorStateList);
        } else {
            this.f5255t.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            M.a.i(drawable, mode);
        } else {
            this.f5255t.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            return drawable.setVisible(z6, z10);
        }
        this.f5255t.a.setVisible(z6, z10);
        return super.setVisible(z6, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f5255t;
        if (dVar.f5251b.isStarted()) {
            return;
        }
        dVar.f5251b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f5261s;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5255t.f5251b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
