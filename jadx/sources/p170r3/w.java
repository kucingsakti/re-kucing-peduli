package p170r3;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import p023c3.c;

/* JADX INFO: loaded from: classes.dex */
public final class w extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14556f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14557g = 0.0f;

    public w(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new c(this, 1));
    }

    @Override // p170r3.v
    public final void a(NavigationView navigationView) {
        j jVar;
        j jVar2;
        RectF rectF;
        j jVar3 = this.f14553c;
        this.f14557g = (jVar3 == null || (rectF = this.f14554d) == null) ? 0.0f : jVar3.f14514f.a(rectF);
        boolean z6 = false;
        if ((this.f14554d.isEmpty() || (jVar2 = this.f14553c) == null) ? false : jVar2.e(this.f14554d)) {
            z6 = true;
        } else if (!this.f14554d.isEmpty() && (jVar = this.f14553c) != null && this.f14552b && !jVar.e(this.f14554d)) {
            j jVar4 = this.f14553c;
            if ((jVar4.a instanceof i) && (jVar4.f14510b instanceof i) && (jVar4.f14512d instanceof i) && (jVar4.f14511c instanceof i)) {
                float fA = jVar4.f14513e.a(this.f14554d);
                float fA2 = this.f14553c.f14514f.a(this.f14554d);
                float fA3 = this.f14553c.f14516h.a(this.f14554d);
                float fA4 = this.f14553c.f14515g.a(this.f14554d);
                if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                    RectF rectF2 = this.f14554d;
                    rectF2.set(rectF2.left - fA2, rectF2.top, rectF2.right, rectF2.bottom);
                    this.f14557g = fA2;
                } else if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                    RectF rectF3 = this.f14554d;
                    rectF3.set(rectF3.left, rectF3.top - fA3, rectF3.right, rectF3.bottom);
                    this.f14557g = fA3;
                } else if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                    RectF rectF4 = this.f14554d;
                    rectF4.set(rectF4.left, rectF4.top, rectF4.right + fA, rectF4.bottom);
                    this.f14557g = fA;
                } else if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                    RectF rectF5 = this.f14554d;
                    rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fA);
                    this.f14557g = fA;
                }
                z6 = true;
            }
        }
        this.f14556f = z6;
        navigationView.setClipToOutline(!b());
        if (b()) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // p170r3.v
    public final boolean b() {
        return !this.f14556f || this.a;
    }
}
