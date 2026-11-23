package V;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final AccessibilityNodeInfo.CollectionItemInfo a;

    public i(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.a = collectionItemInfo;
    }

    public static i a(int i10, int i11, int i12, int i13, boolean z6, boolean z10) {
        return new i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z6, z10));
    }
}
