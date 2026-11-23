package p136o;

import O.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p068ga.l;
import p102k7.e;

/* JADX INFO: loaded from: classes.dex */
public final class n implements a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public char f13519B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Drawable f13521D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final l f13523F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public D f13524G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f13525H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f13526I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CharSequence f13527J;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f13533Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public View f13534R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public o f13535S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f13536T;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f13540u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f13541v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f13542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f13543x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Intent f13544y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public char f13545z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f13518A = 4096;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f13520C = 4096;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f13522E = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ColorStateList f13528K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public PorterDuff.Mode f13529L = null;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f13530M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f13531N = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f13532O = false;
    public int P = 16;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f13537U = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f13523F = lVar;
        this.f13538s = i11;
        this.f13539t = i10;
        this.f13540u = i12;
        this.f13541v = i13;
        this.f13542w = charSequence;
        this.f13533Q = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    @Override // O.a
    public final o a() {
        return this.f13535S;
    }

    @Override // O.a
    public final a b(o oVar) {
        this.f13534R = null;
        this.f13535S = oVar;
        this.f13523F.p(true);
        o oVar2 = this.f13535S;
        if (oVar2 != null) {
            oVar2.a = new e(this);
            oVar2.f13546b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f13533Q & 8) == 0) {
            return false;
        }
        if (this.f13534R == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13536T;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f13523F.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f13532O && (this.f13530M || this.f13531N)) {
            drawable = drawable.mutate();
            if (this.f13530M) {
                M.a.h(drawable, this.f13528K);
            }
            if (this.f13531N) {
                M.a.i(drawable, this.f13529L);
            }
            this.f13532O = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f13533Q & 8) != 0) {
            if (this.f13534R == null && (oVar = this.f13535S) != null) {
                this.f13534R = oVar.f13546b.onCreateActionView(this);
            }
            if (this.f13534R != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13536T;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f13523F.f(this);
        }
        return false;
    }

    public final void f(boolean z6) {
        this.P = (z6 ? 4 : 0) | (this.P & (-5));
    }

    public final void g(boolean z6) {
        if (z6) {
            this.P |= 32;
        } else {
            this.P &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f13534R;
        if (view != null) {
            return view;
        }
        o oVar = this.f13535S;
        if (oVar == null) {
            return null;
        }
        View viewOnCreateActionView = oVar.f13546b.onCreateActionView(this);
        this.f13534R = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // O.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13520C;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13519B;
    }

    @Override // O.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13526I;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f13539t;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f13521D;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f13522E;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableG = l.g(this.f13523F.f13507s, i10);
        this.f13522E = 0;
        this.f13521D = drawableG;
        return d(drawableG);
    }

    @Override // O.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13528K;
    }

    @Override // O.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13529L;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f13544y;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f13538s;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // O.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13518A;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f13545z;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f13540u;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f13524G;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13542w;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13543x;
        return charSequence != null ? charSequence : this.f13542w;
    }

    @Override // O.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13527J;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f13524G != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f13537U;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.P & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.P & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.P & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.f13535S;
        if (oVar == null || !oVar.f13546b.overridesItemVisibility()) {
            return (this.P & 8) == 0;
        }
        return (this.P & 8) == 0 && this.f13535S.f13546b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f13534R = view;
        this.f13535S = null;
        if (view != null && view.getId() == -1 && (i10 = this.f13538s) > 0) {
            view.setId(i10);
        }
        l lVar = this.f13523F;
        lVar.f13494C = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f13519B == c10) {
            return this;
        }
        this.f13519B = Character.toLowerCase(c10);
        this.f13523F.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        int i10 = this.P;
        int i11 = (z6 ? 1 : 0) | (i10 & (-2));
        this.P = i11;
        if (i10 != i11) {
            this.f13523F.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        int i10 = this.P;
        if ((i10 & 4) == 0) {
            int i11 = (i10 & (-3)) | (z6 ? 2 : 0);
            this.P = i11;
            if (i10 != i11) {
                this.f13523F.p(false);
            }
            return this;
        }
        l lVar = this.f13523F;
        lVar.getClass();
        ArrayList arrayList = lVar.f13512x;
        int size = arrayList.size();
        lVar.y();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f13539t == this.f13539t && (nVar.P & 4) != 0 && nVar.isCheckable()) {
                boolean z10 = nVar == this;
                int i13 = nVar.P;
                int i14 = (z10 ? 2 : 0) | (i13 & (-3));
                nVar.P = i14;
                if (i13 != i14) {
                    nVar.f13523F.p(false);
                }
            }
        }
        lVar.x();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.P |= 16;
        } else {
            this.P &= -17;
        }
        this.f13523F.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f13522E = 0;
        this.f13521D = drawable;
        this.f13532O = true;
        this.f13523F.p(false);
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13528K = colorStateList;
        this.f13530M = true;
        this.f13532O = true;
        this.f13523F.p(false);
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13529L = mode;
        this.f13531N = true;
        this.f13532O = true;
        this.f13523F.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f13544y = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f13545z == c10) {
            return this;
        }
        this.f13545z = c10;
        this.f13523F.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13536T = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13525H = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f13545z = c10;
        this.f13519B = Character.toLowerCase(c11);
        this.f13523F.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13533Q = i10;
        l lVar = this.f13523F;
        lVar.f13494C = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13542w = charSequence;
        this.f13523F.p(false);
        D d3 = this.f13524G;
        if (d3 != null) {
            d3.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13543x = charSequence;
        this.f13523F.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        int i10 = this.P;
        int i11 = (z6 ? 0 : 8) | (i10 & (-9));
        this.P = i11;
        if (i10 != i11) {
            l lVar = this.f13523F;
            lVar.f13514z = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f13542w;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // O.a, android.view.MenuItem
    public final a setContentDescription(CharSequence charSequence) {
        this.f13526I = charSequence;
        this.f13523F.p(false);
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final a setTooltipText(CharSequence charSequence) {
        this.f13527J = charSequence;
        this.f13523F.p(false);
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f13519B == c10 && this.f13520C == i10) {
            return this;
        }
        this.f13519B = Character.toLowerCase(c10);
        this.f13520C = KeyEvent.normalizeMetaState(i10);
        this.f13523F.p(false);
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f13545z == c10 && this.f13518A == i10) {
            return this;
        }
        this.f13545z = c10;
        this.f13518A = KeyEvent.normalizeMetaState(i10);
        this.f13523F.p(false);
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f13545z = c10;
        this.f13518A = KeyEvent.normalizeMetaState(i10);
        this.f13519B = Character.toLowerCase(c11);
        this.f13520C = KeyEvent.normalizeMetaState(i11);
        this.f13523F.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f13521D = null;
        this.f13522E = i10;
        this.f13532O = true;
        this.f13523F.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f13523F.f13507s.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        Context context = this.f13523F.f13507s;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f13534R = viewInflate;
        this.f13535S = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f13538s) > 0) {
            viewInflate.setId(i11);
        }
        l lVar = this.f13523F;
        lVar.f13494C = true;
        lVar.p(true);
        return this;
    }
}
