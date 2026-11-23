package C0;

import U.C0412b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class w extends C0412b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f905e;

    public /* synthetic */ w(Object obj, int i10) {
        this.f904d = i10;
        this.f905e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    @Override // U.C0412b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z6;
        Z0.a aVar;
        switch (this.f904d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(N6.l.class.getName());
                N6.l lVar = (N6.l) this.f905e;
                Z0.a aVar2 = lVar.f3397w;
                if (aVar2 != null) {
                    z6 = aVar2.c() > 1;
                }
                accessibilityEvent.setScrollable(z6);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = lVar.f3397w) != null) {
                    accessibilityEvent.setItemCount(aVar.c());
                    accessibilityEvent.setFromIndex(lVar.f3398x);
                    accessibilityEvent.setToIndex(lVar.f3398x);
                    break;
                }
                break;
            case 5:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f905e).f9734v);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // U.C0412b
    public final void d(View view, V.j jVar) {
        RecyclerView recyclerView;
        int i10;
        int iJ = -1;
        boolean z6 = false;
        z6 = false;
        Object obj = this.f905e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (this.f904d) {
            case 0:
                x xVar = (x) obj;
                xVar.f907g.d(view, jVar);
                RecyclerView recyclerView2 = xVar.f906f;
                recyclerView2.getClass();
                RecyclerView.a aVarM = RecyclerView.M(view);
                if (aVarM != null && (recyclerView = aVarM.f7001J) != null) {
                    iJ = recyclerView.J(aVarM);
                }
                androidx.recyclerview.widget.s adapter = recyclerView2.getAdapter();
                if (adapter instanceof t) {
                    ((t) adapter).o(iJ);
                    break;
                }
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, jVar.a);
                jVar.i(N6.l.class.getName());
                N6.l lVar = (N6.l) obj;
                Z0.a aVar = lVar.f3397w;
                if (aVar != null && aVar.c() > 1) {
                    z6 = true;
                }
                jVar.l(z6);
                if (lVar.canScrollHorizontally(1)) {
                    jVar.a(4096);
                }
                if (lVar.canScrollHorizontally(-1)) {
                    jVar.a(8192);
                }
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((X2.h) obj).f5398B) {
                    jVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                }
                break;
            case 3:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, jVar.a);
                int i11 = MaterialButtonToggleGroup.f9564C;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                if (view instanceof MaterialButton) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < materialButtonToggleGroup.getChildCount(); i13++) {
                        if (materialButtonToggleGroup.getChildAt(i13) == view) {
                            i10 = i12;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.c(i13)) {
                                i12++;
                            }
                        }
                    }
                    i10 = -1;
                } else {
                    i10 = -1;
                }
                jVar.j(V.i.a(0, 1, i10, 1, false, ((MaterialButton) view).f9555G));
                break;
            case 4:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, jVar.a);
                com.google.android.material.datepicker.m mVar = (com.google.android.material.datepicker.m) obj;
                jVar.k(mVar.f9670E0.getVisibility() == 0 ? mVar.r(R.string.mtrl_picker_toggle_to_year_selection) : mVar.r(R.string.mtrl_picker_toggle_to_day_selection));
                break;
            case 5:
                AccessibilityNodeInfo accessibilityNodeInfo2 = jVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f9735w);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f9734v);
                break;
            case 6:
                AccessibilityNodeInfo accessibilityNodeInfo3 = jVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).P);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = jVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                jVar.a(1048576);
                accessibilityNodeInfo4.setDismissable(true);
                break;
        }
    }

    @Override // U.C0412b
    public boolean g(View view, int i10, Bundle bundle) {
        switch (this.f904d) {
            case 0:
                return ((x) this.f905e).f907g.g(view, i10, bundle);
            case 1:
                if (super.g(view, i10, bundle)) {
                    return true;
                }
                N6.l lVar = (N6.l) this.f905e;
                if (i10 != 4096) {
                    if (i10 == 8192 && lVar.canScrollHorizontally(-1)) {
                        lVar.setCurrentItem(lVar.f3398x - 1);
                        return true;
                    }
                } else if (lVar.canScrollHorizontally(1)) {
                    lVar.setCurrentItem(lVar.f3398x + 1);
                    return true;
                }
                return false;
            case 2:
                if (i10 == 1048576) {
                    X2.h hVar = (X2.h) this.f905e;
                    if (hVar.f5398B) {
                        hVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i10, bundle);
            case 7:
                if (i10 != 1048576) {
                    return super.g(view, i10, bundle);
                }
                ((p190t3.g) ((p190t3.f) this.f905e)).a(3);
                return true;
            default:
                return super.g(view, i10, bundle);
        }
    }
}
