package p032d0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public abstract int clampViewPositionHorizontal(View view, int i10, int i11);

    public abstract int clampViewPositionVertical(View view, int i10, int i11);

    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i10) {
        return false;
    }

    public abstract void onViewReleased(View view, float f10, float f11);

    public abstract boolean tryCaptureView(View view, int i10);

    public int getOrderedChildIndex(int i10) {
        return i10;
    }

    public void onViewDragStateChanged(int i10) {
    }

    public void onEdgeDragStarted(int i10, int i11) {
    }

    public void onEdgeTouched(int i10, int i11) {
    }

    public void onViewCaptured(View view, int i10) {
    }

    public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
    }
}
