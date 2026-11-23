package J0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class q extends C0263m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2350r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj, Context context, int i10) {
        super(context);
        this.f2349q = i10;
        this.f2350r = obj;
    }

    @Override // J0.C0263m
    public int b(View view, int i10) {
        switch (this.f2349q) {
            case 2:
                ((CarouselLayoutManager) this.f2350r).getClass();
                return 0;
            default:
                return super.b(view, i10);
        }
    }

    @Override // J0.C0263m
    public int c(View view, int i10) {
        switch (this.f2349q) {
            case 2:
                ((CarouselLayoutManager) this.f2350r).getClass();
                return 0;
            default:
                return super.c(view, i10);
        }
    }

    @Override // J0.C0263m
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2349q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // J0.C0263m
    public int e(int i10) {
        switch (this.f2349q) {
            case 0:
                return Math.min(100, super.e(i10));
            default:
                return super.e(i10);
        }
    }

    @Override // J0.C0263m
    public PointF f(int i10) {
        switch (this.f2349q) {
            case 2:
                ((CarouselLayoutManager) this.f2350r).getClass();
                return null;
            default:
                return super.f(i10);
        }
    }

    @Override // J0.C0263m
    public void h(View view, B b3) {
        switch (this.f2349q) {
            case 0:
                C0264n c0264n = (C0264n) this.f2350r;
                int[] iArrB = c0264n.b(c0264n.a.getLayoutManager(), view);
                int i10 = iArrB[0];
                int i11 = iArrB[1];
                int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.j;
                    b3.a = i10;
                    b3.f2219b = i11;
                    b3.f2220c = iCeil;
                    b3.f2222e = decelerateInterpolator;
                    b3.f2223f = true;
                }
                break;
            case 1:
                C0264n c0264n2 = (C0264n) this.f2350r;
                RecyclerView recyclerView = c0264n2.a;
                if (recyclerView != null) {
                    int[] iArrB2 = c0264n2.b(recyclerView.getLayoutManager(), view);
                    int i12 = iArrB2[0];
                    int i13 = iArrB2[1];
                    int iCeil2 = (int) Math.ceil(((double) e(Math.max(Math.abs(i12), Math.abs(i13)))) / 0.3356d);
                    if (iCeil2 > 0) {
                        DecelerateInterpolator decelerateInterpolator2 = this.j;
                        b3.a = i12;
                        b3.f2219b = i13;
                        b3.f2220c = iCeil2;
                        b3.f2222e = decelerateInterpolator2;
                        b3.f2223f = true;
                    }
                    break;
                }
                break;
            default:
                super.h(view, b3);
                break;
        }
    }
}
