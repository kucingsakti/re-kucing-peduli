package p156q0;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f;

/* JADX INFO: loaded from: classes.dex */
public final class z implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f14378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f14379t;

    public z(A a, f fVar) {
        this.f14379t = a;
        this.f14378s = fVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        f fVar = this.f14378s;
        fVar.k();
        C0752k.i((ViewGroup) fVar.f6701c.c0.getParent(), this.f14379t.f14251s).h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
