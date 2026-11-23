package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9962s;

    public b(ClockFaceView clockFaceView) {
        this.f9962s = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f9962s;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f9933L.f9954v) - clockFaceView.f9940T;
        if (height != clockFaceView.f9965J) {
            clockFaceView.f9965J = height;
            clockFaceView.m();
            int i10 = clockFaceView.f9965J;
            ClockHandView clockHandView = clockFaceView.f9933L;
            clockHandView.f9949D = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
