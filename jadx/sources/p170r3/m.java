package p170r3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p159q3.a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f14531d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f14530c = arrayList;
        this.f14531d = matrix;
    }

    @Override // p170r3.s
    public final void a(Matrix matrix, a aVar, int i10, Canvas canvas) {
        Iterator it = this.f14530c.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(this.f14531d, aVar, i10, canvas);
        }
    }
}
