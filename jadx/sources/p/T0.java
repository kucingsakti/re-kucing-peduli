package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements p136o.x {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p136o.l f13993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p136o.n f13994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Toolbar f13995u;

    public T0(Toolbar toolbar) {
        this.f13995u = toolbar;
    }

    @Override // p136o.x
    public final void e(boolean z6) {
        if (this.f13994t != null) {
            p136o.l lVar = this.f13993s;
            if (lVar != null) {
                int size = lVar.f13512x.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f13993s.getItem(i10) == this.f13994t) {
                        return;
                    }
                }
            }
            m(this.f13994t);
        }
    }

    @Override // p136o.x
    public final boolean g(p136o.n nVar) {
        Toolbar toolbar = this.f13995u;
        toolbar.c();
        ViewParent parent = toolbar.f6246z.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f6246z);
            }
            toolbar.addView(toolbar.f6246z);
        }
        View actionView = nVar.getActionView();
        toolbar.f6204A = actionView;
        this.f13994t = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f6204A);
            }
            U0 u0H = Toolbar.h();
            u0H.a = (toolbar.f6209F & 112) | 8388611;
            u0H.f13996b = 2;
            toolbar.f6204A.setLayoutParams(u0H);
            toolbar.addView(toolbar.f6204A);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((U0) childAt.getLayoutParams()).f13996b != 2 && childAt != toolbar.f6239s) {
                toolbar.removeViewAt(childCount);
                toolbar.f6225W.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f13537U = true;
        nVar.f13523F.p(false);
        KeyEvent.Callback callback = toolbar.f6204A;
        if (callback instanceof p125n.a) {
            ((p136o.p) ((p125n.a) callback)).f13548s.onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // p136o.x
    public final int getId() {
        return 0;
    }

    @Override // p136o.x
    public final void i(Context context, p136o.l lVar) {
        p136o.n nVar;
        p136o.l lVar2 = this.f13993s;
        if (lVar2 != null && (nVar = this.f13994t) != null) {
            lVar2.d(nVar);
        }
        this.f13993s = lVar;
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
    public final boolean l(p136o.D d3) {
        return false;
    }

    @Override // p136o.x
    public final boolean m(p136o.n nVar) {
        Toolbar toolbar = this.f13995u;
        KeyEvent.Callback callback = toolbar.f6204A;
        if (callback instanceof p125n.a) {
            ((p136o.p) ((p125n.a) callback)).f13548s.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f6204A);
        toolbar.removeView(toolbar.f6246z);
        toolbar.f6204A = null;
        ArrayList arrayList = toolbar.f6225W;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f13994t = null;
        toolbar.requestLayout();
        nVar.f13537U = false;
        nVar.f13523F.p(false);
        toolbar.w();
        return true;
    }

    @Override // p136o.x
    public final void d(Parcelable parcelable) {
    }

    @Override // p136o.x
    public final void c(p136o.l lVar, boolean z6) {
    }
}
