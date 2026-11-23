package p234y3;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ View f16040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f16041t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p072h3.a f16042u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f16043v;

    public a(ExpandableBehavior expandableBehavior, View view, int i10, p072h3.a aVar) {
        this.f16043v = expandableBehavior;
        this.f16040s = view;
        this.f16041t = i10;
        this.f16042u = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f16040s;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f16043v;
        if (expandableBehavior.f9969s == this.f16041t) {
            Object obj = this.f16042u;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).f9721G.a, false);
        }
        return false;
    }
}
