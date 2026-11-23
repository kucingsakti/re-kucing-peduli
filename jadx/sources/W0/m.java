package W0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {
    public L.f[] a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5282c;

    public m() {
        this.a = null;
        this.f5282c = 0;
    }

    public L.f[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.f5281b;
    }

    public void setPathData(L.f[] fVarArr) {
        if (!C3.b.d(this.a, fVarArr)) {
            this.a = C3.b.m(fVarArr);
            return;
        }
        L.f[] fVarArr2 = this.a;
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            fVarArr2[i10].a = fVarArr[i10].a;
            int i11 = 0;
            while (true) {
                float[] fArr = fVarArr[i10].f2715b;
                if (i11 < fArr.length) {
                    fVarArr2[i10].f2715b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public m(m mVar) {
        this.a = null;
        this.f5282c = 0;
        this.f5281b = mVar.f5281b;
        this.a = C3.b.m(mVar.a);
    }
}
