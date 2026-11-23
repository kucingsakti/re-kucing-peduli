package p215w3;

import C8.E;
import J7.j;
import R2.a;
import U.U;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.X;
import p068ga.l;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f15599A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Typeface f15600B;
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f15603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f15604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f15605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f15606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f15607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f15608i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f15609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f15610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f15611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f15614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X f15616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f15617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15618t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15619u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f15620v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f15621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f15622x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public X f15623y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f15624z;

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f15606g = context;
        this.f15607h = textInputLayout;
        this.f15611m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.a = j.C(context, R.attr.motionDurationShort4, 217);
        this.f15601b = j.C(context, R.attr.motionDurationMedium4, 167);
        this.f15602c = j.C(context, R.attr.motionDurationShort4, 167);
        this.f15603d = j.D(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, a.f4443d);
        LinearInterpolator linearInterpolator = a.a;
        this.f15604e = j.D(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f15605f = j.D(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(X x8, int i10) {
        if (this.f15608i == null && this.f15609k == null) {
            Context context = this.f15606g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f15608i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f15608i;
            TextInputLayout textInputLayout = this.f15607h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f15609k = new FrameLayout(context);
            this.f15608i.addView(this.f15609k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f15609k.setVisibility(0);
            this.f15609k.addView(x8);
        } else {
            this.f15608i.addView(x8, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f15608i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f15608i != null) {
            TextInputLayout textInputLayout = this.f15607h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f15606g;
                boolean zU = E.u(context);
                LinearLayout linearLayout = this.f15608i;
                WeakHashMap weakHashMap = U.a;
                int paddingStart = editText.getPaddingStart();
                if (zU) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zU) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zU) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f15610l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z6, X x8, int i10, int i11, int i12) {
        if (x8 == null || !z6) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z10 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(x8, (Property<X, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i13 = this.f15602c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f15601b : i13);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f15604e : this.f15605f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(x8, (Property<X, Float>) View.TRANSLATION_Y, -this.f15611m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.a);
            objectAnimatorOfFloat2.setInterpolator(this.f15603d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f15616r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f15623y;
    }

    public final void f() {
        this.f15614p = null;
        c();
        if (this.f15612n == 1) {
            if (!this.f15622x || TextUtils.isEmpty(this.f15621w)) {
                this.f15613o = 0;
            } else {
                this.f15613o = 2;
            }
        }
        i(this.f15612n, this.f15613o, h(this.f15616r, ""));
    }

    public final void g(X x8, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f15608i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f15609k) != null) {
            frameLayout.removeView(x8);
        } else {
            linearLayout.removeView(x8);
        }
        int i11 = this.j - 1;
        this.j = i11;
        LinearLayout linearLayout2 = this.f15608i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(X x8, CharSequence charSequence) {
        WeakHashMap weakHashMap = U.a;
        TextInputLayout textInputLayout = this.f15607h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f15613o == this.f15612n && x8 != null && TextUtils.equals(x8.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z6) {
        TextView textViewE;
        TextView textViewE2;
        if (i10 == i11) {
            return;
        }
        if (z6) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f15610l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f15622x, this.f15623y, 2, i10, i11);
            d(arrayList, this.f15615q, this.f15616r, 1, i10, i11);
            l.m(animatorSet, arrayList);
            animatorSet.addListener(new n(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f15612n = i11;
        }
        TextInputLayout textInputLayout = this.f15607h;
        textInputLayout.r();
        textInputLayout.u(z6, false);
        textInputLayout.x();
    }
}
