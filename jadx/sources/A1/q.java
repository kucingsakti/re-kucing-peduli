package A1;

import U.U;
import X9.C0469o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0710j0;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f165d;

    public /* synthetic */ q(int i10) {
        this.a = i10;
    }

    public static q c(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f10;
        float f11;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i10);
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
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = K.c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new q((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayH = K.b.h(resources, theme, attributeSetAsAttributeSet, H.a.f1813d);
        float f12 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayH.getFloat(8, 0.0f);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayH.getFloat(9, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayH.getFloat(10, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayH.getFloat(11, 0.0f) : 0.0f;
        float f16 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : typedArrayH.getFloat(3, 0.0f);
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayH.getFloat(4, 0.0f) : 0.0f;
        int i11 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY) != null) ? 0 : typedArrayH.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayH.getColor(0, 0) : 0;
        boolean z6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayH.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayH.getColor(1, 0) : 0;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayH.getInt(6, 0) : 0;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayH.getFloat(5, 0.0f) : 0.0f;
        typedArrayH.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f19 = f18;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f10 = f13;
            if (next2 == 1) {
                f11 = f14;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f14;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayH2 = K.b.h(resources, theme, attributeSetAsAttributeSet, H.a.f1814e);
                boolean zHasValue = typedArrayH2.hasValue(0);
                boolean zHasValue2 = typedArrayH2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayH2.getColor(0, 0);
                float f20 = typedArrayH2.getFloat(1, 0.0f);
                typedArrayH2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f20));
            }
            f13 = f10;
            f14 = f11;
        }
        o1.e eVar = arrayList2.size() > 0 ? new o1.e(arrayList2, arrayList) : null;
        if (eVar == null) {
            eVar = z6 ? new o1.e(color, color2, color3) : new o1.e(color, color3);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i12 != 1) {
                    tileMode2 = i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f12, f10, f11, f15, (int[]) eVar.f13627t, (float[]) eVar.f13628u, tileMode2);
            } else {
                radialGradient = new SweepGradient(f16, f17, (int[]) eVar.f13627t, (float[]) eVar.f13628u);
            }
        } else {
            if (f19 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i12 != 1) {
                tileMode = i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f16, f17, f19, (int[]) eVar.f13627t, (float[]) eVar.f13628u, tileMode);
        }
        return new q(radialGradient, (ColorStateList) null, 0);
    }

    public void a() {
        C0469o c0469o;
        ImageView imageView = (ImageView) this.f164c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0710j0.a(drawable);
        }
        if (drawable == null || (c0469o = (C0469o) this.f165d) == null) {
            return;
        }
        p.r.e(drawable, c0469o, imageView.getDrawableState());
    }

    public p099k4.b b() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        String str = (String) this.f164c;
        return new p099k4.b(this.f163b, ((Long) this.f165d).longValue(), str);
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f164c) == null && (colorStateList = (ColorStateList) this.f165d) != null && colorStateList.isStateful();
    }

    public void e(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f164c;
        Context context = imageView.getContext();
        int[] iArr = p069h.a.f11614f;
        Y1.c cVarE = Y1.c.E(context, attributeSet, iArr, i10);
        U.m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) cVarE.f5671u, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) cVarE.f5671u;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = p068ga.l.g(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0710j0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                p000a0.f.c(imageView, cVarE.u(2));
            }
            if (typedArray.hasValue(3)) {
                p000a0.f.d(imageView, AbstractC0710j0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            cVarE.J();
        }
    }

    public void f(int i10) {
        ImageView imageView = (ImageView) this.f164c;
        if (i10 != 0) {
            Drawable drawableG = p068ga.l.g(imageView.getContext(), i10);
            if (drawableG != null) {
                AbstractC0710j0.a(drawableG);
            }
            imageView.setImageDrawable(drawableG);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder();
                if (((X9.F) this.f164c) == X9.F.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f163b);
                sb.append(' ');
                sb.append((String) this.f165d);
                String string = sb.toString();
                p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public q(String str, int i10) {
        this.a = 3;
        this.f164c = str;
        this.f163b = i10;
    }

    public q(X9.F f10, int i10, String str) {
        this.a = 4;
        this.f164c = f10;
        this.f163b = i10;
        this.f165d = str;
    }

    public q(ImageView imageView) {
        this.a = 6;
        this.f163b = 0;
        this.f164c = imageView;
    }

    public q(Shader shader, ColorStateList colorStateList, int i10) {
        this.a = 2;
        this.f164c = shader;
        this.f165d = colorStateList;
        this.f163b = i10;
    }

    public q(s sVar) {
        this.a = 0;
        this.f165d = V1.d.a(150, new p040e1.j(this, 1));
        this.f164c = sVar;
    }
}
