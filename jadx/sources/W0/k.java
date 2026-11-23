package W0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {
    public final Matrix a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f5277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f5279i;
    public final Matrix j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5280k;

    public k() {
        this.a = new Matrix();
        this.f5272b = new ArrayList();
        this.f5273c = 0.0f;
        this.f5274d = 0.0f;
        this.f5275e = 0.0f;
        this.f5276f = 1.0f;
        this.f5277g = 1.0f;
        this.f5278h = 0.0f;
        this.f5279i = 0.0f;
        this.j = new Matrix();
        this.f5280k = null;
    }

    @Override // W0.l
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5272b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // W0.l
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f5272b;
            if (i10 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i10)).b(iArr);
            i10++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.f5274d, -this.f5275e);
        matrix.postScale(this.f5276f, this.f5277g);
        matrix.postRotate(this.f5273c, 0.0f, 0.0f);
        matrix.postTranslate(this.f5278h + this.f5274d, this.f5279i + this.f5275e);
    }

    public String getGroupName() {
        return this.f5280k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f5274d;
    }

    public float getPivotY() {
        return this.f5275e;
    }

    public float getRotation() {
        return this.f5273c;
    }

    public float getScaleX() {
        return this.f5276f;
    }

    public float getScaleY() {
        return this.f5277g;
    }

    public float getTranslateX() {
        return this.f5278h;
    }

    public float getTranslateY() {
        return this.f5279i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f5274d) {
            this.f5274d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f5275e) {
            this.f5275e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f5273c) {
            this.f5273c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f5276f) {
            this.f5276f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f5277g) {
            this.f5277g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f5278h) {
            this.f5278h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f5279i) {
            this.f5279i = f10;
            c();
        }
    }

    public k(k kVar, p212w.e eVar) {
        m iVar;
        this.a = new Matrix();
        this.f5272b = new ArrayList();
        this.f5273c = 0.0f;
        this.f5274d = 0.0f;
        this.f5275e = 0.0f;
        this.f5276f = 1.0f;
        this.f5277g = 1.0f;
        this.f5278h = 0.0f;
        this.f5279i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.f5280k = null;
        this.f5273c = kVar.f5273c;
        this.f5274d = kVar.f5274d;
        this.f5275e = kVar.f5275e;
        this.f5276f = kVar.f5276f;
        this.f5277g = kVar.f5277g;
        this.f5278h = kVar.f5278h;
        this.f5279i = kVar.f5279i;
        String str = kVar.f5280k;
        this.f5280k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(kVar.j);
        ArrayList arrayList = kVar.f5272b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof k) {
                this.f5272b.add(new k((k) obj, eVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f5263e = 0.0f;
                    jVar2.f5265g = 1.0f;
                    jVar2.f5266h = 1.0f;
                    jVar2.f5267i = 0.0f;
                    jVar2.j = 1.0f;
                    jVar2.f5268k = 0.0f;
                    jVar2.f5269l = Paint.Cap.BUTT;
                    jVar2.f5270m = Paint.Join.MITER;
                    jVar2.f5271n = 4.0f;
                    jVar2.f5262d = jVar.f5262d;
                    jVar2.f5263e = jVar.f5263e;
                    jVar2.f5265g = jVar.f5265g;
                    jVar2.f5264f = jVar.f5264f;
                    jVar2.f5282c = jVar.f5282c;
                    jVar2.f5266h = jVar.f5266h;
                    jVar2.f5267i = jVar.f5267i;
                    jVar2.j = jVar.j;
                    jVar2.f5268k = jVar.f5268k;
                    jVar2.f5269l = jVar.f5269l;
                    jVar2.f5270m = jVar.f5270m;
                    jVar2.f5271n = jVar.f5271n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f5272b.add(iVar);
                Object obj2 = iVar.f5281b;
                if (obj2 != null) {
                    eVar.put(obj2, iVar);
                }
            }
        }
    }
}
