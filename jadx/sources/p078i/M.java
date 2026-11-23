package p078i;

import A1.J;
import A1.RunnableC0094c;
import J7.j;
import P0.d;
import U.U;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.T0;
import p.X0;
import p068ga.l;
import p136o.n;

/* JADX INFO: loaded from: classes.dex */
public final class M extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X0 f11983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f11984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L f11985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f11989h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RunnableC0094c f11990i = new RunnableC0094c(this, 25);

    public M(Toolbar toolbar, CharSequence charSequence, z zVar) {
        L l4 = new L(this);
        toolbar.getClass();
        X0 x8 = new X0(toolbar, false);
        this.f11983b = x8;
        zVar.getClass();
        this.f11984c = zVar;
        x8.f14016k = zVar;
        toolbar.setOnMenuItemClickListener(l4);
        if (!x8.f14013g) {
            x8.f14014h = charSequence;
            if ((x8.f14008b & 8) != 0) {
                Toolbar toolbar2 = x8.a;
                toolbar2.setTitle(charSequence);
                if (x8.f14013g) {
                    U.o(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f11985d = new L(this);
    }

    @Override // J7.j
    public final boolean A(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            B();
        }
        return true;
    }

    @Override // J7.j
    public final boolean B() {
        return this.f11983b.a.v();
    }

    @Override // J7.j
    public final void H(boolean z6) {
        int i10 = z6 ? 4 : 0;
        X0 x8 = this.f11983b;
        x8.a((i10 & 4) | (x8.f14008b & (-5)));
    }

    @Override // J7.j
    public final void J(int i10) {
        this.f11983b.b(i10);
    }

    @Override // J7.j
    public final void K(int i10) {
        X0 x8 = this.f11983b;
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
        X0 x8 = this.f11983b;
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
    public final void R(CharSequence charSequence) {
        X0 x8 = this.f11983b;
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
        X0 x8 = this.f11983b;
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

    public final Menu a0() {
        boolean z6 = this.f11987f;
        X0 x8 = this.f11983b;
        if (!z6) {
            J j = new J(this, 8);
            d dVar = new d(this, 28);
            Toolbar toolbar = x8.a;
            toolbar.f6232i0 = j;
            toolbar.f6233j0 = dVar;
            ActionMenuView actionMenuView = toolbar.f6239s;
            if (actionMenuView != null) {
                actionMenuView.f6134M = j;
                actionMenuView.f6135N = dVar;
            }
            this.f11987f = true;
        }
        return x8.a.getMenu();
    }

    @Override // J7.j
    public final boolean e() {
        b bVar;
        ActionMenuView actionMenuView = this.f11983b.a.f6239s;
        return (actionMenuView == null || (bVar = actionMenuView.f6133L) == null || !bVar.b()) ? false : true;
    }

    @Override // J7.j
    public final boolean f() {
        n nVar;
        T0 t7 = this.f11983b.a.f6231h0;
        if (t7 == null || (nVar = t7.f13994t) == null) {
            return false;
        }
        if (t7 == null) {
            nVar = null;
        }
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // J7.j
    public final void j(boolean z6) {
        if (z6 == this.f11988g) {
            return;
        }
        this.f11988g = z6;
        ArrayList arrayList = this.f11989h;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // J7.j
    public final int k() {
        return this.f11983b.f14008b;
    }

    @Override // J7.j
    public final Context n() {
        return this.f11983b.a.getContext();
    }

    @Override // J7.j
    public final boolean p() {
        X0 x8 = this.f11983b;
        Toolbar toolbar = x8.a;
        RunnableC0094c runnableC0094c = this.f11990i;
        toolbar.removeCallbacks(runnableC0094c);
        Toolbar toolbar2 = x8.a;
        WeakHashMap weakHashMap = U.a;
        toolbar2.postOnAnimation(runnableC0094c);
        return true;
    }

    @Override // J7.j
    public final void x() {
        this.f11983b.a.removeCallbacks(this.f11990i);
    }

    @Override // J7.j
    public final boolean z(int i10, KeyEvent keyEvent) {
        Menu menuA0 = a0();
        if (menuA0 == null) {
            return false;
        }
        menuA0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuA0.performShortcut(i10, keyEvent, 0);
    }

    @Override // J7.j
    public final void M() {
    }

    @Override // J7.j
    public final void w() {
    }

    @Override // J7.j
    public final void G(boolean z6) {
    }

    @Override // J7.j
    public final void P(boolean z6) {
    }
}
