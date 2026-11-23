package V0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class F extends E {
    @Override // qa.b
    public final void A(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // V0.E, qa.b
    public final void B(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // V0.E
    public final void G(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // V0.E
    public final void H(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // V0.E
    public final void I(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // qa.b
    public final float o(View view) {
        return view.getTransitionAlpha();
    }
}
