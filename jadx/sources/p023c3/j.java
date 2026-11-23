package p023c3;

import O0.a;
import U.U;
import V.h;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f7519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f7520t;

    public j(ChipGroup chipGroup) {
        this.f7520t = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f7520t;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = U.a;
                view2.setId(View.generateViewId());
            }
            Chip chip = (Chip) view2;
            a aVar = chipGroup.f9635z;
            ((HashMap) aVar.f3505c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                aVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new h(aVar, 27));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7519s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f7520t;
        if (view == chipGroup && (view2 instanceof Chip)) {
            Chip chip = (Chip) view2;
            a aVar = chipGroup.f9635z;
            aVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) aVar.f3505c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) aVar.f3506d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7519s;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
