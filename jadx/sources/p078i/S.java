package p078i;

import J7.j;
import L8.e0;
import P0.d;
import U.C0415c0;
import U.C0417d0;
import U.F;
import U.H;
import U.U;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.h;
import o1.k;
import p.InterfaceC0697d;
import p.InterfaceC0704g0;
import p.T0;
import p.X0;
import p068ga.l;
import p069h.a;
import p125n.i;
import p136o.n;

/* JADX INFO: loaded from: classes.dex */
public final class S extends j implements InterfaceC0697d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f12004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f12005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f12006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f12007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC0704g0 f12008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f12009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f12010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12011i;
    public Q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Q f12012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f12013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f12015n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f12021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12022u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12023v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final P f12024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final P f12025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f12026y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f12003z = new AccelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f12002A = new DecelerateInterpolator();

    public S(Activity activity, boolean z6) {
        new ArrayList();
        this.f12015n = new ArrayList();
        this.f12016o = 0;
        this.f12017p = true;
        this.f12020s = true;
        this.f12024w = new P(this, 0);
        this.f12025x = new P(this, 1);
        this.f12026y = new d(this, 29);
        View decorView = activity.getWindow().getDecorView();
        b0(decorView);
        if (z6) {
            return;
        }
        this.f12010h = decorView.findViewById(R.id.content);
    }

    @Override // J7.j
    public final void G(boolean z6) {
        if (this.f12011i) {
            return;
        }
        H(z6);
    }

    @Override // J7.j
    public final void H(boolean z6) {
        int i10 = z6 ? 4 : 0;
        X0 x8 = (X0) this.f12008f;
        int i11 = x8.f14008b;
        this.f12011i = true;
        x8.a((i10 & 4) | (i11 & (-5)));
    }

    @Override // J7.j
    public final void J(int i10) {
        ((X0) this.f12008f).b(i10);
    }

    @Override // J7.j
    public final void K(int i10) {
        X0 x8 = (X0) this.f12008f;
        Drawable drawableG = i10 != 0 ? l.g(x8.a.getContext(), i10) : null;
        x8.f14012f = drawableG;
        int i11 = x8.f14008b & 4;
        Toolbar toolbar = x8.a;
        if (i11 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawableG == null) {
            drawableG = x8.f14020o;
        }
        toolbar.setNavigationIcon(drawableG);
    }

    @Override // J7.j
    public final void L(Drawable drawable) {
        X0 x8 = (X0) this.f12008f;
        x8.f14012f = drawable;
        int i10 = x8.f14008b & 4;
        Toolbar toolbar = x8.a;
        if (i10 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = x8.f14020o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // J7.j
    public final void M() {
        this.f12008f.getClass();
    }

    @Override // J7.j
    public final void P(boolean z6) {
        i iVar;
        this.f12022u = z6;
        if (z6 || (iVar = this.f12021t) == null) {
            return;
        }
        iVar.a();
    }

    @Override // J7.j
    public final void R(CharSequence charSequence) {
        X0 x8 = (X0) this.f12008f;
        x8.f14013g = true;
        x8.f14014h = charSequence;
        if ((x8.f14008b & 8) != 0) {
            Toolbar toolbar = x8.a;
            toolbar.setTitle(charSequence);
            if (x8.f14013g) {
                U.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // J7.j
    public final void S(CharSequence charSequence) {
        X0 x8 = (X0) this.f12008f;
        if (x8.f14013g) {
            return;
        }
        x8.f14014h = charSequence;
        if ((x8.f14008b & 8) != 0) {
            Toolbar toolbar = x8.a;
            toolbar.setTitle(charSequence);
            if (x8.f14013g) {
                U.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // J7.j
    public final e0 T(k kVar) {
        Q q10 = this.j;
        if (q10 != null) {
            q10.b();
        }
        this.f12006d.setHideOnContentScrollEnabled(false);
        this.f12009g.e();
        Q q11 = new Q(this, this.f12009g.getContext(), kVar);
        p136o.l lVar = q11.f11998w;
        lVar.y();
        try {
            boolean zM = ((h) q11.f11999x.f13638s).m(q11, lVar);
            lVar.x();
            if (!zM) {
                return null;
            }
            this.j = q11;
            q11.i();
            this.f12009g.c(q11);
            a0(true);
            return q11;
        } catch (Throwable th) {
            lVar.x();
            throw th;
        }
    }

    public final void a0(boolean z6) {
        C0417d0 c0417d0I;
        C0417d0 c0417d0I2;
        if (z6) {
            if (!this.f12019r) {
                this.f12019r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12006d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d0(false);
            }
        } else if (this.f12019r) {
            this.f12019r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12006d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d0(false);
        }
        if (!this.f12007e.isLaidOut()) {
            if (z6) {
                ((X0) this.f12008f).a.setVisibility(4);
                this.f12009g.setVisibility(0);
                return;
            } else {
                ((X0) this.f12008f).a.setVisibility(0);
                this.f12009g.setVisibility(8);
                return;
            }
        }
        if (z6) {
            X0 x8 = (X0) this.f12008f;
            c0417d0I = U.a(x8.a);
            c0417d0I.a(0.0f);
            c0417d0I.c(100L);
            c0417d0I.d(new p125n.h(x8, 4));
            c0417d0I2 = this.f12009g.i(0, 200L);
        } else {
            X0 x10 = (X0) this.f12008f;
            C0417d0 c0417d0A = U.a(x10.a);
            c0417d0A.a(1.0f);
            c0417d0A.c(200L);
            c0417d0A.d(new p125n.h(x10, 0));
            c0417d0I = this.f12009g.i(8, 100L);
            c0417d0I2 = c0417d0A;
        }
        i iVar = new i();
        ArrayList arrayList = iVar.a;
        arrayList.add(c0417d0I);
        View view = (View) c0417d0I.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0417d0I2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0417d0I2);
        iVar.b();
    }

    public final void b0(View view) {
        InterfaceC0704g0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.kcstream.cing.R.id.decor_content_parent);
        this.f12006d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.kcstream.cing.R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0704g0) {
            wrapper = (InterfaceC0704g0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f12008f = wrapper;
        this.f12009g = (ActionBarContextView) view.findViewById(com.kcstream.cing.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.kcstream.cing.R.id.action_bar_container);
        this.f12007e = actionBarContainer;
        InterfaceC0704g0 interfaceC0704g0 = this.f12008f;
        if (interfaceC0704g0 == null || this.f12009g == null || actionBarContainer == null) {
            throw new IllegalStateException(S.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((X0) interfaceC0704g0).a.getContext();
        this.f12004b = context;
        if ((((X0) this.f12008f).f14008b & 4) != 0) {
            this.f12011i = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        M();
        c0(context.getResources().getBoolean(com.kcstream.cing.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f12004b.obtainStyledAttributes(null, a.a, com.kcstream.cing.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12006d;
            if (!actionBarOverlayLayout2.f6126y) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f12023v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f12007e;
            WeakHashMap weakHashMap = U.a;
            H.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c0(boolean z6) {
        if (z6) {
            this.f12007e.setTabContainer(null);
            ((X0) this.f12008f).getClass();
        } else {
            ((X0) this.f12008f).getClass();
            this.f12007e.setTabContainer(null);
        }
        X0 x8 = (X0) this.f12008f;
        x8.getClass();
        x8.a.setCollapsible(false);
        this.f12006d.setHasNonEmbeddedTabs(false);
    }

    public final void d0(boolean z6) {
        boolean z10 = this.f12019r || !this.f12018q;
        View view = this.f12010h;
        d dVar = this.f12026y;
        if (!z10) {
            if (this.f12020s) {
                this.f12020s = false;
                i iVar = this.f12021t;
                if (iVar != null) {
                    iVar.a();
                }
                int i10 = this.f12016o;
                P p10 = this.f12024w;
                if (i10 != 0 || (!this.f12022u && !z6)) {
                    p10.a();
                    return;
                }
                this.f12007e.setAlpha(1.0f);
                this.f12007e.setTransitioning(true);
                i iVar2 = new i();
                float f10 = -this.f12007e.getHeight();
                if (z6) {
                    int[] iArr = {0, 0};
                    this.f12007e.getLocationInWindow(iArr);
                    f10 -= iArr[1];
                }
                C0417d0 c0417d0A = U.a(this.f12007e);
                c0417d0A.e(f10);
                View view2 = (View) c0417d0A.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(dVar != null ? new C0415c0(dVar, view2) : null);
                }
                boolean z11 = iVar2.f13284e;
                ArrayList arrayList = iVar2.a;
                if (!z11) {
                    arrayList.add(c0417d0A);
                }
                if (this.f12017p && view != null) {
                    C0417d0 c0417d0A2 = U.a(view);
                    c0417d0A2.e(f10);
                    if (!iVar2.f13284e) {
                        arrayList.add(c0417d0A2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f12003z;
                boolean z12 = iVar2.f13284e;
                if (!z12) {
                    iVar2.f13282c = accelerateInterpolator;
                }
                if (!z12) {
                    iVar2.f13281b = 250L;
                }
                if (!z12) {
                    iVar2.f13283d = p10;
                }
                this.f12021t = iVar2;
                iVar2.b();
                return;
            }
            return;
        }
        if (this.f12020s) {
            return;
        }
        this.f12020s = true;
        i iVar3 = this.f12021t;
        if (iVar3 != null) {
            iVar3.a();
        }
        this.f12007e.setVisibility(0);
        int i11 = this.f12016o;
        P p11 = this.f12025x;
        if (i11 == 0 && (this.f12022u || z6)) {
            this.f12007e.setTranslationY(0.0f);
            float f11 = -this.f12007e.getHeight();
            if (z6) {
                int[] iArr2 = {0, 0};
                this.f12007e.getLocationInWindow(iArr2);
                f11 -= iArr2[1];
            }
            this.f12007e.setTranslationY(f11);
            i iVar4 = new i();
            C0417d0 c0417d0A3 = U.a(this.f12007e);
            c0417d0A3.e(0.0f);
            View view3 = (View) c0417d0A3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(dVar != null ? new C0415c0(dVar, view3) : null);
            }
            boolean z13 = iVar4.f13284e;
            ArrayList arrayList2 = iVar4.a;
            if (!z13) {
                arrayList2.add(c0417d0A3);
            }
            if (this.f12017p && view != null) {
                view.setTranslationY(f11);
                C0417d0 c0417d0A4 = U.a(view);
                c0417d0A4.e(0.0f);
                if (!iVar4.f13284e) {
                    arrayList2.add(c0417d0A4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f12002A;
            boolean z14 = iVar4.f13284e;
            if (!z14) {
                iVar4.f13282c = decelerateInterpolator;
            }
            if (!z14) {
                iVar4.f13281b = 250L;
            }
            if (!z14) {
                iVar4.f13283d = p11;
            }
            this.f12021t = iVar4;
            iVar4.b();
        } else {
            this.f12007e.setAlpha(1.0f);
            this.f12007e.setTranslationY(0.0f);
            if (this.f12017p && view != null) {
                view.setTranslationY(0.0f);
            }
            p11.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f12006d;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = U.a;
            F.c(actionBarOverlayLayout);
        }
    }

    @Override // J7.j
    public final boolean f() {
        T0 t7;
        InterfaceC0704g0 interfaceC0704g0 = this.f12008f;
        if (interfaceC0704g0 == null || (t7 = ((X0) interfaceC0704g0).a.f6231h0) == null || t7.f13994t == null) {
            return false;
        }
        T0 t8 = ((X0) interfaceC0704g0).a.f6231h0;
        n nVar = t8 == null ? null : t8.f13994t;
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // J7.j
    public final void j(boolean z6) {
        if (z6 == this.f12014m) {
            return;
        }
        this.f12014m = z6;
        ArrayList arrayList = this.f12015n;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // J7.j
    public final int k() {
        return ((X0) this.f12008f).f14008b;
    }

    @Override // J7.j
    public final Context n() {
        if (this.f12005c == null) {
            TypedValue typedValue = new TypedValue();
            this.f12004b.getTheme().resolveAttribute(com.kcstream.cing.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f12005c = new ContextThemeWrapper(this.f12004b, i10);
            } else {
                this.f12005c = this.f12004b;
            }
        }
        return this.f12005c;
    }

    @Override // J7.j
    public final void w() {
        c0(this.f12004b.getResources().getBoolean(com.kcstream.cing.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // J7.j
    public final boolean z(int i10, KeyEvent keyEvent) {
        p136o.l lVar;
        Q q10 = this.j;
        if (q10 == null || (lVar = q10.f11998w) == null) {
            return false;
        }
        lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return lVar.performShortcut(i10, keyEvent, 0);
    }

    public S(Dialog dialog) {
        new ArrayList();
        this.f12015n = new ArrayList();
        this.f12016o = 0;
        this.f12017p = true;
        this.f12020s = true;
        this.f12024w = new P(this, 0);
        this.f12025x = new P(this, 1);
        this.f12026y = new d(this, 29);
        b0(dialog.getWindow().getDecorView());
    }
}
