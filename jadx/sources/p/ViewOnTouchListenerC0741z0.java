package p;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: p.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0741z0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A0 f14164s;

    public ViewOnTouchListenerC0741z0(A0 a10) {
        this.f14164s = a10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0736x c0736x;
        int action = motionEvent.getAction();
        int x8 = (int) motionEvent.getX();
        int y6 = (int) motionEvent.getY();
        A0 a10 = this.f14164s;
        if (action == 0 && (c0736x = a10.f13918R) != null && c0736x.isShowing() && x8 >= 0 && x8 < a10.f13918R.getWidth() && y6 >= 0 && y6 < a10.f13918R.getHeight()) {
            a10.f13915N.postDelayed(a10.f13911J, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        a10.f13915N.removeCallbacks(a10.f13911J);
        return false;
    }
}
