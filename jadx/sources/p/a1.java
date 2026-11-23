package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.kcstream.cing.R;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static a1 f14023C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static a1 f14024D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f14025A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14026B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f14027s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f14028t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14029u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Z0 f14030v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Z0 f14031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14032x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14033y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b1 f14034z;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.Z0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.Z0] */
    public a1(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f14030v = new Runnable(this) { // from class: p.Z0

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a1 f14022t;

            {
                this.f14022t = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f14022t.c(false);
                        break;
                    default:
                        this.f14022t.a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f14031w = new Runnable(this) { // from class: p.Z0

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a1 f14022t;

            {
                this.f14022t = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f14022t.c(false);
                        break;
                    default:
                        this.f14022t.a();
                        break;
                }
            }
        };
        this.f14027s = view;
        this.f14028t = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = U.Y.a;
        this.f14029u = Build.VERSION.SDK_INT >= 28 ? U.W.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f14026B = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(a1 a1Var) {
        a1 a1Var2 = f14023C;
        if (a1Var2 != null) {
            a1Var2.f14027s.removeCallbacks(a1Var2.f14030v);
        }
        f14023C = a1Var;
        if (a1Var != null) {
            a1Var.f14027s.postDelayed(a1Var.f14030v, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        a1 a1Var = f14024D;
        View view = this.f14027s;
        if (a1Var == this) {
            f14024D = null;
            b1 b1Var = this.f14034z;
            if (b1Var != null) {
                View view2 = (View) b1Var.f14038u;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) b1Var.f14037t).getSystemService("window")).removeView(view2);
                }
                this.f14034z = null;
                this.f14026B = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f14023C == this) {
            b(null);
        }
        view.removeCallbacks(this.f14031w);
    }

    public final void c(boolean z6) {
        int height;
        int i10;
        int i11;
        int i12;
        long longPressTimeout;
        long j;
        long j10;
        View view = this.f14027s;
        if (view.isAttachedToWindow()) {
            b(null);
            a1 a1Var = f14024D;
            if (a1Var != null) {
                a1Var.a();
            }
            f14024D = this;
            this.f14025A = z6;
            b1 b1Var = new b1(view.getContext());
            this.f14034z = b1Var;
            int width = this.f14032x;
            int i13 = this.f14033y;
            boolean z10 = this.f14025A;
            View view2 = (View) b1Var.f14038u;
            ViewParent parent = view2.getParent();
            Context context = (Context) b1Var.f14037t;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) b1Var.f14039v).setText(this.f14028t);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) b1Var.f14040w;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i13 + dimensionPixelOffset2;
                i10 = i13 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z10 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                i12 = 1;
            } else {
                Rect rect = (Rect) b1Var.f14041x;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i11 = 0;
                    i12 = 1;
                } else {
                    Resources resources = context.getResources();
                    i12 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) b1Var.f14043z;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) b1Var.f14042y;
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i14;
                iArr2[i12] = iArr2[i12] - iArr[i12];
                layoutParams.x = (i14 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[i12];
                int i16 = ((i15 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i16 >= 0) {
                        layoutParams.y = i16;
                    } else {
                        layoutParams.y = i17;
                    }
                } else if (measuredHeight + i17 <= rect.height()) {
                    layoutParams.y = i17;
                } else {
                    layoutParams.y = i16;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f14025A) {
                j10 = 2500;
            } else {
                WeakHashMap weakHashMap = U.U.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i12) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j10 = j - longPressTimeout;
            }
            Z0 z11 = this.f14031w;
            view.removeCallbacks(z11);
            view.postDelayed(z11, j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f14034z == null || !this.f14025A) {
            View view2 = this.f14027s;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f14026B = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f14034z == null) {
                    int x8 = (int) motionEvent.getX();
                    int y6 = (int) motionEvent.getY();
                    if (this.f14026B) {
                        this.f14032x = x8;
                        this.f14033y = y6;
                        this.f14026B = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x8 - this.f14032x);
                        int i10 = this.f14029u;
                        if (iAbs > i10 || Math.abs(y6 - this.f14033y) > i10) {
                            this.f14032x = x8;
                            this.f14033y = y6;
                            this.f14026B = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f14032x = view.getWidth() / 2;
        this.f14033y = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
