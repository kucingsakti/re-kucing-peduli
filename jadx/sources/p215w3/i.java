package p215w3;

import C8.E;
import E4.C0187a;
import E4.L;
import J7.j;
import R2.a;
import U.C0415c0;
import U.U;
import W1.c;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.kcstream.cing.R;
import java.util.WeakHashMap;
import p181s3.d;

/* JADX INFO: loaded from: classes.dex */
public final class i extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f15558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f15559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L f15560i;
    public final c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0187a f15561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f15565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f15566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f15567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f15568r;

    public i(l lVar) {
        super(lVar);
        this.f15560i = new L(this, 5);
        this.j = new c(this, 2);
        this.f15561k = new C0187a(this, 29);
        this.f15565o = Long.MAX_VALUE;
        this.f15557f = j.C(lVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f15556e = j.C(lVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f15558g = j.D(lVar.getContext(), R.attr.motionEasingLinearInterpolator, a.a);
    }

    @Override // p215w3.m
    public final void a() {
        if (this.f15566p.isTouchExplorationEnabled() && E.t(this.f15559h) && !this.f15594d.hasFocus()) {
            this.f15559h.dismissDropDown();
        }
        this.f15559h.post(new d(this, 5));
    }

    @Override // p215w3.m
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p215w3.m
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p215w3.m
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // p215w3.m
    public final View.OnClickListener f() {
        return this.f15560i;
    }

    @Override // p215w3.m
    public final C0187a h() {
        return this.f15561k;
    }

    @Override // p215w3.m
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // p215w3.m
    public final boolean j() {
        return this.f15562l;
    }

    @Override // p215w3.m
    public final boolean l() {
        return this.f15564n;
    }

    @Override // p215w3.m
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f15559h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: w3.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                i iVar = this.f15555s;
                iVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - iVar.f15565o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        iVar.f15563m = false;
                    }
                    iVar.u();
                    iVar.f15563m = true;
                    iVar.f15565o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f15559h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: w3.h
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                i iVar = this.a;
                iVar.f15563m = true;
                iVar.f15565o = System.currentTimeMillis();
                iVar.t(false);
            }
        });
        this.f15559h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!E.t(editText) && this.f15566p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = U.a;
            this.f15594d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p215w3.m
    public final void n(V.j jVar) {
        if (!E.t(this.f15559h)) {
            jVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? jVar.a.isShowingHintText() : jVar.e(4)) {
            jVar.k(null);
        }
    }

    @Override // p215w3.m
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f15566p.isEnabled() || E.t(this.f15559h)) {
            return;
        }
        boolean z6 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f15564n && !this.f15559h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z6) {
            u();
            this.f15563m = true;
            this.f15565o = System.currentTimeMillis();
        }
    }

    @Override // p215w3.m
    public final void r() {
        int i10 = 3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15558g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f15557f);
        valueAnimatorOfFloat.addUpdateListener(new C0415c0(this, i10));
        this.f15568r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f15556e);
        valueAnimatorOfFloat2.addUpdateListener(new C0415c0(this, i10));
        this.f15567q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new B4.L(this, 12));
        this.f15566p = (AccessibilityManager) this.f15593c.getSystemService("accessibility");
    }

    @Override // p215w3.m
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f15559h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f15559h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z6) {
        if (this.f15564n != z6) {
            this.f15564n = z6;
            this.f15568r.cancel();
            this.f15567q.start();
        }
    }

    public final void u() {
        if (this.f15559h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f15565o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f15563m = false;
        }
        if (this.f15563m) {
            this.f15563m = false;
            return;
        }
        t(!this.f15564n);
        if (!this.f15564n) {
            this.f15559h.dismissDropDown();
        } else {
            this.f15559h.requestFocus();
            this.f15559h.showDropDown();
        }
    }
}
