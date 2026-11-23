package G7;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kcstream.cing.R;
import java.util.ArrayList;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f1710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f1711t;

    public e(g gVar, View view) {
        this.f1710s = gVar;
        this.f1711t = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f1711t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        X2.h hVar = (X2.h) this.f1710s.f14341E0;
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(hVar != null ? (FrameLayout) hVar.findViewById(R.id.design_bottom_sheet) : null);
        i.b(bottomSheetBehaviorB, "behavior");
        bottomSheetBehaviorB.I(3);
        bottomSheetBehaviorB.H(0);
        d dVar = new d(this, 0);
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList arrayList = bottomSheetBehaviorB.f9525o0;
        arrayList.clear();
        arrayList.add(dVar);
    }
}
