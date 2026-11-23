package com.google.android.material.chip;

import A1.J;
import C8.E;
import M.g;
import S.k;
import U.H;
import U.U;
import V.h;
import V.i;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p.C0721p;
import p023c3.b;
import p023c3.c;
import p023c3.d;
import p023c3.e;
import p023c3.f;
import p068ga.l;
import p091j3.C;
import p091j3.InterfaceC0670e;
import p091j3.InterfaceC0671f;
import p091j3.z;
import p170r3.j;
import p170r3.u;
import p225x3.a;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends C0721p implements e, u, InterfaceC0671f {
    public static final Rect P = new Rect();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int[] f9609Q = {R.attr.state_selected};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f9610R = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f9611A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC0670e f9612B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9613C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f9614D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9615E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f9616F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9617G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f9618H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9619I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CharSequence f9620J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final d f9621K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f9622L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Rect f9623M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final RectF f9624N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final b f9625O;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f f9626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InsetDrawable f9627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RippleDrawable f9628y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View.OnClickListener f9629z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(a.a(context, attributeSet, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.kcstream.cing.R.attr.chipStyle);
        this.f9623M = new Rect();
        this.f9624N = new RectF();
        this.f9625O = new b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = Q2.a.f4015i;
        TypedArray typedArrayI = C.i(fVar.f7516x0, attributeSet, iArr, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        fVar.f7492X0 = typedArrayI.hasValue(37);
        Context context3 = fVar.f7516x0;
        ColorStateList colorStateListN = E.n(context3, typedArrayI, 24);
        if (fVar.f7478Q != colorStateListN) {
            fVar.f7478Q = colorStateListN;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateListN2 = E.n(context3, typedArrayI, 11);
        if (fVar.f7480R != colorStateListN2) {
            fVar.f7480R = colorStateListN2;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = typedArrayI.getDimension(19, 0.0f);
        if (fVar.f7482S != dimension) {
            fVar.f7482S = dimension;
            fVar.invalidateSelf();
            fVar.y();
        }
        if (typedArrayI.hasValue(12)) {
            fVar.E(typedArrayI.getDimension(12, 0.0f));
        }
        fVar.J(E.n(context3, typedArrayI, 22));
        fVar.K(typedArrayI.getDimension(23, 0.0f));
        fVar.T(E.n(context3, typedArrayI, 36));
        String text = typedArrayI.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(fVar.f7491X, text);
        z zVar = fVar.f7465D0;
        if (!zEquals) {
            fVar.f7491X = text;
            zVar.f12495e = true;
            fVar.invalidateSelf();
            fVar.y();
        }
        p139o3.d dVar = (!typedArrayI.hasValue(0) || (resourceId = typedArrayI.getResourceId(0, 0)) == 0) ? null : new p139o3.d(context3, resourceId);
        dVar.f13722k = typedArrayI.getDimension(1, dVar.f13722k);
        zVar.b(dVar, context3);
        int i10 = typedArrayI.getInt(3, 0);
        if (i10 == 1) {
            fVar.U0 = TextUtils.TruncateAt.START;
        } else if (i10 == 2) {
            fVar.U0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i10 == 3) {
            fVar.U0 = TextUtils.TruncateAt.END;
        }
        fVar.I(typedArrayI.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.I(typedArrayI.getBoolean(15, false));
        }
        fVar.F(E.q(context3, typedArrayI, 14));
        if (typedArrayI.hasValue(17)) {
            fVar.H(E.n(context3, typedArrayI, 17));
        }
        fVar.G(typedArrayI.getDimension(16, -1.0f));
        fVar.Q(typedArrayI.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.Q(typedArrayI.getBoolean(26, false));
        }
        fVar.L(E.q(context3, typedArrayI, 25));
        fVar.P(E.n(context3, typedArrayI, 30));
        fVar.N(typedArrayI.getDimension(28, 0.0f));
        fVar.A(typedArrayI.getBoolean(6, false));
        fVar.D(typedArrayI.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.D(typedArrayI.getBoolean(8, false));
        }
        fVar.B(E.q(context3, typedArrayI, 7));
        if (typedArrayI.hasValue(9)) {
            fVar.C(E.n(context3, typedArrayI, 9));
        }
        fVar.f7506n0 = R2.d.a(context3, typedArrayI, 39);
        fVar.f7507o0 = R2.d.a(context3, typedArrayI, 33);
        float dimension2 = typedArrayI.getDimension(21, 0.0f);
        if (fVar.f7508p0 != dimension2) {
            fVar.f7508p0 = dimension2;
            fVar.invalidateSelf();
            fVar.y();
        }
        fVar.S(typedArrayI.getDimension(35, 0.0f));
        fVar.R(typedArrayI.getDimension(34, 0.0f));
        float dimension3 = typedArrayI.getDimension(41, 0.0f);
        if (fVar.f7511s0 != dimension3) {
            fVar.f7511s0 = dimension3;
            fVar.invalidateSelf();
            fVar.y();
        }
        float dimension4 = typedArrayI.getDimension(40, 0.0f);
        if (fVar.f7512t0 != dimension4) {
            fVar.f7512t0 = dimension4;
            fVar.invalidateSelf();
            fVar.y();
        }
        fVar.O(typedArrayI.getDimension(29, 0.0f));
        fVar.M(typedArrayI.getDimension(27, 0.0f));
        float dimension5 = typedArrayI.getDimension(13, 0.0f);
        if (fVar.f7515w0 != dimension5) {
            fVar.f7515w0 = dimension5;
            fVar.invalidateSelf();
            fVar.y();
        }
        fVar.f7490W0 = typedArrayI.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayI.recycle();
        C.a(context2, attributeSet, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action);
        C.b(context2, attributeSet, iArr, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action);
        this.f9617G = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f9619I = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(C.e(getContext(), 48))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.k(H.i(this));
        C.a(context2, attributeSet, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action);
        C.b(context2, attributeSet, iArr, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.kcstream.cing.R.attr.chipStyle, com.kcstream.cing.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f9621K = new d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new c(this, 0));
        }
        setChecked(this.f9613C);
        setText(fVar.f7491X);
        setEllipsize(fVar.U0);
        g();
        if (!this.f9626w.f7488V0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.f9617G) {
            setMinHeight(this.f9619I);
        }
        this.f9618H = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c3.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z6) {
                Chip chip = this.a;
                InterfaceC0670e interfaceC0670e = chip.f9612B;
                if (interfaceC0670e != null) {
                    O0.a aVar = (O0.a) ((h) interfaceC0670e).f5078t;
                    if (!z6 ? aVar.j(chip, aVar.f3504b) : aVar.a(chip)) {
                        aVar.h();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f9611A;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z6);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f9624N;
        rectF.setEmpty();
        if (c() && this.f9629z != null) {
            f fVar = this.f9626w;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.W()) {
                float f10 = fVar.f7515w0 + fVar.f7514v0 + fVar.f7500h0 + fVar.f7513u0 + fVar.f7512t0;
                if (M.b.a(fVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f9623M;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private p139o3.d getTextAppearance() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7465D0.f12497g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.f9615E != z6) {
            this.f9615E = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.f9614D != z6) {
            this.f9614D = z6;
            refreshDrawableState();
        }
    }

    public final void b(int i10) {
        this.f9619I = i10;
        if (!this.f9617G) {
            InsetDrawable insetDrawable = this.f9627x;
            if (insetDrawable == null) {
                int[] iArr = p149p3.a.a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f9627x = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = p149p3.a.a;
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.f9626w.f7482S));
        int iMax2 = Math.max(0, i10 - this.f9626w.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f9627x;
            if (insetDrawable2 == null) {
                int[] iArr3 = p149p3.a.a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f9627x = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = p149p3.a.a;
                    e();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f9627x != null) {
            Rect rect = new Rect();
            this.f9627x.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = p149p3.a.a;
                e();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f9627x = new InsetDrawable((Drawable) this.f9626w, i11, i12, i11, i12);
        int[] iArr6 = p149p3.a.a;
        e();
    }

    public final boolean c() {
        f fVar = this.f9626w;
        if (fVar == null) {
            return false;
        }
        Object obj = fVar.f7498e0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof g) {
            obj = null;
        }
        return obj != null;
    }

    public final void d() {
        f fVar;
        if (!c() || (fVar = this.f9626w) == null || !fVar.f7497d0 || this.f9629z == null) {
            U.n(this, null);
            this.f9622L = false;
        } else {
            U.n(this, this.f9621K);
            this.f9622L = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        if (!this.f9622L) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f9621K;
        AccessibilityManager accessibilityManager = dVar.f10505h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x8 = motionEvent.getX();
                float y6 = motionEvent.getY();
                Chip chip = dVar.f7460q;
                int i11 = (chip.c() && chip.getCloseIconTouchBounds().contains(x8, y6)) ? 1 : 0;
                int i12 = dVar.f10509m;
                if (i12 != i11) {
                    dVar.f10509m = i11;
                    dVar.q(i11, 128);
                    dVar.q(i12, 256);
                }
                if (i11 == Integer.MIN_VALUE) {
                    if (!super.dispatchHoverEvent(motionEvent)) {
                        return false;
                    }
                }
            } else if (action == 10 && (i10 = dVar.f10509m) != Integer.MIN_VALUE) {
                if (i10 != Integer.MIN_VALUE) {
                    dVar.f10509m = Integer.MIN_VALUE;
                    dVar.q(i10, 256);
                    return true;
                }
            } else if (!super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i10;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.f9622L) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f9621K;
        dVar.getClass();
        boolean zM = false;
        int i11 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i12 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case MobileAdsBridge.CODE_21 /* 21 */:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i12 = 33;
                                } else if (keyCode == 21) {
                                    i12 = 17;
                                } else if (keyCode != 22) {
                                    i12 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z6 = false;
                                while (i11 < repeatCount && dVar.m(i12, null)) {
                                    i11++;
                                    z6 = true;
                                }
                                zM = z6;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i10 = dVar.f10508l;
                                if (i10 != Integer.MIN_VALUE) {
                                    chip = dVar.f7460q;
                                    if (i10 == 0) {
                                        chip.performClick();
                                    } else if (i10 == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.f9629z;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f9622L) {
                                            chip.f9621K.q(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i10 = dVar.f10508l;
                    if (i10 != Integer.MIN_VALUE) {
                        chip = dVar.f7460q;
                        if (i10 == 0) {
                            chip.performClick();
                        } else if (i10 == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.f9629z;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f9622L) {
                                chip.f9621K.q(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = dVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = dVar.m(1, null);
            }
        }
        if (!zM || dVar.f10508l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p.C0721p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        int i11;
        super.drawableStateChanged();
        f fVar = this.f9626w;
        boolean z6 = false;
        if (fVar != null && f.x(fVar.f7498e0)) {
            f fVar2 = this.f9626w;
            ?? IsEnabled = isEnabled();
            if (this.f9616F) {
                i10 = IsEnabled;
                i10 = IsEnabled + 1;
            }
            i10 = IsEnabled;
            int i12 = i10;
            if (this.f9615E) {
                i12 = i10 + 1;
            }
            int i13 = i12;
            if (this.f9614D) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (this.f9616F) {
                iArr[i11] = 16842908;
                i11++;
            }
            if (this.f9615E) {
                iArr[i11] = 16843623;
                i11++;
            }
            if (this.f9614D) {
                iArr[i11] = 16842919;
                i11++;
            }
            if (isChecked()) {
                iArr[i11] = 16842913;
            }
            if (!Arrays.equals(fVar2.f7481R0, iArr)) {
                fVar2.f7481R0 = iArr;
                if (fVar2.W()) {
                    z6 = fVar2.z(fVar2.getState(), iArr);
                }
            }
        }
        if (z6) {
            invalidate();
        }
    }

    public final void e() {
        this.f9628y = new RippleDrawable(p149p3.a.c(this.f9626w.f7489W), getBackgroundDrawable(), null);
        this.f9626w.getClass();
        RippleDrawable rippleDrawable = this.f9628y;
        WeakHashMap weakHashMap = U.a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f9626w) == null) {
            return;
        }
        int iU = (int) (fVar.u() + fVar.f7515w0 + fVar.f7512t0);
        f fVar2 = this.f9626w;
        int iT = (int) (fVar2.t() + fVar2.f7508p0 + fVar2.f7511s0);
        if (this.f9627x != null) {
            Rect rect = new Rect();
            this.f9627x.getPadding(rect);
            iT += rect.left;
            iU += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = U.a;
        setPaddingRelative(iT, paddingTop, iU, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f9626w;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        p139o3.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f9625O);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f9620J)) {
            return this.f9620J;
        }
        f fVar = this.f9626w;
        if (!(fVar != null && fVar.f7502j0)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f9635z.a) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f9627x;
        return insetDrawable == null ? this.f9626w : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7504l0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7505m0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7480R;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return Math.max(0.0f, fVar.v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f9626w;
    }

    public float getChipEndPadding() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7515w0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f9626w;
        if (fVar == null || (drawable = fVar.f7494Z) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7496b0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7495a0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7482S;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7508p0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7486U;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7487V;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f9626w;
        if (fVar == null || (drawable = fVar.f7498e0) == 0) {
            return null;
        }
        if (!(drawable instanceof g)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7501i0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7514v0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7500h0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7513u0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7499g0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.U0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f9622L) {
            d dVar = this.f9621K;
            if (dVar.f10508l == 1 || dVar.f10507k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public R2.d getHideMotionSpec() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7507o0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7510r0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7509q0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7489W;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f9626w.f14501s.a;
    }

    public R2.d getShowMotionSpec() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7506n0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7512t0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f9626w;
        if (fVar != null) {
            return fVar.f7511s0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D3.b.E(this, this.f9626w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9609Q);
        }
        f fVar = this.f9626w;
        if (fVar != null && fVar.f7502j0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f9610R);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        super.onFocusChanged(z6, i10, rect);
        if (this.f9622L) {
            d dVar = this.f9621K;
            int i11 = dVar.f10508l;
            if (i11 != Integer.MIN_VALUE) {
                dVar.j(i11);
            }
            if (z6) {
                dVar.m(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        f fVar = this.f9626w;
        int i11 = 0;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f7502j0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f12429u) {
                int i12 = 0;
                while (true) {
                    if (i11 >= chipGroup.getChildCount()) {
                        i12 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i11);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i11).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i11++;
                }
                i10 = i12;
            } else {
                i10 = -1;
            }
            Object tag = getTag(com.kcstream.cing.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo(i.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i10, 1, false, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f9618H != i10) {
            this.f9618H = i10;
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f9614D) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z6 = true;
                }
                z6 = false;
            } else {
                if (this.f9614D) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f9629z;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f9622L) {
                        this.f9621K.q(1, 1);
                    }
                    z6 = true;
                }
                setCloseIconPressed(false);
            }
            z6 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f9620J = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9628y) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p.C0721p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9628y) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p.C0721p, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z6) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.A(z6);
        }
    }

    public void setCheckableResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.A(fVar.f7516x0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        f fVar = this.f9626w;
        if (fVar == null) {
            this.f9613C = z6;
        } else if (fVar.f7502j0) {
            super.setChecked(z6);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.B(l.g(fVar.f7516x0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.C(J.f.c(fVar.f7516x0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.D(fVar.f7516x0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f9626w;
        if (fVar == null || fVar.f7480R == colorStateList) {
            return;
        }
        fVar.f7480R = colorStateList;
        fVar.onStateChange(fVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListC;
        f fVar = this.f9626w;
        if (fVar == null || fVar.f7480R == (colorStateListC = J.f.c(fVar.f7516x0, i10))) {
            return;
        }
        fVar.f7480R = colorStateListC;
        fVar.onStateChange(fVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.E(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.E(fVar.f7516x0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f9626w;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f7485T0 = new WeakReference(null);
            }
            this.f9626w = fVar;
            fVar.f7488V0 = false;
            fVar.f7485T0 = new WeakReference(this);
            b(this.f9619I);
        }
    }

    public void setChipEndPadding(float f10) {
        f fVar = this.f9626w;
        if (fVar == null || fVar.f7515w0 == f10) {
            return;
        }
        fVar.f7515w0 = f10;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setChipEndPaddingResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            float dimension = fVar.f7516x0.getResources().getDimension(i10);
            if (fVar.f7515w0 != dimension) {
                fVar.f7515w0 = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.F(l.g(fVar.f7516x0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.G(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.G(fVar.f7516x0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.H(J.f.c(fVar.f7516x0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.I(fVar.f7516x0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        f fVar = this.f9626w;
        if (fVar == null || fVar.f7482S == f10) {
            return;
        }
        fVar.f7482S = f10;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setChipMinHeightResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            float dimension = fVar.f7516x0.getResources().getDimension(i10);
            if (fVar.f7482S != dimension) {
                fVar.f7482S = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        f fVar = this.f9626w;
        if (fVar == null || fVar.f7508p0 == f10) {
            return;
        }
        fVar.f7508p0 = f10;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setChipStartPaddingResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            float dimension = fVar.f7516x0.getResources().getDimension(i10);
            if (fVar.f7508p0 != dimension) {
                fVar.f7508p0 = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.J(J.f.c(fVar.f7516x0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.K(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.K(fVar.f7516x0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.L(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f9626w;
        if (fVar == null || fVar.f7501i0 == charSequence) {
            return;
        }
        String str = S.b.f4496b;
        S.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? S.b.f4499e : S.b.f4498d;
        bVar.getClass();
        J j = k.a;
        fVar.f7501i0 = bVar.c(charSequence);
        fVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.M(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.M(fVar.f7516x0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.L(l.g(fVar.f7516x0, i10));
        }
        d();
    }

    public void setCloseIconSize(float f10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.N(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.N(fVar.f7516x0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.O(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.O(fVar.f7516x0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.P(J.f.c(fVar.f7516x0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // p.C0721p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p.C0721p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.k(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9626w == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.U0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.f9617G = z6;
        b(this.f9619I);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(R2.d dVar) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.f7507o0 = dVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.f7507o0 = R2.d.b(fVar.f7516x0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.R(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.R(fVar.f7516x0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.S(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.S(fVar.f7516x0.getResources().getDimension(i10));
        }
    }

    @Override // p091j3.InterfaceC0671f
    public void setInternalOnCheckedChangeListener(InterfaceC0670e interfaceC0670e) {
        this.f9612B = interfaceC0670e;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f9626w == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.f7490W0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9611A = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9629z = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.T(colorStateList);
        }
        this.f9626w.getClass();
        e();
    }

    public void setRippleColorResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.T(J.f.c(fVar.f7516x0, i10));
            this.f9626w.getClass();
            e();
        }
    }

    @Override // p170r3.u
    public void setShapeAppearanceModel(j jVar) {
        this.f9626w.setShapeAppearanceModel(jVar);
    }

    public void setShowMotionSpec(R2.d dVar) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.f7506n0 = dVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.f7506n0 = R2.d.b(fVar.f7516x0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f9626w;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.f7488V0 ? null : charSequence, bufferType);
        f fVar2 = this.f9626w;
        if (fVar2 == null || TextUtils.equals(fVar2.f7491X, charSequence)) {
            return;
        }
        fVar2.f7491X = charSequence;
        fVar2.f7465D0.f12495e = true;
        fVar2.invalidateSelf();
        fVar2.y();
    }

    public void setTextAppearance(p139o3.d dVar) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.f7465D0.b(dVar, fVar.f7516x0);
        }
        g();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        f fVar = this.f9626w;
        if (fVar == null || fVar.f7512t0 == f10) {
            return;
        }
        fVar.f7512t0 = f10;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setTextEndPaddingResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            float dimension = fVar.f7516x0.getResources().getDimension(i10);
            if (fVar.f7512t0 != dimension) {
                fVar.f7512t0 = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        f fVar = this.f9626w;
        if (fVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            z zVar = fVar.f7465D0;
            p139o3.d dVar = zVar.f12497g;
            if (dVar != null) {
                dVar.f13722k = fApplyDimension;
                zVar.a.setTextSize(fApplyDimension);
                fVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f10) {
        f fVar = this.f9626w;
        if (fVar == null || fVar.f7511s0 == f10) {
            return;
        }
        fVar.f7511s0 = f10;
        fVar.invalidateSelf();
        fVar.y();
    }

    public void setTextStartPaddingResource(int i10) {
        f fVar = this.f9626w;
        if (fVar != null) {
            float dimension = fVar.f7516x0.getResources().getDimension(i10);
            if (fVar.f7511s0 != dimension) {
                fVar.f7511s0 = dimension;
                fVar.invalidateSelf();
                fVar.y();
            }
        }
    }

    public void setCloseIconVisible(boolean z6) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.Q(z6);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z6) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.D(z6);
        }
    }

    public void setChipIconVisible(boolean z6) {
        f fVar = this.f9626w;
        if (fVar != null) {
            fVar.I(z6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f fVar = this.f9626w;
        if (fVar != null) {
            Context context2 = fVar.f7516x0;
            fVar.f7465D0.b(new p139o3.d(context2, i10), context2);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        f fVar = this.f9626w;
        if (fVar != null) {
            Context context = fVar.f7516x0;
            fVar.f7465D0.b(new p139o3.d(context, i10), context);
        }
        g();
    }
}
