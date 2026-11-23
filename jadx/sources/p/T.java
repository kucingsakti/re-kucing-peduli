package p;

import X9.C0469o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class T {
    public final TextView a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0469o f13982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0469o f13983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0469o f13984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0469o f13985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0469o f13986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0469o f13987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0469o f13988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0696c0 f13989i;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13990k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f13991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13992m;

    public T(TextView textView) {
        this.a = textView;
        this.f13989i = new C0696c0(textView);
    }

    public static C0469o c(Context context, r rVar, int i10) {
        ColorStateList colorStateListI;
        synchronized (rVar) {
            colorStateListI = rVar.a.i(context, i10);
        }
        if (colorStateListI == null) {
            return null;
        }
        C0469o c0469o = new C0469o();
        c0469o.f5618b = true;
        c0469o.f5619c = colorStateListI;
        return c0469o;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i10 >= 30) {
            Z.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i10 >= 30) {
            Z.b.a(editorInfo, text);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 : i11;
        if (i11 <= i12) {
            i11 = i12;
        }
        int length = text.length();
        if (i13 < 0 || i11 > length) {
            Z.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i14 = editorInfo.inputType & 4095;
        if (i14 == 129 || i14 == 225 || i14 == 18) {
            Z.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            Z.c.a(editorInfo, text, i13, i11);
            return;
        }
        int i15 = i11 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(text.length() - i11, i17 - Math.min(i13, (int) (((double) i17) * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i18))) {
            i18++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i11 + iMin) - 1))) {
            iMin--;
        }
        int i19 = iMin2 + i16;
        Z.c.a(editorInfo, i16 != i15 ? TextUtils.concat(text.subSequence(i18, i18 + iMin2), text.subSequence(i11, iMin + i11)) : text.subSequence(i18, i19 + iMin + i18), iMin2, i19);
    }

    public final void a(Drawable drawable, C0469o c0469o) {
        if (drawable == null || c0469o == null) {
            return;
        }
        r.e(drawable, c0469o, this.a.getDrawableState());
    }

    public final void b() {
        C0469o c0469o = this.f13982b;
        TextView textView = this.a;
        if (c0469o != null || this.f13983c != null || this.f13984d != null || this.f13985e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f13982b);
            a(compoundDrawables[1], this.f13983c);
            a(compoundDrawables[2], this.f13984d);
            a(compoundDrawables[3], this.f13985e);
        }
        if (this.f13986f == null && this.f13987g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f13986f);
        a(compoundDrawablesRelative[2], this.f13987g);
    }

    public final ColorStateList d() {
        C0469o c0469o = this.f13988h;
        if (c0469o != null) {
            return (ColorStateList) c0469o.f5619c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C0469o c0469o = this.f13988h;
        if (c0469o != null) {
            return (PorterDuff.Mode) c0469o.f5620d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:241:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:243:0x03de  */
    /* JADX WARN: Code duplicated, block: B:246:0x03e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:251:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:253:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z6;
        boolean z10;
        String string;
        String string2;
        int i11;
        float dimensionPixelSize;
        int i12;
        ColorStateList colorStateList;
        int resourceId;
        int i13;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        r rVarA = r.a();
        int[] iArr = p069h.a.f11616h;
        Y1.c cVarE = Y1.c.E(context, attributeSet, iArr, i10);
        U.U.m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) cVarE.f5671u, i10);
        TypedArray typedArray = (TypedArray) cVarE.f5671u;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f13982b = c(context, rVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f13983c = c(context, rVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f13984d = c(context, rVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f13985e = c(context, rVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f13986f = c(context, rVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f13987g = c(context, rVarA, typedArray.getResourceId(6, 0));
        }
        cVarE.J();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = p069h.a.f11631x;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            Y1.c cVar = new Y1.c(context, typedArrayObtainStyledAttributes);
            if (z11 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z6 = false;
                z10 = false;
            } else {
                z10 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z6 = true;
            }
            n(context, cVar);
            int i14 = Build.VERSION.SDK_INT;
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i14 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            cVar.J();
        } else {
            z6 = false;
            z10 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        Y1.c cVar2 = new Y1.c(context, typedArrayObtainStyledAttributes2);
        if (!z11 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z10 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z6 = true;
        }
        boolean z12 = z10;
        int i15 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        String str = string2;
        if (i15 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i15 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, cVar2);
        cVar2.J();
        if (!z11 && z6) {
            textView.setAllCaps(z12);
        }
        Typeface typeface = this.f13991l;
        if (typeface != null) {
            if (this.f13990k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            Q.d(textView, string);
        }
        if (str != null) {
            if (i15 >= 24) {
                P.b(textView, P.a(str));
            } else {
                textView.setTextLocale(O.a(str.split(",")[0]));
            }
        }
        int[] iArr3 = p069h.a.f11617i;
        C0696c0 c0696c0 = this.f13989i;
        Context context2 = c0696c0.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = c0696c0.f14055i;
        U.U.m(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i10);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0696c0.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i16 = 0; i16 < length; i16++) {
                    iArr4[i16] = typedArrayObtainTypedArray.getDimensionPixelSize(i16, -1);
                }
                c0696c0.f14052f = C0696c0.b(iArr4);
                c0696c0.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0696c0.j()) {
            c0696c0.a = 0;
        } else if (c0696c0.a == 1) {
            if (!c0696c0.f14053g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                float f10 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0696c0.k(dimension2, f10, dimension);
            }
            c0696c0.h();
        }
        if (f1.f14061c && c0696c0.a != 0) {
            int[] iArr5 = c0696c0.f14052f;
            if (iArr5.length > 0) {
                if (Q.a(textView) != -1.0f) {
                    Q.b(textView, Math.round(c0696c0.f14050d), Math.round(c0696c0.f14051e), Math.round(c0696c0.f14049c), 0);
                } else {
                    Q.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? rVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? rVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? rVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? rVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? rVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? rVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = J.f.c(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                p000a0.l.f(textView, colorStateList);
            } else if (textView instanceof p000a0.s) {
                ((p000a0.s) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeC = AbstractC0710j0.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                p000a0.l.g(textView, modeC);
            } else if (textView instanceof p000a0.s) {
                ((p000a0.s) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i11 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i17 = typedValuePeekValue.data;
                i12 = i17 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i17);
                i11 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i11) {
                J7.j.I(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i11) {
                J7.j.N(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i12 == i11) {
                    J7.j.O(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    p000a0.o.a(textView, i12, dimensionPixelSize);
                } else {
                    J7.j.O(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i11 = -1;
        dimensionPixelSize = -1.0f;
        i12 = i11;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i11) {
            J7.j.I(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i11) {
            J7.j.N(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i12 == i11) {
                J7.j.O(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                p000a0.o.a(textView, i12, dimensionPixelSize);
            } else {
                J7.j.O(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p069h.a.f11631x);
        Y1.c cVar = new Y1.c(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, cVar);
        if (i11 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            Q.d(textView, string);
        }
        cVar.J();
        Typeface typeface = this.f13991l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        C0696c0 c0696c0 = this.f13989i;
        if (c0696c0.j()) {
            DisplayMetrics displayMetrics = c0696c0.j.getResources().getDisplayMetrics();
            c0696c0.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (c0696c0.h()) {
                c0696c0.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        C0696c0 c0696c0 = this.f13989i;
        if (c0696c0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0696c0.j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                c0696c0.f14052f = C0696c0.b(iArrCopyOf);
                if (!c0696c0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0696c0.f14053g = false;
            }
            if (c0696c0.h()) {
                c0696c0.a();
            }
        }
    }

    public final void k(int i10) {
        C0696c0 c0696c0 = this.f13989i;
        if (c0696c0.j()) {
            if (i10 == 0) {
                c0696c0.a = 0;
                c0696c0.f14050d = -1.0f;
                c0696c0.f14051e = -1.0f;
                c0696c0.f14049c = -1.0f;
                c0696c0.f14052f = new int[0];
                c0696c0.f14048b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(AbstractC0487g.g(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c0696c0.j.getResources().getDisplayMetrics();
            c0696c0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0696c0.h()) {
                c0696c0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f13988h == null) {
            this.f13988h = new C0469o();
        }
        C0469o c0469o = this.f13988h;
        c0469o.f5619c = colorStateList;
        c0469o.f5618b = colorStateList != null;
        this.f13982b = c0469o;
        this.f13983c = c0469o;
        this.f13984d = c0469o;
        this.f13985e = c0469o;
        this.f13986f = c0469o;
        this.f13987g = c0469o;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f13988h == null) {
            this.f13988h = new C0469o();
        }
        C0469o c0469o = this.f13988h;
        c0469o.f5620d = mode;
        c0469o.a = mode != null;
        this.f13982b = c0469o;
        this.f13983c = c0469o;
        this.f13984d = c0469o;
        this.f13985e = c0469o;
        this.f13986f = c0469o;
        this.f13987g = c0469o;
    }

    public final void n(Context context, Y1.c cVar) {
        String string;
        int i10 = this.j;
        TypedArray typedArray = (TypedArray) cVar.f5671u;
        this.j = typedArray.getInt(2, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(11, -1);
            this.f13990k = i12;
            if (i12 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f13992m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 == 1) {
                    this.f13991l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f13991l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f13991l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f13991l = null;
        int i14 = typedArray.hasValue(12) ? 12 : 10;
        int i15 = this.f13990k;
        int i16 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceX = cVar.x(i14, this.j, new N(this, i15, i16, new WeakReference(this.a)));
                if (typefaceX != null) {
                    if (i11 < 28 || this.f13990k == -1) {
                        this.f13991l = typefaceX;
                    } else {
                        this.f13991l = S.a(Typeface.create(typefaceX, 0), this.f13990k, (this.j & 2) != 0);
                    }
                }
                this.f13992m = this.f13991l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f13991l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f13990k == -1) {
            this.f13991l = Typeface.create(string, this.j);
        } else {
            this.f13991l = S.a(Typeface.create(string, 0), this.f13990k, (this.j & 2) != 0);
        }
    }
}
