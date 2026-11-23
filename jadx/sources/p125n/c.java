package p125n;

import L8.e0;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.b;
import java.lang.ref.WeakReference;
import o1.h;
import o1.k;
import p136o.j;
import p136o.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e0 implements j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public l f13233A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Context f13234v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ActionBarContextView f13235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k f13236x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WeakReference f13237y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13238z;

    @Override // L8.e0
    public final void b() {
        if (this.f13238z) {
            return;
        }
        this.f13238z = true;
        this.f13236x.p(this);
    }

    @Override // L8.e0
    public final View c() {
        WeakReference weakReference = this.f13237y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // L8.e0
    public final l e() {
        return this.f13233A;
    }

    @Override // L8.e0
    public final MenuInflater f() {
        return new g(this.f13235w.getContext());
    }

    @Override // L8.e0
    public final CharSequence g() {
        return this.f13235w.getSubtitle();
    }

    @Override // L8.e0
    public final CharSequence h() {
        return this.f13235w.getTitle();
    }

    @Override // L8.e0
    public final void i() {
        this.f13236x.r(this, this.f13233A);
    }

    @Override // L8.e0
    public final boolean j() {
        return this.f13235w.f6088K;
    }

    @Override // p136o.j
    public final boolean k(l lVar, MenuItem menuItem) {
        return ((h) this.f13236x.f13638s).l(this, menuItem);
    }

    @Override // L8.e0
    public final void m(View view) {
        this.f13235w.setCustomView(view);
        this.f13237y = view != null ? new WeakReference(view) : null;
    }

    @Override // L8.e0
    public final void n(int i10) {
        o(this.f13234v.getString(i10));
    }

    @Override // L8.e0
    public final void o(CharSequence charSequence) {
        this.f13235w.setSubtitle(charSequence);
    }

    @Override // L8.e0
    public final void p(int i10) {
        q(this.f13234v.getString(i10));
    }

    @Override // L8.e0
    public final void q(CharSequence charSequence) {
        this.f13235w.setTitle(charSequence);
    }

    @Override // p136o.j
    public final void r(l lVar) {
        i();
        b bVar = this.f13235w.f6093v;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // L8.e0
    public final void s(boolean z6) {
        this.f2816t = z6;
        this.f13235w.setTitleOptional(z6);
    }
}
