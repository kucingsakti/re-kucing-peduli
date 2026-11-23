package p206v3;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import p053f4.e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f15423t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(27);
        this.f15423t = i10;
    }

    @Override // p053f4.e
    public final void r(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float fCos;
        float fCos2;
        switch (this.f15423t) {
            case 0:
                RectF rectFO = e.o(tabLayout, view);
                RectF rectFO2 = e.o(tabLayout, view2);
                if (rectFO.left < rectFO2.left) {
                    double d3 = (((double) f10) * 3.141592653589793d) / 2.0d;
                    fCos2 = (float) (1.0d - Math.cos(d3));
                    fCos = (float) Math.sin(d3);
                } else {
                    double d8 = (((double) f10) * 3.141592653589793d) / 2.0d;
                    float fSin = (float) Math.sin(d8);
                    fCos = (float) (1.0d - Math.cos(d8));
                    fCos2 = fSin;
                }
                drawable.setBounds(R2.a.c((int) rectFO.left, fCos2, (int) rectFO2.left), drawable.getBounds().top, R2.a.c((int) rectFO.right, fCos, (int) rectFO2.right), drawable.getBounds().bottom);
                break;
            default:
                if (f10 >= 0.5f) {
                    view = view2;
                }
                RectF rectFO3 = e.o(tabLayout, view);
                float fB = f10 < 0.5f ? R2.a.b(1.0f, 0.0f, 0.0f, 0.5f, f10) : R2.a.b(0.0f, 1.0f, 0.5f, 1.0f, f10);
                drawable.setBounds((int) rectFO3.left, drawable.getBounds().top, (int) rectFO3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (fB * 255.0f));
                break;
        }
    }
}
