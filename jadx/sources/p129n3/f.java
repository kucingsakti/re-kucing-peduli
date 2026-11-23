package p129n3;

import Y1.c;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import p098k0.b;
import p098k0.d;
import p098k0.e;
import p181s3.a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final e f13342I = new e();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final l f13343D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final e f13344E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final d f13345F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final i f13346G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13347H;

    public f(Context context, p pVar, l lVar) {
        super(context, pVar);
        this.f13347H = false;
        this.f13343D = lVar;
        this.f13346G = new i();
        e eVar = new e();
        this.f13344E = eVar;
        eVar.f12673b = 1.0f;
        eVar.f12674c = false;
        eVar.a(50.0f);
        d dVar = new d(this);
        this.f13345F = dVar;
        dVar.f12670m = eVar;
        if (this.f13359z != 1.0f) {
            this.f13359z = 1.0f;
            invalidateSelf();
        }
    }

    @Override // p129n3.h
    public final boolean d(boolean z6, boolean z10, boolean z11) {
        boolean zD = super.d(z6, z10, z11);
        a aVar = this.f13354u;
        ContentResolver contentResolver = this.f13352s.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f10 == 0.0f) {
            this.f13347H = true;
            return zD;
        }
        this.f13347H = false;
        this.f13344E.a(50.0f / f10);
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            l lVar = this.f13343D;
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f13355v;
            boolean z6 = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.f13356w;
            lVar.a(canvas, bounds, fB, z6, objectAnimator2 != null && objectAnimator2.isRunning());
            Paint paint = this.f13350A;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            p pVar = this.f13353t;
            int i10 = pVar.f13390c[0];
            i iVar = this.f13346G;
            iVar.f13361c = i10;
            int iD = pVar.f13394g;
            if (iD > 0) {
                if (!(this.f13343D instanceof l)) {
                    iD = (int) ((a.d(iVar.f13360b, 0.0f, 0.01f) * iD) / 0.01f);
                }
                this.f13343D.d(canvas, paint, iVar.f13360b, 1.0f, pVar.f13391d, this.f13351B, iD);
            } else {
                this.f13343D.d(canvas, paint, 0.0f, 1.0f, pVar.f13391d, this.f13351B, 0);
            }
            l lVar2 = this.f13343D;
            int i11 = this.f13351B;
            lVar2.getClass();
            int iC = J7.a.c(iVar.f13361c, i11);
            float f10 = iVar.a;
            float f11 = iVar.f13360b;
            int i12 = iVar.f13362d;
            lVar2.b(canvas, paint, f10, f11, iC, i12, i12);
            l lVar3 = this.f13343D;
            int i13 = pVar.f13390c[0];
            int i14 = this.f13351B;
            lVar3.getClass();
            int iC2 = J7.a.c(i13, i14);
            p pVar2 = lVar3.a;
            if (pVar2.f13397k > 0 && iC2 != 0) {
                paint.setStyle(style);
                paint.setColor(iC2);
                PointF pointF = new PointF((lVar3.f13365b / 2.0f) - (lVar3.f13366c / 2.0f), 0.0f);
                float f12 = pVar2.f13397k;
                lVar3.c(canvas, paint, pointF, null, f12, f12);
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13343D.a.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.f13343D.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f13345F.b();
        this.f13346G.f13360b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z6 = this.f13347H;
        i iVar = this.f13346G;
        d dVar = this.f13345F;
        if (z6) {
            dVar.b();
            iVar.f13360b = i10 / 10000.0f;
            invalidateSelf();
        } else {
            dVar.f12660b = iVar.f13360b * 10000.0f;
            dVar.f12661c = true;
            float f10 = i10;
            if (dVar.f12664f) {
                dVar.f12671n = f10;
            } else {
                if (dVar.f12670m == null) {
                    dVar.f12670m = new e(f10);
                }
                e eVar = dVar.f12670m;
                double d3 = f10;
                eVar.f12680i = d3;
                double d8 = (float) d3;
                if (d8 > dVar.f12665g) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                if (d8 < dVar.f12666h) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(dVar.j * 0.75f);
                eVar.f12675d = dAbs;
                eVar.f12676e = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z10 = dVar.f12664f;
                if (!z10 && !z10) {
                    dVar.f12664f = true;
                    if (!dVar.f12661c) {
                        dVar.f12660b = dVar.f12663e.p(dVar.f12662d);
                    }
                    float f11 = dVar.f12660b;
                    if (f11 > dVar.f12665g || f11 < dVar.f12666h) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ThreadLocal threadLocal = b.f12648f;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new b());
                    }
                    b bVar = (b) threadLocal.get();
                    ArrayList arrayList = bVar.f12649b;
                    if (arrayList.size() == 0) {
                        if (bVar.f12651d == null) {
                            bVar.f12651d = new c(bVar.f12650c);
                        }
                        c cVar = bVar.f12651d;
                        ((Choreographer) cVar.f5671u).postFrameCallback((p098k0.a) cVar.f5672v);
                    }
                    if (!arrayList.contains(dVar)) {
                        arrayList.add(dVar);
                    }
                }
            }
        }
        return true;
    }
}
