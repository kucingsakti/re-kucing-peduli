package p097k;

import A1.RunnableC0094c;
import W0.c;
import W0.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParserException;
import p.I0;
import p105l.a;
import qa.b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f12617L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RunnableC0094c f12618A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f12619B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f12620C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public c f12621D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public b f12622E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f12623F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public b f12624G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public b f12625H;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f12628K;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f12629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Rect f12630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f12631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f12632v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12634x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12636z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12633w = 255;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12635y = -1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f12626I = -1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f12627J = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static e c(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray typedArrayH = K.b.h(resources2, theme, attributeSet, p105l.b.a);
        int i10 = 1;
        eVar.setVisible(typedArrayH.getBoolean(1, true), true);
        b bVar = eVar.f12624G;
        bVar.f12591d |= a.b(typedArrayH);
        int i11 = 2;
        bVar.f12596i = typedArrayH.getBoolean(2, bVar.f12596i);
        int i12 = 3;
        bVar.f12598l = typedArrayH.getBoolean(3, bVar.f12598l);
        bVar.f12611y = typedArrayH.getInt(4, bVar.f12611y);
        bVar.f12612z = typedArrayH.getInt(5, bVar.f12612z);
        boolean z6 = false;
        eVar.setDither(typedArrayH.getBoolean(0, bVar.f12609w));
        b bVar2 = eVar.f12629s;
        if (resources2 != null) {
            bVar2.f12589b = resources2;
            int i13 = resources2.getDisplayMetrics().densityDpi;
            if (i13 == 0) {
                i13 = 160;
            }
            int i14 = bVar2.f12590c;
            bVar2.f12590c = i13;
            if (i14 != i13) {
                bVar2.f12599m = false;
                bVar2.j = false;
            }
        } else {
            bVar2.getClass();
        }
        typedArrayH.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i12)) {
                break;
            }
            if (next3 == i11 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayH2 = K.b.h(resources2, theme, attributeSet, p105l.b.f12846b);
                    int resourceId = typedArrayH2.getResourceId(z6 ? 1 : 0, z6 ? 1 : 0);
                    int resourceId2 = typedArrayH2.getResourceId(i10, -1);
                    Drawable drawableF = resourceId2 > 0 ? I0.d().f(context2, resourceId2) : null;
                    typedArrayH2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i15 = z6 ? 1 : 0;
                    for (int i16 = i15 == true ? 1 : 0; i16 < attributeCount; i16++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i17 = (i15 == true ? 1 : 0) + 1;
                            if (!attributeSet.getAttributeBooleanValue(i16, z6)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i15 == true ? 1 : 0] = attributeNameResource;
                            i15 = i17;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i15 == true ? 1 : 0);
                    if (drawableF == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableF = new q();
                            drawableF.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableF = a.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableF == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.f12624G;
                    int iA = bVar3.a(drawableF);
                    bVar3.f12586H[iA] = iArrTrimStateSet;
                    bVar3.f12588J.f(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayH3 = K.b.h(resources2, theme, attributeSet, p105l.b.f12847c);
                        int resourceId3 = typedArrayH3.getResourceId(2, -1);
                        int resourceId4 = typedArrayH3.getResourceId(1, -1);
                        int resourceId5 = typedArrayH3.getResourceId(z6 ? 1 : 0, -1);
                        Drawable drawableF2 = resourceId5 > 0 ? I0.d().f(context2, resourceId5) : null;
                        boolean z10 = typedArrayH3.getBoolean(3, z6);
                        typedArrayH3.recycle();
                        if (drawableF2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableF2 = new W0.e(context2);
                                drawableF2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableF2 = a.a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableF2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        b bVar4 = eVar.f12624G;
                        int iA2 = bVar4.a(drawableF2);
                        long j = resourceId3;
                        long j10 = resourceId4;
                        long j11 = (j << 32) | j10;
                        long j12 = z10 ? 8589934592L : 0L;
                        long j13 = iA2;
                        bVar4.f12587I.a(j11, Long.valueOf(j13 | j12));
                        if (z10) {
                            bVar4.f12587I.a((j10 << 32) | j, Long.valueOf(j13 | 4294967296L | j12));
                        }
                        context2 = context;
                        resources2 = resources;
                        i10 = 1;
                        z6 = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                    }
                    i11 = 2;
                    i12 = 3;
                }
                i10 = 1;
                i11 = 2;
                i12 = 3;
            }
        }
        eVar.onStateChange(eVar.getState());
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z6) {
        boolean z10;
        Drawable drawable;
        long j;
        boolean z11 = true;
        this.f12634x = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f12631u;
        if (drawable2 != null) {
            long j10 = this.f12619B;
            if (j10 != 0) {
                if (j10 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f12633w);
                    this.f12619B = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j10 - jUptimeMillis) * 255)) / this.f12629s.f12611y)) * this.f12633w) / 255);
                    z10 = true;
                }
            }
            drawable = this.f12632v;
            if (drawable != null) {
                j = this.f12620C;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f12632v = null;
                        this.f12620C = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f12629s.f12612z) * this.f12633w) / 255);
                    }
                }
                if (z6 || !z11) {
                }
                scheduleSelf(this.f12618A, jUptimeMillis + 16);
                return;
            }
            this.f12620C = 0L;
            z11 = z10;
            if (z6) {
            }
        }
        this.f12619B = 0L;
        z10 = false;
        drawable = this.f12632v;
        if (drawable != null) {
            j = this.f12620C;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f12632v = null;
                    this.f12620C = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f12629s.f12612z) * this.f12633w) / 255);
                }
            }
            if (z6) {
            }
        }
        this.f12620C = 0L;
        z11 = z10;
        if (z6) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f12629s;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i10 = bVar.f12595h;
        Drawable[] drawableArr = bVar.f12594g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && M.a.b(drawable)) {
                M.a.a(drawableArr[i11], theme);
                bVar.f12592e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f12589b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = bVar.f12590c;
            bVar.f12590c = i12;
            if (i13 != i12) {
                bVar.f12599m = false;
                bVar.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f12629s.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f12621D == null) {
            this.f12621D = new c();
        }
        c cVar = this.f12621D;
        cVar.f5250t = drawable.getCallback();
        drawable.setCallback(cVar);
        try {
            if (this.f12629s.f12611y <= 0 && this.f12634x) {
                drawable.setAlpha(this.f12633w);
            }
            b bVar = this.f12629s;
            if (bVar.f12581C) {
                drawable.setColorFilter(bVar.f12580B);
            } else {
                if (bVar.f12584F) {
                    M.a.h(drawable, bVar.f12582D);
                }
                b bVar2 = this.f12629s;
                if (bVar2.f12585G) {
                    M.a.i(drawable, bVar2.f12583E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f12629s.f12609w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            M.b.b(drawable, M.b.a(this));
            drawable.setAutoMirrored(this.f12629s.f12579A);
            Rect rect = this.f12630t;
            if (rect != null) {
                M.a.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            c cVar2 = this.f12621D;
            Drawable.Callback callback = (Drawable.Callback) cVar2.f5250t;
            cVar2.f5250t = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f12632v;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z6;
        Drawable drawable = this.f12632v;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f12632v = null;
            z6 = true;
        } else {
            z6 = false;
        }
        Drawable drawable2 = this.f12631u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f12634x) {
                this.f12631u.setAlpha(this.f12633w);
            }
        }
        if (this.f12620C != 0) {
            this.f12620C = 0L;
            z6 = true;
        }
        if (this.f12619B != 0) {
            this.f12619B = 0L;
        } else {
            z10 = z6;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f12636z && super.mutate() == this) {
            b bVar = new b(this.f12624G, this, null);
            bVar.f12587I = bVar.f12587I.clone();
            bVar.f12588J = bVar.f12588J.clone();
            i(bVar);
            this.f12636z = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f12623F) {
            f();
            b bVar = this.f12622E;
            bVar.f12587I = bVar.f12587I.clone();
            bVar.f12588J = bVar.f12588J.clone();
            this.f12623F = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f12633w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f12629s.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z6;
        b bVar = this.f12629s;
        if (!bVar.f12607u) {
            bVar.c();
            bVar.f12607u = true;
            int i10 = bVar.f12595h;
            Drawable[] drawableArr = bVar.f12594g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    bVar.f12608v = true;
                    z6 = true;
                    break;
                }
                if (drawableArr[i11].getConstantState() == null) {
                    bVar.f12608v = false;
                    z6 = false;
                    break;
                }
                i11++;
            }
        } else {
            z6 = bVar.f12608v;
        }
        if (!z6) {
            return null;
        }
        this.f12629s.f12591d = getChangingConfigurations();
        return this.f12629s;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f12631u;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f12630t;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f12629s;
        if (bVar.f12598l) {
            if (!bVar.f12599m) {
                bVar.b();
            }
            return bVar.f12601o;
        }
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f12629s;
        if (bVar.f12598l) {
            if (!bVar.f12599m) {
                bVar.b();
            }
            return bVar.f12600n;
        }
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f12629s;
        if (bVar.f12598l) {
            if (!bVar.f12599m) {
                bVar.b();
            }
            return bVar.f12603q;
        }
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f12629s;
        if (bVar.f12598l) {
            if (!bVar.f12599m) {
                bVar.b();
            }
            return bVar.f12602p;
        }
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f12631u;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f12629s;
            if (bVar.f12604r) {
                return bVar.f12605s;
            }
            bVar.c();
            int i10 = bVar.f12595h;
            Drawable[] drawableArr = bVar.f12594g;
            opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            bVar.f12605s = opacity;
            bVar.f12604r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f12629s;
        boolean padding = false;
        Rect rect2 = null;
        if (!bVar.f12596i) {
            Rect rect3 = bVar.f12597k;
            if (rect3 != null || bVar.j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.f12595h;
                Drawable[] drawableArr = bVar.f12594g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                bVar.j = true;
                bVar.f12597k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f12631u;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f12629s.f12579A && M.b.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean h(int i10) {
        if (i10 == this.f12635y) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f12629s.f12612z > 0) {
            Drawable drawable = this.f12632v;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f12631u;
            if (drawable2 != null) {
                this.f12632v = drawable2;
                this.f12620C = ((long) this.f12629s.f12612z) + jUptimeMillis;
            } else {
                this.f12632v = null;
                this.f12620C = 0L;
            }
        } else {
            Drawable drawable3 = this.f12631u;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            b bVar = this.f12629s;
            if (i10 < bVar.f12595h) {
                Drawable drawableD = bVar.d(i10);
                this.f12631u = drawableD;
                this.f12635y = i10;
                if (drawableD != null) {
                    int i11 = this.f12629s.f12611y;
                    if (i11 > 0) {
                        this.f12619B = jUptimeMillis + ((long) i11);
                    }
                    d(drawableD);
                }
            } else {
                this.f12631u = null;
                this.f12635y = -1;
            }
        } else {
            this.f12631u = null;
            this.f12635y = -1;
        }
        if (this.f12619B != 0 || this.f12620C != 0) {
            RunnableC0094c runnableC0094c = this.f12618A;
            if (runnableC0094c == null) {
                this.f12618A = new RunnableC0094c(this, 27);
            } else {
                unscheduleSelf(runnableC0094c);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    public final void i(b bVar) {
        this.f12629s = bVar;
        int i10 = this.f12635y;
        if (i10 >= 0) {
            Drawable drawableD = bVar.d(i10);
            this.f12631u = drawableD;
            if (drawableD != null) {
                d(drawableD);
            }
        }
        this.f12632v = null;
        this.f12622E = bVar;
        this.f12624G = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f12629s;
        if (bVar != null) {
            bVar.f12604r = false;
            bVar.f12606t = false;
        }
        if (drawable != this.f12631u || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f12629s.f12579A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z6, boolean z10) {
        boolean visible = super.setVisible(z6, z10);
        Drawable drawable = this.f12632v;
        if (drawable != null) {
            drawable.setVisible(z6, z10);
        }
        Drawable drawable2 = this.f12631u;
        if (drawable2 != null) {
            drawable2.setVisible(z6, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        b bVar = this.f12625H;
        if (bVar != null) {
            bVar.D();
            this.f12625H = null;
            h(this.f12626I);
            this.f12626I = -1;
            this.f12627J = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f12628K) {
            g();
            b bVar = this.f12624G;
            bVar.f12587I = bVar.f12587I.clone();
            bVar.f12588J = bVar.f12588J.clone();
            this.f12628K = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12632v;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f12631u;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        b bVar = this.f12629s;
        int i11 = this.f12635y;
        int i12 = bVar.f12595h;
        Drawable[] drawableArr = bVar.f12594g;
        boolean z6 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean zB = M.b.b(drawable, i10);
                if (i13 == i11) {
                    z6 = zB;
                }
            }
        }
        bVar.f12610x = i10;
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f12632v;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f12631u;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iE;
        b aVar;
        b bVar = this.f12624G;
        int iF = bVar.f(iArr);
        if (iF < 0) {
            iF = bVar.f(StateSet.WILD_CARD);
        }
        int i10 = this.f12635y;
        boolean z6 = false;
        if (iF != i10) {
            b bVar2 = this.f12625H;
            if (bVar2 == null) {
                this.f12625H = null;
                this.f12627J = -1;
                this.f12626I = -1;
                b bVar3 = this.f12624G;
                int iE2 = bVar3.e(i10);
                iE = bVar3.e(iF);
                if (iE == 0 && iE2 != 0) {
                    long j = ((long) iE) | (((long) iE2) << 32);
                    int iLongValue = (int) ((Long) bVar3.f12587I.f(j)).longValue();
                    if (iLongValue >= 0) {
                        boolean z10 = (((Long) bVar3.f12587I.f(j)).longValue() & 8589934592L) != 0;
                        h(iLongValue);
                        Object obj = this.f12631u;
                        if (obj instanceof AnimationDrawable) {
                            aVar = new c((AnimationDrawable) obj, (((Long) bVar3.f12587I.f(j)).longValue() & 4294967296L) != 0, z10);
                        } else if (obj instanceof W0.e) {
                            aVar = new a((W0.e) obj, 1);
                        } else if (obj instanceof Animatable) {
                            aVar = new a((Animatable) obj, 0);
                        } else if (h(iF)) {
                            z6 = true;
                        }
                        aVar.C();
                        this.f12625H = aVar;
                        this.f12627J = i10;
                        this.f12626I = iF;
                        z6 = true;
                    } else if (h(iF)) {
                        z6 = true;
                    }
                } else if (h(iF)) {
                    z6 = true;
                }
            } else {
                if (iF != this.f12626I) {
                    if (iF == this.f12627J && bVar2.b()) {
                        bVar2.z();
                        this.f12626I = this.f12627J;
                        this.f12627J = iF;
                    } else {
                        i10 = this.f12626I;
                        bVar2.D();
                        this.f12625H = null;
                        this.f12627J = -1;
                        this.f12626I = -1;
                        b bVar4 = this.f12624G;
                        int iE3 = bVar4.e(i10);
                        iE = bVar4.e(iF);
                        if (iE == 0) {
                            if (h(iF)) {
                            }
                        } else if (h(iF)) {
                        }
                    }
                }
                z6 = true;
            }
        }
        Drawable drawable = this.f12631u;
        return drawable != null ? drawable.setState(iArr) | z6 : z6;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f12631u || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f12634x && this.f12633w == i10) {
            return;
        }
        this.f12634x = true;
        this.f12633w = i10;
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            if (this.f12619B == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        b bVar = this.f12629s;
        if (bVar.f12579A != z6) {
            bVar.f12579A = z6;
            Drawable drawable = this.f12631u;
            if (drawable != null) {
                drawable.setAutoMirrored(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f12629s;
        bVar.f12581C = true;
        if (bVar.f12580B != colorFilter) {
            bVar.f12580B = colorFilter;
            Drawable drawable = this.f12631u;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        b bVar = this.f12629s;
        if (bVar.f12609w != z6) {
            bVar.f12609w = z6;
            Drawable drawable = this.f12631u;
            if (drawable != null) {
                drawable.setDither(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            M.a.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f12630t;
        if (rect == null) {
            this.f12630t = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f12631u;
        if (drawable != null) {
            M.a.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f12629s;
        bVar.f12584F = true;
        if (bVar.f12582D != colorStateList) {
            bVar.f12582D = colorStateList;
            M.a.h(this.f12631u, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f12629s;
        bVar.f12585G = true;
        if (bVar.f12583E != mode) {
            bVar.f12583E = mode;
            M.a.i(this.f12631u, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        boolean zJ = j(z6, z10);
        b bVar = this.f12625H;
        if (bVar != null && (zJ || z10)) {
            if (z6) {
                bVar.C();
                return zJ;
            }
            jumpToCurrentState();
        }
        return zJ;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f12631u || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
