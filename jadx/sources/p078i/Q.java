package p078i;

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
import p125n.g;
import p136o.j;
import p136o.l;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends e0 implements j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f11997v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f11998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k f11999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WeakReference f12000y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ S f12001z;

    public Q(S s9, Context context, k kVar) {
        this.f12001z = s9;
        this.f11997v = context;
        this.f11999x = kVar;
        l lVar = new l(context);
        lVar.f13495D = 1;
        this.f11998w = lVar;
        lVar.f13511w = this;
    }

    @Override // L8.e0
    public final void b() {
        S s9 = this.f12001z;
        if (s9.j != this) {
            return;
        }
        if (s9.f12018q) {
            s9.f12012k = this;
            s9.f12013l = this.f11999x;
        } else {
            this.f11999x.p(this);
        }
        this.f11999x = null;
        s9.a0(false);
        ActionBarContextView actionBarContextView = s9.f12009g;
        if (actionBarContextView.f6080C == null) {
            actionBarContextView.e();
        }
        s9.f12006d.setHideOnContentScrollEnabled(s9.f12023v);
        s9.j = null;
    }

    @Override // L8.e0
    public final View c() {
        WeakReference weakReference = this.f12000y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // L8.e0
    public final l e() {
        return this.f11998w;
    }

    @Override // L8.e0
    public final MenuInflater f() {
        return new g(this.f11997v);
    }

    @Override // L8.e0
    public final CharSequence g() {
        return this.f12001z.f12009g.getSubtitle();
    }

    @Override // L8.e0
    public final CharSequence h() {
        return this.f12001z.f12009g.getTitle();
    }

    @Override // L8.e0
    public final void i() {
        if (this.f12001z.j != this) {
            return;
        }
        l lVar = this.f11998w;
        lVar.y();
        try {
            this.f11999x.r(this, lVar);
        } finally {
            lVar.x();
        }
    }

    @Override // L8.e0
    public final boolean j() {
        return this.f12001z.f12009g.f6088K;
    }

    @Override // p136o.j
    public final boolean k(l lVar, MenuItem menuItem) {
        k kVar = this.f11999x;
        if (kVar != null) {
            return ((h) kVar.f13638s).l(this, menuItem);
        }
        return false;
    }

    @Override // L8.e0
    public final void m(View view) {
        this.f12001z.f12009g.setCustomView(view);
        this.f12000y = new WeakReference(view);
    }

    @Override // L8.e0
    public final void n(int i10) {
        o(this.f12001z.f12004b.getResources().getString(i10));
    }

    @Override // L8.e0
    public final void o(CharSequence charSequence) {
        this.f12001z.f12009g.setSubtitle(charSequence);
    }

    @Override // L8.e0
    public final void p(int i10) {
        q(this.f12001z.f12004b.getResources().getString(i10));
    }

    @Override // L8.e0
    public final void q(CharSequence charSequence) {
        this.f12001z.f12009g.setTitle(charSequence);
    }

    @Override // p136o.j
    public final void r(l lVar) {
        if (this.f11999x == null) {
            return;
        }
        i();
        b bVar = this.f12001z.f12009g.f6093v;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // L8.e0
    public final void s(boolean z6) {
        this.f2816t = z6;
        this.f12001z.f12009g.setTitleOptional(z6);
    }
}
