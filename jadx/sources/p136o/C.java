package p136o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.kcstream.cing.R;
import p.C0722p0;
import p.F0;
import p118m3.k;

/* JADX INFO: loaded from: classes.dex */
public final class C extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public u f13414C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f13415D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f13416E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public w f13417F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ViewTreeObserver f13418G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13419H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f13420I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f13421J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f13423L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f13424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f13425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f13426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f13427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f13428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f13429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final F0 f13430z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final k f13412A = new k(this, 2);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0686d f13413B = new ViewOnAttachStateChangeListenerC0686d(this, 1);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f13422K = 0;

    public C(int i10, Context context, View view, l lVar, boolean z6) {
        this.f13424t = context;
        this.f13425u = lVar;
        this.f13427w = z6;
        this.f13426v = new i(lVar, LayoutInflater.from(context), z6, R.layout.abc_popup_menu_item_layout);
        this.f13429y = i10;
        Resources resources = context.getResources();
        this.f13428x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f13415D = view;
        this.f13430z = new F0(context, null, i10);
        lVar.b(this, context);
    }

    @Override // p136o.B
    public final void a() {
        View view;
        if (b()) {
            return;
        }
        if (this.f13419H || (view = this.f13415D) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f13416E = view;
        F0 f0 = this.f13430z;
        f0.f13918R.setOnDismissListener(this);
        f0.f13909H = this;
        f0.f13917Q = true;
        f0.f13918R.setFocusable(true);
        View view2 = this.f13416E;
        boolean z6 = this.f13418G == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f13418G = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f13412A);
        }
        view2.addOnAttachStateChangeListener(this.f13413B);
        f0.f13908G = view2;
        f0.f13905D = this.f13422K;
        boolean z10 = this.f13420I;
        Context context = this.f13424t;
        i iVar = this.f13426v;
        if (!z10) {
            this.f13421J = t.o(iVar, context, this.f13428x);
            this.f13420I = true;
        }
        f0.r(this.f13421J);
        f0.f13918R.setInputMethodMode(2);
        Rect rect = this.f13554s;
        f0.P = rect != null ? new Rect(rect) : null;
        f0.a();
        C0722p0 c0722p0 = f0.f13921u;
        c0722p0.setOnKeyListener(this);
        if (this.f13423L) {
            l lVar = this.f13425u;
            if (lVar.f13496E != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0722p0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(lVar.f13496E);
                }
                frameLayout.setEnabled(false);
                c0722p0.addHeaderView(frameLayout, null, false);
            }
        }
        f0.p(iVar);
        f0.a();
    }

    @Override // p136o.B
    public final boolean b() {
        return !this.f13419H && this.f13430z.f13918R.isShowing();
    }

    @Override // p136o.x
    public final void c(l lVar, boolean z6) {
        if (lVar != this.f13425u) {
            return;
        }
        dismiss();
        w wVar = this.f13417F;
        if (wVar != null) {
            wVar.c(lVar, z6);
        }
    }

    @Override // p136o.B
    public final void dismiss() {
        if (b()) {
            this.f13430z.dismiss();
        }
    }

    @Override // p136o.x
    public final void e(boolean z6) {
        this.f13420I = false;
        i iVar = this.f13426v;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // p136o.B
    public final C0722p0 f() {
        return this.f13430z.f13921u;
    }

    @Override // p136o.x
    public final void h(w wVar) {
        this.f13417F = wVar;
    }

    @Override // p136o.x
    public final boolean j() {
        return false;
    }

    @Override // p136o.x
    public final Parcelable k() {
        return null;
    }

    @Override // p136o.x
    public final boolean l(D d3) {
        if (d3.hasVisibleItems()) {
            View view = this.f13416E;
            v vVar = new v(this.f13429y, this.f13424t, view, d3, this.f13427w);
            w wVar = this.f13417F;
            vVar.f13563h = wVar;
            t tVar = vVar.f13564i;
            if (tVar != null) {
                tVar.h(wVar);
            }
            boolean zW = t.w(d3);
            vVar.f13562g = zW;
            t tVar2 = vVar.f13564i;
            if (tVar2 != null) {
                tVar2.q(zW);
            }
            vVar.j = this.f13414C;
            this.f13414C = null;
            this.f13425u.c(false);
            F0 f0 = this.f13430z;
            int width = f0.f13924x;
            int iM = f0.m();
            if ((Gravity.getAbsoluteGravity(this.f13422K, this.f13415D.getLayoutDirection()) & 7) == 5) {
                width += this.f13415D.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f13560e != null) {
                    vVar.d(width, iM, true, true);
                }
            }
            w wVar2 = this.f13417F;
            if (wVar2 != null) {
                wVar2.l(d3);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f13419H = true;
        this.f13425u.c(true);
        ViewTreeObserver viewTreeObserver = this.f13418G;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f13418G = this.f13416E.getViewTreeObserver();
            }
            this.f13418G.removeGlobalOnLayoutListener(this.f13412A);
            this.f13418G = null;
        }
        this.f13416E.removeOnAttachStateChangeListener(this.f13413B);
        u uVar = this.f13414C;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p136o.t
    public final void p(View view) {
        this.f13415D = view;
    }

    @Override // p136o.t
    public final void q(boolean z6) {
        this.f13426v.f13487c = z6;
    }

    @Override // p136o.t
    public final void r(int i10) {
        this.f13422K = i10;
    }

    @Override // p136o.t
    public final void s(int i10) {
        this.f13430z.f13924x = i10;
    }

    @Override // p136o.t
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f13414C = (u) onDismissListener;
    }

    @Override // p136o.t
    public final void u(boolean z6) {
        this.f13423L = z6;
    }

    @Override // p136o.t
    public final void v(int i10) {
        this.f13430z.i(i10);
    }

    @Override // p136o.x
    public final void d(Parcelable parcelable) {
    }

    @Override // p136o.t
    public final void n(l lVar) {
    }
}
