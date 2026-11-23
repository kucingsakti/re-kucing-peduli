package p078i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p068ga.l;
import p125n.b;

/* JADX INFO: loaded from: classes.dex */
public final class B extends ContentFrameLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ D f11903A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d3, b bVar) {
        super(bVar, null);
        this.f11903A = d3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f11903A.u(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (x8 < -5 || y6 < -5 || x8 > getWidth() + 5 || y6 > getHeight() + 5) {
                D d3 = this.f11903A;
                d3.s(d3.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(l.g(getContext(), i10));
    }
}
