package p022c1;

import F8.C0212f;
import J0.A;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import p013b1.b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends A {
    public b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager2 f7417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f7418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f7419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f7422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7424i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7426l;

    public d(ViewPager2 viewPager2) {
        this.f7417b = viewPager2;
        l lVar = viewPager2.f7185B;
        this.f7418c = lVar;
        this.f7419d = (LinearLayoutManager) lVar.getLayoutManager();
        this.f7422g = new c();
        e();
    }

    @Override // J0.A
    public final void a(RecyclerView recyclerView, int i10) {
        b bVar;
        int i11 = this.f7420e;
        boolean z6 = true;
        if (!(i11 == 1 && this.f7421f == 1) && i10 == 1) {
            this.f7420e = 1;
            int i12 = this.f7424i;
            if (i12 != -1) {
                this.f7423h = i12;
                this.f7424i = -1;
            } else if (this.f7423h == -1) {
                this.f7423h = this.f7419d.T0();
            }
            d(1);
            return;
        }
        if ((i11 == 1 || i11 == 4) && i10 == 2) {
            if (this.f7425k) {
                d(2);
                this.j = true;
                return;
            }
            return;
        }
        if (i11 != 1 && i11 != 4) {
            z6 = false;
        }
        c cVar = this.f7422g;
        if (z6 && i10 == 0) {
            f();
            if (!this.f7425k) {
                int i13 = cVar.a;
                if (i13 != -1 && (bVar = this.a) != null) {
                    bVar.b(i13, 0.0f, 0);
                }
            } else if (cVar.f7416c == 0) {
                int i14 = this.f7423h;
                int i15 = cVar.a;
                if (i14 != i15) {
                    c(i15);
                }
            }
            d(0);
            e();
        }
        if (this.f7420e == 2 && i10 == 0 && this.f7426l) {
            f();
            if (cVar.f7416c == 0) {
                int i16 = this.f7424i;
                int i17 = cVar.a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    c(i17);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    @Override // J0.A
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        this.f7425k = true;
        f();
        boolean z6 = this.j;
        c cVar = this.f7422g;
        if (z6) {
            this.j = false;
            if (i11 <= 0) {
                if (i11 == 0) {
                    if ((i10 < 0) == (this.f7417b.f7202y.H() == 1)) {
                        if (cVar.f7416c != 0) {
                            i12 = cVar.a + 1;
                        }
                    }
                }
                i12 = cVar.a;
            } else if (cVar.f7416c != 0) {
                i12 = cVar.a + 1;
            } else {
                i12 = cVar.a;
            }
            this.f7424i = i12;
            if (this.f7423h != i12) {
                c(i12);
            }
        } else if (this.f7420e == 0) {
            int i13 = cVar.a;
            if (i13 == -1) {
                i13 = 0;
            }
            c(i13);
        }
        int i14 = cVar.a;
        if (i14 == -1) {
            i14 = 0;
        }
        float f10 = cVar.f7415b;
        int i15 = cVar.f7416c;
        b bVar = this.a;
        if (bVar != null) {
            bVar.b(i14, f10, i15);
        }
        int i16 = cVar.a;
        int i17 = this.f7424i;
        if ((i16 == i17 || i17 == -1) && cVar.f7416c == 0 && this.f7421f != 1) {
            d(0);
            e();
        }
    }

    public final void c(int i10) {
        b bVar = this.a;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public final void d(int i10) {
        if ((this.f7420e == 3 && this.f7421f == 0) || this.f7421f == i10) {
            return;
        }
        this.f7421f = i10;
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    public final void e() {
        this.f7420e = 0;
        this.f7421f = 0;
        c cVar = this.f7422g;
        cVar.a = -1;
        cVar.f7415b = 0.0f;
        cVar.f7416c = 0;
        this.f7423h = -1;
        this.f7424i = -1;
        this.j = false;
        this.f7425k = false;
        this.f7426l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149 A[LOOP:2: B:64:0x013d->B:67:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[SYNTHETIC] */
    public final void f() {
        int top;
        int iW;
        int top2;
        int i10;
        int bottom;
        int i11;
        LinearLayoutManager linearLayoutManager = this.f7419d;
        int iT0 = linearLayoutManager.T0();
        c cVar = this.f7422g;
        cVar.a = iT0;
        if (iT0 == -1) {
            cVar.a = -1;
            cVar.f7415b = 0.0f;
            cVar.f7416c = 0;
            return;
        }
        View viewR = linearLayoutManager.r(iT0);
        if (viewR == null) {
            cVar.a = -1;
            cVar.f7415b = 0.0f;
            cVar.f7416c = 0;
            return;
        }
        int i12 = ((x) viewR.getLayoutParams()).f7136t.left;
        int i13 = ((x) viewR.getLayoutParams()).f7136t.right;
        int i14 = ((x) viewR.getLayoutParams()).f7136t.top;
        int i15 = ((x) viewR.getLayoutParams()).f7136t.bottom;
        ViewGroup.LayoutParams layoutParams = viewR.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i12 += marginLayoutParams.leftMargin;
            i13 += marginLayoutParams.rightMargin;
            i14 += marginLayoutParams.topMargin;
            i15 += marginLayoutParams.bottomMargin;
        }
        int height = viewR.getHeight() + i14 + i15;
        int width = viewR.getWidth() + i12 + i13;
        int i16 = linearLayoutManager.f6897q;
        l lVar = this.f7418c;
        if (i16 == 0) {
            top = (viewR.getLeft() - i12) - lVar.getPaddingLeft();
            if (this.f7417b.f7202y.H() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewR.getTop() - i14) - lVar.getPaddingTop();
        }
        int i17 = -top;
        cVar.f7416c = i17;
        if (i17 >= 0) {
            cVar.f7415b = height != 0 ? i17 / height : 0.0f;
            return;
        }
        int iW2 = linearLayoutManager.w();
        if (iW2 != 0) {
            boolean z6 = linearLayoutManager.f6897q == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iW2, 2);
            for (int i18 = 0; i18 < iW2; i18++) {
                View viewV = linearLayoutManager.v(i18);
                if (viewV == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewV.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : a.a;
                int[] iArr2 = iArr[i18];
                if (z6) {
                    top2 = viewV.getLeft();
                    i10 = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewV.getTop();
                    i10 = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i10;
                int[] iArr3 = iArr[i18];
                if (z6) {
                    bottom = viewV.getRight();
                    i11 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewV.getBottom();
                    i11 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i11;
            }
            Arrays.sort(iArr, new C0212f(17));
            int i19 = 1;
            while (true) {
                if (i19 >= iW2) {
                    int[] iArr4 = iArr[0];
                    int i20 = iArr4[1];
                    int i21 = iArr4[0];
                    int i22 = i20 - i21;
                    if (i21 <= 0 && iArr[iW2 - 1][1] >= i22) {
                        if (linearLayoutManager.w() <= 1) {
                        }
                    }
                } else if (iArr[i19 - 1][1] == iArr[i19][0]) {
                    i19++;
                }
                iW = linearLayoutManager.w();
                for (int i23 = 0; i23 < iW; i23++) {
                    if (!a.a(linearLayoutManager.v(i23))) {
                        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    }
                }
            }
        } else if (linearLayoutManager.w() <= 1) {
            iW = linearLayoutManager.w();
            while (i23 < iW) {
                if (!a.a(linearLayoutManager.v(i23))) {
                    throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                }
            }
        }
        Locale locale = Locale.US;
        throw new IllegalStateException(AbstractC0487g.g(cVar.f7416c, "Page can only be offset by a positive amount, not by "));
    }
}
