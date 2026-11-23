package p088j0;

import U.C0412b;
import U.U;
import V.d;
import V.j;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C0412b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f12347d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f12348e;

    public b(DrawerLayout drawerLayout) {
        this.f12348e = drawerLayout;
    }

    @Override // U.C0412b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.f12348e;
        View viewH = drawerLayout.h();
        if (viewH == null) {
            return true;
        }
        int iK = drawerLayout.k(viewH);
        drawerLayout.getClass();
        WeakHashMap weakHashMap = U.a;
        Gravity.getAbsoluteGravity(iK, drawerLayout.getLayoutDirection());
        return true;
    }

    @Override // U.C0412b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // U.C0412b
    public final void d(View view, j jVar) {
        boolean z6 = DrawerLayout.f6527a0;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        if (z6) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            jVar.f5080b = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = U.a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            Rect rect = this.f12347d;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            jVar.i(accessibilityNodeInfoObtain.getClassName());
            accessibilityNodeInfo.setContentDescription(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            jVar.a(accessibilityNodeInfoObtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.m(childAt)) {
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }
        jVar.i("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) d.f5065e.a);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) d.f5066f.a);
    }

    @Override // U.C0412b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.f6527a0 || DrawerLayout.m(view)) {
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
