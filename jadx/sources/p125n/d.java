package p125n;

import L8.e0;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p136o.A;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ActionMode {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f13239b;

    public d(Context context, e0 e0Var) {
        this.a = context;
        this.f13239b = e0Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f13239b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f13239b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new A(this.a, this.f13239b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f13239b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f13239b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f13239b.f2817u;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f13239b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f13239b.f2816t;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f13239b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f13239b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f13239b.m(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f13239b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f13239b.f2817u = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f13239b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z6) {
        this.f13239b.s(z6);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f13239b.n(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f13239b.p(i10);
    }
}
