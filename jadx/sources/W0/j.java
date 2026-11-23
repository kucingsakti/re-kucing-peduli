package W0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A1.q f5262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A1.q f5264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5267i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f5268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f5269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f5270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f5271n;

    @Override // W0.l
    public final boolean a() {
        return this.f5264f.d() || this.f5262d.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // W0.l
    public final boolean b(int[] iArr) {
        boolean z6;
        A1.q qVar = this.f5264f;
        boolean z10 = false;
        if (qVar.d()) {
            ColorStateList colorStateList = (ColorStateList) qVar.f165d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != qVar.f163b) {
                qVar.f163b = colorForState;
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        A1.q qVar2 = this.f5262d;
        if (qVar2.d()) {
            ColorStateList colorStateList2 = (ColorStateList) qVar2.f165d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != qVar2.f163b) {
                qVar2.f163b = colorForState2;
                z10 = true;
            }
        }
        return z6 | z10;
    }

    public float getFillAlpha() {
        return this.f5266h;
    }

    public int getFillColor() {
        return this.f5264f.f163b;
    }

    public float getStrokeAlpha() {
        return this.f5265g;
    }

    public int getStrokeColor() {
        return this.f5262d.f163b;
    }

    public float getStrokeWidth() {
        return this.f5263e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.f5268k;
    }

    public float getTrimPathStart() {
        return this.f5267i;
    }

    public void setFillAlpha(float f10) {
        this.f5266h = f10;
    }

    public void setFillColor(int i10) {
        this.f5264f.f163b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f5265g = f10;
    }

    public void setStrokeColor(int i10) {
        this.f5262d.f163b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f5263e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f5268k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f5267i = f10;
    }
}
