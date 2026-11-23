package com.google.android.material.timepicker;

import U.C0412b;
import V.j;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C0412b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9963d;

    public c(ClockFaceView clockFaceView) {
        this.f9963d = clockFaceView;
    }

    @Override // U.C0412b
    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f9963d.P.get(iIntValue - 1));
        }
        jVar.j(V.i.a(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        jVar.b(V.d.f5067g);
    }

    @Override // U.C0412b
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.g(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f9963d;
        view.getHitRect(clockFaceView.f9934M);
        float fCenterX = clockFaceView.f9934M.centerX();
        float fCenterY = clockFaceView.f9934M.centerY();
        clockFaceView.f9933L.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f9933L.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
