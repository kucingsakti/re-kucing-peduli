package com.google.android.flexbox;

import U.U;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.recyclerview.widget.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import p067g9.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final FlexboxLayoutManager a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f7736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f7737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f7738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f7739e;

    public a(FlexboxLayoutManager flexboxLayoutManager) {
        this.a = flexboxLayoutManager;
    }

    public final void a(g gVar, int i10, int i11, int i12, int i13, int i14, List list) {
        int iL;
        int I2;
        int paddingStart;
        int paddingEnd;
        FlexItem flexItem;
        int i15;
        int iX;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        byte b3;
        int i21;
        int i22 = i14;
        FlexboxLayoutManager flexboxLayoutManager = this.a;
        boolean zB1 = flexboxLayoutManager.b1();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        List arrayList = list == null ? new ArrayList() : list;
        gVar.a = arrayList;
        boolean z6 = i22 == -1;
        if (zB1) {
            RecyclerView recyclerView = flexboxLayoutManager.f7121b;
            if (recyclerView != null) {
                WeakHashMap weakHashMap = U.a;
                iL = recyclerView.getPaddingStart();
            } else {
                iL = 0;
            }
        } else {
            iL = flexboxLayoutManager.L();
        }
        if (zB1) {
            RecyclerView recyclerView2 = flexboxLayoutManager.f7121b;
            if (recyclerView2 != null) {
                WeakHashMap weakHashMap2 = U.a;
                I2 = recyclerView2.getPaddingEnd();
            } else {
                I2 = 0;
            }
        } else {
            I2 = flexboxLayoutManager.I();
        }
        if (zB1) {
            paddingStart = flexboxLayoutManager.L();
        } else {
            RecyclerView recyclerView3 = flexboxLayoutManager.f7121b;
            if (recyclerView3 != null) {
                WeakHashMap weakHashMap3 = U.a;
                paddingStart = recyclerView3.getPaddingStart();
            } else {
                paddingStart = 0;
            }
        }
        if (zB1) {
            paddingEnd = flexboxLayoutManager.I();
        } else {
            RecyclerView recyclerView4 = flexboxLayoutManager.f7121b;
            if (recyclerView4 != null) {
                WeakHashMap weakHashMap4 = U.a;
                paddingEnd = recyclerView4.getPaddingEnd();
            } else {
                paddingEnd = 0;
            }
        }
        p189t2.a aVar = new p189t2.a();
        int i23 = i13;
        aVar.f15148k = i23;
        int i24 = iL + I2;
        aVar.a = i24;
        int iB = flexboxLayoutManager.f7724z.b();
        int i25 = Integer.MIN_VALUE;
        int i26 = 1;
        int i27 = 0;
        int iCombineMeasuredStates = 0;
        while (i23 < iB) {
            View viewX0 = flexboxLayoutManager.X0(i23);
            boolean z10 = zB1;
            boolean z11 = z6;
            if (viewX0.getVisibility() == 8) {
                int i28 = aVar.f15143e + 1;
                aVar.f15143e = i28;
                int i29 = aVar.f15142d + 1;
                aVar.f15142d = i29;
                if (i23 == iB - 1 && i29 - i28 != 0) {
                    aVar.f15147i = i27;
                    aVar.f15149l = i23;
                    arrayList.add(aVar);
                }
                i21 = i26;
                z6 = z11;
                i20 = i22;
                mode = mode;
                iB = iB;
                paddingStart = paddingStart;
                i15 = paddingEnd;
                b3 = -1;
            } else {
                if (viewX0 instanceof CompoundButton) {
                    CompoundButton compoundButton = (CompoundButton) viewX0;
                    FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) ((FlexItem) compoundButton.getLayoutParams());
                    int i30 = layoutParams.f7725A;
                    int i31 = layoutParams.f7726B;
                    Drawable drawableA = p000a0.c.a(compoundButton);
                    int minimumWidth = drawableA == null ? 0 : drawableA.getMinimumWidth();
                    int minimumHeight = drawableA == null ? 0 : drawableA.getMinimumHeight();
                    if (i30 == -1) {
                        i30 = minimumWidth;
                    }
                    layoutParams.f7725A = i30;
                    if (i31 == -1) {
                        i31 = minimumHeight;
                    }
                    layoutParams.f7726B = i31;
                }
                FlexItem flexItem2 = (FlexItem) viewX0.getLayoutParams();
                FlexboxLayoutManager.LayoutParams layoutParams2 = (FlexboxLayoutManager.LayoutParams) flexItem2;
                if (layoutParams2.f7732y == 4) {
                    aVar.j.add(Integer.valueOf(i23));
                }
                int iRound = z10 ? ((ViewGroup.MarginLayoutParams) layoutParams2).width : ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                float f10 = layoutParams2.f7733z;
                if (f10 != -1.0f) {
                    flexItem = flexItem2;
                    if (mode == 1073741824) {
                        iRound = Math.round(size * f10);
                    }
                } else {
                    flexItem = flexItem2;
                }
                if (z10) {
                    i15 = paddingEnd;
                    iX = w.x(flexboxLayoutManager.e(), flexboxLayoutManager.f7133o, flexboxLayoutManager.f7131m, ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + i24, iRound);
                    int iX2 = w.x(flexboxLayoutManager.f(), flexboxLayoutManager.f7134p, flexboxLayoutManager.f7132n, ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).bottomMargin + ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).topMargin + paddingStart + i15 + i27, ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).height);
                    viewX0.measure(iX, iX2);
                    q(i23, iX, iX2, viewX0);
                } else {
                    i15 = paddingEnd;
                    int iX3 = w.x(flexboxLayoutManager.e(), flexboxLayoutManager.f7133o, flexboxLayoutManager.f7131m, ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + paddingStart + i15 + i27, ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).width);
                    iX = w.x(flexboxLayoutManager.f(), flexboxLayoutManager.f7134p, flexboxLayoutManager.f7132n, ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).bottomMargin + ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).topMargin + i24, iRound);
                    viewX0.measure(iX3, iX);
                    q(i23, iX3, iX, viewX0);
                }
                flexboxLayoutManager.i1(viewX0, i23);
                b(viewX0, i23);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewX0.getMeasuredState());
                int i32 = aVar.a;
                int measuredWidth = (z10 ? ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).rightMargin : ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).bottomMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin : ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) + (z10 ? viewX0.getMeasuredWidth() : viewX0.getMeasuredHeight());
                int size2 = arrayList.size();
                if (flexboxLayoutManager.f7716r != 0) {
                    if (!layoutParams2.f7729E) {
                        if (mode != 0 && ((i17 = flexboxLayoutManager.f7718t) == -1 || i17 > size2 + 1)) {
                            if (flexboxLayoutManager.b1()) {
                                i18 = ((x) viewX0.getLayoutParams()).f7136t.left;
                                i19 = ((x) viewX0.getLayoutParams()).f7136t.right;
                            } else {
                                i18 = ((x) viewX0.getLayoutParams()).f7136t.top;
                                i19 = ((x) viewX0.getLayoutParams()).f7136t.bottom;
                            }
                            int i33 = i18 + i19;
                            if (i33 > 0) {
                                measuredWidth += i33;
                            }
                            if (size < i32 + measuredWidth) {
                            }
                        }
                        aVar.f15142d += i26;
                        i16 = i25;
                    }
                    if (aVar.f15142d - aVar.f15143e > 0) {
                        int i34 = i23 > 0 ? i23 - 1 : 0;
                        aVar.f15147i = i27;
                        aVar.f15149l = i34;
                        arrayList.add(aVar);
                        i27 += aVar.f15141c;
                    }
                    if (z10) {
                        if (((ViewGroup.MarginLayoutParams) layoutParams2).height == -1) {
                            viewX0.measure(iX, w.x(flexboxLayoutManager.f(), flexboxLayoutManager.f7134p, flexboxLayoutManager.f7132n, flexboxLayoutManager.I() + flexboxLayoutManager.L() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i27, ((ViewGroup.MarginLayoutParams) layoutParams2).height));
                            b(viewX0, i23);
                        }
                    } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -1) {
                        viewX0.measure(w.x(flexboxLayoutManager.e(), flexboxLayoutManager.f7133o, flexboxLayoutManager.f7131m, flexboxLayoutManager.K() + flexboxLayoutManager.J() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i27, ((ViewGroup.MarginLayoutParams) layoutParams2).width), iX);
                        b(viewX0, i23);
                    }
                    aVar = new p189t2.a();
                    aVar.f15142d = i26;
                    aVar.a = i24;
                    aVar.f15148k = i23;
                    i16 = Integer.MIN_VALUE;
                } else {
                    aVar.f15142d += i26;
                    i16 = i25;
                }
                boolean z12 = aVar.f15150m;
                float f11 = layoutParams2.f7730w;
                aVar.f15150m = z12 | (f11 != 0.0f);
                boolean z13 = aVar.f15151n;
                float f12 = layoutParams2.f7731x;
                aVar.f15151n = z13 | (f12 != 0.0f);
                int[] iArr = this.f7737c;
                if (iArr != null) {
                    iArr[i23] = arrayList.size();
                }
                aVar.a = (z10 ? ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).rightMargin : ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).bottomMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).leftMargin : ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).topMargin) + (z10 ? viewX0.getMeasuredWidth() : viewX0.getMeasuredHeight()) + aVar.a;
                aVar.f15144f += f11;
                aVar.f15145g += f12;
                flexboxLayoutManager.d(FlexboxLayoutManager.f7700O, viewX0);
                if (flexboxLayoutManager.b1()) {
                    int i35 = ((x) viewX0.getLayoutParams()).f7136t.left + ((x) viewX0.getLayoutParams()).f7136t.right;
                    aVar.a += i35;
                    aVar.f15140b += i35;
                } else {
                    int i36 = ((x) viewX0.getLayoutParams()).f7136t.top + ((x) viewX0.getLayoutParams()).f7136t.bottom;
                    aVar.a += i36;
                    aVar.f15140b += i36;
                }
                int iMax = Math.max(i16, flexboxLayoutManager.W0(viewX0) + (z10 ? ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).bottomMargin : ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).rightMargin) + (z10 ? ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).topMargin : ((ViewGroup.MarginLayoutParams) ((FlexboxLayoutManager.LayoutParams) flexItem)).leftMargin) + (z10 ? viewX0.getMeasuredHeight() : viewX0.getMeasuredWidth()));
                aVar.f15141c = Math.max(aVar.f15141c, iMax);
                if (z10) {
                    if (flexboxLayoutManager.f7716r != 2) {
                        aVar.f15146h = Math.max(aVar.f15146h, viewX0.getBaseline() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                    } else {
                        aVar.f15146h = Math.max(aVar.f15146h, (viewX0.getMeasuredHeight() - viewX0.getBaseline()) + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                    }
                }
                if (i23 == iB - 1 && aVar.f15142d - aVar.f15143e != 0) {
                    aVar.f15147i = i27;
                    aVar.f15149l = i23;
                    arrayList.add(aVar);
                    i27 += aVar.f15141c;
                }
                i20 = i14;
                b3 = -1;
                if (i20 == -1 || arrayList.size() <= 0 || ((p189t2.a) arrayList.get(arrayList.size() - 1)).f15149l < i20 || i23 < i20 || z11) {
                    z6 = z11;
                } else {
                    i27 = -aVar.f15141c;
                    z6 = true;
                }
                if (i27 > i12 && z6) {
                    return;
                }
                i25 = iMax;
                i21 = 1;
            }
            i23 += i21;
            i22 = i20;
            i26 = i21;
            zB1 = z10;
            iB = iB;
            mode = mode;
            paddingEnd = i15;
            paddingStart = paddingStart;
        }
    }

    public final void b(View view, int i10) {
        boolean z6;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) flexItem;
        int i11 = layoutParams.f7725A;
        boolean z10 = true;
        if (measuredWidth >= i11 && measuredWidth <= (i11 = layoutParams.f7727C)) {
            z6 = false;
        } else {
            measuredWidth = i11;
            z6 = true;
        }
        int i12 = layoutParams.f7726B;
        if (measuredHeight < i12) {
            measuredHeight = i12;
        } else {
            int i13 = layoutParams.f7728D;
            if (measuredHeight > i13) {
                measuredHeight = i13;
            } else {
                z10 = z6;
            }
        }
        if (z10) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            q(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            this.a.i1(view, i10);
        }
    }

    public final void c(List list, int i10) {
        int i11 = this.f7737c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        for (int size = list.size() - 1; size >= i11; size--) {
            list.remove(size);
        }
        int[] iArr = this.f7737c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f7738d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i10, length2, 0L);
        }
    }

    public final void d(int i10, int i11, int i12) {
        int size;
        int iJ;
        int iK;
        int i13;
        int i14;
        FlexboxLayoutManager flexboxLayoutManager = this.a;
        int iB = flexboxLayoutManager.f7724z.b();
        boolean[] zArr = this.f7736b;
        if (zArr == null) {
            if (iB < 10) {
                iB = 10;
            }
            this.f7736b = new boolean[iB];
        } else if (zArr.length < iB) {
            int length = zArr.length * 2;
            if (length >= iB) {
                iB = length;
            }
            this.f7736b = new boolean[iB];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i12 >= flexboxLayoutManager.f7724z.b()) {
            return;
        }
        int i15 = flexboxLayoutManager.f7715q;
        if (i15 == 0 || i15 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int iY0 = flexboxLayoutManager.Y0();
            if (mode != 1073741824 && iY0 <= size) {
                size = iY0;
            }
            iJ = flexboxLayoutManager.J();
            iK = flexboxLayoutManager.K();
        } else {
            if (i15 != 2 && i15 != 3) {
                throw new IllegalArgumentException(AbstractC0487g.g(i15, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = flexboxLayoutManager.Y0();
            }
            iJ = flexboxLayoutManager.L();
            iK = flexboxLayoutManager.I();
        }
        int i16 = iK + iJ;
        int i17 = size;
        int[] iArr = this.f7737c;
        int i18 = iArr != null ? iArr[i12] : 0;
        List list = flexboxLayoutManager.f7721w;
        int size2 = list.size();
        while (i18 < size2) {
            p189t2.a aVar = (p189t2.a) list.get(i18);
            int i19 = aVar.a;
            if (i19 >= i17 || !aVar.f15150m) {
                i13 = i10;
                i14 = i11;
                if (i19 > i17 && aVar.f15151n) {
                    m(i13, i14, aVar, i17, i16, false);
                }
            } else {
                i13 = i10;
                i14 = i11;
                h(i13, i14, aVar, i17, i16, false);
            }
            i18++;
            i10 = i13;
            i11 = i14;
        }
    }

    public final void e(int i10) {
        int[] iArr = this.f7737c;
        if (iArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f7737c = new int[i10];
        } else if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f7737c = Arrays.copyOf(iArr, i10);
        }
    }

    public final void f(int i10) {
        long[] jArr = this.f7738d;
        if (jArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f7738d = new long[i10];
        } else if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f7738d = Arrays.copyOf(jArr, i10);
        }
    }

    public final void g(int i10) {
        long[] jArr = this.f7739e;
        if (jArr == null) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f7739e = new long[i10];
        } else if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (length >= i10) {
                i10 = length;
            }
            this.f7739e = Arrays.copyOf(jArr, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a2  */
    public final void h(int i10, int i11, p189t2.a aVar, int i12, int i13, boolean z6) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d3;
        boolean z10;
        int i15;
        int i16;
        double d8;
        float f12 = aVar.f15144f;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i12 < (i14 = aVar.a)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        aVar.a = i13 + aVar.f15140b;
        if (!z6) {
            aVar.f15141c = Integer.MIN_VALUE;
        }
        int i17 = 0;
        boolean z11 = false;
        int i18 = 0;
        float f15 = 0.0f;
        while (i17 < aVar.f15142d) {
            int i19 = aVar.f15148k + i17;
            FlexboxLayoutManager flexboxLayoutManager = this.a;
            View viewX0 = flexboxLayoutManager.X0(i19);
            if (viewX0.getVisibility() == 8) {
                i17 = i17;
                f10 = f13;
                f11 = f14;
            } else {
                FlexItem flexItem = (FlexItem) viewX0.getLayoutParams();
                int i20 = flexboxLayoutManager.f7715q;
                f10 = f13;
                if (i20 == 0 || i20 == 1) {
                    f11 = f14;
                    boolean z12 = z11;
                    int measuredWidth = viewX0.getMeasuredWidth();
                    long[] jArr = this.f7739e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i19];
                    }
                    int measuredHeight = viewX0.getMeasuredHeight();
                    long[] jArr2 = this.f7739e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i19] >> 32);
                    }
                    if (!this.f7736b[i19]) {
                        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) flexItem;
                        float f16 = layoutParams.f7730w;
                        if (f16 > f10) {
                            float f17 = (f11 * f16) + measuredWidth;
                            if (i17 == aVar.f15142d - 1) {
                                f17 += f15;
                                f15 = f10;
                            }
                            int iRound = Math.round(f17);
                            int i21 = layoutParams.f7727C;
                            if (iRound > i21) {
                                this.f7736b[i19] = true;
                                aVar.f15144f -= f16;
                                z10 = true;
                                iRound = i21;
                            } else {
                                float f18 = (f17 - iRound) + f15;
                                double d10 = f18;
                                if (d10 > 1.0d) {
                                    iRound++;
                                    d3 = d10 - 1.0d;
                                } else {
                                    if (d10 < -1.0d) {
                                        iRound--;
                                        d3 = d10 + 1.0d;
                                    }
                                    f15 = f18;
                                    z10 = z12;
                                }
                                f18 = (float) d3;
                                f15 = f18;
                                z10 = z12;
                            }
                            int i22 = i(i11, flexItem, aVar.f15147i);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewX0.measure(iMakeMeasureSpec, i22);
                            measuredWidth = viewX0.getMeasuredWidth();
                            int measuredHeight2 = viewX0.getMeasuredHeight();
                            q(i19, iMakeMeasureSpec, i22, viewX0);
                            flexboxLayoutManager.i1(viewX0, i19);
                            z12 = z10;
                            measuredHeight = measuredHeight2;
                        }
                    }
                    FlexboxLayoutManager.LayoutParams layoutParams2 = (FlexboxLayoutManager.LayoutParams) flexItem;
                    int iMax2 = Math.max(i18, flexboxLayoutManager.W0(viewX0) + measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                    aVar.a = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + aVar.a;
                    iMax = iMax2;
                    z11 = z12;
                } else {
                    int measuredHeight3 = viewX0.getMeasuredHeight();
                    long[] jArr3 = this.f7739e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i19] >> 32);
                    }
                    int measuredWidth2 = viewX0.getMeasuredWidth();
                    long[] jArr4 = this.f7739e;
                    f11 = f14;
                    boolean z13 = z11;
                    if (jArr4 != null) {
                        measuredWidth2 = (int) jArr4[i19];
                    }
                    if (!this.f7736b[i19]) {
                        FlexboxLayoutManager.LayoutParams layoutParams3 = (FlexboxLayoutManager.LayoutParams) flexItem;
                        float f19 = layoutParams3.f7730w;
                        if (f19 > f10) {
                            float f20 = (f11 * f19) + measuredHeight3;
                            if (i17 == aVar.f15142d - 1) {
                                f20 += f15;
                                f15 = f10;
                            }
                            int iRound2 = Math.round(f20);
                            int i23 = layoutParams3.f7728D;
                            if (iRound2 > i23) {
                                this.f7736b[i19] = true;
                                aVar.f15144f -= f19;
                                z13 = true;
                                i15 = i23;
                            } else {
                                float f21 = (f20 - iRound2) + f15;
                                double d11 = f21;
                                if (d11 > 1.0d) {
                                    i16 = iRound2 + 1;
                                    d8 = d11 - 1.0d;
                                } else if (d11 < -1.0d) {
                                    i16 = iRound2 - 1;
                                    d8 = d11 + 1.0d;
                                } else {
                                    i15 = iRound2;
                                    f15 = f21;
                                }
                                i15 = i16;
                                f15 = (float) d8;
                            }
                            int iJ = j(i10, flexItem, aVar.f15147i);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                            viewX0.measure(iJ, iMakeMeasureSpec2);
                            measuredWidth2 = viewX0.getMeasuredWidth();
                            measuredHeight3 = viewX0.getMeasuredHeight();
                            q(i19, iJ, iMakeMeasureSpec2, viewX0);
                            flexboxLayoutManager.i1(viewX0, i19);
                        }
                    }
                    z11 = z13;
                    FlexboxLayoutManager.LayoutParams layoutParams4 = (FlexboxLayoutManager.LayoutParams) flexItem;
                    iMax = Math.max(i18, flexboxLayoutManager.W0(viewX0) + measuredWidth2 + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin);
                    aVar.a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + aVar.a;
                    i17 = i17;
                }
                aVar.f15141c = Math.max(aVar.f15141c, iMax);
                i18 = iMax;
            }
            i17++;
            f13 = f10;
            f14 = f11;
        }
        if (!z11 || i14 == aVar.a) {
            return;
        }
        h(i10, i11, aVar, i12, i13, true);
    }

    public final int i(int i10, FlexItem flexItem, int i11) {
        FlexboxLayoutManager flexboxLayoutManager = this.a;
        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) flexItem;
        int iX = w.x(flexboxLayoutManager.f(), flexboxLayoutManager.f7134p, flexboxLayoutManager.f7132n, flexboxLayoutManager.I() + flexboxLayoutManager.L() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        int size = View.MeasureSpec.getSize(iX);
        int i12 = layoutParams.f7728D;
        if (size > i12) {
            return View.MeasureSpec.makeMeasureSpec(i12, View.MeasureSpec.getMode(iX));
        }
        int i13 = layoutParams.f7726B;
        return size < i13 ? View.MeasureSpec.makeMeasureSpec(i13, View.MeasureSpec.getMode(iX)) : iX;
    }

    public final int j(int i10, FlexItem flexItem, int i11) {
        FlexboxLayoutManager flexboxLayoutManager = this.a;
        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) flexItem;
        int iX = w.x(flexboxLayoutManager.e(), flexboxLayoutManager.f7133o, flexboxLayoutManager.f7131m, flexboxLayoutManager.K() + flexboxLayoutManager.J() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i11, ((ViewGroup.MarginLayoutParams) layoutParams).width);
        int size = View.MeasureSpec.getSize(iX);
        int i12 = layoutParams.f7727C;
        if (size > i12) {
            return View.MeasureSpec.makeMeasureSpec(i12, View.MeasureSpec.getMode(iX));
        }
        int i13 = layoutParams.f7725A;
        return size < i13 ? View.MeasureSpec.makeMeasureSpec(i13, View.MeasureSpec.getMode(iX)) : iX;
    }

    public final void k(View view, p189t2.a aVar, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        FlexboxLayoutManager flexboxLayoutManager = this.a;
        int i14 = flexboxLayoutManager.f7717s;
        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) flexItem;
        int i15 = layoutParams.f7732y;
        if (i15 != -1) {
            i14 = i15;
        }
        int i16 = aVar.f15141c;
        if (i14 != 0) {
            if (i14 == 1) {
                if (flexboxLayoutManager.f7716r != 2) {
                    int i17 = i11 + i16;
                    int measuredHeight = i17 - view.getMeasuredHeight();
                    int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    view.layout(i10, measuredHeight - i18, i12, i17 - i18);
                    return;
                }
                view.layout(i10, view.getMeasuredHeight() + (i11 - i16) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i12, view.getMeasuredHeight() + (i13 - i16) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                return;
            }
            if (i14 == 2) {
                int measuredHeight2 = (((i16 - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) / 2;
                if (flexboxLayoutManager.f7716r != 2) {
                    int i19 = i11 + measuredHeight2;
                    view.layout(i10, i19, i12, view.getMeasuredHeight() + i19);
                    return;
                } else {
                    int i20 = i11 - measuredHeight2;
                    view.layout(i10, i20, i12, view.getMeasuredHeight() + i20);
                    return;
                }
            }
            if (i14 == 3) {
                if (flexboxLayoutManager.f7716r != 2) {
                    int iMax = Math.max(aVar.f15146h - view.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (aVar.f15146h - view.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (i14 != 4) {
                return;
            }
        }
        if (flexboxLayoutManager.f7716r != 2) {
            int i21 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            view.layout(i10, i11 + i21, i12, i13 + i21);
        } else {
            int i22 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            view.layout(i10, i11 - i22, i12, i13 - i22);
        }
    }

    public final void l(View view, p189t2.a aVar, boolean z6, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int i14 = this.a.f7717s;
        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) flexItem;
        int i15 = layoutParams.f7732y;
        if (i15 != -1) {
            i14 = i15;
        }
        int i16 = aVar.f15141c;
        if (i14 != 0) {
            if (i14 == 1) {
                if (!z6) {
                    view.layout(((i10 + i16) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i11, ((i12 + i16) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i13);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i10 - i16) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i11, view.getMeasuredWidth() + (i12 - i16) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i13);
                return;
            }
            if (i14 == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i16 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z6) {
                    view.layout(i10 - marginStart, i11, i12 - marginStart, i13);
                    return;
                } else {
                    view.layout(i10 + marginStart, i11, i12 + marginStart, i13);
                    return;
                }
            }
            if (i14 != 3 && i14 != 4) {
                return;
            }
        }
        if (z6) {
            int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            view.layout(i10 - i17, i11, i12 - i17, i13);
        } else {
            int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            view.layout(i10 + i18, i11, i12 + i18, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    public final void m(int i10, int i11, p189t2.a aVar, int i12, int i13, boolean z6) {
        float f10;
        int iMax;
        int i14 = aVar.a;
        float f11 = aVar.f15145g;
        float f12 = 0.0f;
        if (f11 <= 0.0f || i12 > i14) {
            return;
        }
        float f13 = (i14 - i12) / f11;
        aVar.a = i13 + aVar.f15140b;
        if (!z6) {
            aVar.f15141c = Integer.MIN_VALUE;
        }
        int i15 = 0;
        boolean z10 = false;
        int i16 = 0;
        float f14 = 0.0f;
        while (i15 < aVar.f15142d) {
            int i17 = aVar.f15148k + i15;
            FlexboxLayoutManager flexboxLayoutManager = this.a;
            View viewX0 = flexboxLayoutManager.X0(i17);
            if (viewX0.getVisibility() == 8) {
                f10 = f12;
            } else {
                FlexItem flexItem = (FlexItem) viewX0.getLayoutParams();
                int i18 = flexboxLayoutManager.f7715q;
                f10 = f12;
                if (i18 == 0 || i18 == 1) {
                    int measuredWidth = viewX0.getMeasuredWidth();
                    long[] jArr = this.f7739e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i17];
                    }
                    int measuredHeight = viewX0.getMeasuredHeight();
                    long[] jArr2 = this.f7739e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i17] >> 32);
                    }
                    if (!this.f7736b[i17]) {
                        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) flexItem;
                        float f15 = layoutParams.f7731x;
                        if (f15 > f10) {
                            float f16 = measuredWidth - (f13 * f15);
                            if (i15 == aVar.f15142d - 1) {
                                f16 += f14;
                                f14 = f10;
                            }
                            int iRound = Math.round(f16);
                            int i19 = layoutParams.f7725A;
                            if (iRound < i19) {
                                this.f7736b[i17] = true;
                                aVar.f15145g -= f15;
                                z10 = true;
                                iRound = i19;
                            } else {
                                float f17 = (f16 - iRound) + f14;
                                double d3 = f17;
                                if (d3 > 1.0d) {
                                    iRound++;
                                    f17 -= 1.0f;
                                } else if (d3 < -1.0d) {
                                    iRound--;
                                    f17 += 1.0f;
                                }
                                f14 = f17;
                            }
                            int i20 = i(i11, flexItem, aVar.f15147i);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewX0.measure(iMakeMeasureSpec, i20);
                            int measuredWidth2 = viewX0.getMeasuredWidth();
                            int measuredHeight2 = viewX0.getMeasuredHeight();
                            q(i17, iMakeMeasureSpec, i20, viewX0);
                            flexboxLayoutManager.i1(viewX0, i17);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                    }
                    FlexboxLayoutManager.LayoutParams layoutParams2 = (FlexboxLayoutManager.LayoutParams) flexItem;
                    int iMax2 = Math.max(i16, flexboxLayoutManager.W0(viewX0) + measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                    aVar.a = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + aVar.a;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewX0.getMeasuredHeight();
                    long[] jArr3 = this.f7739e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i17] >> 32);
                    }
                    int measuredWidth3 = viewX0.getMeasuredWidth();
                    long[] jArr4 = this.f7739e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i17];
                    }
                    if (!this.f7736b[i17]) {
                        FlexboxLayoutManager.LayoutParams layoutParams3 = (FlexboxLayoutManager.LayoutParams) flexItem;
                        float f18 = layoutParams3.f7731x;
                        if (f18 > f10) {
                            float f19 = measuredHeight3 - (f13 * f18);
                            if (i15 == aVar.f15142d - 1) {
                                f19 += f14;
                                f14 = f10;
                            }
                            int iRound2 = Math.round(f19);
                            int i21 = layoutParams3.f7726B;
                            if (iRound2 < i21) {
                                this.f7736b[i17] = true;
                                aVar.f15145g -= f18;
                                z10 = true;
                                iRound2 = i21;
                            } else {
                                float f20 = (f19 - iRound2) + f14;
                                double d8 = f20;
                                if (d8 > 1.0d) {
                                    iRound2++;
                                    f20 -= 1.0f;
                                } else if (d8 < -1.0d) {
                                    iRound2--;
                                    f20 += 1.0f;
                                }
                                f14 = f20;
                            }
                            int iJ = j(i10, flexItem, aVar.f15147i);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewX0.measure(iJ, iMakeMeasureSpec2);
                            measuredWidth3 = viewX0.getMeasuredWidth();
                            int measuredHeight4 = viewX0.getMeasuredHeight();
                            q(i17, iJ, iMakeMeasureSpec2, viewX0);
                            flexboxLayoutManager.i1(viewX0, i17);
                            measuredHeight3 = measuredHeight4;
                        }
                    }
                    FlexboxLayoutManager.LayoutParams layoutParams4 = (FlexboxLayoutManager.LayoutParams) flexItem;
                    iMax = Math.max(i16, flexboxLayoutManager.W0(viewX0) + measuredWidth3 + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin);
                    aVar.a = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + aVar.a;
                }
                aVar.f15141c = Math.max(aVar.f15141c, iMax);
                i16 = iMax;
            }
            i15++;
            f12 = f10;
        }
        if (!z10 || i14 == aVar.a) {
            return;
        }
        m(i10, i11, aVar, i12, i13, true);
    }

    public final void n(View view, int i10, int i11) {
        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) ((FlexItem) view.getLayoutParams());
        int i12 = (i10 - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        FlexboxLayoutManager flexboxLayoutManager = this.a;
        int iMin = Math.min(Math.max(i12 - flexboxLayoutManager.W0(view), layoutParams.f7725A), layoutParams.f7727C);
        long[] jArr = this.f7739e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i11] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        q(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        flexboxLayoutManager.i1(view, i11);
    }

    public final void o(View view, int i10, int i11) {
        FlexboxLayoutManager.LayoutParams layoutParams = (FlexboxLayoutManager.LayoutParams) ((FlexItem) view.getLayoutParams());
        int i12 = (i10 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        FlexboxLayoutManager flexboxLayoutManager = this.a;
        int iMin = Math.min(Math.max(i12 - flexboxLayoutManager.W0(view), layoutParams.f7726B), layoutParams.f7728D);
        long[] jArr = this.f7739e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i11] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        q(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        flexboxLayoutManager.i1(view, i11);
    }

    public final void p(int i10) {
        int i11;
        FlexboxLayoutManager flexboxLayoutManager = this.a;
        if (i10 >= flexboxLayoutManager.f7724z.b()) {
            return;
        }
        int i12 = flexboxLayoutManager.f7715q;
        if (flexboxLayoutManager.f7717s != 4) {
            for (p189t2.a aVar : flexboxLayoutManager.f7721w) {
                for (Integer num : aVar.j) {
                    View viewX0 = flexboxLayoutManager.X0(num.intValue());
                    if (i12 == 0 || i12 == 1) {
                        o(viewX0, aVar.f15141c, num.intValue());
                    } else {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalArgumentException(AbstractC0487g.g(i12, "Invalid flex direction: "));
                        }
                        n(viewX0, aVar.f15141c, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f7737c;
        List list = flexboxLayoutManager.f7721w;
        int size = list.size();
        for (int i13 = iArr != null ? iArr[i10] : 0; i13 < size; i13++) {
            p189t2.a aVar2 = (p189t2.a) list.get(i13);
            int i14 = aVar2.f15142d;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = aVar2.f15148k + i15;
                if (i15 < flexboxLayoutManager.f7724z.b()) {
                    View viewX1 = flexboxLayoutManager.X0(i16);
                    if (viewX1.getVisibility() != 8 && ((i11 = ((FlexboxLayoutManager.LayoutParams) ((FlexItem) viewX1.getLayoutParams())).f7732y) == -1 || i11 == 4)) {
                        if (i12 == 0 || i12 == 1) {
                            o(viewX1, aVar2.f15141c, i16);
                        } else {
                            if (i12 != 2 && i12 != 3) {
                                throw new IllegalArgumentException(AbstractC0487g.g(i12, "Invalid flex direction: "));
                            }
                            n(viewX1, aVar2.f15141c, i16);
                        }
                    }
                }
            }
        }
    }

    public final void q(int i10, int i11, int i12, View view) {
        long[] jArr = this.f7738d;
        if (jArr != null) {
            jArr[i10] = (((long) i11) & 4294967295L) | (((long) i12) << 32);
        }
        long[] jArr2 = this.f7739e;
        if (jArr2 != null) {
            jArr2[i10] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
