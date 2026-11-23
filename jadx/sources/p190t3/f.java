package p190t3;

import A1.I;
import C0.w;
import J7.j;
import U.H;
import U.U;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.kcstream.cing.R;
import java.util.List;
import java.util.WeakHashMap;
import o1.h;
import p091j3.C;
import p102k7.e;
import p178s0.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f15191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f15192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f15193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f15194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f15195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f15196i;
    public final SnackbarContentLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15197k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f15204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f15205s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f15183u = R2.a.f4441b;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f15184v = R2.a.a;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f15185w = R2.a.f4443d;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f15187y = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f15188z = f.class.getSimpleName();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Handler f15186x = new Handler(Looper.getMainLooper(), new I(1));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f15198l = new c(this, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f15206t = new d(this);

    public f(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f15194g = viewGroup;
        this.j = snackbarContentLayout2;
        this.f15195h = context;
        C.c(context, C.a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f15187y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        e eVar = (e) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f15196i = eVar;
        eVar.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = eVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f9810t.setTextColor(J7.a.n(J7.a.g(snackbarContentLayout, R.attr.colorSurface), actionTextColorAlpha, snackbarContentLayout.f9810t.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(eVar.getMaxInlineActionWidth());
        eVar.addView(snackbarContentLayout);
        WeakHashMap weakHashMap = U.a;
        eVar.setAccessibilityLiveRegion(1);
        eVar.setImportantForAccessibility(1);
        eVar.setFitsSystemWindows(true);
        H.u(eVar, new e(this));
        U.n(eVar, new w(this, 7));
        this.f15205s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f15190c = j.C(context, R.attr.motionDurationLong2, 250);
        this.a = j.C(context, R.attr.motionDurationLong2, 150);
        this.f15189b = j.C(context, R.attr.motionDurationMedium1, 75);
        this.f15191d = j.D(context, R.attr.motionEasingEmphasizedInterpolator, f15184v);
        this.f15193f = j.D(context, R.attr.motionEasingEmphasizedInterpolator, f15185w);
        this.f15192e = j.D(context, R.attr.motionEasingEmphasizedInterpolator, f15183u);
    }

    public final void a(int i10) {
        h hVarG = h.g();
        d dVar = this.f15206t;
        synchronized (hVarG.f13632s) {
            try {
                if (hVarG.k(dVar)) {
                    hVarG.c((h) hVarG.f13634u, i10);
                } else {
                    h hVar = (h) hVarG.f13635v;
                    if (hVar != null && hVar.a.get() == dVar) {
                        hVarG.c((h) hVarG.f13635v, i10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        h hVarG = h.g();
        d dVar = this.f15206t;
        synchronized (hVarG.f13632s) {
            try {
                if (hVarG.k(dVar)) {
                    hVarG.f13634u = null;
                    if (((h) hVarG.f13635v) != null) {
                        hVarG.s();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f15196i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f15196i);
        }
    }

    public final void c() {
        h hVarG = h.g();
        d dVar = this.f15206t;
        synchronized (hVarG.f13632s) {
            try {
                if (hVarG.k(dVar)) {
                    hVarG.q((h) hVarG.f13634u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z6 = true;
        AccessibilityManager accessibilityManager = this.f15205s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z6 = false;
        }
        e eVar = this.f15196i;
        if (z6) {
            eVar.post(new c(this, 2));
            return;
        }
        if (eVar.getParent() != null) {
            eVar.setVisibility(0);
        }
        c();
    }

    public final void e() {
        e eVar = this.f15196i;
        ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
        boolean z6 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f15188z;
        if (!z6) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (eVar.f15173B == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (eVar.getParent() == null) {
            return;
        }
        int i10 = this.f15199m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = eVar.f15173B;
        int i11 = rect.bottom + i10;
        int i12 = rect.left + this.f15200n;
        int i13 = rect.right + this.f15201o;
        int i14 = rect.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            eVar.requestLayout();
        }
        if ((z10 || this.f15203q != this.f15202p) && Build.VERSION.SDK_INT >= 29 && this.f15202p > 0) {
            ViewGroup.LayoutParams layoutParams2 = eVar.getLayoutParams();
            if ((layoutParams2 instanceof G.e) && (((G.e) layoutParams2).a instanceof SwipeDismissBehavior)) {
                c cVar = this.f15198l;
                eVar.removeCallbacks(cVar);
                eVar.post(cVar);
            }
        }
    }
}
