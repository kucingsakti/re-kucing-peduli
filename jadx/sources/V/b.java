package V;

import C8.E;
import E4.C0187a;
import U.U;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final C0187a a;

    public b(C0187a c0187a) {
        this.a = c0187a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.a.equals(((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z6) {
        p215w3.i iVar = (p215w3.i) this.a.f1398t;
        AutoCompleteTextView autoCompleteTextView = iVar.f15559h;
        if (autoCompleteTextView == null || E.t(autoCompleteTextView)) {
            return;
        }
        int i10 = z6 ? 2 : 1;
        WeakHashMap weakHashMap = U.a;
        iVar.f15594d.setImportantForAccessibility(i10);
    }
}
