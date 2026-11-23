package V0;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static int a(ViewGroup viewGroup, int i10) {
        return viewGroup.getChildDrawingOrder(i10);
    }

    public static void b(ViewGroup viewGroup, boolean z6) {
        viewGroup.suppressLayout(z6);
    }
}
