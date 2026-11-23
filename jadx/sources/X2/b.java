package X2;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.onesignal.core.activities.PermissionsActivity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p032d0.e {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G.b f5386b;

    public /* synthetic */ b(G.b bVar, int i10) {
        this.a = i10;
        this.f5386b = bVar;
    }

    @Override // p032d0.e
    public final int clampViewPositionHorizontal(View view, int i10, int i11) {
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5386b;
                p181s3.a aVar = sideSheetBehavior.f9799s;
                switch (aVar.a) {
                    case 0:
                        i12 = -aVar.f14589b.f9787D;
                        break;
                    default:
                        i12 = aVar.i();
                        break;
                }
                p181s3.a aVar2 = sideSheetBehavior.f9799s;
                switch (aVar2.a) {
                    case 0:
                        i13 = aVar2.f14589b.f9790G;
                        break;
                    default:
                        i13 = aVar2.f14589b.f9788E;
                        break;
                }
                return p181s3.a.e(i10, i12, i13);
        }
    }

    @Override // p032d0.e
    public final int clampViewPositionVertical(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                return p181s3.a.e(i10, ((BottomSheetBehavior) this.f5386b).D(), getViewVerticalDragRange(view));
            default:
                return view.getTop();
        }
    }

    @Override // p032d0.e
    public int getViewHorizontalDragRange(View view) {
        switch (this.a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5386b;
                return sideSheetBehavior.f9787D + sideSheetBehavior.f9790G;
            default:
                return super.getViewHorizontalDragRange(view);
        }
    }

    @Override // p032d0.e
    public int getViewVerticalDragRange(View view) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5386b;
                return bottomSheetBehavior.f9513a0 ? bottomSheetBehavior.f9522l0 : bottomSheetBehavior.f9511Y;
            default:
                return super.getViewVerticalDragRange(view);
        }
    }

    @Override // p032d0.e
    public final void onViewDragStateChanged(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5386b;
                    if (bottomSheetBehavior.c0) {
                        bottomSheetBehavior.J(1);
                    }
                }
                break;
            default:
                if (i10 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5386b;
                    if (sideSheetBehavior.f9805y) {
                        sideSheetBehavior.x(1);
                    }
                }
                break;
        }
    }

    @Override // p032d0.e
    public final void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.a) {
            case 0:
                ((BottomSheetBehavior) this.f5386b).z(i11);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5386b;
                WeakReference weakReference = sideSheetBehavior.f9792I;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    p181s3.a aVar = sideSheetBehavior.f9799s;
                    int left = view.getLeft();
                    int right = view.getRight();
                    switch (aVar.a) {
                        case 0:
                            if (left <= aVar.f14589b.f9788E) {
                                marginLayoutParams.leftMargin = right;
                            }
                            break;
                        default:
                            int i14 = aVar.f14589b.f9788E;
                            if (left <= i14) {
                                marginLayoutParams.rightMargin = i14 - left;
                            }
                            break;
                    }
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f9797N;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                p181s3.a aVar2 = sideSheetBehavior.f9799s;
                switch (aVar2.a) {
                    case 0:
                        aVar2.j();
                        aVar2.i();
                        break;
                    default:
                        int i15 = aVar2.f14589b.f9788E;
                        aVar2.i();
                        break;
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw E0.a.e(it);
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x011e  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Code duplicated, block: B:93:0x0196  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0027. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0065. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000d. Please report as an issue. */
    @Override // p032d0.e
    public final void onViewReleased(View view, float f10, float f11) {
        boolean z6;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.a) {
            case 0:
                int i11 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5386b;
                if (f11 < 0.0f) {
                    if (bottomSheetBehavior.f9531t) {
                        i11 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f9509W) {
                            i11 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f9513a0 && bottomSheetBehavior.K(view, f11)) {
                    if (Math.abs(f10) < Math.abs(f11) && f11 > bottomSheetBehavior.f9535v) {
                        i11 = 5;
                    } else if (view.getTop() > (bottomSheetBehavior.D() + bottomSheetBehavior.f9522l0) / 2) {
                        i11 = 5;
                    } else if (bottomSheetBehavior.f9531t || Math.abs(view.getTop() - bottomSheetBehavior.D()) < Math.abs(view.getTop() - bottomSheetBehavior.f9509W)) {
                        i11 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f9531t) {
                        int i12 = bottomSheetBehavior.f9509W;
                        if (top2 < i12) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f9511Y)) {
                                i11 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i12) < Math.abs(top2 - bottomSheetBehavior.f9511Y)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i11 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f9508V) < Math.abs(top2 - bottomSheetBehavior.f9511Y)) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (bottomSheetBehavior.f9531t) {
                    i11 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f9509W) < Math.abs(top3 - bottomSheetBehavior.f9511Y)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i11 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.L(view, i11, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5386b;
                switch (sideSheetBehavior.f9799s.a) {
                    case 0:
                        if (f10 <= 0.0f) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        break;
                    default:
                        if (f10 >= 0.0f) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        break;
                }
                if (!z6) {
                    p181s3.a aVar = sideSheetBehavior.f9799s;
                    switch (aVar.a) {
                        case 0:
                            float left = view.getLeft();
                            SideSheetBehavior sideSheetBehavior2 = aVar.f14589b;
                            float fAbs = Math.abs((sideSheetBehavior2.f9786C * f10) + left);
                            sideSheetBehavior2.getClass();
                            if (fAbs <= 0.5f) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            break;
                        default:
                            float right = view.getRight();
                            SideSheetBehavior sideSheetBehavior3 = aVar.f14589b;
                            float fAbs2 = Math.abs((sideSheetBehavior3.f9786C * f10) + right);
                            sideSheetBehavior3.getClass();
                            if (fAbs2 <= 0.5f) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            break;
                    }
                    if (z10) {
                        p181s3.a aVar2 = sideSheetBehavior.f9799s;
                        switch (aVar2.a) {
                            case 0:
                                if (Math.abs(f10) > Math.abs(f11)) {
                                    float fAbs3 = Math.abs(f10);
                                    aVar2.f14589b.getClass();
                                    z11 = fAbs3 > PermissionsActivity.DELAY_TIME_CALLBACK_CALL;
                                }
                                break;
                            default:
                                if (Math.abs(f10) > Math.abs(f11)) {
                                    float fAbs4 = Math.abs(f10);
                                    aVar2.f14589b.getClass();
                                    if (fAbs4 > PermissionsActivity.DELAY_TIME_CALLBACK_CALL) {
                                    }
                                }
                                break;
                        }
                        if (!z11) {
                            p181s3.a aVar3 = sideSheetBehavior.f9799s;
                            switch (aVar3.a) {
                                case 0:
                                    if (view.getRight() >= (aVar3.i() - aVar3.j()) / 2) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    break;
                                default:
                                    if (view.getLeft() <= (aVar3.i() + aVar3.f14589b.f9788E) / 2) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    break;
                            }
                            if (z12) {
                            }
                        }
                    } else if (f10 == 0.0f || Math.abs(f10) <= Math.abs(f11)) {
                        int left2 = view.getLeft();
                        i10 = Math.abs(left2 - sideSheetBehavior.f9799s.i()) < Math.abs(left2 - sideSheetBehavior.f9799s.j()) ? 3 : 5;
                    }
                }
                sideSheetBehavior.z(view, i10, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    @Override // p032d0.e
    public final boolean tryCaptureView(View view, int i10) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5386b;
                int i11 = bottomSheetBehavior.f9515d0;
                if (i11 != 1 && !bottomSheetBehavior.f9532t0) {
                    if (i11 == 3 && bottomSheetBehavior.f9528r0 == i10) {
                        WeakReference weakReference3 = bottomSheetBehavior.f9524n0;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            System.currentTimeMillis();
                            weakReference = bottomSheetBehavior.f9523m0;
                            if (weakReference == null) {
                            }
                        }
                    } else {
                        System.currentTimeMillis();
                        weakReference = bottomSheetBehavior.f9523m0;
                        if (weakReference == null && weakReference.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5386b;
                return (sideSheetBehavior.f9806z == 1 || (weakReference2 = sideSheetBehavior.f9791H) == null || weakReference2.get() != view) ? false : true;
        }
    }
}
