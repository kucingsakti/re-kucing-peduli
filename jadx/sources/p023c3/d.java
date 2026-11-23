package p023c3;

import V.j;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.kcstream.cing.R;
import java.util.ArrayList;
import p032d0.b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f7460q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f7460q = chip;
    }

    @Override // p032d0.b
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.P;
        Chip chip = this.f7460q;
        if (!chip.c() || (fVar = chip.f9626w) == null || !fVar.f7497d0 || chip.f9629z == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // p032d0.b
    public final void o(int i10, j jVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        if (i10 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.P);
            return;
        }
        Chip chip = this.f7460q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        jVar.b(V.d.f5067g);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }
}
