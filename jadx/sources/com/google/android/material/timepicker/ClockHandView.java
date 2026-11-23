package com.google.android.material.timepicker;

import J7.j;
import U.U;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.kcstream.cing.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p091j3.C;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f9946A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9947B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public double f9948C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9949D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9950E;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ValueAnimator f9951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9952t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f9953u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9954v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f9955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f9956x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f9957y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f9958z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f9951s = new ValueAnimator();
        this.f9953u = new ArrayList();
        Paint paint = new Paint();
        this.f9956x = paint;
        this.f9957y = new RectF();
        this.f9950E = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q2.a.f4017l, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        j.C(context, R.attr.motionDurationLong2, 200);
        j.D(context, R.attr.motionEasingEmphasizedInterpolator, R2.a.f4441b);
        this.f9949D = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f9954v = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f9958z = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f9955w = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = U.a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.f9949D * 0.66f) : this.f9949D;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f9951s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f11 = f10 % 360.0f;
        this.f9946A = f11;
        this.f9948C = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f9950E);
        float fCos = (((float) Math.cos(this.f9948C)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f9948C))) + height;
        float f12 = this.f9954v;
        this.f9957y.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f9953u.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f9945b0 - f11) > 0.001f) {
                clockFaceView.f9945b0 = f11;
                clockFaceView.n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.f9950E);
        float f10 = width;
        float f11 = iA;
        float fCos = (((float) Math.cos(this.f9948C)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f9948C))) + f12;
        Paint paint = this.f9956x;
        paint.setStrokeWidth(0.0f);
        int i10 = this.f9954v;
        canvas.drawCircle(fCos, fSin, i10, paint);
        double dSin = Math.sin(this.f9948C);
        double d3 = iA - i10;
        paint.setStrokeWidth(this.f9958z);
        canvas.drawLine(f10, f12, width + ((int) (Math.cos(this.f9948C) * d3)), height + ((int) (d3 * dSin)), paint);
        canvas.drawCircle(f10, f12, this.f9955w, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        if (this.f9951s.isRunning()) {
            return;
        }
        b(this.f9946A);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x8 = motionEvent.getX();
        float y6 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked == 0) {
            this.f9947B = false;
            z6 = true;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z10 = this.f9947B;
            if (this.f9952t) {
                this.f9950E = ((float) Math.hypot((double) (x8 - ((float) (getWidth() / 2))), (double) (y6 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + C.e(getContext(), 12) ? 2 : 1;
            }
            z6 = false;
        } else {
            z10 = false;
            z6 = false;
        }
        boolean z12 = this.f9947B;
        int degrees = (int) Math.toDegrees(Math.atan2(y6 - (getHeight() / 2), x8 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f10 = i10;
        boolean z13 = this.f9946A != f10;
        if (z6 && z13) {
            z11 = true;
        } else if (z13 || z10) {
            b(f10);
            z11 = true;
        }
        this.f9947B = z12 | z11;
        return true;
    }
}
