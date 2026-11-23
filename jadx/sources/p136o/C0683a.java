package p136o;

import O.a;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0683a implements a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Context f13433A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f13434B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f13435C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f13436D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f13437E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f13438F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f13439G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f13440H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f13441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f13442t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Intent f13443u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public char f13444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public char f13446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13447y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f13448z;

    @Override // O.a
    public final o a() {
        return null;
    }

    @Override // O.a
    public final a b(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f13448z;
        if (drawable != null) {
            if (this.f13438F || this.f13439G) {
                this.f13448z = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f13448z = drawableMutate;
                if (this.f13438F) {
                    M.a.h(drawableMutate, this.f13436D);
                }
                if (this.f13439G) {
                    M.a.i(this.f13448z, this.f13437E);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // O.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13447y;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13446x;
    }

    @Override // O.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13434B;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f13448z;
    }

    @Override // O.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13436D;
    }

    @Override // O.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13437E;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f13443u;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // O.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13445w;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f13444v;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13441s;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13442t;
        return charSequence != null ? charSequence : this.f13441s;
    }

    @Override // O.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13435C;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f13440H & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f13440H & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f13440H & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f13440H & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f13446x = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f13440H = (z6 ? 1 : 0) | (this.f13440H & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f13440H = (z6 ? 2 : 0) | (this.f13440H & (-3));
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final a setContentDescription(CharSequence charSequence) {
        this.f13434B = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f13440H = (z6 ? 16 : 0) | (this.f13440H & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f13448z = drawable;
        c();
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13436D = colorStateList;
        this.f13438F = true;
        c();
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13437E = mode;
        this.f13439G = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f13443u = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f13444v = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f13444v = c10;
        this.f13446x = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13441s = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13442t = charSequence;
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final a setTooltipText(CharSequence charSequence) {
        this.f13435C = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        this.f13440H = (this.f13440H & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f13446x = Character.toLowerCase(c10);
        this.f13447y = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13434B = charSequence;
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f13444v = c10;
        this.f13445w = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f13441s = this.f13433A.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13435C = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f13448z = J.a.b(this.f13433A, i10);
        c();
        return this;
    }

    @Override // O.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f13444v = c10;
        this.f13445w = KeyEvent.normalizeMetaState(i10);
        this.f13446x = Character.toLowerCase(c11);
        this.f13447y = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
