package J0;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: J0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0253c extends A {
    public final /* synthetic */ C0255e a;

    public C0253c(C0255e c0255e) {
        this.a = c0255e;
    }

    @Override // J0.A
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0255e c0255e = this.a;
        int iComputeVerticalScrollRange = c0255e.f2295s.computeVerticalScrollRange();
        int i12 = c0255e.f2294r;
        int i13 = iComputeVerticalScrollRange - i12;
        int i14 = c0255e.a;
        c0255e.f2296t = i13 > 0 && i12 >= i14;
        int iComputeHorizontalScrollRange = c0255e.f2295s.computeHorizontalScrollRange();
        int i15 = c0255e.f2293q;
        boolean z6 = iComputeHorizontalScrollRange - i15 > 0 && i15 >= i14;
        c0255e.f2297u = z6;
        boolean z10 = c0255e.f2296t;
        if (!z10 && !z6) {
            if (c0255e.f2298v != 0) {
                c0255e.g(0);
                return;
            }
            return;
        }
        if (z10) {
            float f10 = i12;
            c0255e.f2288l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            c0255e.f2287k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (c0255e.f2297u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i15;
            c0255e.f2291o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            c0255e.f2290n = Math.min(i15, (i15 * i15) / iComputeHorizontalScrollRange);
        }
        int i16 = c0255e.f2298v;
        if (i16 == 0 || i16 == 1) {
            c0255e.g(1);
        }
    }
}
