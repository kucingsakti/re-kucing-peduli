package p078i;

import J7.j;
import L8.e0;
import U.C0417d0;
import U.F;
import U.U;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.kcstream.cing.R;
import java.util.List;
import java.util.WeakHashMap;
import o1.h;
import p125n.b;
import p125n.c;
import p125n.k;
import p136o.l;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Window.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Window.Callback f12121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public L f12122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ D f12126x;

    public z(D d3, Window.Callback callback) {
        this.f12126x = d3;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f12121s = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f12123u = true;
            callback.onContentChanged();
        } finally {
            this.f12123u = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f12121s.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f12121s.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        k.a(this.f12121s, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f12121s.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f12124v;
        Window.Callback callback = this.f12121s;
        if (z6) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.f12126x.u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f12121s.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            D d3 = this.f12126x;
            d3.C();
            j jVar = d3.f11926G;
            if (jVar == null || !jVar.z(keyCode, keyEvent)) {
                C c10 = d3.f11948e0;
                if (c10 == null || !d3.H(c10, keyEvent.getKeyCode(), keyEvent)) {
                    if (d3.f11948e0 == null) {
                        C cB = d3.B(0);
                        d3.I(cB, keyEvent);
                        boolean zH = d3.H(cB, keyEvent.getKeyCode(), keyEvent);
                        cB.f11912k = false;
                        if (zH) {
                        }
                    }
                    return false;
                }
                C c11 = d3.f11948e0;
                if (c11 != null) {
                    c11.f11913l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f12121s.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f12121s.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f12121s.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f12121s.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f12121s.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f12121s.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f12123u) {
            this.f12121s.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof l)) {
            return this.f12121s.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        L l4 = this.f12122t;
        if (l4 != null) {
            View view = i10 == 0 ? new View(l4.a.f11983b.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f12121s.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f12121s.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f12121s.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        b(i10, menu);
        D d3 = this.f12126x;
        if (i10 == 108) {
            d3.C();
            j jVar = d3.f11926G;
            if (jVar != null) {
                jVar.j(true);
            }
        } else {
            d3.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f12125w) {
            this.f12121s.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        D d3 = this.f12126x;
        if (i10 == 108) {
            d3.C();
            j jVar = d3.f11926G;
            if (jVar != null) {
                jVar.j(false);
                return;
            }
            return;
        }
        if (i10 != 0) {
            d3.getClass();
            return;
        }
        C cB = d3.B(i10);
        if (cB.f11914m) {
            d3.s(cB, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z6) {
        p125n.l.a(this.f12121s, z6);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        l lVar = menu instanceof l ? (l) menu : null;
        if (i10 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.P = true;
        }
        L l4 = this.f12122t;
        if (l4 != null && i10 == 0) {
            M m2 = l4.a;
            if (!m2.f11986e) {
                m2.f11983b.f14017l = true;
                m2.f11986e = true;
            }
        }
        boolean zOnPreparePanel = this.f12121s.onPreparePanel(i10, view, menu);
        if (lVar != null) {
            lVar.P = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        l lVar = this.f12126x.B(0).f11910h;
        if (lVar != null) {
            d(list, lVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return p125n.j.a(this.f12121s, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f12121s.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        this.f12121s.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        ViewGroup viewGroup;
        boolean z6 = false;
        int i11 = 1;
        D d3 = this.f12126x;
        d3.getClass();
        if (i10 != 0) {
            return p125n.j.b(this.f12121s, callback, i10);
        }
        h hVar = new h(d3.f11922C, callback);
        e0 e0Var = d3.f11932M;
        if (e0Var != null) {
            e0Var.b();
        }
        o1.k kVar = new o1.k(d3, hVar, z6);
        d3.C();
        j jVar = d3.f11926G;
        if (jVar != null) {
            d3.f11932M = jVar.T(kVar);
        }
        if (d3.f11932M == null) {
            C0417d0 c0417d0 = d3.f11935Q;
            if (c0417d0 != null) {
                c0417d0.b();
            }
            e0 e0Var2 = d3.f11932M;
            if (e0Var2 != null) {
                e0Var2.b();
            }
            if (d3.f11933N == null) {
                if (d3.f11945a0) {
                    TypedValue typedValue = new TypedValue();
                    Context context = d3.f11922C;
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        b bVar = new b(context, 0);
                        bVar.getTheme().setTo(themeNewTheme);
                        context = bVar;
                    }
                    d3.f11933N = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    d3.f11934O = popupWindow;
                    p000a0.k.d(popupWindow, 2);
                    d3.f11934O.setContentView(d3.f11933N);
                    d3.f11934O.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    d3.f11933N.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    d3.f11934O.setHeight(-2);
                    d3.P = new r(d3, i11);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) d3.f11937S.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(d3.y()));
                        d3.f11933N = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (d3.f11933N != null) {
                C0417d0 c0417d1 = d3.f11935Q;
                if (c0417d1 != null) {
                    c0417d1.b();
                }
                d3.f11933N.e();
                Context context2 = d3.f11933N.getContext();
                ActionBarContextView actionBarContextView = d3.f11933N;
                c cVar = new c();
                cVar.f13234v = context2;
                cVar.f13235w = actionBarContextView;
                cVar.f13236x = kVar;
                l lVar = new l(actionBarContextView.getContext());
                lVar.f13495D = 1;
                cVar.f13233A = lVar;
                lVar.f13511w = cVar;
                if (((h) kVar.f13638s).m(cVar, lVar)) {
                    cVar.i();
                    d3.f11933N.c(cVar);
                    d3.f11932M = cVar;
                    if (d3.f11936R && (viewGroup = d3.f11937S) != null && viewGroup.isLaidOut()) {
                        d3.f11933N.setAlpha(0.0f);
                        C0417d0 c0417d0A = U.a(d3.f11933N);
                        c0417d0A.a(1.0f);
                        d3.f11935Q = c0417d0A;
                        c0417d0A.d(new u(d3, i11));
                    } else {
                        d3.f11933N.setAlpha(1.0f);
                        d3.f11933N.setVisibility(0);
                        if (d3.f11933N.getParent() instanceof View) {
                            View view = (View) d3.f11933N.getParent();
                            WeakHashMap weakHashMap = U.a;
                            F.c(view);
                        }
                    }
                    if (d3.f11934O != null) {
                        d3.f11923D.getDecorView().post(d3.P);
                    }
                } else {
                    d3.f11932M = null;
                }
            }
            d3.K();
            d3.f11932M = d3.f11932M;
        }
        d3.K();
        e0 e0Var3 = d3.f11932M;
        if (e0Var3 != null) {
            return hVar.f(e0Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f12121s.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
