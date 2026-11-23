package p170r3;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public float a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f14550f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f14551g = new ArrayList();

    public t() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10) {
        float f11 = this.f14548d;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f14546b;
        float f14 = this.f14547c;
        p pVar = new p(f13, f14, f13, f14);
        pVar.f14541f = this.f14548d;
        pVar.f14542g = f12;
        this.f14551g.add(new n(pVar));
        this.f14548d = f10;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f14550f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((r) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f10, float f11) {
        q qVar = new q();
        qVar.f14543b = f10;
        qVar.f14544c = f11;
        this.f14550f.add(qVar);
        o oVar = new o(qVar, this.f14546b, this.f14547c);
        float fB = oVar.b() + 270.0f;
        float fB2 = oVar.b() + 270.0f;
        a(fB);
        this.f14551g.add(oVar);
        this.f14548d = fB2;
        this.f14546b = f10;
        this.f14547c = f11;
    }

    public final void d(float f10, float f11, float f12) {
        this.a = f10;
        this.f14546b = 0.0f;
        this.f14547c = f10;
        this.f14548d = f11;
        this.f14549e = (f11 + f12) % 360.0f;
        this.f14550f.clear();
        this.f14551g.clear();
    }
}
