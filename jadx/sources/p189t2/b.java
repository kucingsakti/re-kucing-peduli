package p189t2;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15154d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayoutManager f15158h;

    public b(FlexboxLayoutManager flexboxLayoutManager) {
        this.f15158h = flexboxLayoutManager;
    }

    public static void a(b bVar) {
        FlexboxLayoutManager flexboxLayoutManager = bVar.f15158h;
        if (flexboxLayoutManager.b1() || !flexboxLayoutManager.f7719u) {
            bVar.f15153c = bVar.f15155e ? flexboxLayoutManager.f7703C.g() : flexboxLayoutManager.f7703C.k();
        } else {
            bVar.f15153c = bVar.f15155e ? flexboxLayoutManager.f7703C.g() : flexboxLayoutManager.f7133o - flexboxLayoutManager.f7703C.k();
        }
    }

    public static void b(b bVar) {
        bVar.a = -1;
        bVar.f15152b = -1;
        bVar.f15153c = Integer.MIN_VALUE;
        bVar.f15156f = false;
        bVar.f15157g = false;
        FlexboxLayoutManager flexboxLayoutManager = bVar.f15158h;
        if (flexboxLayoutManager.b1()) {
            int i10 = flexboxLayoutManager.f7716r;
            if (i10 == 0) {
                bVar.f15155e = flexboxLayoutManager.f7715q == 1;
                return;
            } else {
                bVar.f15155e = i10 == 2;
                return;
            }
        }
        int i11 = flexboxLayoutManager.f7716r;
        if (i11 == 0) {
            bVar.f15155e = flexboxLayoutManager.f7715q == 3;
        } else {
            bVar.f15155e = i11 == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.f15152b + ", mCoordinate=" + this.f15153c + ", mPerpendicularCoordinate=" + this.f15154d + ", mLayoutFromEnd=" + this.f15155e + ", mValid=" + this.f15156f + ", mAssignedFromSavedState=" + this.f15157g + '}';
    }
}
