package p170r3;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14544c;

    @Override // p170r3.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f14543b, this.f14544c);
        path.transform(matrix);
    }
}
